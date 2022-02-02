package br.ignus.autorizador.service.impl;

import br.ignus.autorizador.entity.CartaoCredito;
import br.ignus.autorizador.entity.Portador;
import br.ignus.autorizador.response.AutCompraResponse;
import br.ignus.autorizador.service.PortadorService;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Singleton;

@Singleton
public class PortadorServiceImpl implements PortadorService {

    @Override
    public AutCompraResponse avaliaCompra(Portador portador, Double valorCompra) {
        CartaoCredito cartaoCredito = portador.getCartaoCredito();

        if (!cartaoCredito.isBloqueado() && cartaoCredito.getLimiteDisponivel() > valorCompra) {
            return AutCompraResponse.from(portador, valorCompra);
        }
        else {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Compra de " + valorCompra
                    + " negada para o portador de id " + portador.getId());
        }
    }
}
