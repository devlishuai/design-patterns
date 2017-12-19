package com.demo;

/**
 * @author shuai.li
 * @since 2017-09-22 PM10:57
 */
public class SellWindow implements Runnable {

    Sell sell = new Sell();

    @Override
    public void run() {

            sell.sale();
        }


}
