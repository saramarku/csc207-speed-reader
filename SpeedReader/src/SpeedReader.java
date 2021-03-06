
import java.awt.*;
import java.io.FileNotFoundException;
public class SpeedReader {
	
	/**
	 * It displays a panel which shows all the words of the file one by one at a certain speed. SpeedReader. 
	 * @param args filename, width, height, font, words per minute, all are string types. 
	 * @throws FileNotFoundException when the location of the file is not found.
	 * @throws InterruptedException to avoid handling the exception explicitly.
	 */

	public static void main(String[] args) throws FileNotFoundException, InterruptedException{
		
		String filename = args[0];
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);
		int  font = Integer.parseInt(args[3]);
		double wpm = Integer.parseInt(args[4]);
		WordGenerator f1 = new WordGenerator(filename);
		int sentence = f1.getSentenceCount();
		int words = f1.getWordCount();
		DrawingPanel panel = new DrawingPanel(width, height);
		Graphics g = panel.getGraphics();
		Font f = new Font("Courier", Font.BOLD, font);
		if (args.length != 5){
		System.out.println("Giving the wrong number of arguments!");
		}else{
			
		while (f1.hasNext()){
			 String next = f1.next();
			FontMetrics fm = g.getFontMetrics();
			  g.setFont(f);
			  int x = (width - fm.stringWidth(next))/2;
			  int y = (fm.getAscent() + (height - (fm.getAscent() + fm.getDescent())) / 2);
			  g.drawString(next, x, y);
			  Thread.sleep((long)(60000/wpm));
			  panel.clear();	
			  
		}}
			System.out.println("The number of words is " + words);
			System.out.println("The number of sentences is " + sentence);
			panel.exit();
			
		}}

