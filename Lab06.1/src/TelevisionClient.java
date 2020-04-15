

public class TelevisionClient {

    public static void main(String[] args) {

        // validate that a three-element array was passed into Main
        if (args.length < 3) {
            //if not, then tell the user they messed up and exit program
            System.out.println("Usage: java TelevisioTest Brand1 Brand2 Brand3");
            System.exit(0);
        } else {
            // but if there are three arguments, then make them a nice shiny televison!
          createTelevision(args);
        }
    }

    private static void createTelevision(String[] args){
        String brand = args[0];
        String volumeString = args[1];
        String displayString = args[2];

        int volume = Integer.parseInt(volumeString);
        DisplayType display = DisplayType.valueOf(displayString);

        Television tv1 = new Television(brand, volume, display);
        System.out.println(tv1.toString());
    }
}
