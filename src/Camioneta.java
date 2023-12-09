public class Camioneta extends Automovil{
    public int Capacidad_Remolque;

    public String Tamano_Cabina;

    public Camioneta(String marca, String modelo, int anoFab, int numPuertas, String color, int Capacidad_Remolque,String Tamano_Cabina) {
        super(marca, modelo, anoFab, numPuertas, color);
        this.Capacidad_Remolque = Capacidad_Remolque;
        this.Tamano_Cabina = Tamano_Cabina;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Capacidad de Remolque: " + Capacidad_Remolque);
        System.out.println("Tamaño de Cabina: " + Tamano_Cabina);
    }
}
