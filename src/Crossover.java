public class Crossover extends Camioneta {
    public int Numero_Cilindros;
    public String Transmision;

    public Crossover(String marca, String modelo, int anoFab, int numPuertas, String color, int Capacidad_Remolque, String Tamano_Cabina,int Numero_Cilindro, String Transmision) {
        super(marca, modelo, anoFab, numPuertas, color, Capacidad_Remolque, Tamano_Cabina);
        this.Numero_Cilindros = Numero_Cilindro;
        this.Transmision = Transmision;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Número de cilindros: " + Numero_Cilindros);
        System.out.println("Transmision: " + Transmision);
    }

}

