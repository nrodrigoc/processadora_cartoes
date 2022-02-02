package br.ignus.autorizador.service;


import br.ignus.autorizador.entity.Portador;
import br.ignus.autorizador.response.AutCompraResponse;

public interface PortadorService {

    AutCompraResponse avaliaCompra(Portador portador, Double valorCompra);
}
