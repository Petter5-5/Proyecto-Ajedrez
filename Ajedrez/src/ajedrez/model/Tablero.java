package ajedrez.model;

import java.util.List;

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
        
        colocarPiezas(Color.);
    }
    
    private void colocarPiezas(Color color, int fila)
    {
        
    }
}
