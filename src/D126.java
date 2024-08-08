import java.nio.file.*;

public class D126{
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\example.txt"); // Replace with your file path

        if (Files.exists(filePath)) {
            System.out.println("File exists: " + filePath);
        } else {
            System.out.println("File does not exist: " + filePath);
        }
    }
}
