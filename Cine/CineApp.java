package Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class CineApp {
    static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    static ArrayList<Sala> salas = new ArrayList<Sala>();
    static ArrayList<Funcion> funciones = new ArrayList<Funcion>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        salas.add(new Sala(1, "35mm"));
        salas.add(new Sala(2, "35mm"));
        salas.add(new Sala(3, "3D"));
        while (true) {
            System.out.println("/n--- menu principal---");
            System.out.println("1. Crear película");
            System.out.println("2. Asignar función");
            System.out.println("3. Vender entradas");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearpelicula();
                    break;
                case 2:
                    asignarFuncion();
                    break;
                case 3:
                    venderEntradas();
                    break;
                case 4:
                    System.out.println("saliendo del menu manito");
                    return;

                default:
                    System.out.println("Opción inválida");

            }

        }

    }

    public static void crearPelicula() {
        System.out.print("Nombre de la película: ");
        String nombre = scanner.nextLine();
        System.out.print("Idioma: ");
        String idioma = scanner.nextLine();
        System.out.print("Tipo (35mm o 3D): ");
        String tipo = scanner.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = scanner.nextInt();
        scanner.nextLine();

        Pelicula pelicula = new Pelicula(nombre, idioma, tipo, duracion);
        peliculas.add(pelicula);
        System.out.println("Película creada: " + pelicula);
    }

}