package com.scaler.javabasics;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreading {
    Runnable r = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("iteration " + i + " running on " + Thread.currentThread().getName());
            }
        }
    };

    ThreadPoolExecutor executor = new ThreadPoolExecutor(
            1,
            5,
            1L,
            TimeUnit.SECONDS,
            new PriorityBlockingQueue<Runnable>()
    );

    void runAllThreads() {
        // Q: make three runs of r parallelly on the executor
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);

        // Q2: Print odd nos on thread-1 and even on thread-2 but sequentially
    }


}
