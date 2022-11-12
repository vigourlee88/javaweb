package runnoobprac;

//Importing Arrays

import java.util.Arrays;

public class Newfeed01 {
	public Newfeed01() {
		
	}
	public String[] getTopics() {
		String[] topics = {"Opinion","Tech","Science","Health"};
		return topics;
	}
	
	public static void main(String[] args) {
		Newfeed01 sampleFeed = new Newfeed01();
		String[] topics = sampleFeed.getTopics();
		System.out.println(Arrays.toString(topics));//打印数组内容
		
		
	}
}