package com.entertainment.test;
import com.entertainment.Television;

public class TelevisionTest {

    public static void main(String[] args) {
        Television tele = new Television();
        tele.setBrand("Duff");
        tele.setVolume(4);
        System.out.println(tele.toString());
    }
}
