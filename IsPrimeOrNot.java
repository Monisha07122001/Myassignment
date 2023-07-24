package week2.day1.program3;

public class IsPrimeOrNot {
	public static void main(String[] args) {
			int n=3,flag=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
				if(flag!=0) {
					System.out.println("Is a prime");
				}
				else {
					System.out.println("Not a prime");
				}
			}
		}

	}


