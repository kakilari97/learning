package lab11;

public class Program11_1 {

	public static void main(String[] args) {
	
		PowerInterface pr=(double x,double y)->{double m=Math.pow(x, y); System.out.println(m); return m;
	};
	pr.power(2.0, 2.0);
	}

}
