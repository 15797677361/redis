package com.cn.redis.controller;
public class TestSynMethod1 {
    synchronized void hello() {

    }

    public static void main(String[] args) {
        String anything = "anything";
        synchronized (anything) {
            System.out.println("hello word");
        }
    }
}

