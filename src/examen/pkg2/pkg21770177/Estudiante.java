/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.pkg2.pkg21770177;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eduardo Rivera Geffoy
 */
public abstract class Estudiante {

    static Scanner leer = new Scanner(System.in);
    String nombre, carrera;
    int nControl;

    public Estudiante() {
        
        boolean bandera = false;
        
        do {
            try {
                leer.nextLine();
                System.out.println("Escriba el nombre del estudiante: ");
                this.nombre = leer.nextLine();

                leer.nextLine();
                System.out.println("Escriba la carrera que cursa el estudiante: ");
                this.carrera = leer.nextLine().toLowerCase();

                leer.nextLine();
                System.out.println("Escriba el numero de control del estudiante: ");
                this.nControl = leer.nextInt();
                
                bandera = true;
                
            } catch (InputMismatchException e) {
                System.out.println("\nSe introdujo un tipo de dato incorrecto, intentelo de nuevo\n");
            } catch (Exception e) {
                System.out.println("\nSe a producido un error\n");
            }
        } while (bandera == false);
    }

    public abstract boolean parametro();

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Numero de control: " + this.nControl + "\n");
    }

}
