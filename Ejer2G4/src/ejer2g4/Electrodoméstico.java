
package ejer2g4;

public class Electrodoméstico {
    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;
    
    public Electrodoméstico (){}
    public Electrodoméstico (double precio, String color, char letra, int peso){
        this.precio=precio;
        this.color=comprobarColor(color);
        this.consumo=comprobarConsumoEnergetico(letra);
        this.peso=peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = comprobarConsumoEnergetico(consumo);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
        letra=Character.toUpperCase(letra);
        switch(letra){
            case 'A': 
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return letra;
            default: return 'F';
        }
    }
    
    private String comprobarColor(String color){
        color=color.toLowerCase();
        switch(color){
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color;
            default: return "blanco";
        }
    }
    
    public void precioFinal(){
        switch(consumo){
            case 'A':
                precio+=1000;
                break;
            case 'B':
                precio+=800;
                break;
            case 'C':
                precio+=600;
                break;
            case 'D':
                precio+=500;
                break;
            case 'E':
                precio+=300;
                break;
            case 'F':
                precio+=100;
                break;
        }
        
        if(peso>=1 && peso<=19){
            precio+=100;
        }else if(peso>=20 && peso<=49){
            precio+=500;
        }else if(peso>=50 && peso<=79){
            precio+=800;
        }else if(peso>=80){
            precio+=1000;
    }
        
    }
    
}
