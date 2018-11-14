package com.example.lib_samei;

public class T1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
