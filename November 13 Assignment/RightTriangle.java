public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = args[0];
		int row = Integer.parseInt(num1);
		String num2 = args[1];
		int col = Integer.parseInt(num2);
		RightTriangle pd = new RightTriangle();
		pd.printRightTriangle(row, col);
	}

	void printRightTriangle(int r, int c) {
		for (int row = 0; row < r; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
