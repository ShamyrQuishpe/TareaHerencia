public class SUV extends Camioneta {
    public int Precio;

    public int num_airbags ;

    public SUV(String marca, String modelo, int anoFab, int numPuertas, String color, int Capacidad_Remolque, String Tamano_Cabina, int Precio, int num_airbags) {
        super(marca, modelo, anoFab, numPuertas, color, Capacidad_Remolque, Tamano_Cabina);
        this.Precio=Precio;
        this.num_airbags=num_airbags;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de Airbags: " + num_airbags);
        System.out.println("Precio: " + Precio);
    }
}

