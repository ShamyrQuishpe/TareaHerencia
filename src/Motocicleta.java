public class Motocicleta extends Vehiculo {

    public int peso;
    public String color;

    public Motocicleta(String marca, String modelo, int anoFab, int peso, String color){
        super(marca, modelo, anoFab);
        this.peso = peso;
        this.color = color;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("El peso es de: " + peso);
        System.out.println("Color: " + color);
    }
}

