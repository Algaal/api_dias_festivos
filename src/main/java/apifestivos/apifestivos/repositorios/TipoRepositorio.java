package apifestivos.apifestivos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apifestivos.apifestivos.entidades.Tipo;

public interface TipoRepositorio extends JpaRepository<Tipo, Integer>{
    
}
