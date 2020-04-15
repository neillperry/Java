

public class Television {
    // INstance properties
    private String brand;
    private int volume = 5;
    private String displayType = "LED";

    // class variables
    private Boolean isOn = false;
    private int oldVolume;
    private boolean muted = false;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    // CONSTRUCTORS
    // create a Television with default values
    public Television(){}

    public Television(String brand, int volume, String display){
        setVolume(volume);
        setBrand(brand);
        setDisplayType(display);
    }


    // GETTERS
    public int getVolume(){
        return this.volume;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    // SETTERS
    private boolean isVolumeValid(int volume1) {
        if (volume1 > this.MAX_VOLUME || volume1 < this.MIN_VOLUME)  {
            return false;
        } else { return true; }
    }

    public void setVolume(int volume1){
        if (this.isVolumeValid(volume1)) {
            this.volume = volume1;
            this.muted = false;
        } else {
            System.out.println("Invalid volume: " + volume1 + ". Valid range is " + MIN_VOLUME + "-" + MAX_VOLUME);
        }
    }

    public void setBrand(String brand) {
        if (brand.equals("Samsung") || brand.equals("LG") || brand.equals("Panasonic") || brand.equals(
                "Toshiba") || brand.equals("Sony"))
        {
            this.brand = brand;
        } else {
            this.brand = "generic";
        }
    }

    public void setDisplayType(String display) {
        this.displayType = display;
    }

    // toString method
    public String toString(){
        return "Television: brand="+ getBrand() + ", volume=" + getVolume() + ", display=" + getDisplayType();
    }

    // Turn On television
    void turnOn() {
        if (isOn) {
            System.out.println("It's already turned on!");
        } else {
            isOn = true;
            System.out.println("telvision is on!!");
        }
    }

    // Turn Off television
    void turnOff() {
        if (!isOn) {
            System.out.println("It's already turned off!");
        } else {
            isOn = false;
            System.out.println("television is off!!");
        }
    }

    // VOLUME CONTROLS
    // Increase volume by 1
    public void increaseVoluem() {
        if (isOn && isVolumeValid(this.volume +1)){
            this.volume = this.volume + 1;
            System.out.println("Volume is now " + volume);
        }
    }

    // Decrease volume by 1
    public void decreaseVolume() {
        if (isOn && isVolumeValid(this.volume-1)){
            this.volume = this.volume - 1;
            System.out.println("Volume is now " + volume);
        }
    }

    // check whether TV is currently muted or not
    private boolean isMuted() {
        return this.muted;
    }

    // mute and unmute television
    public void mute() {
        if (isMuted()) {
            this.setVolume(oldVolume);
            this.muted = false;
        } else {
            oldVolume = this.getVolume();
            this.muted = true;
            this.setVolume(0);
        }
    }
}
