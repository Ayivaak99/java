package main.java.tutorials.masterclass.concurrency;

import static ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the Main thread");

        Thread threadOne = new tutorials.masterclass.concurrency.ThreadOne();
        threadOne.setName("== Thread One ==");
        threadOne.start();

        new Thread(() -> System.out.println(ANSI_GREEN + "Hello from the Anonymous thread")).start();

        Thread myRunnableThread = new Thread(new tutorials.masterclass.concurrency.MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from Anonymous MyRunnable() implementation of run()");
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello from Main thread");

    }
}
