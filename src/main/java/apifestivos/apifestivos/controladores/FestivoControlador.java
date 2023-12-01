package apifestivos.apifestivos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apifestivos.apifestivos.entidades.Festivo;
import apifestivos.apifestivos.interfaces.IFestivoServicio;

@RestController
@RequestMapping("/festivos")
@CrossOrigin
public class FestivoControlador {

    private IFestivoServicio servicio;

    public FestivoControlador(IFestivoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Festivo> listar() {
        return this.servicio.listar();
    };

    @RequestMapping(value = "/verificar/{year}/{month}/{day}", method = RequestMethod.GET)
    public String verificar(@PathVariable int year, @PathVariable int month, @PathVariable int day) {
        return this.servicio.verificar(year, month, day);
    };

    @RequestMapping(value = "/obtener/{year}", method = RequestMethod.GET)
    public List<Festivo> obtener(@PathVariable int year) {
        return this.servicio.obtener(year);
    };
}
