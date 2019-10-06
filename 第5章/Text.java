public class Text {
	public static void main(String args[]) {
		String str="We are students";
		//将空字符串在str中的索引位置赋值给变量size
		int size = str.lastIndexOf("");
		//将变量size输出
		System.out.println("空字符在字符串str中的索引位置是： "+ size);
		//将字符串str长度输出
		System.out.println("字符串str的长度是： "+str.length());
	}

}


Return:
空字符在字符串str中的索引位置是： 15
字符串str的长度是： 15
