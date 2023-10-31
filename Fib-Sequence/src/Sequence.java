
public class Sequence {
	
	
	public static int[] seq(int n) {
		int[] fib = new int[n]; 
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2;i < n;i++) {
			fib[i] = fib[i - 2] + fib[i - 1]; //the sequence is equal to the sum of the two previous numbers which is why we start at i = 2
		}
		
		return fib;
	}
		
	public static void main(String[] args) {
		int n = 10;
		int[] fib = seq(n);
		for(int i=0;i<fib.length;i++) {
			System.out.print(fib[i] + " ");
		}
	}

}
