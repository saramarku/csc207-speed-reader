
	import java.util.Scanner;
	import java.io.File;
	import java.io.FileNotFoundException;
	public class WordGenerator {
		
		Scanner text;
		int wordcounter;
		int sentcounter;
		/**
		 * WordGenerator takes in the file and checks whether or not the file can be found
		 * @param filename must be a string value 
		 * @throws FileNotFoundException if the file location is not found.
		 *
		 */
	
		public WordGenerator(String filename) throws FileNotFoundException {
			text = new Scanner(new File(filename));
			while (text.hasNext()){
				char[] s1 = text.next().toCharArray();
				for (int i = 0; i< s1.length; i++ ){
				if (s1[i]=='.'|| s1[i]=='!' || s1[i] =='?'){
				sentcounter++;
				}
				}	
				wordcounter++;
			}
			text = new Scanner(new File(filename));
		    }
		
		/**
		 * Checks if there is text in the file read by WordGenertor
		 * @return true if there is text in the file or false if not. 
		 */
		public boolean hasNext(){
		return	(text.hasNext());		
		}
		
		/**
		 * @return a string value, the next word. 
		 */
		public String next(){
			return text.next();
		}
		
		/**
		 * Wrapped around WordGenerator to count the number of words
		 * @return an integer value, the number of the words
		 */
		
		public int getWordCount(){
		return wordcounter;
		}
		
		/** 
		 * checks whether or not each word ends a sentence. If the word is followed by period, 
		 * question mark or explanation point, it is a sentence.
		 * @return integer, the number of sentences
		 */
		
		
		public int getSentenceCount(){
			return sentcounter;
		}
}
		