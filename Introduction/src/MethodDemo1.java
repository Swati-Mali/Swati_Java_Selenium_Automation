
public class MethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//MethodDemo1 class object
		MethodDemo1 d1 = new MethodDemo1();
		String s = d1.getData();
		System.out.println(s);
		
		String s1 = getData2();
		System.out.println(s1);
		
		//MethodDemo2 class object
		MethodDemo2 d2 = new MethodDemo2();
		String s2=d2.getUserData();
		System.out.println(s2);
	}
	
	public String getData()
	{
		System.out.println("Rahul Shetty");
		return "Hello world";
	}
	
	public static String getData2()
	{
		System.out.println("Rahul Shetty");
		return "Hello world";
	}

}
