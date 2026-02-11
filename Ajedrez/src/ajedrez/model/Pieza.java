package ajedrez.model;

import java.util.List;
import java.util.ArrayList;

public abstract class Pieza 
{
    enum Color
    {
        BLANCO,
        NEGRO
    }
    
    enum Tipo
    {
        REY,
        REINA,
        TORRE,
        ALFIL,
        CABALLO,
        PEON
    }
    
    private Color color;
    private Tipo tipo;
    private int fila;
    private int columna;
    private boolean aMovido;
    
    private static String[][] SIMBOLOS = {
        { "♔", "♚" },
        { "♕", "♛" },
        { "♖", "♜" },
        { "♗", "♝" },
        { "♘", "♞" },
        { "♙", "♟" }
    };
    
    public Pieza(Color color, Tipo tipo, int fila, int columna)
    {
        this.color = color;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }
    
    
    
    public abstract List<Movimiento> movimientosValidos(Tablero tablero);
    
    public String getSimbolo(Color color, Tipo tipo)
    {
        return SIMBOLOS[color.ordinal()][tipo.ordinal()];
    }
    
    public 
}
