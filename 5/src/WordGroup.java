import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {

    private String words;

    //Constructor for a WordGroup takes a string, converts it to lower case and stores it
    public WordGroup(String inputWord) {
        words = inputWord.toLowerCase();
    }

    //Splits the string into an array of words
    public String[] getWordArray() {
        return words.split(" ");
    }

    //Creates and returns a hash set containing all words from both word groups
    public HashSet<String> getWordSet(WordGroup wordGroup) {
        HashSet<String> hashSet = new HashSet();

        //Loop through each word in this word group
        for (String word : this.getWordArray()) {
            //Add the word to the hash set
            hashSet.add(word);
        }
        //Loop through each word in the word group passed to the method
        for (String word: wordGroup.getWordArray()) {
            //Add the word to the hash set
            hashSet.add(word);
        }
        return hashSet;
    }

    //Return a hash map containing the words and how many times they are used in the word group
    public HashMap<String, Integer> getWordCounts() {
        //Instantiate a hash map which maps strings (words) to integers (count)
        HashMap<String, Integer> hashMap = new HashMap();

        //Loop through each word in the word array
        for (String word : getWordArray()) {
            /* Add the word and count to the hash map. It will default to 1 for words not currently in
            the hash map as 1 is always added. This means if the word is already in the hash map by using
            getOrDefault we will increment the count. */
            hashMap.put(word, hashMap.getOrDefault(word,0) + 1);
        }
        return hashMap;
    }

}
