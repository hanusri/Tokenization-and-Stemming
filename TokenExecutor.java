/**
 * Created by Srikanth on 1/31/2017.
 */
public class TokenExecutor {

    private TokenSummary tokenSummary;

    // region Constructor

    public TokenExecutor(TokenSummary tokenSummary, String filePath) {
        this.tokenSummary = tokenSummary;
        processFiles(filePath);
    }

    // endregion

    // region Private Methods

    private void processFiles(String filePath) {
        processFile();
    }

    private void processFile() {

    }

    //endregion
}
