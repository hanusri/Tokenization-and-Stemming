import java.io.File;

/**
 * Created by Srikanth on 1/31/2017.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Please provide valid dataset path");
        else {

        }
    }

    private void processFile(String directoryPath) {
        // get the list of files
        File[] lstFiles = Utility.getFiles(directoryPath);

        if (lstFiles.length == 0)
            System.out.println("Error loading the directory");
        else {
            TokenSummary tokenSummary = new TokenSummary();
            TokenExecutor tokenExecutor = new TokenExecutor(tokenSummary,lstFiles);

        }
    }
}
