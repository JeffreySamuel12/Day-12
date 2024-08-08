import java.nio.file.*;
import java.io.IOException;

public class D1210 {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\example.txt"); // Replace with your file path

        try {
            // Read the entire content of the file into a String
            String content = Files.readString(filePath);
            System.out.println("File content:");
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
