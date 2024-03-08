public class CampanaEx extends Thread{
        private String suono;
        private int rintocchi;

        public CampanaEx(String suono, int rintocchi){
            this.suono=suono;
            this.rintocchi=rintocchi;
        }

        public void run(){
            for(int i = 0; i<rintocchi; i++){
                System.out.println(i + " " + suono + "\n");
                try {
                    this.sleep(100);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
}

