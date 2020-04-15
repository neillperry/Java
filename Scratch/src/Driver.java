import java.io.IOException;
import java.time.LocalDate;


public class Driver {
    
    public static void main(String[] args) {
        Child kiddo = new Child("Alexander", LocalDate.now(), EyeColor.GREEN, HairColor.BROWN);
        kiddo.toCry();

        // CODE for REVIEW CLass
        /*  try {
        *    Review.loadFile("C:\\StudentWork\\IntroJava\\workspace\\Scratch\\src\\File");
        * } catch (IOException e){
        *    System.out.println(e);
        * }
         */

    }





}
