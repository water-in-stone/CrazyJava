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
			else if(args[1].equals("-")) c = a-b;  //��equals
			else if(args[1].equals("x")) c = a*b;
			else if(args[1].equals("/")) c = a/b;
			else 
			{
				System.out.println("���������");
				System.exit(0);
			}
			System.out.println(c);
		}
		/*catch (Exception e)
		{
			System.out.println(e.getMessage());
		} ע���������ֱ��catch����Exception����ô������������������
		*/
		catch (IndexOutOfBoundsException ie)
		{
			System.out.println("����Խ�磺���г���ʱ����Ĳ�����������");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("���ָ�ʽ�쳣������ֻ�ܽ�����������");

		}
		catch(ArithmeticException ae)
		{
			System.out.println("�����쳣");
		}
		catch(Exception e)
		{
			System.out.println("δ֪�쳣");
		}
		finally
		{
			try
			{		
				
			}
			catch (Exception e)
			{
				System.out.println("�ٴδ����쳣");
			}
		}
	}

}

