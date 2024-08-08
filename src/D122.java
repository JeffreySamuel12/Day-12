import java.nio.file.*;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class D122{
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\output.txt"); // Replace with your file path
        List<String> lines = Arrays.asList(
                "line 1 content ready",
                "line 2 content ready",
                "line 3 content ready"
        );

        try {
            // Write lines to the file, create the file if it doesn't exist, and append to it if it does
            Files.write(filePath, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
