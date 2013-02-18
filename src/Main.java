
public class Main {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int count = 0;
		while(count < 4) {
			System.out.println("val:" + ++count);
		}
		
		System.out.println("Hello World");
		System.out.println("Testing this git coding sytle");
		System.out.println("business updates");
		
		/* usage of arrayCopy in java */
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
		
	}
}