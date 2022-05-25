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
public class Escolarizado extends Estudiante {

    int numeroSalon;
    String genero;
    boolean viveConPadres, condicionEspecial;

    public Escolarizado() {
        super();
        int opcion;
        boolean bandera = false;

        do {
            try {
                System.out.println("\nCual es el numero de salon del estudiante?: ");
                this.numeroSalon = leer.nextInt();
                System.out.println("Cual es el genero del estudiante?");
                System.out.println("1: Hombre, 2: Mujer");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    this.genero = "Hombre";
                } else {
                    this.genero = "Mujer";
                }

                System.out.println("El estudiante vive con sus padres?");
                System.out.println("1: Si, 2: No");
                opcion = leer.nextInt();
                this.viveConPadres = (opcion == 1);

                condicionEspecial = parametro();
                System.out.println("Estudiante escolarizado registrado con exito");
                bandera = true;
                
            } catch (InputMismatchException e) {
                System.out.println("\nSe introdujo un tipo de dato incorrecto, intentelo de nuevo\n");
            } catch (Exception e) {
                System.out.println("\nSe a producido un error\n");
            }
        } while (bandera == false);

    }

    @Override
    public final boolean parametro() {
        return (this.viveConPadres == true && this.genero.equals("Mujer") && this.carrera.contains("sistemas"));
    }

}
