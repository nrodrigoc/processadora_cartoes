package br.ignus.core.resource;

import br.ignus.core.entity.Portador;
import br.ignus.core.request.PortadorRequest;
import br.ignus.core.service.PortadorService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/portador")
public class PortadorResource {


    private final PortadorService portadorService;


    public PortadorResource(PortadorService portadorService) {
        this.portadorService = portadorService;
    }

    @Post("/cadastra")
    public HttpResponse<?> salvarPortador(@Body PortadorRequest portadorRequest) {
        return HttpResponse.ok(portadorService.salvar(Portador.from(portadorRequest)));
    }
}
