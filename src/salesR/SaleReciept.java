package salesR;

import java.util.Scanner;

public class SaleReciept {
	static final int max=5;
	static int[] work= new int[max];
	static int count;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		for(count=0;count<max; count++){
			work[count]=input.nextInt();
		}while(count<=max) {System.out.print(work[count]+" ");}
		
		

	}

}
