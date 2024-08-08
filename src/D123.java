import java.nio.file.*;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
public class D123 {
    public static void main(String[]args){
        Path sourcePath=Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\source.txt");
        Path targetPath=Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\target.txt");
        try{
            Files.copy(sourcePath,targetPath,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e)
        {
            e.printStackTrace();
    }
    }
}
