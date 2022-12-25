import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz =0.94;
        double patlıcan=5.00;

        double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg,toplam;

        Scanner oku= new Scanner(System.in);
        armutKg=oku.nextDouble();
        System.out.println("Armut kaç kilo? :");
        elmaKg=oku.nextDouble();
        System.out.println("Elma kaç kilo? :");
        domatesKg=oku.nextDouble();
        System.out.println("Domates kaç kilo? :");
        muzKg=oku.nextDouble();
        System.out.println("Muz kaç kilo? :");
        patlıcanKg=oku.nextDouble();
        System.out.println("Patlıcan kaç kilo? :");

        toplam=(armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlıcan*patlıcanKg);
        System.out.println("Toplam Ödemeniz Gereken Tutar: "+toplam);
    }
}
