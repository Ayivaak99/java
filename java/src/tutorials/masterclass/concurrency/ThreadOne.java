package tutorials.masterclass.concurrency;
import static tutorials.masterclass.concurrency.ThreadColor.ANSI_BLUE;

public class ThreadOne extends Thread{
    @Override
    public void run() {
//        super.run();
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm wake");
    }
}
