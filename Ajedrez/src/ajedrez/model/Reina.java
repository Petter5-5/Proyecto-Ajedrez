package ajedrez.model;

import ajedrez.model.*;
import java.util.ArrayList;
import java.util.List;

public class Reina extends Pieza
{
    public Reina(Color color, int fila, int col)
    {
        super(color, Tipo.TORRE, fila, col);
    }
    
    @Override
    public List<Movimiento> movimientosValidos(Tablero tablero)
    {
        List lista = new ArrayList();
        
        //Torre
        deslizar(lista, tablero, -1, 0);
        deslizar(lista, tablero, 1, 0);
        deslizar(lista, tablero, 0, -1);
        deslizar(lista, tablero, 0, 1);
        //Alfil
        deslizar(lista, tablero, -1, 1);
        deslizar(lista, tablero, 1, 1);
        deslizar(lista, tablero, 1, -1);
        deslizar(lista, tablero, -1, -1);
        
        return lista;
    }
}
