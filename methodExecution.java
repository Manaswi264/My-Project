
public class methodExecution {
	public int multiplynum(int a,int b)
	{
	int c=a*b;
	return c;
		
	}
	public static void main(String[] args) {
		methodExecution b= new methodExecution();
		int ans= b.multiplynum(10,3);
		System.out.println("Multipilcation is :"+ans);

		
	}

}
