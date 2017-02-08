import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Srikanth on 1/31/2017.
 */
public class Utility {

    public static File[] getFiles(String directoryPath) {

        try {
            File folderPath = new File(directoryPath);
            return folderPath.listFiles();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return new File[0];
    }
}
