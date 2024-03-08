public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread din =new Thread(new Campana("din", 3));
        Thread don =new Thread(new Campana("don", 3));
        Thread dan =new Thread(new Campana("dan", 3));

        din.start();
        don.start();
        dan.start();

        din.join();
        don.join();
        dan.join();

        CampanaEx dinEx = new CampanaEx("din", 3);
        CampanaEx donEx = new CampanaEx("don", 3);
        CampanaEx danEx = new CampanaEx("dan", 3);

        dinEx.start();
        donEx.start();
        danEx.start();
    }
}