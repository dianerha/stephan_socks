import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Word {

    // Fields
    private int index;
    private String name;
    private String definition;
    private ArrayList<String> tagList;

    // Constructor
    public Word(String name, String def) {
        this.name = name;
        this.definition = def;
    }

    // Getter, Setter
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public ArrayList<String> getTagList() {
        return tagList;
    }

    public void setTagList(ArrayList<String> tagList) {
        this.tagList = tagList;
    }

    // Methods
    public void printWord() {

        System.out.println(getName() + ": " + getDefinition() + " (tags: " + getTagList() + ")");

    }

    public void editWord() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the new word name: ");
        String wordName = scanner.nextLine();
        setName(wordName);

        System.out.print("Please enter the new word definition: ");
        String wordDefinition = scanner.nextLine();
        setDefinition(wordDefinition);

        System.out.print("Please enter the new word tag: ");
        String wordTagList = scanner.nextLine();

        // To ArrayList
        ArrayList<String> tagArrayList = new ArrayList<>(Arrays.asList(wordTagList.split(",")));

        // Change TagList
        setTagList(tagArrayList);

    }

}

