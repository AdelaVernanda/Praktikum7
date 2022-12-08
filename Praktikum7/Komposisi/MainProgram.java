public class MainProgram {
    public static void main(String[] args) {
        Manusia adel = new Manusia("Snapdragon", 80);

        adel.merk = "Samsung S22";
        adel.powerOn();
        adel.run();
        adel.powerOff();
    }
}