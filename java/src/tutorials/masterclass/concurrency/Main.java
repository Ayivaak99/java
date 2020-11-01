package tutorials.masterclass.concurrency;

import static tutorials.masterclass.concurrency.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the Main thread");

        Thread threadOne = new ThreadOne();
        threadOne.setName("== Thread One ==");
        threadOne.start();

        new Thread(() -> System.out.println(ANSI_GREEN + "Hello from the Anonymous thread")).start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from Anonymous MyRunnable() implementation of run()");
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello from Main thread");

    }
}
