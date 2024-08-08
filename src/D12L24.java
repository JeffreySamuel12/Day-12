import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class D12L24 {
    public static void main(String[] args) {
        Path file1 = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\example.txt");
        Path file2 = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Day 12\\src\\output.txt");

        try (FileChannel channel1 = FileChannel.open(file1, StandardOpenOption.READ);
             FileChannel channel2 = FileChannel.open(file2, StandardOpenOption.READ)) {

            // Compare file sizes
            if (channel1.size() != channel2.size()) {
                System.out.println("Files are not equal (different sizes).");
                return;
            }

            // Map the files into memory
            MappedByteBuffer buffer1 = channel1.map(FileChannel.MapMode.READ_ONLY, 0, channel1.size());
            MappedByteBuffer buffer2 = channel2.map(FileChannel.MapMode.READ_ONLY, 0, channel2.size());

            // Compare the byte buffers in chunks
            for (int i = 0; i < channel1.size(); i++) {
                if (buffer1.get(i) != buffer2.get(i)) {
                    System.out.println("Files are not equal (content mismatch).");
                    return;
                }
            }

            System.out.println("Files are equal.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
