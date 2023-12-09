public class Automovil extends Vehiculo {
    public int numPuertas;
    public String color;

    public Automovil(String marca, String modelo, int anoFab, int numPuertas, String color){
        super(marca, modelo, anoFab);
        this.numPuertas=numPuertas;
        this.color=color;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numPuertas);
        System.out.println("Color: " + color);
    }
}
