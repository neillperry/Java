import java.io.IOException;



public class Driver {


    public static void main(String[] args) {

        try {
            Review.loadFile("C:\\StudentWork\\IntroJava\\workspace\\Scratch\\src\\File");
        } catch (IOException e){
            System.out.println(e);
        }
    }





}
