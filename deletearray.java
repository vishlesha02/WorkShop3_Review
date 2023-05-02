// wap to delete the element into exsisting array in a specfied position
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class deletearray
{

	public void arr()
	{ 
		Scanner sc=new Scanner(System.in);
		int a;    
		System.out.print("Enter the number for array : ");
		a=sc.nextInt();    

		Integer arr[]=new Integer[a];    

		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<a;i++)    
		{
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter the element to remove from array : ");
		int elem = sc.nextInt();

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == elem)   
			{
				
				for(int j = i; j < arr.length - 1; j++)
				{
					arr[j] = arr[j+1];
				}
				break;
			}
		}

		System.out.print("Elements after deleting the element : ");
		for(int i = 0; i < arr.length-1; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
		

		public static void main(String[] args)
			{
				deletearray obj=new deletearray();
				obj.arr();
			}

}

