public class Exe03 {
	public static void main(String args[]) {
		double a =1;
		double b =1;
		double c =0;
		double sum=0;
		while(a<=20) {
			b=b*a;
			c=1/b;
			sum=sum+c;
			a++;
		}
		System.out.println("sum = " +sum);
	}

}

Return Result:
sum = 1.7182818284590455
