abstract class Base 
{	int x;
	int y;
	void show()
	{	System.out.println(x);
		System.out.println(y);
	}
	abstract void display();
	void register(Base b)
	{	b.display();

	}
}
class Child extends Base
{	void get(int x,int y)
	{	this.x=x;
		this.y=y;
	}
	void display()
	{	System.out.println("display");
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String... s)
	{	Child c1=new Child();
		c1.get(10,20);
		c1.register(c1);
	}
}