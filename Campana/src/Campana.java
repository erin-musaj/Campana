public class Campana implements Runnable{
    private String suono;
    private int rintocchi;

    public Campana(String suono, int rintocchi){
        this.suono=suono;
        this.rintocchi=rintocchi;
    }

    public void run(){
        for(int i = 0; i<rintocchi; i++){
            System.out.println(i + " " + suono + "\n");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}
