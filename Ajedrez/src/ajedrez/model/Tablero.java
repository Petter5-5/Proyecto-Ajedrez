package ajedrez.model;

import java.util.List;
import ajedrez.model.Pieza.Color;
import ajedrez.model.Pieza.Tipo;


public class Tablero 
{
    private Pieza[][] casillas = new Pieza[8][8];
    private Movimiento enPassantObjetivo;
    private List<Pieza> capturasBlancas;
    private List<Pieza> capturaNegras;
    
    public Tablero()
    {
        inicializador();
    }
    
    public void inicializador()
    {
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                casillas[i][j] = null;
            }
        }
        
        capturasBlancas.clear();
        capturaNegras.clear();
        enPassantObjetivo = null;
        
        colocarPiezas(Color.BLANCO, 0);
        colocarPiezas(Color.NEGRO, 7);
        
        for(int i = 0; i < 8; i++)
        {
            casillas[1][i] = new Peon(Color.BLANCO, 1, c);
            casillas[6][i] = new Peon(Color.NEGRO, 6, c);
        }
    }
    
    private void colocarPiezas(Color color, int fila)
    {
        
    }
    
    public static boolean enRango(int fila, int col)
    {
        return fila >= 0 && fila < 8 && col >= 0 && col < 8;
    }
    
    public Pieza getPieza(int fila, int col)
    {
        return casillas[fila][col];
    }

    public Movimiento getEnPassantObjetivo() {
        return enPassantObjetivo;
    }
    
}
