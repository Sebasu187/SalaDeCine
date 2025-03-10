package Cine;
public class Sala {
    int numero;
    boolean[][] asientos;
    String tipo;

    public Sala (int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        if (tipo.equals("35mm")) {
            asientos = new boolean [8][12];
        } else {
            asientos = new boolean [6][12];
        }
    }
}