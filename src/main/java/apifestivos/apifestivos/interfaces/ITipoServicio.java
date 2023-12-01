package apifestivos.apifestivos.interfaces;

import java.util.List;

import apifestivos.apifestivos.entidades.Tipo;

public interface ITipoServicio {
    
    public List<Tipo> listar();

    public Tipo obtener(int id);

    public Tipo guardar(Tipo tipo);

    public boolean eliminar(int id);
}
