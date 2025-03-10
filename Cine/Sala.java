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

    public void mostrarAsientos() {
        System.out.println("Asientos de la sala "+numero+" ("+tipo+"):" );
        for(int i = 0; i < asientos.length; i++) {
            for(int j = 0; j < asientos[i].length; j++) {
                char fila = (char) ('A' + i);
                System.out.print(fila + (j + 1)+ ":" + (asientos[i][j]? "X" : "0"));   
            }
            System.out.println();
        }
    }
    public boolean comprarAsiento(String asiento) {
        int fila = asiento.charAt(0)- 'A';
        int columna = Integer.parseInt(asiento.substring(1)) - 1;
        if (fila >= 0 && fila < asientos.length && columna >= 0 && columna < asientos[0].length) {
            if(!asientos[fila][columna]){
                asientos[fila][columna] = true;
                return true;
            }
        }
        return false;
    }
}