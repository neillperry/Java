

public class Television {
    private String brand = "Toshiba";      // brand of television
    private int volume = 5;        // current volume
    private Boolean isOn = false;

    // create a Television with default values
    public Television(){}

    // create a Television with specified values
    public Television(String brand, int volume, boolean isOn){
        setVolume(volume);
        setBrand(brand);
        this.isOn = isOn;
    }

    public void setVolume(int volume1){
        this.volume = volume1;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public String toString(){
        return "Television: brand="+ getBrand() + ", volume=" + getVolume();
    }

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
}
