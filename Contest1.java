import java.util.ArrayList;
import java.util.List;

public class Contest1 {

	public static List<String> splitString(String str, char esc) {
		List<String> result = new ArrayList<String>();

		// Your Logic goes here

		String blue = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				result.add(blue);
				blue  = "";
				continue;
			}
			blue += ch;
		}

		if(!(blue.equals(""))) {
			result.add(blue);
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "My name is 'KING' I have 10+ years of experience I work for 'FC LTD' ";

		List<String> result = splitString(str, '\'');

		for (String a : result) {
			System.out.println(a);
		}
	}
}