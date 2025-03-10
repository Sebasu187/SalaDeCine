package Cine;
public class funcion {
    Sala sala;
    String horario;
    Pelicula paelicula;
    public funcion(Sala sala, String horario, Pelicula pelicula){
        this.sala = sala;
        this.horario = horario;
        this.pelicula = pelicula;
    }
    @override 
    public String toString(){
        return "Sala" + sala.numero + "-" + horario + "-" + pelicula.nombre;
    }


}