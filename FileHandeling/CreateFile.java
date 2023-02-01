import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        
        File fl = new File("./no.txt");
    
        if (fl.createNewFile()) {

            System.out.println("File " + fl.getName() + " created.");

            FileWriter flWriter = new FileWriter(fl.getAbsoluteFile());
            flWriter.write("yes wassup");
            flWriter.close();

        } else {
            
            try {
                FileWriter flWriter = new FileWriter(fl.getAbsoluteFile());
                flWriter.write("yes wassup");
                flWriter.close();
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("File " + fl.getName() + " exists.");
        }

    }
    
}
