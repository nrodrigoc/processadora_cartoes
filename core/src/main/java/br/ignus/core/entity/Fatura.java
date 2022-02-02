package br.ignus.core.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "T_FATURA")
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_FATURA")
    @SequenceGenerator(name = "S_FATURA", sequenceName = "S_FATURA", allocationSize = 1)
    private long id;

    @ManyToOne
    @JoinColumn(name = "portador_id")
    private Portador portador;

}
