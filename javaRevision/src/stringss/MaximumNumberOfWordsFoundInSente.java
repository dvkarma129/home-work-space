package stringss;

public class MaximumNumberOfWordsFoundInSente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much much"};
		int count = 0;
		
		for (int i = 0; i < sentences.length; i++) {
			
			String [] newArray = sentences[i].split(" ");
			
			if (count<newArray.length) {
				count = newArray.length;
			}
		}
		
		System.out.println(count);
	}

}
