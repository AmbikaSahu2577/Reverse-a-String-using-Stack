import java.util.Scanner;
import java.util.Stack;
class Reverse_String
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();

		Stack<Character> stack = new Stack<>();
		for (int i=0;i<str.length();i++) 
		{
			stack.push(str.charAt(i));
		}

		System.out.println("reverse String");

		while(!stack.empty())
		{
          System.out.print(stack.pop());
		}
	}
}