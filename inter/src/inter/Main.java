package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inm = new Scanner(System.in);


        System.out.println("Tutar Giriniz : ");
        double price = inm.nextDouble();

        System.out.println("Kart Numarasını Giriniz : ");
        String cardnumber = inm.next();

        System.out.println("Tarihi Giriniz : ");
        String date = inm.next();

        System.out.println("Güvenlik Kodu : ");
        String cv = inm.next();

        System.out.println("1.A Bankası");
        System.out.println("2.B Bankası");
        System.out.println("3.C Bankası");
        System.out.println("Banka Seçiniz : ");

        int selectBank = inm.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos = new ABankasi("sda","123123123","batuh");
                aPos.connect("2321.323.32");
                aPos.payment(price, cardnumber, date,cv);
                break;
            case 2 :
               BBankasi bPos = new BBankasi("Garanti Bankası","GARAN","Güvenlik");
               bPos.connect("Garanti");
               bPos.payment(price,cardnumber,date,cv);


            default:
                System.out.println("Geçerli Bir Banka Seçiniz !");
        }

    }
}
