import java.util.ArrayList;
import java.util.List;

public class RealNoteManager {
    private List<Note> noteList;

    public RealNoteManager() {
        this.noteList = new ArrayList<>();
    }

    public void addNote(Note note) {
        noteList.add(note);
    }

    public void showNoteList() {
        for (int i = 0; i < noteList.size() ; i++) {
            Note note = noteList.get(i);

            System.out.println(note.getName());
        }
    }
}
