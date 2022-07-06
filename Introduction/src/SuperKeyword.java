
class Animal
{
	String color="White";
	Animal()
	{
		System.out.println("Animal constructor");
	}
	void eat()
	{
		System.out.println("eating..");
	}	

}
class Dog extends Animal
{
	String color = "Black";
	void printclr()
	{
		System.out.println(color);
		System.out.println(super.color);
		super.eat();
	}
	
	Dog()
	{
		super();
		System.out.println("Doggy");
	}
	
}

public class SuperKeyword{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.printclr();

		
	}

}
