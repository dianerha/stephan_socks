import java.util.ArrayList;
import java.util.List;

public class Note {
    private final String name;
    private List<String> wordList;

    public Note(final String name) {
        this.name = name;
        this.wordList = new ArrayList<>();
    }

    public void addWord(String word) {
        wordList.add(word);
    }

    public String findWordByIndex(int index) {
        return wordList.get(index);
    }

    public void showWordList() {
        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getWordList() {
        return wordList;
    }
}