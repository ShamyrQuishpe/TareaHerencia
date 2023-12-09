public class Mototaxi extends Motocicleta {

    public int numAsientos;
    public String tamCajon;

    public Mototaxi(String marca, String modelo, int anoFab, int peso, String color, int numAsientos, String tamCajon) {
        super(marca, modelo, anoFab, peso, color);
        this.numAsientos = numAsientos;
        this.tamCajon = tamCajon;
    }


    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("El numero de asientos es de: " + numAsientos);
        System.out.println("El tamaño del cajon es: " + tamCajon);
    }
}
