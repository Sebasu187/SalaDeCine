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
            



            
        }
        
    }

    
}