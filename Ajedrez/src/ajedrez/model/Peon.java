package ajedrez.model;

import ajedrez.model.*;
import java.util.ArrayList;
import java.util.List;

public class Peon extends Pieza
{
    public Peon(Color color, int fila, int col)
    {
        super(color, Tipo.PEON, fila, col);
    }

    @Override
    public List<Movimiento> movimientosValidos(Tablero tablero) 
    {
        List<Movimiento> lista = new ArrayList<>();
        
        //Avance simple
        int direccion = (getColor() == Color.BLANCO) ? -1 : 1;
        
        int filaAvance = getFila() + direccion;
        
        if(Tablero.enRango(filaAvance, getCol()) && tablero.getPieza(filaAvance, getCol()) == null)
        {
            Movimiento m = new Movimiento(getFila(), getCol(), filaAvance, getCol());
            
            if(filaAvance == 0 || filaAvance == 7)
                m.setEsPromocion(true);
            lista.add(m);
        }
        
        //Avance Doble
        int filaInicial = (getColor() == Color.BLANCO) ? 6 : 1;
        int filaAvanceDoble = getFila() + 2 * direccion;
        
        if(getFila() == filaInicial && tablero.getPieza(filaAvanceDoble, getCol()) == null)
        {
            lista.add(new Movimiento (getFila(), getCol(), filaAvanceDoble, getCol()));
        }
        
        //Captura en diagonal
        for(int deltaCol : new int[]{-1, 1})
        {
            int filaCaptura = getFila() + direccion;
            int colCaptura = getCol() + deltaCol;
            
            if(Tablero.enRango(filaCaptura, colCaptura))
            {
                Pieza piezaDestino = tablero.getPieza(filaCaptura, colCaptura);
                if(piezaDestino != null && piezaDestino.getColor() != getColor())
                {
                    Movimiento m = new Movimiento(getFila(), getCol(), filaCaptura, colCaptura);
                    m.setPiezaCapturada(true);
                    
                    if(filaCaptura == 0 || filaCaptura == 7)
                        m.setEsPromocion(true);
                    lista.add(m);
                }
            }
            //Captura en Passant
            Movimiento enPassantObejetivo = tablero.getEnPassantObjetivo();
        
            if(enPassantObejetivo != null && filaCaptura == enPassantObejetivo.getDestinoFila() && colCaptura == enPassantObejetivo.getDestinoCol())
            {
                Movimiento m = new Movimiento(getFila(), getCol(), filaCaptura, colCaptura);
                m.setEsEnPassant(true);
                lista.add(m);
            }
        }
        return lista;
    }
}
