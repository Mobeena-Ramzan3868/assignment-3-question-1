public class Square extends Rectangle
{
	Square()
	{
		super();
	}
	Square(double width,double length)
	{
		super(width,length);
	}
	Square(String color,boolean fill,double width,double length)
	{
		super(color,fill,width,length);
	}
	double getside()
	{
		if(width==length)
		{
			return width;
		}
		System.out.println("enter valid side length");
		return 0.0;
	}
	void setside(double s)
	{
		length=width=s;
	}
	void setwidth(double w)
	{
		super.setwidth(w);
	}
	void setlength(double l)
	{
		super.setlength(l);
	}
	double getarea()
	{
		return 4*getside();
	}
	double getperimeter()
	{
		return getside()*getside();
	}
	public String toString()
	{
		return "A square with side= "+getside()+", which is the subclass of "+super.toString();
	}
}
