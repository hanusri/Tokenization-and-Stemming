import java.io.File;

/**
 * Created by Srikanth on 1/31/2017.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Please provide valid dataset path");
        else {
            processFile(args[0]);
        }
    }

    private static void processFile(String directoryPath) {
        // get the list of files
        File[] lstFiles = Utility.getFiles(directoryPath);

        if (lstFiles.length == 0)
            System.out.println("Error loading the directory");
        else {
            System.out.println("Tokenization Analysis of Documents");
            System.out.println("----------------------------------");
            TokenSummary tokenSummary = new TokenSummary();
            TokenExecutor tokenExecutor = new TokenExecutor(tokenSummary, lstFiles);
            System.out.println("Stemming Analysis of Documents");
            System.out.println("------------------------------");
            StemmingExecutor stemmingExecutor = new StemmingExecutor(tokenSummary);
            stemmingExecutor.processStemming();
        }
    }
}
