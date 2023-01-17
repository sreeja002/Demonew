package demo5;

public class Calculate {
	public float calculateIntrest(float principal,float rate,float time) {
		return (principal*rate*time)/100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj = new Calculate();
		System.out.println(obj.calculateIntrest(500,6,7));

	}

}
