import java.nio.file.*;
import java.io.IOException;

public class D125{
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\deleted.txt"); // Replace with your file path

        try {
            Files.delete(filePath);
            System.out.println("File deleted successfully.");
        } catch (NoSuchFileException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            System.err.println("Unable to delete file: " + filePath);
            e.printStackTrace();
        }
    }
}
