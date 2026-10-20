import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to reverse");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		while(num>0) {
			int lastdigit = num%10;
			rev = rev*10+lastdigit;
			num/=10;
		}
		System.out.println("Reverse Number is = "+ rev);
	}

}
