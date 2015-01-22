package org.catchup.preprocessor;
public class TextPreprocessor {
	
	/**
	 * 
	 * @param input String to be pre processed. Facade pattern. Stop words will be removed by calling removeStopwords
	 * from the StopwordsRemover class and stemmed by calling getResults method of the Stemmer class.
	 * @return outputText, stopwords removed and stemmed.
	 */
	public static String getPreprocessedText(String input)
	{
		StopwordsRemover str=new StopwordsRemover(input);
		String temp=str.removeStopwords();
		System.out.println(temp);		
		return Stemmer.getResults(temp);
	}
	
	
	
	
	
	public static void main(String...args)
	{
		String text="For too many students, a college education that is supposed to create opportunities can also mean years of struggle to pay off tens of thousands of dollars in debt. Schools must be required to do more to educate students about the real cost of their education and about a complex borrowing process that even the most sophisticated people have trouble understanding.An article in The Times last week described the experience of 23-year-old Kelsey Griffith. She currently earns a meager wage as a restaurant worker and owes $120,000 in student loans for an undergraduate degree from Ohio Northern University, a college whose recent graduates are among the most indebted in the country.";
		System.out.println(text);
		   
		TextPreprocessor tp=new TextPreprocessor();
		System.out.println(tp.getPreprocessedText(text));
	}
}
