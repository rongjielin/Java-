public class GetSum {
	public static void main(String args[]) {
		int x = 1;
		int sum = 0;            //定义变量用于保持相加后的结果
		while(x<=10) {
			sum = sum + x;      //while循环语句，当变量满足条件表达式时执行循环体语句
			x++;
		}
		System.out.println("sum = "+sum);   //将变量sum输出
	}

}



Return Result:
sum = 55
