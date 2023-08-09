
package ejer2g4;

public class Lavadora extends Electrodoméstico {
    private int carga;

    public Lavadora() {}

    public Lavadora(int carga, double precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga>30){
            precio+=500;
        }
    }
}
