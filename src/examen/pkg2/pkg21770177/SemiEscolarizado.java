/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.pkg2.pkg21770177;

import java.util.InputMismatchException;

public class SemiEscolarizado extends Estudiante {

    String trabajo = "";
    boolean trabaja = false, condicionEspecial;
    float salario = 0;

    public SemiEscolarizado() {
        int opcion;
        boolean bandera = false;
        do {
            try {

                System.out.println("El estudiante trabaja? ");
                System.out.println("1: Si, 2: No");
                opcion = leer.nextInt();
                this.trabaja = (opcion == 1);
                if (trabaja) {
                    leer.nextLine();
                    System.out.println("En que trabaja el estudiante?");
                    this.trabajo = leer.nextLine().toLowerCase();

                    System.out.println("Cual es el salario semanal del estudiante?");
                    this.salario = leer.nextInt();
                }

                condicionEspecial = parametro();

                System.out.println("Estudiante semiescolarizado registrado con exito");
                bandera = true;
            } catch(InputMismatchException e){
                System.out.println("\nSe introdujo un tipo de dato incorrecto, intentelo de nuevo\n");  
            } catch(Exception e){
                System.out.println("\nSe a producido un error\n");
            }
        } while (bandera == false);

    }

    @Override
    public final boolean parametro() {
        return (this.trabaja == true && this.salario > 5000);
    }

}
