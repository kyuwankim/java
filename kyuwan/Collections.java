package com.kyuwan;

import java.util.ArrayList;

public class Collections {

	/*
	 * 1. 입력값으로 정수 n, m으로 받았을 때 n이하까지의 m의 갯수가 몇개인지 구하시오 n = 10000, m = 8
	 * 2. 입력값을 문자열 n으로 받은 후, 해당 문자열을 거꾸로 뒤집은 후 출력하는 프로그램을 작성하세요
	 * 3. 문자열의 구성이 같은 문자열을 아나그램이라고 한다 ex) abcd = acbd = cabd
	 * 	   입력값을 문자열 n, m 으로 받은 후 n 문자열과 m 문자열이 아나그램인지 확인하는 프로그램을 작성하세요
	 *     아나그램을 경우 결과값으로 true를 리턴한다 
	 */
	public static void main(String[] args) {

		Collections CL = new Collections();
		CL.countNumber(10000, 8);

		String myName = "kimkyuwan";
		String yuRi = "nayuri";
		String manDeuk = "mandeuk";

		// 만약 내용들의 크기를 알면 배열을 쓰는게 훨씬 효율적일 수 있다

		ArrayList<String> nameList = new ArrayList<>();
		// 객체들의 초기화는 new ArrayList로 초기화 한다

		// 객체 : 아직까지는 코드랑은 상관없는 상태 설계단계의 개념화된 코딩할 대상들, 이걸 인스턴스랑 같이 쓰는 곳도 있
		// 클래스 : 개념화 된 객체를 코딩한 상태
		// 인스턴스 : 클래스에 따라서 실행을 하여 객체가 메모리에 올라간 것

		// add를 통하여 각 String을 저장함
		nameList.add(myName);
		nameList.add(yuRi);
		nameList.add(manDeuk);

		// 스트링 다입과 인티저 타입 다 어레이리스트에 들어갈 수 있다
		// 컬랙션 객체는 타입이 달라도 다 허용이 되도록 되어있다
		// 다 허용 할 수 있도록 컬랙션에서 Object 라는 타입으로 맞춰줌

		int num = 57;
		// nameList.add(new Integer(num));

		// 동적 배열 (크기가 변하는)의 사이즈는 비교의 기준으로 삼지 않는다 (권고사항)
		int i = 0;
		int nameListSize = nameList.size(); // nameListSize로 따로 빼서 비교문에는 동적으로
											// 변하게 쓰지 않는다
		for (i = 0; i < nameListSize; i++) {
			System.out.println(i + 1 + " 번 사람 : " + nameList.get(i));
		}

		// for each 문
		for (String item : nameList) {
			System.out.println(item);
		}

	}

	public void countNumber(int n, int m) {
		int count = 0;
		int number = 0;

		int i = 0;
		for (i = 0; i <= n; i++) {
			number = i;
			while (number > 0) {
				if (number % 10 == m) {
					count++;
				}number = number / 10;

			}
		}
		System.out.println(count);
	}

}
