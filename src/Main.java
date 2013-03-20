import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		int count = 0;
		while(count < 4) {
			System.out.println("val:" + ++count);
		}
		
		
		System.out.println("Display contents");
		System.out.println("Hello World");
		System.out.println("Testing this git coding sytle");
		System.out.println("business updates");
		
		/* usage of arrayCopy in java */
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        
        
        Scanner scan = new Scanner(System.in);
        int input = 0;
        ArrayList <Integer> numbList = new ArrayList<Integer>(4);
        for (int i=0; i<4; i++) {
        	System.out.println("Enter a number to store: " );
        	input = scan.nextInt();
        	numbList.add(i, input);
        	System.out.println("*******TESTING*******");
        	System.out.println(numbList.toString());
        }
        
        int counta = 0;
        for (int index : numbList) {
        	if(index > 10) {
        		System.out.println("FETCHING ARRAYLIST VALUES");
        		System.out.println("These values are greather than ten");
        		System.out.println("greather value retrieved: " + numbList.get(counta));
        	}else {
        		System.out.println("These values are lesser than ten");
        		System.out.println("lesser value retrieved: " + numbList.get(counta));
        	}
        	counta++;
        }			
	} // end of main method.
}// end of Main class.