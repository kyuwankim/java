package com.kyuwan;

public class DrawPattern {

	public static void main(String[] args) {

		DrawPattern dp = new DrawPattern();
		dp.showBlankDiamond(5, "A");

	}

	/**	�� ���̾Ƹ�� ����� 
	 * 
	 */
	public void showEmptyDiamond(int count, String unit) {
		int i,j,k;
		int flag = 1;
		
		for(i = 0 ; i < count && i >= 0 ; i++) {
			
			for (k = count - i ; k > 0 ; k--) {
				System.out.print(" ");
			}
			
			for (j = 0 ; j < 2 * i +1 ; j++) {
				System.out.print(unit);
			}
			
			System.out.println("");
		}
		
		
	}
	
	
	
	
	/**
	 * ���۶ո� ���̾Ƹ�� �����
	 * 
	 */
	public void showBlankDiamond(int count, String unit) {
		int i, j, k;
		int flag = 1;
		for (i = 0; i < count && i >= 0; i = i + flag) {

			for (k = count - i - 1; k > 0; k--) {
				System.out.print(" ");
			}

			for (j = 0; j < i * 2 + 1; j++) {

				if (flag == -1) {
					System.out.print(unit);
				} else {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print(unit);
					}

				}

			}

			System.out.println("");

			if (i == count - 1) {
				flag = -1;
			}
		}
	}

	/**
	 * ���̾Ƹ�� �����
	 * 
	 */
	public void showDiamond(int count, String unit) {

		int i, j, k;
		int flag = 1;

		for (i = 0; i < count && i >= 0; i = i + flag) {

			// ���� �߰� for
			for (k = count - i; k > 0; k--) {
				System.out.print(" ");
			}

			// ���� �߰� for
			for (j = 0; j < i * 2 + 1; j++) {
				System.out.print(unit);
			}
			System.out.println("");

			if (i == count - 1) {
				flag = -1;
			}
		}

		/*
		 * int i, j, k;
		 * 
		 * int flag = 1;
		 * 
		 * for (i = 0; i < count && i >= 0; i = i + flag) {
		 * 
		 * //���� �־��ִ� �κ� for (k = count - i; k > 1; k--) { System.out.print(" ");
		 * }
		 * 
		 * //unit �־��ִ� �κ� for (j = 0; j < i * 2 + 1; j++) {
		 * System.out.print(unit); } System.out.println("");
		 * 
		 * if (i == count - 1) flag = -1; }
		 */
	}

	/**
	 * ���� �� ���ﰢ�� �����
	 */
	public void showEmptyTriangle(int count, String unit) {

		int i, j;
		for (i = 0; i < count; i++) {
			for (j = 0; j < count * 2 - 1; j++) {
				if (count - 1 - i == j || count - 1 - i == (count - 1) * 2 - j || i == count - 1)
					System.out.print(unit);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

	/**
	 * ���ﰢ�� �����
	 * 
	 * @param count
	 * @param unit
	 */
	public void showTriangle(int count, String unit) {

		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * �������� �����ﰢ�� �����
	 * 
	 * ������ �ֱ����� �ݺ����� �߰�
	 * 
	 * @param count
	 * @param unit
	 */
	public void showReverseTri(int count, String unit) {
		int i, j, k;
		for (i = 1; i <= count; i++) {
			// ������ ����ϴ� �ݺ���
			for (k = count - 1; k >= i; k--) {
				System.out.print(" ");
			}
			// unit�� ����ϴ� �ݺ���
			for (j = 1; j <= i; j++) {
				System.out.print(unit);
			}
			System.out.println();
		}
	}

	/**
	 * count�� unit�� �Է¹޾Ƽ� 1���� �����ؼ� �� count�� ���ڸ�ŭ unit�� ����մϴ�.
	 * 
	 * ��) count = 5, unit = A A AA AAA AAAA AAAAA
	 * 
	 * @param count
	 * @param unit
	 */
	public void showRectTri(int count, String unit) {
		int i;
		for (i = 1; i <= count; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(unit);
			}
			System.out.println();

		}
	}

}
