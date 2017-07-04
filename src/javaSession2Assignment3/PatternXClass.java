package javaSession2Assignment3;

public class PatternXClass {

	public static void main(String[] args) {

		System.out.println("The Output :");
		// the loop is used to print the X pattern by using rows and columns of
		// matrix
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				// this condition will print * only when row = column or
				// row+column = upperlimit-1
				if (i == j || (i + j) == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
