package br.ignus.core.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "T_TRANSACAO")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_TRANSACAO")
    @SequenceGenerator(name = "S_TRANSACAO", sequenceName = "S_TRANSACAO", allocationSize = 1)
    private long id;

    @OneToOne
    @JoinColumn(name = "cartao_credito_id")
    private CartaoCredito cartaoCredito;

    private double valor;

    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "fatura_id")
    private Fatura fatura;

}
