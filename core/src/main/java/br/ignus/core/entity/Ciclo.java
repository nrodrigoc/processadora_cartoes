package br.ignus.core.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ciclo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_CICLO")
    @SequenceGenerator(name = "S_CICLO", sequenceName = "S_CICLO", allocationSize = 1)
    private long id;

    private int diaCorte;

    // Quantidade de dias entre o corte e o vencimento
    private int diasVencimento;

}
