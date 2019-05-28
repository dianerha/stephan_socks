import java.util.List;

public class NoteManager {
    private List<Note> noteList;
    String[] stringArray = new String[10];
    int currentIndex = 0;

    public void add(String note) {
        if (currentIndex == stringArray.length) {
            String[] newStringArray = new String[stringArray.length + 10];
            for (int i = 0; i < stringArray.length; i++) {
                newStringArray[i] = stringArray[i];
            }
            stringArray = newStringArray;
        }
        stringArray[currentIndex] = note;
        currentIndex++;
    }

    public void print() {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(i + 1 + ": " + stringArray[i]);
        }
    }

    public String findByIndex(int index) {
        return stringArray[index - 1];
    }

    public void remove(String note) {
        for (int i = 0; i < stringArray.length; i++) {
            if (note.equals(stringArray[i])) {
                for (int j = i; j < currentIndex; j++) {
                    if (j + 1 == stringArray.length) {
                        stringArray[j] = null;
                    } else {
                        stringArray[j] = stringArray[j + 1];
                    }
                }
                currentIndex--;
                break;
            }
        }
    }

    public String get(int index) {
        return stringArray[index];
    }
    //stringArray.length는 극장에서 좌석을 미리 예약하는 거고 currentIndex는 좌석에 앉아있는 사람의 수

    public int size() {
        return currentIndex;
    }

}
