package pkt1;

public class Class_Pattern6 {

	public static void main(String[] args) {
			
		for(int i = 0;i<6;i++) {
			for (int j =5;j>i;j--) {
				System.out.print(" ");
			}
			     for (int k=0; k<(2*i)-1;k++) {
				       System.out.print("**");
		         }
			System.out.println();
        }
    }
}
