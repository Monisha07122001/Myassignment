package week2.day1.program5;

public class FabonnacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.print(a+ " "+b);
		for(int i=2;i<=56;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
