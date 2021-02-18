import java.util.ArrayList;
import java.util.Random;

public class PassworGenerator {
	private static final String _LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String _UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String _DIGITS = "0123456789";
	private static final String _PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";

	private boolean upperCase;
	private boolean lowerCase;
	private boolean digits;
	private boolean punctuation;
	private int length;

	public PassworGenerator(boolean upperCase, boolean lowerCase, boolean digits, boolean punctuation, int length) {
		this.lowerCase = lowerCase;
		this.upperCase = upperCase;
		this.digits = digits;
		this.punctuation = punctuation;
		this.length = length;
	}

	public String Generate() {
		if (length <= 0) {
			return "";
		}

		// Variables.
		StringBuilder password = new StringBuilder(length);
		Random random = new Random(System.nanoTime());

	
		ArrayList<String> charList = new ArrayList<>(4);
	
		if (upperCase) {
			charList.add(_UPPER_CASE);
		}
		if (lowerCase) {
			charList.add(_LOWER_CASE);
		}
		if (digits) {
			charList.add(_DIGITS);
		}
		if (punctuation) {
			charList.add(_PUNCTUATION);
		}
		
		// Build the password.
		for (int i = 0; i < length; i++) {
			String charCategory = charList.get(random.nextInt(charList.size()));
			int position = random.nextInt(charCategory.length());
			password.append(charCategory.charAt(position));
		}
		return "" + password;

	}

}
