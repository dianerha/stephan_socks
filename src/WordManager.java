import java.util.ArrayList;
import java.util.List;

public class WordManager {
    private List<Word> wordList = new ArrayList<>(); // 리스트는 어레이리스트를 포함함. 리스트<워드>가 통째로 데이터 형식임.
    // <워드> 라고 객체의 데이터 형식도 명시해줌. 어레이리스트<>는 어짜피 똑같으니까 생략함

    public void add(Word word) {
        wordList.add(word);
    }

    public void print() {
        for (int i = 0; i < wordList.size(); i++) {
            Word word = wordList.get(i);
            System.out.println(i + 1 + ": " + word);
//            for (Word word : wordList) { // 인덱스 없이 전체 순회
        }
    }

    public void remove(Word word) {
        wordList.remove(word);
    }

    public Word getByIndex(int index) {
        return wordList.get(index);
    }

    public Word getByName(String name) {
        for (Word word1 : wordList) {
            if(word1.getName().equals(name)) {
                return word1;
            }
        }
        return null;
    }

    public int size() {
        return wordList.size();
    }

}
