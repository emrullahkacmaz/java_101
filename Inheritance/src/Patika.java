public class Patika {
    public static void main(String[] args) {
        Calisan c1= new Calisan("emrullah kaçmaz", "0543", "e@gmail.com");

        c1.yemekhane();
        Akademisyen a1= new Akademisyen("emrah kaçmaz","0452","a@gmail.com", "bolum", "");

        a1.giris();

        a1.derseGir();

        Memur m1= new Memur("izzet çınar", "05422","g@gmail.com","fen fakultesi","18-09");
        System.out.println(m1.getMesai());

        OgretimGorevlisi o1= new OgretimGorevlisi("edip kaçmaz","0546","edip@gmail.com","mat","doç","5");
        System.out.println(o1.getKapiNo());
        o1.derseGir();

    }
}
