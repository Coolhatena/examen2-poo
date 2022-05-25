package examen.pkg2.pkg21770177;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eduardo Rivera Geffoy
 */
public class ServiciosEscolares {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<SemiEscolarizado> semis = new ArrayList<>();
    static ArrayList<Escolarizado> escolarizados = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 8;
        do {
            
            System.out.println("Pulse enter para continuar");
            leer.nextLine();
            
            System.out.println("Bienvenido al sistema de registro de estudiantes");
            System.out.println("1.- Registrar un estudiante semiescolarizado");
            System.out.println("2.- Registrar un estudiante escolarizado");
            System.out.println("3.- Listar estudiantes semiescolarizados");
            System.out.println("4.- Listar estudiantes escolarizados");
            System.out.println("5.- Listar estudiantes de sistemas + total de mujeres que viven con sus padres");
            System.out.println("6.- Listar el numero de control de todos los estudiantes semiescolarizados"
                    + " que trabajan en una fabrica y el total de los que ganan mas de 5 k a la semana");
            System.out.println("7.- Salir");
            System.out.print("Opcion: ");
            
            try {
                opcion = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nSe introdujo un tipo de dato incorrecto, intentelo de nuevo\n");
            } catch (Exception e) {
                System.out.println("\nSe a producido un error\n");
            }

            switch (opcion) {

                case 1 -> {
                    System.out.println("\nRegistro de estudiante semiEscolarizado: \n");
                    semis.add(new SemiEscolarizado());
                    System.out.println("\nRegistro exitoso");
                }

                case 2 -> {
                    System.out.println("\nRegistro de estudiante Escolarizado: \n");
                    escolarizados.add(new Escolarizado());
                    System.out.println("\nRegistro exitoso");
                }

                case 3 -> {
                    listaSemi();
                }
                case 4 -> {
                    listaEsc();
                }
                case 5 -> {
                    escEspeciales();
                }
                case 6 -> {
                    semiEspeciales();
                }
                case 7 ->
                    System.out.println("Adios!");
                default ->
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 7);
    }

    static public void listaSemi() {
        System.out.println("Lista de estudiantes SemiEscolarizados\n");
        for (int i = 0; i < semis.size(); i++) {
            System.out.println("No. " + (i + 1) + " ");
            semis.get(i).mostrarDatos();
        }
        System.out.println("--- FIN DE LA LISTA DE SEMIESCOLARIZADOS ---");
    }

    static public void listaEsc() {
        System.out.println("Lista de estudiantes Escolarizados\n");
        for (int i = 0; i < escolarizados.size(); i++) {
            System.out.println("No. " + (i + 1) + " ");
            escolarizados.get(i).mostrarDatos();
        }
        System.out.println("\n--- FIN DE LA LISTA DE ESCOLARIZADOS ---");
    }

    static void escEspeciales() {
        int contSis = 1;

        System.out.println("Los estudiantes del programa educativo de sistemas son:");
        for (int i = 0; i < escolarizados.size(); i++) {
            if (escolarizados.get(i).carrera.contains("sistemas")) {
                System.out.println("No. " + contSis + " ");
                escolarizados.get(i).mostrarDatos();
                contSis++;
            }
        }

        System.out.println("Las estudiantes de sistemas que viven con sus padres son:");
        for (int i = 0; i < escolarizados.size(); i++) {
            if (escolarizados.get(i).condicionEspecial == true) {
                escolarizados.get(i).mostrarDatos();
            }
        }

        System.out.println("--- FIN DE LOS LISTADOS DE ESCOLARIZADOS ---");
    }

    static void semiEspeciales() {
        int contTrabajo = 1;
        System.out.println("Los estudiantes semiEscolarizados que trabajan en una fabrica son: ");
        for (int i = 0; i < semis.size(); i++) {
            if (semis.get(i).trabajo.contains("fabrica")) {
                System.out.println("\nNo. " + contTrabajo + " ");
                semis.get(i).mostrarDatos();
                contTrabajo++;
            }
        }

        System.out.println("\nLos estudiantes de semiEscolarizado que ganan mas de 5k semanales son:");
        for (int i = 0; i < semis.size(); i++) {
            if (semis.get(i).condicionEspecial == true) {
                semis.get(i).mostrarDatos();
            }
        }
        System.out.println("\n--- FIN DE LOS LISTADOS DE SEMIESCOLARIZADOS ---");
    }

}
