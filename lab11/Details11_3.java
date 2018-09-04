package lab11;

public abstract class Details11_3 implements Details11_3Interface {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		Details11_3Interface log=(uname,pass)->uname.equals(pass)?true:false;
		boolean result=log.login(s, s1);
		System.out.println(result);
	}
}
