



public class TelevisionTest {

    public static void main(String[] args) {
        String brand;
        String volumeString;
        String display;
        Integer volume;


        if (args.length < 3) {
            System.out.println("Usage: java TelevisioTest Brand1 Brand2 Brand3");
        } else {
            brand = args[0];
            volumeString = args[1];
            display = args[2];
            
            volume = Integer.valueOf(volumeString);

            Television tv1 = new Television(brand, volume, display);
        }
    }
}
