import java.util.Scanner;

public class userEnter {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("user name: ");
        userName= input.nextLine();

        System.out.print("password: ");
        password= input.nextLine();

        if (userName.equals("emrullah") && password.equals("12345")){
            System.out.println("giriş yaptınız !");
        }
        else {
            System.out.println("geçersiz giriş !");
        }

    }
}
