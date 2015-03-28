public class TestMethod {
	public static void main(String[] args) 
	{
		m3('A',9);
	}

	public static void m3(int i,int j){
		System.out.println(i+j);
	}

	public  static int m1(int i){
		int j = 2;
		return j;  //这里方法里说了要返回int，才能返回值！
	}
}

