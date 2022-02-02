package br.ignus.core.repository;

import br.ignus.core.entity.Portador;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PortadorRepository extends CrudRepository<Portador, Long> {

}
