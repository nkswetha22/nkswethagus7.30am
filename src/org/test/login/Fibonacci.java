package org.test.login;

public class Fibonacci {
public  void fibo() {
	int n = 10, t1 = 0, t2 = 1, sum = 0;
	
	for (int i = 1; i<= n; i++) {
		
		
	System.out.println(t1);
	
	sum = t1+t2;
	t1=t2;
	t2=sum;
	
	}
}
public static void main(String[] args) {
	Fibonacci f = new Fibonacci();
	f.fibo();
}
}
