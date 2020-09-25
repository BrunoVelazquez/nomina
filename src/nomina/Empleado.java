// Alumno: Bruno Levi Velázquez Sánchez
// Grupo: DS-DPO3-2002-B2-002
// Semestre: 2002-B2
// Fecha: jueves, 24 de septiembre de 2020
// Docente: Gabriel Enríquez Peña

package nomina;

/**
 *
 * @author bruno
 */
public class Empleado {
    private String nombre;
    private String id;
    private String rfc;
    
    public Empleado(String nombre, String id, String rfc){
        this.nombre = nombre;
        this.id = id;
        this.rfc = rfc;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getRfc() {
        return this.rfc;
    }
}
