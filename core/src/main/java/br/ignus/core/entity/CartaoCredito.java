package br.ignus.core.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "T_CARTAO_CREDITO")
public class CartaoCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_CARTAO_CREDITO")
    @SequenceGenerator(name = "S_CARTAO_CREDITO", sequenceName = "S_CARTAO_CREDITO", allocationSize = 1)
    private long id;

    private String numero;

    private LocalDate validade;

    private String status;

    @ManyToOne
    @JoinColumn(name = "portador_id")
    private Portador portador;

    @ManyToOne
    @JoinColumn(name = "ciclo_id")
    private Ciclo ciclo;


}
