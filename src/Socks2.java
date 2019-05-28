import java.util.Scanner;

public class Socks2 {

    private final RealNoteManager realNoteManager = new RealNoteManager();

    public static void main(String[] args) {
        Socks2 socks = new Socks2();
        socks.start();
    }

    private void start() {
        startMainList();
    }

    private void startMainList() {
        NoteManager noteManager = new NoteManager(); // 어디로 가는지 붕어빵 주소를 명시해야 하므로 반복문 돌기 전에 한번 써줌
        while (true) {
            System.out.println("Welcome to Stephan's Socks");
            System.out.println("1. Add New Note");
            System.out.println("2. Show Note List");
            System.out.println("3. Finish App");

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == 1) {
                addNewNote(noteManager); // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
            } else if (num == 2) {
                showNoteList(noteManager); // // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
            } else if (num == 3) {
                finishApp();
                break; // 여기에서 break는 app을 finish한다는 말이 아니라, startMainList의 반복을 break하고 다시 main(?)으로 돌아간다는 뜻
            }
        }

    }

    private void addNewNote(NoteManager noteManager) { // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
        System.out.println("Add New Note");
        System.out.println("Name of New Note:");

        Scanner scanner = new Scanner(System.in);
        String noteName = scanner.nextLine();

        Note note = new Note(noteName);
        realNoteManager.addNote(note);
        // 클래스는 타입을 커스텀으로 만드는거
//        noteManager.add(noteName);

        System.out.println("Added " + noteName + " in your Note List :)");
    }


    private void finishApp() {
        System.out.println("Finish!");
    }

    private void addNewWord(WordManager wordManager) {
    }

    private void showWordList(WordManager wordManager) {
    }

    private void showNoteList(NoteManager noteManager) { // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
        System.out.println("Note List");
        realNoteManager.showNoteList();
        System.out.println("Select Note Number: ");

        Scanner scanner = new Scanner(System.in);
        int noteIndex = scanner.nextInt();
    }


//        private void startWordList () {
//            WordManager wordManager = new WordManager(); // 어디로 가는지 붕어빵 주소를 명시해야 하므로 반복문 돌기 전에 한번 써줌
//            while (true) {
//                System.out.println(noteName);
//                System.out.println("1. Add New Word");
//                System.out.println("2. 뒤로가기");
//                wordManager.print();
//
//                Scanner scanner = new Scanner(System.in);
//                int num = scanner.nextInt();
//                if (num == 1) {
//                    addNewWord(wordManager); // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
//                } else if (num == 2) {
//                    backToMain();
//                    break; // 여기에서 break는 app을 finish한다는 말이 아니라, startMainList의 반복을 break하고 다시 main(?)으로 돌아간다는 뜻
//                }
//
//                private void addNewWord (WordManager wordManager){ // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
//                    System.out.println("Add New Word");
//                    System.out.println("Name of New Word:");
//
//                    Scanner scanner2 = new Scanner(System.in);
//                    String noteName = scanner2.nextLine();
//
//                    // 클래스는 타입을 커스텀으로 만드는거
//                    wordManager.add(wordName);
//
//                    System.out.println("Added " + wordName + " in your Word List :)");
//                }

}