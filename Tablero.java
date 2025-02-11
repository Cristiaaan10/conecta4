import java.util.Scanner;
import java.util.SplittableRandom;

public class Tablero {

    private final int filas ;
    private final int columnas ;

    private Ficha[][] tablero;


    public Tablero(){
        this.filas =6;
        this.columnas = 7;
        this.tablero = new Ficha[filas][columnas];
        inicializarTablero();



    }



    public void inicializarTablero(){

        for (int i = 0; i<filas; i++){
            for (int j = 0; j<columnas; j++) {
                tablero[i][j] = new Ficha('⬜');

            }
        }
    }
public void impremirTablero(){

    for (int i = 0; i<filas; i++){
        for (int j = 0; j<columnas; j++){
            System.out.print(tablero[i][j].getFicha());
        }
        System.out.println();
    }
}




}
