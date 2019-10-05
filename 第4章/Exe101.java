import java.util.Scanner;

public class Exe101 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入一个整数: ");
		int a =scan.nextByte();
		if(a%2!=0)
			System.out.println("a是奇数");
		else
			System.out.println("a是偶数");
	}

}

Return Result:
输入一个整数：
若输入是偶数或奇数，则
（a是奇数，a是偶数）
