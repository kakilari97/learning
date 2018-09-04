package lab11;

public abstract class StringSpace implements StringSpaceInterface{

	public static void main(String[] args) {
		
		StringSpaceInterface s=(tring)->{System.out.println(tring.replace("", " "));};
		s.space("Hello");
	}

}
