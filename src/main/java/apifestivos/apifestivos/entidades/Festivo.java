package apifestivos.apifestivos.entidades;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "festivo")
public class Festivo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_festivo")
    @GenericGenerator(name = "secuencia_festivo", strategy = "increment")
    @Column(name = "id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "dia")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer dia;

    @Column(name = "mes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer mes;

    @Column(name = "diaspascua")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer diaspascua;

    @ManyToOne
    @JoinColumn(name = "idtipo", referencedColumnName = "id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Tipo tipo;

    @Transient
    private Date fecha;

    public Festivo() {
    }

    public Festivo(Integer id, String nombre, Integer dia, Integer mes, Integer diaspascua, Tipo tipo, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.diaspascua = diaspascua;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public Festivo(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDiaspascua() {
        return diaspascua;
    }

    public void setDiaspascua(Integer diaspascua) {
        this.diaspascua = diaspascua;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

}
