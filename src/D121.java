import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class D121 {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\example.txt"); // Replace with your file path

        try (Stream<String> l = Files.lines(filePath)) {
  //          l.forEach(System.out::println); //Process each line as needed
           l.forEach(f-> System.out.println(f));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
