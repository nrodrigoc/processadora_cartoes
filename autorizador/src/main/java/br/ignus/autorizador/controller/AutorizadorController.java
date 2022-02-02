package br.ignus.autorizador.controller;

import br.ignus.autorizador.entity.CartaoCredito;
import br.ignus.autorizador.entity.Portador;
import br.ignus.autorizador.service.PortadorService;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/autorizador")
public class AutorizadorController {

    private final PortadorService portadorService;

    public AutorizadorController(PortadorService portadorService) {
        this.portadorService = portadorService;
    }

    @Get
    public HttpResponse<?> avaliaCompra(@Nullable Double valor) {
        CartaoCredito cartaoCredito = new CartaoCredito(1, 300.00, false);
        Portador portador = new Portador(1, "Paulo Brificado", cartaoCredito);
        return HttpResponse.ok(portadorService.avaliaCompra(portador, valor));
    }

}
