package pkt1;

public class Class_Pattern3 {

	public static void main(String[] args) {
		int x = 1;
		for(int i = 0;i<=5;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print(x);
				x =x + 1;
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
