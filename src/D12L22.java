import java.io.*;
import java.nio.file.*;

public class D12L22 {
    public static void main(String[] args) {
        Path originalFile = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\original.txt");
        Path tempFile = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\temp.txt");
        String targetText = "original text";
        String replacementText = "target text";

        try (BufferedReader reader = Files.newBufferedReader(originalFile);
             BufferedWriter writer = Files.newBufferedWriter(tempFile, StandardOpenOption.CREATE)) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Replace the target text with the replacement text
                String modifiedLine = line.replace(targetText, replacementText);
                // Write the modified line to the temporary file
                writer.write(modifiedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Delete the original file
            Files.delete(originalFile);
            // Rename the temporary file to the original file name
            Files.move(tempFile, originalFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
