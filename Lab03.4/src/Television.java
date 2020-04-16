class Television {

    private String brand = "Toshiba";      // brand of television
    private int volume = 50;        // current volume
    private boolean isOn = false;
    private int oldVolume;
    private boolean muted = false;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    // create a Television with default values
    public Television(){}

    // create a Television with specified values
    public Television(String brand, int volume1){
        setBrand(brand);
        this.volume = volume1;
    }

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

    public int getVolume(){
        return this.volume;
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

    public String getBrand(){
        return this.brand;
    }

    public boolean isMuted() {
        return this.muted;
    }

    public String toString(){
        String msg1;
        if (!this.isMuted()) {
            msg1 = String.valueOf(this.getVolume());
        } else {
            msg1 = "muted";
        }
        return "Television: brand=" + this.getBrand() + ", volume=" + msg1;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("It's already turned on!");
        } else {
            isOn = true;
            System.out.println("telvision is on!!");
        }
    }

    public void turnOff() {
        if (!isOn) {
            System.out.println("It's already turned off!");
        } else {
            isOn = false;
            System.out.println("television is off!!");
        }
    }

    public void increaseVoluem() {
        if (isOn && isVolumeValid(this.volume +1)){
            this.volume = this.volume + 1;
            System.out.println("Volume is now " + volume);
        }
    }

    public void decreaseVolume() {
        if (isOn && isVolumeValid(this.volume-1)){
            this.volume = this.volume - 1;
            System.out.println("Volume is now " + volume);
        }
    }

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

