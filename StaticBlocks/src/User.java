public class User {

    public String name;
    public static  int counter=0;


static {

    System.out.println("2. statik kod bloğu");
    int random= (int) (Math.random()*10);
    System.out.println("3. random sayı: "+ random);
    counter=random;
    System.out.println("4. counter değeri: "+ counter);

}

    public User(String name){

        this.name=name;
        counter++;
        System.out.println("counter yeni değeri: "+ counter);
    }
}
