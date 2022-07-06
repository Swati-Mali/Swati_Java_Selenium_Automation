
public class ParameterizedConstructor {

	int id;
	String name;
	ParameterizedConstructor(int i, String n)
	{
		id=i;
		name=n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor c1 = new ParameterizedConstructor(1,"Swati");
		ParameterizedConstructor c2 = new ParameterizedConstructor(2,"Sandeep");
		c1.display();
		c2.display();
	}

}
