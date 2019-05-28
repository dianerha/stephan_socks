import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Socks {
    public static void main(String[] args) {
        Socks socks = new Socks();
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

        // 클래스는 타입을 커스텀으로 만드는거
        noteManager.add(noteName);

        System.out.println("Added " + noteName + " in your Note List :)");
    }


    private void showNoteList(NoteManager noteManager) { // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
        System.out.println("Note List");
        noteManager.print();
        System.out.println("Select Note Number: ");
        // 돌아가기 추가

        Scanner scanner = new Scanner(System.in);
        int noteIndex = scanner.nextInt();
        String noteName = noteManager.findByIndex(noteIndex);

        // 이거 따로 showWordList
        WordManager wordManager = new WordManager();
        while (true) {
            System.out.println(noteName);
            System.out.println("1. Add New Word");
            System.out.println("2. Show Word List");
            System.out.println("3. Back to the Main");

            int num = scanner.nextInt();
            if (num == 1) {
                addNewWord(wordManager); // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
            } else if (num == 2) {
                showWordList(wordManager); // // 어떤 주소인지 명시하기 위해 붕어빵을 인자로 넣음
            } else if (num == 3) {
                return;         // equal to backToTheMain();
            } else {
                System.err.println("Please enter correct number.");
            }
        }
    }
//
    private void addNewWord(WordManager wordManager) {
        wordManager.add();
    }

    private void showWordList(WordManager wordManager) {
        wordManager.print();
    }

    private void finishApp() {
        System.out.println("Finish!");
    }

}


////        System.out.println(wordManager);
//        System.out.println("Add New Word");
//        System.out.println("Word Name:");
//
//        Scanner scanner1 = new Scanner(System.in);
//        String wordName = scanner1.nextLine();
//
//        System.out.println("Definition:");
//
//        Scanner scanner2 = new Scanner(System.in);
//        String wordDefinition = scanner2.nextLine();
//
//        System.out.println("Category:");
//
//        Scanner scanner3 = new Scanner(System.in);
//        String wordCategory = scanner3.nextLine();
//
//        // 클래스는 타입을 커스텀으로 만드는거
//        wordManager.add(wordManager);
//
//        System.out.println("Added " + word + " in your Word List :)");
    }