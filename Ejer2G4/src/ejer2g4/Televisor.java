
package ejer2g4;

public class Televisor extends Electrodoméstico {
    private float pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(float pulgadas, boolean tdt, double precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(pulgadas>40){
            precio+=precio*0.3;
        }
        if(tdt){
            precio+=500;
        }
    }
    
    
    
}
