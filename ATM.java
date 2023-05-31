import java.io.IOException;

public class ATM  {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
		add ();
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
}
