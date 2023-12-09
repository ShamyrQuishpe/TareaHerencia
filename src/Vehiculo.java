public class Vehiculo {
    public String marca;
    public String modelo;
    public int anoFab;

    public Vehiculo(String marca, String modelo, int anoFab){
        this.marca=marca;
        this.modelo=modelo;
        this.anoFab=anoFab;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anoFab);
    }
}
