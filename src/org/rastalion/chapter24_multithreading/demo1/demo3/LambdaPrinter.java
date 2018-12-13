package org.rastalion.chapter24_multithreading.demo1.demo3;

/**
 * Created by Mrrobot on 7/06/2018 javabasics-workspace.
 */
public class LambdaPrinter {

    //OR we can use lambdas like this
    //nice :D
    public static void main (String[] args) {

        Thread t1 = new Thread(() -> {
            print(50, '*');
            System.out.println("Job t1 is done");

        });

        Thread t2 = new Thread(() -> {
            print(50, '#');
            System.out.println("Job t2 is done");
        });

        Thread t3 = new Thread(() -> {
            print(1_000_000, '$');
            System.out.println("Job t3 is done");

            // add this
            while (t1.isAlive() || t2.isAlive()) {
                try {
                    Thread.sleep(10_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        });

        //add this to show daemon threads
        t3.setDaemon(true);


        try {
            startThreadcheckState(t1, Thread.MAX_PRIORITY);
            //This is no way to know for sure that this works!!!
            startThreadcheckState(t2, Thread.NORM_PRIORITY);
            startThreadcheckState(t3, Thread.MIN_PRIORITY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /*
    This belongs to demo4
     */
    private static void startThreadcheckState (Thread thread, int priority) throws InterruptedException {
        System.out.println(thread.getName() + ": " + thread.getState());
        thread.start();
//        thread.join();
//        thread.setPriority(priority);
        System.out.println(thread.getName() + ": " + thread.getState());
    }

    //It's a nice eh, it is me Meriooooo
    private static void print (int count, char character) {
        for (int i = 0; i <= count; i++) {
            System.out.print(character);
        }
    }

}
