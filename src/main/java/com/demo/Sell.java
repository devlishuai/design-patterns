package com.demo;

/**
 * @author shuai.li
 * @since 2017-09-22 PM10:44
 */
public class Sell {
    Integer tickNum = 0;


    public void sale() {
        while (tickNum < 500) {
            synchronized (this) {
                System.out.println(
                        "窗口 " + Thread.currentThread().getName() + " 已售出第 " + ++tickNum
                                + " 张票");
            }
        }
    }
}
