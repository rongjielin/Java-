public class UpandLower {
	public static void main(String args[]) {
		String str = new String("abc DEF");
		String newstr = str.toLowerCase();
		String newstr2 = str.toUpperCase();
		
		System.out.println(newstr);
		System.out.println(newstr2);
	}

}

return:
abc def
ABC DEF
