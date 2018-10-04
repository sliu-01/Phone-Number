import java.util.Scanner;

public class PhoneNumber 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = in.nextLine();
		
		if (name.length()>20)
			name = name.substring(0,name.length()-1);

		System.out.print("Please enter your ten digit telephone number in the form of \"xxxxxxxxxx\": ");
		String telephoneNum = in.next();
		in.nextLine();
		
		String set1 = telephoneNum.substring(0, 3);
		String set2 = telephoneNum.substring(3, 6);
		String set3 = telephoneNum.substring(6, 10);
		
		System.out.printf("\n%-20s (" + set1 + ") " + set2 + "-" + set3 , name + ":");

	}

}
