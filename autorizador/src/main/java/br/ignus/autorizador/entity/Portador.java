package br.ignus.autorizador.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Portador {

    private long id;

    private String nome;

    private CartaoCredito cartaoCredito;
}
