
package Datos;
import entidad.Alumno;
import java.util.ArrayList;
import java.util.List;



public class PersonaDatos {
    
    public static List<Alumno> listaAlumnos = new ArrayList<Alumno>();
    static int id=0;
    public PersonaDatos(){
    }
    public void crear(Alumno d){
        id = id +1;
        System.out.println("ID:" + id);
        d.setID(id);
        listaAlumnos.add(d);
    }
    public void eliminar(int ID){
        for(Alumno d :listaAlumnos){
            if(ID==d.getID()){
                listaAlumnos.remove(d);
                System.out.println("Eliminado de la Lista" + d.getNombre());
                        
            }
            
        }
        
    }
    public void update(int ID, String nombre, String apePaterno ,String apeMaterno,int fechaNac,String correo) {
        for (Alumno d: listaAlumnos) {
            if (d.getID() == id) {
                System.out.println("Ya se cambió");
            }else {
                System.out.println("No se cambió correctamente");
            }
        }
    }
}
