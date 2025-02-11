import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Scanner teclado = new Scanner(System.in);

    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    Jugador jugadorActual;


    public String jugadores(){

        Jugador jugador1 = new Jugador("Jugador 1 ", "🔵");
        Jugador jugador2 = new Jugador("Jugador 2 ", "🔴");

        jugadores.add(jugador1);
        jugadores.add(jugador2);
    }

    public void turnoJugador(){

        int turno = 0 ;
       jugadorActual = jugadores.get(turno);
        System.out.println("El turno es de "+ jugadorActual.getNombre() + "con la ficha " + jugadorActual.getSimbolo());

      while (true){

     } turno = (turno + 1) % 2;
     jugadorActual = jugadores.get(turno);
     System.out.println("El turno es de "+ jugadorActual.getNombre() + "con la ficha " + jugadorActual.getSimbolo());


    }
}
