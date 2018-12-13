package com.demoTime.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Mrrobot on 25/05/2018 javabasics-workspace.
 */
public class QueueApp {

    public static void main (String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("John");
        queue.offer("Sue");
        queue.offer("Ellen");
        queue.offer("Richard");

        //Handling Queue
        String s = queue.peek();
        while (s != null) {
            System.out.println("About to handle " + s);
            s = queue.poll();
            System.out.println("Handling " + s);
            s = queue.peek();
        }

    }

}
