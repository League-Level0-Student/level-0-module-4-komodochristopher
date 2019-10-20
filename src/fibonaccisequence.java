
public class fibonaccisequence {
	public static void main(String[] args) {
		
		
		long l = 1;
	long u = 0;
        
for(int i =0;i<10; i++ ) {


	long sum =u + l;	
	System.out.println(u);
	long k = u;
	u = l;
    l =  k;
	 u =sum;
		}
	}
}