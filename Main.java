import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*
		 * Given a list of Strings, write a method that returns a list of all strings
		 * that contain the letter 'o'. Print the result.
		 */
		Main stringFilter = new Main();
		List<String> filterStrings = stringFilter.filterStringsHavingLetterO();
		System.out.println(filterStrings);

	}

	private ArrayList<String> strings;

	public Main() {
	    strings = new ArrayList<String>();
		strings.add("Ok");
		strings.add("Lola");
		strings.add("home");
		strings.add("lampda");
		strings.add("popcorn");

	}

	public List<String> filterStringsHavingLetterO() {
		return strings.stream().filter(word -> word.contains("o")).collect(Collectors.toList());
	}

}
