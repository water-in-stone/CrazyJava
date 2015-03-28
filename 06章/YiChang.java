public class  YiChang
{
	public static void main(String[] args )   
	{
		//String[] arr = {"A","a"};
		//System.out.println(arr[1]);
		try 
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[2]);
			int c =0;
			if(args[1].equals("+")) c = a + b;
			else if(args[1].equals("-")) c = a-b;  //用equals
			else if(args[1].equals("x")) c = a*b;
			else if(args[1].equals("/")) c = a/b;
			else 
			{
				System.out.println("错误的输入");
				System.exit(0);
			}
			System.out.println(c);
		}
		/*catch (Exception e)
		{
			System.out.println(e.getMessage());
		} 注意这里如果直接catch最大的Exception，那么接下来的语句就有问题
		*/
		catch (IndexOutOfBoundsException ie)
		{
			System.out.println("数组越界：运行程序时输入的参数个数不够");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("数字格式异常：程序只能接受整数参数");

		}
		catch(ArithmeticException ae)
		{
			System.out.println("算术异常");
		}
		catch(Exception e)
		{
			System.out.println("未知异常");
		}
		finally
		{
			try
			{		
				
			}
			catch (Exception e)
			{
				System.out.println("再次处理异常");
			}
		}
	}

}

