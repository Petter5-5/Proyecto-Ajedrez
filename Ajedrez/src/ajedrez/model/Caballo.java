package ajedrez.model;

import ajedrez.model.*;
import java.util.ArrayList;
import java.util.List;

public class Caballo extends Pieza
{
    public Caballo(Color color, int fila, int col)
    {
        super(color, Tipo.TORRE, fila, col);
    }
    
    @Override
    public List<Movimiento> movimientosValidos(Tablero tablero)
    {
        List lista = new ArrayList<>();
        
        int[][] saltos = 
        {
            {-2, -1},
            {-2, 1},
            {2, -1},
            {2, 1},
            {-1, -2},
            {-1, 2},
            {1, -2},
            {1, 2}
        };
        
        for(int[] s : saltos)
        {
            agregarSiValido(lista, tablero, getFila() + s[0], getCol() + s[1]);
        }
        
        return lista;
    }
}
