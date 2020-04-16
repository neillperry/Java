
import java.time.LocalDate;


class ChildClient {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2010, 4, 15);
        Child kiddo = new Child("Alexander", birthday, EyeColor.GREEN, HairColor.BROWN, false);
    }
}

