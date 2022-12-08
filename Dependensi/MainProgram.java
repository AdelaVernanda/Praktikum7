public class MainProgram {
    public static void main(String[] args) {
        Phone mesin = new Phone();

        mesin.merk = "Snapdragon";
        mesin.volume = 80;

        Manusia adel = new Manusia();

        adel.merk = "Samsung S22";
        adel.mesin = mesin;
        adel.powerOn();
        adel.run();
        adel.powerOff();
    }
}