import java.util.Scanner;

public class Jugador {

    private Scanner nombre;
    private String simbolo;

    public Jugador(Scanner nombre, String simbolo){
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public Scanner getNombre() {
        return nombre;
    }

    public String getSimbolo(){
        return simbolo;
    }
}
