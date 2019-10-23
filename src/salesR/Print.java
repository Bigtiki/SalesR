package salesR;

import java.util.Scanner;

public class Print{
	
	
	
	
public static void printLine(int H) {
	
	int x, y;
	for(x=0;x<=H;x++){
		
		for(y=1;y<=x;y++) {
			if (y==x) {
			System.out.print(y+".");}else {System.out.print(y+",");}
		}
		System.out.println();
	}
}
public static void main(String[]args) {
	System.out.println("Write a good number:");
	int H;
	boolean result;
	do{
		try {
			
		Scanner input= new Scanner(System.in);
		H=input.nextInt();
	if(H>=0) {

		printLine(H);
		result=true;}
	else{
		result=false;
		}}catch(Exception e) {
			System.out.println("Write a valid number:");
			result=false;
	}}while(!result);
	
	
}
}