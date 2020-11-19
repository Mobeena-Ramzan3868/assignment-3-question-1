import java.util.Scanner;

public class Rectangle extends Shape
{
	double width;
	double length;
	Rectangle()
	{
		super();
		width=1.0;
		length=1.0;
	}
	Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	Rectangle(String color,boolean fill,double width,double length)
	{
		super(color,fill);
		this.width=width;
		this.length=length;
	}
	double getwidth()
	{
		return width;
	}
	double getlength()
	{
		return length;
	}
	void setwidth(double w)
	{
		width=w;
	}
	void setlength(double l)
	{
		length=l;
	}
	double getarea()
	{
		return width*length;
	}
	double getperimeter()
	{
		return 2*(length+width);
	}
	void input()
	{
		Scanner input=new Scanner(System.in);
		super.input();
		System.out.println("enter rectangle width: ");
		width=input.nextDouble();
		System.out.println("enter rectangle length: ");
		length=input.nextDouble();
	}
	public String toString()
	{
		return "A Rectangle with width= "+width+" and length= "+length+", which is a subclass of "+super.toString();
	}
}
