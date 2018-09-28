package week05;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		
		for(int i=0; i<1000000000; i++) {
			myList.add((int)Math.random() * 1000000);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 & 1 million");
		int num = input.nextInt();
		
		//look for the number in the array
		int answer = -1;
		for(int i = 0; i<1000000; i++) {
			if(myList.get(i) == num){
				answer = i;
				break;
			}
		}
		
		if(answer == -1) {
			System.out.println("Could not find the number "+ num);
			
		}else {
			System.out.println(num+" is at index "+answer);
		}
	}
	
	private static int FindIntArray(ArrayList<Integer> array, int num) {
		//look for number in array
		int answer = -1;
		
		//if i iteration has the value of 'num'
		for (int i = 0; i<1000000; i++) {
			
			if(array.get(i) == num) {
				answer = i;
				break;
			}
		}
		return answer;		
	}
}
