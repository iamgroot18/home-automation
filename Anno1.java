class Anno1
{	int x=100;
	static int y=200;
	My1 display()
	{	return(new My1()
			{	public void show()
				{	System.out.println(x);
					System.out.println(y);
				}
			});
	}
	public static void main(String s[])
	{	Anno1 =new Anno1();
		My1 z=o.display();
		z.show();
	}
}
interface My1
{	void show();
}	