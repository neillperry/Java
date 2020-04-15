/*
*    this is the driver code for Lab 2.2
 */


public class TelevisionTest {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television();

        tv1.turnOff();

        tv2.turnOn();
        tv2.increaseVoluem();
        tv2.increaseVoluem();
        tv2.increaseVoluem();
        tv2.decreaseVolume();
        tv2.turnOff();
    }
}
