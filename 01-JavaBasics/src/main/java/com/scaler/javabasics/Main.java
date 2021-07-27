package com.scaler.javabasics;

/**
 * Entry point of our project
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        var downloader = new ExampleComDownloader();
//        System.out.println(
//                downloader.getWebpageSource()
//        );

        var mt = new MultiThreading();
        mt.runAllThreads();
    }
}
