import java.util.Scanner;
public class SoalDuaSedang {
    public static double hitungVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }

    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan jari jari tabung: ");
        double radius = input.nextDouble();
        System.out.println("Masukkan tinggi tabung: ");
        double height = input.nextDouble();
        double volumeTabung = hitungVolume(radius,height);
        System.out.println("Volume tabung dengan jari jari: " + radius + " dan tinggi: " + height +  " adalah: " + volumeTabung);
       
    }
}


