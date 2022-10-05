 /*
   Name:    Descalso, Nielmar C
   		    Pesuelo, Reu Denver L.
   Section: 3D
   
   Problem: Write a program that prompts the user to input an
   			integer and then outputs both the individual digits
   			of the number and the sum of the digits. 
   			For example, it should output the individual digits 
   			of 3456 as 3 4 5 6, output the individual digits of 8030 as 8 0 3 0, 
   			output the individual digits of 2345526 as 2 3 4 5 5 2 6, output the 
   			individual digits of 4000 as 4 0 0 0, and output the 
   			individual digits of -2345 as 2 3 4 5.
   
   */

import java.util.Scanner;
public class Activity1{
	
	public static void main(String[] args){
	    System.out.println("Input an Integer:  ");
	    Scanner s = new Scanner(System.in);
		int i = 0, r, j, sum = 0, n, arr[] = new int[50];
		
		n = s.nextInt();
		while(n != 0){
		// Getting last digit of number
		r = n % 10;
		// Putting remainder in array
		arr[i] = Math.abs(r);
		// incrementing i which tells that how many digit number have
		i++;
		n = n/10;
		}

	//Printing array  contents on reverse order and finding sum of all digits
		for (j = i - 1; j > -1; j--){
			sum = sum + arr[j];
			System.out.print(arr[j]+" ");
		}
	//Printing the sum
		System.out.println("\nSum of digits is: "+sum);
	}
}
