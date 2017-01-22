package com.kyuwan;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {

		String a = "a2a";
		String b = "12345";
		String c = "aaa";

		Strings st = new Strings();
		st.reverseString("was it a cat it saw");
		//st.countNumber(10000, 8);

		// 1. 문자열 비교
		// 문자열.compareTo(문자열)
		// 문자열.equals(문자열)
		// 문자열 == 문자열

		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		// 2. 문자열의 인덱스 값
		System.out.println(a.charAt(2));

		// 3. 문자열 합치기
		System.out.println(a + b);

		// 4. "무엇" 으로 시작하는 문자열인지.. 끝나는 문자열인지
		System.out.println(a.startsWith("a"));
		System.out.println(a.endsWith("a"));

		// 5. 찾고자하는 문자열이 몇번쨰 있는지
		System.out.println(a.indexOf("2"));

		// 6. 문자열길이
		System.out.println(a.length());

		// 7. 문자열 변경
		System.out.println(a.replace("a", "x"));
		a.replaceAll("문자열의 패턴 : 정규식", "바꿀문자");

		// 8. 문자열 자르기
		System.out.println(a.substring(1, 2));// 1번과 2번 사이의 문자를 가져옴

		// 9. 문자열 분리하기
		String value = "a/b/cdg/a2223/afefs";
		String values[] = value.split("/");
		for (String item : values) {
			System.out.println(item);
		}
	}

		// 10. 숫자 -> 문자변환 = 숫자 + ""
	    String ccc = 888 + "";
	    
	    // 11. 문자 -> 숫자변환
	    int ddd = Integer.parseInt(ccc);
	    long eee = Long.parseLong(ccc);
	    
	    // 12. int -> char 변환 = char 범위보다 큰값이 입력되면 절삭 
	    char fff = (char) ddd;
	    
	    // 13. 하나의 숫자를 char로 변형 = 이유 : 문자열보다 효율적 
	    int argNum = 8; // 입력하는 숫자
	    int argDigix = 10;

	    // 14. 문자열을 한글자씩 char로 분해
	    String target = "8888";
	    char arrs[] = target.toCharArray();
	    
	    // 15. 배열 정렬
	    // Arrays.sort(arrs);
	
	
	public void countNumber(int n, int m) {
		int i = 0;
		int j = 0;
		int count = 0;

		for (i = 1; i <= n; i++) {
			String nn = i + "";
			for (j = 0; j < nn.length(); j++) {
				if (nn.charAt(j) == '0' + m) {
					count++;
				}
			}
		}
		System.out.println(count + "개 만큼 존재함 ");

	}


	//2. 입력값을 문자열 n으로 받은 후, 해당 문자열을 거꾸로 뒤집은 후 출력하는 프로그램을 작성하세요
	public void reverseString(String n) {
				
		char array[] = n.toCharArray();

		int i = 0;
		int k = 0;
		for(i = array.length-1 ; i >=0 ; i--) {

			char temp[] = new char[array.length];
			temp[k] = array[i];
			k++;
			System.out.print(temp);
			
		}
		

		
		
		
		
	}

	public boolean isAnagram(String a, String b) {
		boolean result = false;
		
		//각각의 파라미터를 배열에 담고
		//각 배열을 정렬을 해서 비교를 한다 (기본 기능이 있음)
		
		char arrayA[] = a.toCharArray();
		char arrayB[] = b.toCharArray();
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		result = Arrays.equals(arrayA, arrayB);

		return result;
	}


}
