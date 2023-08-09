
package ejer2g4;

public class Ejer2G4 {

    public static void main(String[] args) {
        Lavadora lav = new Lavadora (35, 650, "negro", 'B', 72);
        Televisor tele = new Televisor (70, true, 1200, "negro", 'A', 10);
        lav.precioFinal();
        System.out.println("La lavadora que acabas de adquirir te dolió unos "+lav.getPrecio());
        tele.precioFinal();
        System.out.println("Alto tele "+tele.getPrecio());
}
}