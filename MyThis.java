class MyThis
{	int x=10;
	void get(MyThis this,int y)
	{	System.out.println(this+"get");
		System.out.println(this.x);
		System.out.println(y);
	}
	public static void main(String... s)
	{	MyThis mt=new MyThis();
		System.out.println(mt+"main");
		mt.get(16);
	}
}