public class Main {
    public static void main(String[] args) {
        Runnable runnable = new NumberGenerator();
        Runnable runnable1 = new NumberGenerator1();

        Thread th = new Thread(runnable);
        Thread th1 = new Thread(runnable1);


        try {
            th.start();
            th.join();
            th1.start();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
