import java.time.LocalDate;

public class ChildClientArgs {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("ERROR: five inputs needed to create a child");
        } else {
            createChild(args);
        }
    }

    private static void createChild(String[] args) {
        String name = args[0];
        LocalDate dob = LocalDate.parse(args[1]);
        EyeColor eyeColor = EyeColor.valueOf(args[2]);
        HairColor hairColor = HairColor.valueOf(args[3]);
        boolean brat = Boolean.valueOf(args[4]);

        // create a new child
        Child kid = new Child(name, dob, eyeColor, hairColor, brat);
        kid.toCry();
    }



}
