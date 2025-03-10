package Cine;
public class funcion {
    Sala sala;
    String horario;
    PELICULA pelicula;
    public funcion(Sala sala, String horario, PELICULA pelicula){
        this.sala = sala;
        this.horario = horario;
        this.pelicula = pelicula;
    }
    @Override 
    public String toString(){
        return "Sala" + sala.numero + "-" + horario + "-" + pelicula.nombre;
    }


}