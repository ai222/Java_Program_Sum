public class Recursion {
  
	public static int sum(int num) {
	
	int sum=0;
	for(int i =0;i<=num;i++)
	sum+=i;
	return sum;
	
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
	}
}