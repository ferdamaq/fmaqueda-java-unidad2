/*
Fernando Daniel Maqueda
Comisión #2157 de FullStack Java del Programa Codo a Codo 4.0 - 2021 - JAVA-POO - Unidad 2 - Actividad Práctica Obligatoria
 */
package apo.java.poo.unidad.pkg2;

import java.util.Scanner;

public class APOJAVAPOOUnidad2
{
    
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editor_preferido;
    String so_utilizado;

    public APOJAVAPOOUnidad2()
    {
    }

    public static void main(String[] args) 
    {
        APOJAVAPOOUnidad2 datos = new APOJAVAPOOUnidad2();
        Scanner in = new Scanner(System.in);

        System.out.println("");
        System.out.println("**********");
        System.out.println("Ingreso");
        System.out.println("**********");
        System.out.println("");
         
        System.out.printf("Ingrese su nombre: ");
        datos.nombre = in.nextLine();
        System.out.printf("Ingrese su apellido: ");
        datos.apellido = in.nextLine();
        System.out.printf("Ingrese su edad: ");
        datos.edad = Integer.parseInt(in.nextLine());
        System.out.printf("Ingrese su hobbie: ");
        datos.hobbie = in.nextLine();
        System.out.printf("Ingrese su editor de código preferido: ");
        datos.editor_preferido = in.nextLine();        
        System.out.printf("Ingrese su sistema operativo que utiliza: ");
        datos.so_utilizado = in.nextLine();
        
        System.out.println("");
        System.out.println("**********");
        System.out.println("Muestra");
        System.out.println("**********");
        System.out.println("");
        
        System.out.println("Su nombre es: " + datos.nombre);
        System.out.println("Su apellido es: " + datos.apellido);
        System.out.println("Su edad es: " + datos.edad);
        System.out.println("Su hobbie es: " + datos.hobbie);
        System.out.println("Su editor de código preferido es: " + datos.editor_preferido);
        System.out.println("Su sistema operativo que utiliza es: " + datos.so_utilizado);
       
          in.close();
    }
}
