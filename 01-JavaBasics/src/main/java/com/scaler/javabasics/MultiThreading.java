package com.scaler.javabasics;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreading {
    Runnable r = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("iteration " + i + " running on " + Thread.currentThread().getName());
            }
            System.out.println("======================= END ================== " + Thread.currentThread().getName());
            executor.shutdown();
        }
    };

    ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());

    void runAllThreads() {
        // Q: make three runs of r parallelly on the executor
        executor.execute(r);
        executor.execute(r);
        executor.execute(r);

        // Q2: Print odd nos on thread-1 and even on thread-2 but sequentially
    }


}
