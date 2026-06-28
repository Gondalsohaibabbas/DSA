import java.util.ArrayList;

public class ImplementTrieBrute {

    ArrayList<String> words = new ArrayList<>();

    public void insert(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        return words.contains(word);
    }

    public boolean startsWith(String prefix) {

        for (String word : words) {
            if (word.startsWith(prefix))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        ImplementTrieBrute trie = new ImplementTrieBrute();

        trie.insert("apple");

        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("app"));
    }
}

/*
Time Complexity:
Insert O(1)
Search O(n)
StartsWith O(n)

Space Complexity: O(n)
*/
