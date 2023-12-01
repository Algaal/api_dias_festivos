package apifestivos.apifestivos.interfaces;

import java.util.List;

import apifestivos.apifestivos.entidades.Festivo;

public interface IFestivoServicio {
    
    public List<Festivo> listar();

    public List<Festivo> obtener(int id);

    public String verificar(int year, int month, int day);
}
