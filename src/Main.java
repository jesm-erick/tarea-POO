import java.util.List;
import java.util.Scanner;

import Datos.PersonaDatos;
import entidad.Alumno;

public class Main {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int opt = 0;
        PersonaDatos pData= new PersonaDatos();
        do {
            
            System.out.println("***** MI CRUD PERSONA :)*****");
            System.out.println("1 Listar ");
            System.out.println("2 Nuevo ");
            System.out.println("3 Eliminar ");
            System.out.println("4 Salir ");
            System.out.println("Seleccionar: ");
            opt = input.nextInt();
            System.out.println("Tu seleccionaste: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("****** 1 Listar *****");
                    List<Alumno> lis = pData.listaAlumnos;
                    System.out.println("ID \t Nombre    \t ApePaterno    \t ApeMaterno \t FechNacimiento  \t DNI        \t Direccion        \tCorreo");
                    for (Alumno d : lis) {
                        System.out.println(d.getID() + "\t" +   d.getNombre()+ "\t" + d.getApePaterno()+ "\t"+ d.getApeMaterno()+ "\t" + d.getFechaNac()+ "\t" + d.getDNI()+ "\t" + d.getDireccion()+ "\t" + d.getCorreo());
                    }
                    break;
                case 2:
                    System.out.println("**** 2 Nuevo Alumno****");
                    Alumno d = new Alumno();
                    System.out.println("Ingrese  el Nombre del estudiante: ");
                    d.setNombre(input.nextLine());
                    System.out.println("Ingrese su primer apellido: ");
                    d.setApePaterno(input.nextLine());
                    System.out.println("Ingrese su seundo apellido: ");
                    d.setApeMaterno(input.nextLine());
                    System.out.println("Ingrese su fecha de nacimiento: ");
                    d.setFechaNac(input.nextInt());
                    System.out.println("Ingrese su DNI: ");
                    d.setDNI(input.nextInt());
                    System.out.println("Ingrese el correo del alumno: ");
                    d.setCorreo(input.nextLine());
                    System.out.println("Ingrese la direccion: ");
                    d.setDireccion(input.nextLine());
                    pData.crear(d);
                    break;
                case 3:
                    System.out.println("**** 3 Eliminar Alumno ****");
                    System.out.print("Ingrese ID a eliminar: ");
                    pData.eliminar(input.nextInt());
                    input.nextLine();
                    break;

                case 9:
                    System.out.println("Finalizar proceso ");
                    break;
                default:
                    System.out.println("ingreso un dato incorrecto");
                    break;
            }
        } while (opt != 0);      
    }     
}
