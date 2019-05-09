class Emp
{	String cname;
	String name;
	int salary;
	void get(String s1,int s2,String s3)
	{	name=s1;
		salary=s2;
		cname=s3;
	}
	void show()
	{	System.out.println(name);
		System.out.println(salary);		
		System.out.println(cname);

	}
 	public static void main(String... s)
	{	Emp e1=new Emp();
		e1.get("Lalu",101,"TCS");
		e1.show();
		Emp e2=new Emp();
		e2.get("Rabri",51,"Infosys");
		e2.show();
	}
}
		