import java.util.Scanner;
public class Testshape 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Shape s=new Shape();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square sq=new Square();
		char choice='y';
		int x;
		while(choice=='y')
		{
		System.out.println("enter 1 for circle and 2 for rectangel: ");
		x=input.nextInt();
		if(x==1)
		{
			c.input();
			System.out.println(c.toString());
		}
		else if(x==2)
		{
			r.input();
			if(r.getwidth()!=r.getlength())
			{
				System.out.println(r.toString());
			}
			else if(r.getwidth()==r.getlength())
			{
				System.out.println(sq.toString());
			}
		}
		System.out.println("You want to continue or not (y/n): ");
		choice=input.next().charAt(0);
		}
	}
}
