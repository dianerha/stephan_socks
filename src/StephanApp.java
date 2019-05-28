import java.util.Scanner;

public class StephanApp {
	public static void main(String[] args) {
		StephanApp stephanApp = new StephanApp();
		stephanApp.start();

	}

	private void start() {
		startMainMenu();
	}

	private void startMainMenu() {
		while (true) {
			System.out.println(Strings.TEXT_MAIN_MENU);
			System.out.println(Strings.TEXT_MAIN_OPTIONS);

			System.out.println("type menu num: ");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();

			if (num == 1) {
				startAddNoteScreen();
			} else if (num == 2) {
				startListNoteScreen();
			} else if (num == 3) {
				finish();
				break;
			} else {
				System.out.println("miss typing");
			}
		}
	}

	private void finish() {
		System.out.println("finish app");
	}

	private void startListNoteScreen() {
		System.out.println( "Note1");
		System.out.println( "Note2");
		System.out.println( "Select your note");


	}

	private void startAddNoteScreen() {

	}

}