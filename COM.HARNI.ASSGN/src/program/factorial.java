package program;

import java.util.Scanner;;

public class factorial {
	public  static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("please enter a number: ");

	int num = ref.nextInt();
	int f=1;
	int i;
	for(i=1;i<=num;i++) {
		f=f*i;
	}
	System.out.println("factorial of a "+num+ "is: "+f);
	}
}

