package palindromNumbers;

public class Main {
	static boolean isPalindrom(int number) {
		int temp=number,lastNumber, reverceNumber=0;
		while(temp!=0) {
			lastNumber=temp%10;
			reverceNumber=(reverceNumber*10)+lastNumber;
			temp /=10;
		}
		
		if(number==reverceNumber)
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrom(2002));

	}

}
