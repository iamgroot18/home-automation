class Shadow
{	int x=20;
	static int y=20;
	class Black 
	{	int x=40;
		void show()
		{	System.out.println(x);
			System.out.println(y);
			System.out.println(Shadow.this.x);
		}
	}
	public static void main(String... s)
	{	Shadow sh=new Shadow();
		System.out.println(sh.x);
		Shadow.Black b=sh.new Black();
		b.show();
	}
}