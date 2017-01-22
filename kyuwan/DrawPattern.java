package com.kyuwan;

public class DrawPattern {

	public static void main(String[] args) {

		DrawPattern dp = new DrawPattern();
		dp.showBlankDiamond(5, "A");

	}

	/**	빈 다이아몬드 만들기 
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
	 * 구멍뚫린 다이아몬드 만들기
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
	 * 다이아몬드 만들기
	 * 
	 */
	public void showDiamond(int count, String unit) {

		int i, j, k;
		int flag = 1;

		for (i = 0; i < count && i >= 0; i = i + flag) {

			// 공백 추가 for
			for (k = count - i; k > 0; k--) {
				System.out.print(" ");
			}

			// 문자 추가 for
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
		 * //공백 넣어주는 부분 for (k = count - i; k > 1; k--) { System.out.print(" ");
		 * }
		 * 
		 * //unit 넣어주는 부분 for (j = 0; j < i * 2 + 1; j++) {
		 * System.out.print(unit); } System.out.println("");
		 * 
		 * if (i == count - 1) flag = -1; }
		 */
	}

	/**
	 * 속이 빈 정삼각형 만들기
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
	 * 정삼각형 만들기
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
	 * 뒤집어진 직각삼각형 만들기
	 * 
	 * 공백을 넣기위한 반복문이 추가
	 * 
	 * @param count
	 * @param unit
	 */
	public void showReverseTri(int count, String unit) {
		int i, j, k;
		for (i = 1; i <= count; i++) {
			// 공백을 출력하는 반복문
			for (k = count - 1; k >= i; k--) {
				System.out.print(" ");
			}
			// unit을 출력하는 반복문
			for (j = 1; j <= i; j++) {
				System.out.print(unit);
			}
			System.out.println();
		}
	}

	/**
	 * count와 unit을 입력받아서 1부터 시작해서 매 count의 숫자만큼 unit을 출력합니다.
	 * 
	 * 예) count = 5, unit = A A AA AAA AAAA AAAAA
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
