package st_lab1;

import java.util.Scanner;

public class Lab1 {	
	/*
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int givenYuan=sc.nextInt();
			
			if(check(givenYuan)==true) {
				System.out.println("Can take out "+givenYuan);
			}
			else {
				System.out.println("Can't take out "+givenYuan);

			}
		}
	}
	*/

	public boolean check(int givenYuan) {
		int[] YuansInPoket={50,20,10,5,5,1,1,1};
		int sum=0;
		
		for(int i=0;i<YuansInPoket.length;i++) {
			sum+=YuansInPoket[i];
		}
		
		if(givenYuan>sum || givenYuan<1) {
			return false;
		}
		
		int tempYuan=givenYuan;
		
		for(int i=0; i<YuansInPoket.length; i++) {
			if(tempYuan>=YuansInPoket[i]) {
				tempYuan-=YuansInPoket[i];
			}
		}
		if(tempYuan!=0) {
			return false;
		}	
		return true;
	}
}
