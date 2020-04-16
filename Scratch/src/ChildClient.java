
import java.time.LocalDate;


public class ChildClient {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 4, 15);
        Child kiddo = new Child("Alexander", birthday, EyeColor.GREEN, HairColor.BROWN, false);
        kiddo.calculateAge();

    }
}

