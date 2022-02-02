package br.ignus.core.service.impl;

import br.ignus.core.entity.Portador;
import br.ignus.core.repository.PortadorRepository;
import br.ignus.core.service.PortadorService;
import jakarta.inject.Singleton;

@Singleton
public class PortadorServiceImpl implements PortadorService {

    private final PortadorRepository portadorRepository;

    public PortadorServiceImpl(PortadorRepository portadorRepository) {
        this.portadorRepository = portadorRepository;
    }

    @Override
    public Portador salvar(Portador portador) {
        return portadorRepository.save(portador);
    }
}
