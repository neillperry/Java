import java.nio.file.*;
import java.util.List;
import java.io.IOException;


class Review {

    public static void loadFile(String fileName) throws IOException {
        Path file = FileSystems.getDefault().getPath("", fileName);
        List<String> lines = Files.readAllLines(file);
        lines.forEach(System.out::println);
    }
}
