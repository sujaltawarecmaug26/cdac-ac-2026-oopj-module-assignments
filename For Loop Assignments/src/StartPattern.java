
public class StartPattern {

	public static void main(String[] args) {
		
		for(int iTemp = 0; iTemp < 5; iTemp++) {
			for(int jTemp = 0; jTemp <= iTemp; jTemp++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
