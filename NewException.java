class NewException
{	public static void main(String[] s)
	{	try
		{	int x=10/s.length;
			System.out.print(x);
			int[] z=new int[s.length];
			z[10]=100;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{	System.out.print(e+"jajajajaja");
		}
		catch(Error e)
		{	System.out.print(e);
		}
		catch(Exception e)
		{	System.out.print(e);
		}
		catch(Throwable e)
		{	System.out.print(e);
		}
	}
}