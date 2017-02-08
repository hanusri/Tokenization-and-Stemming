import java.util.HashMap;

/**
 * Created by Srikanth on 1/31/2017.
 */
public class TokenSummary {

    // region Private members

    private int tokenCount;
    private int uniqueCount;
    private int onlyOccuranceCount;
    private float avgTokens;
    private HashMap<String, Integer> tokenMap;

    // endregion

    //  region Constructor

    public TokenSummary() {
        tokenMap = new HashMap<>();
    }

    //  endregion

    //  region Getters and Setters

    public int getTokenCount() {
        return tokenCount;
    }

    public void setTokenCount(int tokenCount) {
        this.tokenCount = tokenCount;
    }

    public int getUniqueCount() {
        return uniqueCount;
    }

    public void setUniqueCount(int uniqueCount) {
        this.uniqueCount = uniqueCount;
    }

    public int getOnlyOccuranceCount() {
        return onlyOccuranceCount;
    }

    public void setOnlyOccuranceCount(int onlyOccuranceCount) {
        this.onlyOccuranceCount = onlyOccuranceCount;
    }

    public float getAvgTokens() {
        return avgTokens;
    }

    public void setAvgTokens(float avgTokens) {
        this.avgTokens = avgTokens;
    }

    public HashMap<String, Integer> getTokenMap() {
        return tokenMap;
    }

    //  endregion
}
