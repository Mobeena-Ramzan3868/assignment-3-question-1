import java.util.Scanner;

public class Circle extends Shape
{
	double radius;
	Circle()
	{
		super();
		radius=1.0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(String name,boolean fill,double radius)
	{
		super(name,fill);
		this.radius=radius;
	}
	void input()
	{
		Scanner input=new Scanner(System.in);
		super.input();
		System.out.println("enter circle radius: ");
		radius=input.nextDouble();
	}
	double getradius()
	{
		return radius;
	}
	void setradius(double r)
	{
		radius=r;
	}
	double getarea()
	{
		return (22/7)*radius*radius;
	}
	double getparimeter()
	{
		return 2*(22/7)*radius;
	}
	public String toString()
	{
		return "A circle with radius= "+radius+", which is a subclass of "+super.toString();
	}
}
