import java.util.Scanner;

public class lessonTwo {
    public static void main(String[] args) {

         int mat, fizik, kimya, muzik;
         Scanner input= new Scanner(System.in);

        System.out.print("mat notu:");
        mat= input.nextInt();
        System.out.print("fizik notu:");
        fizik= input.nextInt();
        System.out.print("kimya notu:");
        kimya= input.nextInt();
        System.out.print("muzik notu:");
        muzik= input.nextInt();


        double toplam= (mat+fizik+kimya+muzik);
        double sonuc= toplam/4;
        System.out.println("ortalama");
        System.out.println(sonuc);
        if (sonuc >=50){
            System.out.println("geçti");
        }
        else {
            System.out.println("kaldı");
        }
    }
}
