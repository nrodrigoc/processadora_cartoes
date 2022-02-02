package br.ignus.core.entity;

import br.ignus.core.request.PortadorRequest;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "T_PORTADOR")
public class Portador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PORTADOR")
    @SequenceGenerator(name = "S_PORTADOR", sequenceName = "S_PORTADOR", allocationSize = 1)
    private long id;

    private String nome;

    public static Portador from(PortadorRequest portadorRequest) {
        return Portador.builder().nome(portadorRequest.getNome()).build();
    }

}
