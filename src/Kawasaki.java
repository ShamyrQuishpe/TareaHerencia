public class Kawasaki extends Mototaxi{

    public String Arranque;
    public String tipo_carnet;

    public Kawasaki(String marca, String modelo, int anoFab, int peso, String color, int numAsientos, String tamCajon, String Arranque, String tipo_carnet) {
        super(marca, modelo, anoFab, peso, color, numAsientos, tamCajon);
        this.tipo_carnet=tipo_carnet;
        this.Arranque=Arranque;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("El arranque es : " + Arranque);
        System.out.println("El tipo de carnet es: " + tipo_carnet);
    }
}
