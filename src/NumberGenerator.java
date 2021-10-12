public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0){
                System.out.println("threat even"+i);
            }
            ;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
