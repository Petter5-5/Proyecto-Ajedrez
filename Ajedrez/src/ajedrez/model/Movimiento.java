package ajedrez.model;

public class Movimiento 
{
    private final int origenFila;
    private final int origenCol;
    private final int destinoFila;
    private final int destinoCol;
    
    private boolean esEnroque = false;
    private boolean esEnPassant = false;
    private boolean esPromocion = false;
    private boolean piezaCapturada = false;
    
    public Movimiento(int origenFila, int origenCol, int destinoFila, int destinoCol)
    {
        this.origenFila = origenFila;
        this.origenCol = origenCol;
        this.destinoFila = destinoFila;
        this.destinoCol = destinoCol;
    }

    public int getOrigenFila() {
        return origenFila;
    }

    public int getOrigenCol() {
        return origenCol;
    }

    public int getDestinoFila() {
        return destinoFila;
    }

    public int getDestinoCol() {
        return destinoCol;
    }

    public boolean isEsEnroque() {
        return esEnroque;
    }

    public boolean isEsEnPassant() {
        return esEnPassant;
    }

    public boolean isEsPromocion() {
        return esPromocion;
    }

    public void setEsPromocion(boolean esPromocion) {
        this.esPromocion = esPromocion;
    }

    public void setEsEnroque(boolean esEnroque) {
        this.esEnroque = esEnroque;
    }

    public void setEsEnPassant(boolean esEnPassant) {
        this.esEnPassant = esEnPassant;
    }

    public void setPiezaCapturada(boolean piezaCapturada) {
        this.piezaCapturada = piezaCapturada;
    }
    
    
}
