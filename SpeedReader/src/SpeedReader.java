
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
		//if the exact number of arguments is not specified print a message
		if (args.length != 5){
		System.out.println("Giving the wrong number of arguments!");
		}else{
		
		WordGenerator f1 = new WordGenerator(filename);
		DrawingPanel panel = new DrawingPanel(width, height);
		Graphics g = panel.getGraphics();
		 Font f = new Font("Courier", Font.BOLD, font);
		 //a loop which goes through each of the words and displays them on the panel. 
		while (f1.hasNext()){
			  g.setFont(f);
			  g.drawString(f1.next(), 100, 100);
			  Thread.sleep((long)(60000/wpm));
			  panel.clear();	
		}
			panel.exit();
		}}}
