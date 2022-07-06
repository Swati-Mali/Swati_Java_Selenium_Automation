
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Rahul SHetty Academy";
		String s2 = "Rahul Shetty Academy";
		String s = new String("Welcome");
		String s3 = new String("Welcome");
		
		String[] SplittedString = s1.split(" ");
		//System.out.println(SplittedString[0]);
		//System.out.println(SplittedString[1]);
		//System.out.println(SplittedString[2]);
		
		for(int i = s1.length()-1; i>=0; i--)
		{
			System.out.println(s1.charAt(i));
		}
	}

}
