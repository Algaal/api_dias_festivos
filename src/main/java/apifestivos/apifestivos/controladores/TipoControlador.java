package apifestivos.apifestivos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apifestivos.apifestivos.entidades.Tipo;
import apifestivos.apifestivos.interfaces.ITipoServicio;

@RestController
@RequestMapping("/tipos")
public class TipoControlador {

    private ITipoServicio servicio;

    public TipoControlador(ITipoServicio servicio){
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Tipo> listar(){
        return this.servicio.listar();
    };
}
