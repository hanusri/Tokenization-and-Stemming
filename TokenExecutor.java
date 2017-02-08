import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Srikanth on 1/31/2017.
 */
public class TokenExecutor {

    private TokenSummary tokenSummary;
    private File[] lstFiles;
    // region Constructor

    public TokenExecutor(TokenSummary tokenSummary, File[] listFiles) {
        this.tokenSummary = tokenSummary;
        lstFiles = listFiles;
        processFile();
    }

    // endregion

    // region Private Methods

    private void processFiles() {
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader bufferedReader = null;
        try {
            for (File file : lstFiles) {
                if (file.isFile()) {
                    // increase the document count
                    tokenSummary.incrementDocumentCount();
                    fis = new FileInputStream(file);
                    dis = new DataInputStream(fis);
                    bufferedReader = new BufferedReader(new InputStreamReader(dis));

                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        StringTokenizer tokenizer = new StringTokenizer(line, Constants.TOKENIZER_SPLIT);
                        while (tokenizer.hasMoreTokens()) {
                            String word = tokenizer.nextToken().trim().toLowerCase();

                            String[] subWords = word.split("\\s+|\\/|\\\\|\\-|\\_");

                            for (String subWord : subWords) {
                                if (word.isEmpty())
                                    continue;

                                // remove words which are xml tags or just numbers or just symbols
                                if (subWord.matches("<[^>]+>") || subWord.matches("(\\d)*") || subWord.matches("[^\\w\\s]+"))
                                    continue;

                                // handle the 's by spliting the part and taking the actual work
                                if (subWord.matches("(.*)\\'s"))
                                    subWord.replace("'s", "");

                                tokenSummary.addToDictionary(word);
                            }
                        }
                    }
                }
            }

            tokenSummary.printStatistics();

        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
    }

    private void processFile() {

    }

    //endregion
}
