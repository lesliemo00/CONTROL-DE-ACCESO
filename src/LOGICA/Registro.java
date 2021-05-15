package LOGICA;

import java.io.Serializable;

public class Registro implements Serializable {

    private String nombre;
    private String apellido;
    private String codigo;
    private String carrera;
    private String sala;
    private String fecha;
    private String fechaS;
//Constructor
    public Registro() {
    }
/**
 * 
 * @param nombre
 * @param apellido
 * @param codigo
 * @param carrera
 * @param sala
 * @param fechaE
 * @param fechaS 
 */
    public Registro(String nombre, String apellido, String codigo, String carrera, String sala, String fechaE, String fechaS) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.sala = sala;
        this.carrera = carrera;
        this.fecha = fecha;
        this.fechaS = fechaS;

    }
/**
 * 
 * @param nombre
 * @param apellido
 * @param codigo
 * @param carrera
 * @param sala 
 */
    public Registro(String nombre, String apellido, String codigo, String carrera, String sala) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.sala = sala;
        this.carrera = carrera;
        this.fecha = fecha;
        this.fechaS = fechaS;

    }
//SET AND GETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaS() {
        return fechaS;
    }

    public void setFechaS(String fechaS) {
        this.fechaS = fechaS;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNomnbre() {
        return nombre;
    }

    public void setNomnbre(String nomnbre) {
        this.nombre = nomnbre;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSala() {
        return sala;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getApellido() {
        return apellido;
    }

}
