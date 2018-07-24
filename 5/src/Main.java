import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Part 1
        //Instantiate two word groups
        System.out.println("Part 1: ");
        System.out.println();
        WordGroup wordGroup1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup wordGroup2 = new WordGroup("When you play play hard when you work dont play at all");

        //Use getWordArray to make two arrays of strings from the word groups
        String wordArray1[] = wordGroup1.getWordArray();
        String wordArray2[] = wordGroup2.getWordArray();

        //Output the first word group
        for (String word : wordArray1) {
            System.out.print(word + " ");
        }
        System.out.println();

        //Output the second word group
        for (String word : wordArray2) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println();



        //Part 2
        System.out.println("Part 2: ");
        System.out.println();
        //Creates a hash set containing both word groups by calling the method on wordGroup1 and passing it wordGroup2 as a parameter
        HashSet<String> words = wordGroup1.getWordSet(wordGroup2);

        //Set up an iterator to loop through each element
        Iterator it = words.iterator();

        //Loop and output the words to the console
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println();



        //Part 3
        System.out.println("Part 3: ");
        System.out.println();

        //Creates a hash map containing the words and counts of wordGroup1
        HashMap<String, Integer> map1 = wordGroup1.getWordCounts();
        //Store the key set of the hash map which contains all the words
        Set<String> keys1 = map1.keySet();

        //Does the same for wordGroup2
        HashMap<String, Integer> map2 = wordGroup2.getWordCounts();
        Set<String> keys2 = map2.keySet();

        System.out.println("WordGroup1 count: ");
        //Loop through each key and fetch the value of that key from the hash map. Output to the console
        for (String key : keys1) {
            System.out.println(key + " " + map1.get(key));
        }

        System.out.println();

        System.out.println("WordGroup2 count: ");
        for (String key : keys2) {
            System.out.println(key + " " + map2.get(key));
        }

        System.out.println();
        System.out.println("Both WordGroups: ");

        //Create another hash set with all the words from both groups
        HashSet<String> allWords = wordGroup1.getWordSet(wordGroup2);

        //Loop through every word
        for (String word : allWords) {

            //If the word is found in both word groups
            if (keys1.contains(word) & keys2.contains(word)) {
                //Add the total occurrences of the word together
                int total = map1.get(word) + map2.get(word);
                //Output the word and total count
                System.out.println(word + " " + total);

            //If only the first word group contains the word
            } else if (keys1.contains(word)) {
                //Output the word and the count
                System.out.println(word + " " + map1.get(word));

            //If only the second group contains the word
            } else if (keys2.contains(word)) {
                //Output the word and the count
                System.out.println(word + " " + map2.get(word));
            }
        }
    }
}
