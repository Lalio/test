package com.baidu.xyj.test;

public class Main {
    public static void main(String[] args) {
//        new SonOfHelloWorld();
        System.out.println(System.currentTimeMillis());
        try {
            System.out.println(2);
            throw  new NullPointerException();
        } catch (Exception e) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
