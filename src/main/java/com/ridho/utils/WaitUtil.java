package com.ridho.utils;

public class WaitUtil {
    public static void pause(int milliseconds) {

        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
