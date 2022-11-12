package runnoobprac;

//String[] args 
//Fill in the code to print the array so that its actual values display,
//instead of the memory address.
import java.util.Arrays;

public class Newsfeed05 {
	
	String[] topics;
	
	public Newsfeed05(String[] initialTopics) {
		topics = initialTopics;
	}
	
	public static void main(String[] args) {
		Newsfeed05 feed;
		if(args[0].equals("Robot")) {
			//topics for a Robot feed :
			String[] robotTopics = {"Oil","Parts","Algorithms","Love"};
			feed = new Newsfeed05(robotTopics);
		}
		else if(args[0].equals("Human")) {
			//topics for a Human feed:
			String[] humanTopics = {"Politics","Science","Sports","Love"};
			feed = new Newsfeed05(humanTopics);
		}
		else {
			String[] genericTopics = {"Opinion","Tech","Science","Health"};
			feed = new Newsfeed05(genericTopics);
		}
		
		System.out.println("The topics in this feed are:");
		System.out.println(Arrays.toString(feed.topics));
		
	}
}