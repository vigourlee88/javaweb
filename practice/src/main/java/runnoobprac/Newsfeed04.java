package runnoobprac;

//Length

import java.util.Arrays;

public class Newsfeed04 {
	
	String[] topics = {"Opinion","Tech","Science","Health"};
	int[] views = {0,0,0,0};
	
	public Newsfeed04() {
		
	}
	
	public String[] getTopics() {
		return topics;
	}
	
	public int getNumTopics() {
		return topics.length;
	}
	
	public static void main(String[] args) {
		Newsfeed04 sampleFeed= new Newsfeed04();
		
		System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
		
	}
}