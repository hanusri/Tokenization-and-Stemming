import java.util.HashMap;
import java.util.Map;

/**
 * Created by Srikanth on 1/31/2017.
 */
public class TokenSummary {

    // region Private members

    private int tokenCount;
    private int onlyOccuranceCount;
    private int documentCount;
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

    public int getOnlyOccuranceCount() {
        return onlyOccuranceCount;
    }

    public void setOnlyOccuranceCount(int onlyOccuranceCount) {
        this.onlyOccuranceCount = onlyOccuranceCount;
    }

    public HashMap<String, Integer> getTokenMap() {
        return tokenMap;
    }

    public int getDocumentCount() {
        return documentCount;
    }

    //  endregion

    // region Public Methods


    public double getAvgTokens() {
        return tokenCount / documentCount;
    }

    public void incrementTokenCount() {
        this.tokenCount++;
    }

    public void incrementDocumentCount() {
        this.documentCount++;
    }

    public void addToDictionary(String word) {
        tokenCount++;
        if (tokenMap.containsKey(word)) {
            int count = tokenMap.get(word);
            if (count == 1)
                onlyOccuranceCount--;
            tokenMap.put(word, count + 1);
        } else {
            onlyOccuranceCount++;
            tokenMap.put(word, 1);
        }
    }

    public void printStatistics() {


        System.out.println("Number of tokens in Cranfield Collection: " + tokenCount);
        System.out.println("Number of unique tokens in Cranfield Collection: " + tokenMap.size());
        System.out.println("Number of tokens that occur only once: " + onlyOccuranceCount);
        System.out.println("Average number of word tokens per document: " + getAvgTokens());
        System.out.println("Number of documents scanned: " + documentCount);

        Map<String, Integer> sortedMapValue = Utility.sortMap(tokenMap);
        int counter = 1;
        System.out.println("30 Most frequent words tokens with their frequency: ");
        for (Map.Entry<String, Integer> entry : sortedMapValue.entrySet()) {
            if (counter > 30)
                break;
            counter++;
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    //  endregion
}
