
public class Main {

	//private static final boolean LINK
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
		
		int evType = 10;
		int from_layer2 = 2;
		int link_change = 10;
		int event = 0;
		
		
		/* usage of arrayCopy in java */
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        
        
        /*
		if (evType == from_layer2) {
			if (event >= 0 && event < 4) {
				System.out.println("receive update");
			} else {
				System.err.println("panic 1st time");
			}
		} else if (evType == link_change) {
			System.out.println("this line");
			System.out.println("next line");
		} else {
			System.err.println("panic 2nd time");
		}*/
		
	}

}
