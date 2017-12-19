package com.demo;

/**
 * @author shuai.li
 * @since 2017-09-22 PM10:46
 */
public class Test {

    public static void main(String[] args) {
        SellWindow sellWindow = new SellWindow();
        for (int i = 1; i < 4; i++)
        {
            new Thread(sellWindow, String.valueOf(i)).start();
        }
    }

}
