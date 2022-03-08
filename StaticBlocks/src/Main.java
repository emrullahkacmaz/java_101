public class Main {

    public static void main(String[] args) {

        System.out.println("program başladı");
        User u1 = new User("emrullah");
        User u2 = new User("spyros");

        User u3 = new User("eleni");

        System.out.println("counter son değer:"+ User.counter);
        System.out.println("program bitti");
    }
}
