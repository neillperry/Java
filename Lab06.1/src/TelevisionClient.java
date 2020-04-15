

public class TelevisionClient {

    public static void main(String[] args) {

        // validate that a three-element array was passed into Main
        if (args.length < 3) {
            //if not, then tell the user they messed up and exit program
            System.out.println("Need a 3 element array; [brand volume display]");
            System.exit(0);
        } else {
            // but if there are three arguments, then make them a nice shiny television!
          createTelevision(args);
        }
    }

    private static void createTelevision(String[] args){
        // parse out array elements and convert them to appropriate types
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2]);

            // create a new television!
        Television tv1 = new Television(brand, volume, display);
        System.out.println(tv1.toString());
    }
}
