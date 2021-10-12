public class NumberGenerator1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println("thread odd "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
