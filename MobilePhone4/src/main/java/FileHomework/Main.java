package FileHomework;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	public final static Logger LOGGER = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		String example = "";
		String test1 = "";
		try (BufferedReader reader = new BufferedReader(new FileReader("Example.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));) {

			// Convert all text tolowerCase
			while ((test1 = reader.readLine()) != null) {
				example = test1.toLowerCase();
			}

			LOGGER.info("Display lowercase text: " + example);

			// Number of same words
			String[] words = example.split(" ");

			HashMap<String, Integer> test2 = new HashMap<String, Integer>();

			for (int i = 0; i < words.length; i++) {

				if (test2.containsKey(words[i])) {
					test2.put(words[i], test2.get(words[i]) + 1);
				}

				else {
					test2.put(words[i], 1);
				}

			}
			writer.write(test2.toString() + ".");
			LOGGER.info(test2 + ".");

			// Number of unique words
			HashSet<String> unique = new HashSet<String>();

			for (int i = 0; i < words.length; i++) {
				unique.add(words[i]);
			}

			LOGGER.info("words: " + unique + ".");
			writer.write("\nwords: " + unique.toString() + ".");
			LOGGER.info("number of unique words: " + unique.size() + ".");
			writer.write("\nnumber of unique words: " + unique.size() + ".");
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
