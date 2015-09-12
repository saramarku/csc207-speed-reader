import static org.junit.Assert.*;
import org.junit.Test;

import java.io.FileNotFoundException;


public class WordGeneratorTest {

	@Test
	public void getWordCountTest() throws FileNotFoundException {
		WordGenerator f1 = new WordGenerator("//home//markusar//csc207/csc207-speed-reader//SpeedReader//src//testing");
		int num;
		num = f1.getWordCount();
		assertEquals("7 words", 7, num);
	}
	@Test
	public void getSentenceCountTest() throws FileNotFoundException {
		WordGenerator f1 = new WordGenerator("//home//markusar//csc207//csc207-speed-reader//SpeedReader//src//testing");
		int num;
		num = f1.getSentenceCount();
		assertEquals("3 sentences", 3, num);
	}
	
	
	
	
}