package programacion;

import java.io.*;
import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
/**

 * @author Administrador
 */

    
    

    public class Programacion {
    public static void main(String[] args) throws NumberFormatException,
    IOException {
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader programacion = new BufferedReader(entrada);

    String dato = null;

    {
    System.out.println("Ingrese dato");
    dato= programacion.readLine();
    System.out.println("El dato ingresado es:"+ dato);


    }
    }
    }
