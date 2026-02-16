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
    private int col;
    private boolean aMovido = false;
    
    private static String[][] SIMBOLOS = {
        { "♔", "♚" },
        { "♕", "♛" },
        { "♖", "♜" },
        { "♗", "♝" },
        { "♘", "♞" },
        { "♙", "♟" }
    };
    
    public Pieza(Color color, Tipo tipo, int fila, int col)
    {
        this.color = color;
        this.tipo = tipo;
        this.fila = fila;
        this.col = col;
    }
    
    
    
    public abstract List<Movimiento> movimientosValidos(Tablero tablero);
    
    public String getSimbolo(Color color, Tipo tipo)
    {
        return SIMBOLOS[color.ordinal()][tipo.ordinal()];
    }
    
    protected void agregarSiValido(List lista, Tablero tablero, int destinoFila, int destinoCol)
    {
        if(Tablero.enRango(destinoFila, destinoCol))
        {
            Pieza destino = tablero.getPieza(destinoFila, destinoCol);
            if(destino == null || destino.getColor() != this.color)
            {
                lista.add(new Movimiento(fila, col, destinoFila, destinoCol));
            }
        }
    }

    protected void deslizar(List lista, Tablero tablero, int dFila, int dCol)
    {
        int f = fila + dFila;
        int c = col + dCol;
        
        while(Tablero.enRango(f, c))
        {
            Pieza dest = tablero.getPieza(fila, col);
            if(dest == null)
                lista.add(new Movimiento(fila, col, f, c));
            else
            {
                if(dest.getColor() != this.color)
                    lista.add(new Movimiento(fila, col, f, c));
                break;
            }
            f += dFila;
            c += dCol;
        }
    }
    
    public Color getColor() {
        return color;
    }

    public int getFila() {
        return fila;
    }

    public int getCol() {
        return col;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public boolean isaMovido() {
        return aMovido;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setCol(int columna) {
        this.col = col;
    }

    public void setaMovido(boolean aMovido) {
        this.aMovido = aMovido;
    }
    
    
}
