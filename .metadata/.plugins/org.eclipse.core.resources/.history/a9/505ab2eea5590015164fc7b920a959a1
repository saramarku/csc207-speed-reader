
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class WordGenerator {
	
	Scanner text;
	
	public WordGenerator(String filename) throws FileNotFoundException {
		this.text = new Scanner(new File(filename));
	    }
	public boolean hasNext(){
	return	(text.hasNext());		
	}
	
	public String next(){
		return text.next();
		}
	
	public int getWordCount(){
		int i =0;
		while (hasNext())
		{
			i++;
			next();
		}
		return i;
	}
	public int getSentenceCount(){
		int counter =0;
		while(hasNext())
		{
		char[] s1 = next().toCharArray();
		for (int i = 0; i< s1.length; i++ ){
		if (s1[i]=='.'|| s1[i]=='!' || s1[i] =='?')
		counter++;
		
		}}
		return counter;
	}
	
	
	}
	