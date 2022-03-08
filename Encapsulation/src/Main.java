public class Main {

    public static void main(String[] args) {

        Book b1= new Book("hikayeler", 100);
        Book b2= new Book("şiirler", -100);


        System.out.println(b1.getName());
        b1.setName("romanlar");
        System.out.println(b1.getName());

        System.out.println(b2.getPageNumber());
        b2.setPageNumber(48);
        System.out.println(b2.getPageNumber());
    }
}
