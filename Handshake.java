import java.util.*;

public class Handshake
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n ;
		System.out.println("How many people are in the room?: ");
		n = input.nextInt();

		for(int i=1;i<=n;i++)
		{
			System.out.println("handshake("+i+") = "+handshake(i));
		}

	}

	public static int handshake(int number)
	{
		if(number<2)
		{
			return (number-1);
		}
		else
		{
			return ((number-1)+(handshake(number-1)));
		}
	}
}