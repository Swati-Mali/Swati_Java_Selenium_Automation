import java.util.ArrayList;

public class ArrayBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {1,2,4,6,7,8,10,122};
		//check if array has multiple of 2
		for(int i=0; i<arr2.length; i++)
		{
			
			if(arr2[i]%2 ==0)
			{
				System.out.println(arr2[i]+ "is a multiple of 2" );
				break; // if any multiple of 2 found then loop is exit 
			}
			else
			{
				System.out.println(arr2[i]+ "is Not multiple of 2");
			}
		}
		
		//declaration of arraylist
		ArrayList<String> a = new ArrayList<String>();
		
		//assign values to arraylist object
		a.add("Swati");
		a.add("Mali");
		a.add("Saneep");
		System.out.println(a.get(1));
	}

}
