package Cine;

public class PELICULA {
    String nombre;
    String idioma;
    String tipo;
    int duracion;

    public PELICULA(String nombre, String idioma, String tipo, int duracion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    @Override

    public String toString() {
        return nombre + " (" + idioma + ", " + tipo + ", " + duracion + " mins)";
    }






    
}