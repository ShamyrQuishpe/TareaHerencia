// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String [] args) {
        Vehiculo vei1=new Vehiculo("KIA","Picanto",2015);
        Automovil auto1=new Automovil("Chevrolet","Colorado",2019,5,"Beige");
        Motocicleta moto1=new Motocicleta("Honda","Maisto",2020,135,"Rojo");
        SUV suvi1=new SUV("Chevrolet","SUV",2019,5,"Celeste",1000,"Medio",24500,4);
        Camioneta camio1=new Camioneta("Ford","Raptor",2020,4,"Negro",13200,"Grande");
        Kawasaki kawa1 = new Kawasaki("Kawasaki", "Deportiva", 2023, 164, "Verde", 2, "pequeño", "Electrico", "A");
        Mototaxi kawa2 = new Mototaxi("Kawasaki", "deportiva", 2023, 163, "roja", 2, "Grande");
        vei1.mostrarInformacion();
        auto1.mostrarInformacion();
        moto1.mostrarInformacion();
        suvi1.mostrarInformacion();
        camio1.mostrarInformacion();
        kawa1.mostrarInformacion();
        kawa2.mostrarInformacion();
    }
}
