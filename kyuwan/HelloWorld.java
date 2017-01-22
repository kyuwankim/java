package com.kyuwan;

import java.math.BigDecimal;

public class HelloWorld {
	// 2017.01.16
	// 진행내용
	// 0. JavaDoc 사용법
	// 1. 연산자
	// 2. 조건문
	// 3. 반복문

	/** Java Doc 생성 주석 **/
	/**
	 * 이 부분은 설명을 나열하는 부분
	 * 
	 * 
	 * 
	 * @author kimkyuwan
	 * @version 1.0
	 */

	public static void main(String[] args) {

		HelloWorld hello = new HelloWorld(); // 생성자 개념 클래스 전체를 메모리로 올리면 메소드를 다
												// 사용할 수 있다

		BigDecimal bigNumber = new BigDecimal("3333333333");

		
		BigDecimal result = hello.sumEven(bigNumber);
		System.out.println(result.toString());

	}

	/**
	 * 1부터 max 까지의 합을 구하는데 짝수만 더해보세요 BigDecimal 사용
	 */

	public BigDecimal sumEven(BigDecimal max) {
		BigDecimal result = new BigDecimal(0);

		BigDecimal first = new BigDecimal("1");
		BigDecimal divide = new BigDecimal("2");

		/*
		result = result.add(first);
		result = result.add(max);
		result = result.multiply(max);
		result = result.divide(divide);
		 */
		
		for(BigDecimal i = new BigDecimal(1); i.compareTo(max) ==0 ;)
		{
			
		}
		return result;
	}

	/**
	 * 
	 * 
	 * @param value
	 *            - 정수형 입력
	 */
	public void print(int value) {
		System.out.println(value);
	}

	/**
	 * 입력 값 a, b를 더해서 리턴
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	// 접근제어자, 리턴값, 함수명(파라미터)
	public int sum(int a, int b) {
		int result;
		result = a + b;
		return result;

	}

	public int minus(int a, int b) {

		int result;
		result = a - b;
		return result;
	}

	public int multiply(int a, int b) {
		int result;
		result = a * b;
		return result;
	}

	public int divide(int a, int b) {
		int result;
		result = a / b;
		return result;
	}

	/**
	 * 지불한 금액 payed에서 실제 가격 amount를 빼고 남은 거스름돈의 개수를 출력
	 *
	 * 제약조건 payed = 10,000원 amount = 3,720원
	 *
	 * 
	 * @param payed
	 * @param amount
	 */
	public void calculate(int payed, int amount) {

		int exchangeTotal = payed - amount;
		int exchangeFt = exchangeTotal / 5000;
		int exchangeOt = (exchangeTotal - exchangeFt * 5000) / 1000;
		int exchangeFw = (exchangeTotal - exchangeFt * 5000 - exchangeOt * 1000) / 500;
		int exchangeOh = (exchangeTotal - exchangeFt * 5000 - exchangeOt * 1000 - exchangeFw * 500) / 100;
		int exchangeF = (exchangeTotal - exchangeFt * 5000 - exchangeOt * 1000 - exchangeFw * 500 - exchangeOh * 100)
				/ 50;
		int exchangeT = (exchangeTotal - exchangeFt * 5000 - exchangeOt * 1000 - exchangeFw * 500 - exchangeOh * 100
				- exchangeF * 50) / 10;

		System.out.println("오천원" + exchangeFt + "개");
		System.out.println("천원" + exchangeOt + "개");
		System.out.println("오백원" + exchangeFw + "개");
		System.out.println("백원" + exchangeOh + "개");
		System.out.println("오십원" + exchangeF + "개");
		System.out.println("십원" + exchangeT + "개");

	}

	/**
	 * 조건문 if 비교 결과가 참인지 거짓인지를 판단하여 해당 블럭 내에 있는 로직을 실행한다 switch 입력된 값이 어떤 특정값과
	 * 비교하여 해당 블럭 내에 있는 로직을 실행한다
	 * 
	 */

	public void condition() {
		int a = 15;
		int b = 20;
		int c = 15;

		if (a > b) {
			System.out.println("A가 B보다 큽니다");
		} else if (a == b) {
			System.out.println("A와 B는 같습니다");
		} else {
			System.out.println("A가 B보다 작습니다");
		}

		// 3항 연산자
		c = (a == 15) ? 100 : 0;

		switch (a) {
		case 1:
			System.out.println("A는 1입니다.");
			break;
		case 15:
			System.out.println("A는 15입니다.");
			break;
		case 20:
			System.out.println("A는 20입니다.");
			break;
		default:
			System.out.println("A는" + a + " 입니다.");
			break;

		}
	}

	/**
	 * 반복문 for 특정 범위내의 값만큼 반복하면서 블럭내의 로직을 실행 while 특정 조건이 만족될 때 블럭내의 로직을 실행
	 */
	public void loop() {
		int i = 0; // 반복문의 시작값
		int limit = 100; // 반복문의 종료값
		for (i = 0; i < limit; i++) {
			System.out.println("i1=" + i);
		}

		i = 0;

		while (i < limit) {
			System.out.println("i2=" + i);
			i = i + 1;
		}

		int a = 0; // 시작값
		int a_limit = 10; // 종료값

		int b = 0; // 내부 for 시작값
		int b_limit = 10; // 종료값

		for (a = 0; a < a_limit; a++) {
			for (b = 0; b < b_limit; b++) {
				System.out.println("a= " + a + ", b=" + b);
				// System.out.print(" " + b + " ");
			}
			System.out.println("");
		}

	}

	/**
	 * 1부터 3,333,333,333 까지 더하는 함수를 만들고 결과값을 리턴받아서 출력하세요
	 * 
	 * 특정숫자까지 더하는 알고리즘 (n+1)*n/2 공식
	 * 
	 **/
	public long add() {
		long i = 1; // for 시작값
		long i_limit = 3333333333l;
		long result = ((i_limit + 1) * i_limit) / 2;

		/*
		 * for (i = 1; i <= i_limit; i++) {
		 * 
		 * result = result + i; }
		 */

		return result;

	}

	/**
	 * 33억 더하기 강사님 코드
	 * 
	 */
	public BigDecimal sum(long max) {
		BigDecimal result = new BigDecimal(0); // 큰 숫자 0으로 초기화된다

		BigDecimal bigMax = new BigDecimal(max);

		// (n+1) * n / 2
		result = result.add(bigMax);
		result = result.add(new BigDecimal(1));

		result = result.multiply(bigMax);
		result = result.divide(new BigDecimal(2));

		/*
		 * long count = 1;
		 * 
		 * for (count = 1; count <= max; count++) {
		 * 
		 * BigDecimal current = new BigDecimal(count); // DigDecimal 형태에서 바로
		 * 더할수가 없어서 해당 방법으로 추가함 result = result.add(current);
		 * 
		 * //result.add(new BigDecimal(count)); //위와 같은 표현식임 }
		 */
		return result;
	}

	/**
	 * 1000 보다 작은 양의정수 중에서 n 과 m 값을 받아서 n과 m의 합을 구하라
	 * 
	 * @return
	 */
	public int add2(int n, int m) {
		int result = 0;

		result = (m * (m + 1)) / 2 - (n * (n + 1)) / 2 + 1;

		return result;
	}

	/**
	 * 구구단 입력값을 정수 n으로 받았을 때, n 이하까지의 구구단을 계산하는 프로그램을 작성하시오
	 */
	public void multiple(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + " * " + j + " = " + i * j);
			}
			System.out.println("");
		}
	}
}
