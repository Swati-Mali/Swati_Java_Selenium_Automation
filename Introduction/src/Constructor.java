
 class Constructor {

		int id;
		String name;
		
		void display()
		{
			System.out.println(id+" "+name);
		}
	
	public static void main(String args[])
	{
		Constructor s1 = new Constructor();
		Constructor s2 = new Constructor();
		//caliing default condtructor and it provides default values
		s1.display();
		s2.display();
	}
}
