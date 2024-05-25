package introduction;

import java.util.ArrayList;

public class JavaBrushUp2 {

	public static void main(String[] args) {

		int Num = 5;
		String website = "www.google.com";
		char letter ='r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(Num+" is the value stored in the Num variable");
		System.out.println(website);
		// Arrays --
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		//for loop exp
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if (arr2[i] % 2 ==0)
			{
			System.out.println(arr2[i]);
			break;
			}
			
			else
			{
				System.out.println(arr2[i] +" is not multiple by 2");

			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("lakshmi");
		a.add("narayana");
		a.add("manikattu");
		System.out.println(a.get(2));
				
	}
}
