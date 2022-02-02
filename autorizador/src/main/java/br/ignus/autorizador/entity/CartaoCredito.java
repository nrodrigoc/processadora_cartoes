package br.ignus.autorizador.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartaoCredito {

    private long id;

    private Double limiteDisponivel;

    private boolean bloqueado;
}
