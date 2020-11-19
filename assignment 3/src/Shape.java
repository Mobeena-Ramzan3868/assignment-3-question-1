import java.util.Scanner;
public class Shape 
{
	String color;
	boolean fill;
	Shape()
	{
		color="green";
		fill= true;
	}
	Shape(String color,boolean fill)
	{
		this.color=color;
		this.fill=fill;
	}
	String getcolor()
	{
		return color;
	}
	boolean FILL()
	{
		return fill;
	}
	void setcolor(String c)
	{
		color=c;
	}
	void setfill(boolean f)
	{
		fill=f;
	}
	void input()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the color of shape: ");
		color=input.nextLine();
		System.out.println("shape is filled (true/false): ");
		fill=input.nextBoolean();	}
	public String toString()
	{
		if(fill==true)
		{
			return "A shape with color of "+color+" and filled";
		}
		else if(fill==false)
		{
			return "A shape with color of "+color+" and Not filled";
		}
		return "enter valid data";
	}
}
