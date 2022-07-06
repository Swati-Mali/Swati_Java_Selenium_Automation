
public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare array
		int[] arr = new int[5];
		//initialize array 
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 5;
		arr[3] = 10;
		arr[4] = 15;
		
		System.out.println("value of index 4 in arr is " +arr[4]);
		
		//declare array
		int[] arr2 = {2,4,6,8,10};
		
		System.out.println("value of index 2 in arr2 is " +arr2[2]);
		
		//for loop
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		//declare string array
		String[] name = {"Swati", "Sandeep","Mali"};
		
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
	}

}
