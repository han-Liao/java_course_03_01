package liao.csc.group.han;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入整數n");
		n = scan.nextInt();
		System.out.println("計算結果 : " + fib(n));
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fib(n-1) + fib(n-2);
		}
		
	}
}
