
public class DecStarPattern {

	public static void main(String[] args) {
		for(int iTemp = 5; iTemp >= 0; iTemp--) {
			for(int jTemp = 0; jTemp <= iTemp; jTemp++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
