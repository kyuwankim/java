package com.confirm;

public class QuizRep {

	/**
	 * 2017/01/18 퀴즈
	 * 
	 * 1. 입력값으로 정수 n, m으로 받았을 때 n이하까지의 m의 갯수가 몇개인지 구하시오 n = 10000, m = 8 2. 입력값을
	 * 문자열 n으로 받은 후, 해당 문자열을 거꾸로 뒤집은 후 출력하는 프로그램을 작성하세요 3. 문자열의 구성이 같은 문자열을
	 * 아나그램이라고 한다 ex) abcd = acbd = cabd 입력값을 문자열 n, m 으로 받은 후 n 문자열과 m 문자열이
	 * 아나그램인지 확인하는 프로그램을 작성하세요 아나그램을 경우 결과값으로 true를 리턴한다
	 *
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		QuizRep qr = new QuizRep();
		qr.countNum(10000, 8);

	}

	public void countNum(int n, int m) {

		/*
		 * int result = 0 ;
		 * 
		 * // 입력받은 n의 수 만큼 돌아가는 배열의 초기값 선언 int input = 0 ; int count = n ;
		 * 
		 * for(input = 0 ; input < n ; input = input + 1 ) {
		 * 
		 * while(count > 0 ){ if(input % m == 0){ result++; }count = count/10; }
		 * 
		 * 
		 * System.out.println("result : "+result);
		 * System.out.println("count : "+count); System.out.println("m : "+m);
		 * System.out.println("n : "+n); System.out.println("-----------");
		 */

	}

}
