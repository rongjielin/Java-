public class Opinion {
	public static void main(String args[]) {
		String s1 = new String("abc");
		String s2 = new String("ABC");
		String s3 = new String("abc");
		boolean b = s1.equals(s2);
		boolean b2 =s1.equalsIgnoreCase(s2);
		System.out.println(s1 + " equals " + s2 + " :" + b);
		System.out.println(s1 + " equalsIgnoreCase " + s2 + " :" + b2);
	} 

}


Return:
abc equals ABC :false
abc equalsIgnoreCase ABC :true
