/*
* this is the class for the 2.2 Lab
 */

public class Television {
    String brand = "Toshiba";      // brand of television
    int volume = 5;        // current volume
    Boolean isOn = false;

    void turnOn() {
        if (isOn) {
            System.out.println("It's already turned on!");
        } else {
            isOn = true;
            System.out.println("telvision is on!!");
        }
    }

    void turnOff() {
        if (!isOn) {
            System.out.println("It's already turned off!");
        } else {
            isOn = false;
            System.out.println("television is off!!");
        }
    }

    void increaseVoluem() {
        if (isOn) {
            volume = volume + 1;
            System.out.println("Volume is now " + volume);
        }
    }

    void decreaseVolume() {
        if (isOn) {
            volume = volume - 1;
            System.out.println("Volume is now " + volume);
        }
    }

    public String toString(){
        return "Television: brand=" + this.brand + ", volume=" + this.volume;
    }
}
