package br.ignus.autorizador.response;

import br.ignus.autorizador.entity.Portador;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AutCompraResponse {

    private long idPortador;

    private double valorCompra;

    private double limiteRestante;

    public static AutCompraResponse from(Portador portador, double valorCompra) {
        return AutCompraResponse.builder()
                .idPortador(portador.getId())
                .valorCompra(valorCompra)
                .limiteRestante(portador.getCartaoCredito().getLimiteDisponivel() - valorCompra)
                .build();
    }

}
