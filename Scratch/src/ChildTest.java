
import java.time.LocalDate;


public class ChildTest {

    public static void main(String[] args) {
        Child kiddo = new Child("Alexander", LocalDate.now(), EyeColor.GREEN, HairColor.BROWN);
        kiddo.toCry();

    }
}

