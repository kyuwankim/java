#자바 주석넣기
######주석은 여러가지 방법으로 입력 할 수 있다
>주석넣기의 방법
>
>- 한 줄 주석 : //
>- 영억 주석 : /* 내용 */
>- JavaDoc 주석넣기 : /** 내용 **/

#연산자
- 산술연산자(+, -, *, /, %)
- 대입연산자(=)
- 복합대입연산자(+=, -=, *=, /=, %=)
- 형변환연산자((DataType))
- 증감연산자(++, --)
- 비교연산자(>, >=, <, <=, ==, !=, instanceof)
- 비트연산자(&, |, ^, ~)
- 논리연산자(&&, ||, !)
- 조건삼항연산자( ? : )
- 배열연산자([])
- 메소드연산자(())

#조건문
>1. if(조건식)
>
>	조건식 내용이 참일경우 해당 영역으로 이동 후 수행(분기)
>**if** 외 다른 분기를 처리할땐 **else** 를 사용
>**if**와 **else**이외 분기가 필요할 땐 **else if** 사용

>2. switch
>
>	**switch(n)** n값 에 따라서 분기가됨 
>분기 구분은 **case**로 함
>**break**를 걸면 해당 내용만 출력 후 내용 탈출 가능
>**continue**를 사용하면 해당 영역 안 ‘ } ’ 으로 이동

#반복문
>1. for
>
>	**for( 초기화 ; 조건 ; 증감식 )** 조건에 만족하면 계속 반복하면서 증감식을 거친 후 다시 조건을 확인하며 반복하는 형식
>
>2. while
>	
>	**while()** 괄호 안 내용이 참이면 계속 반복
>	for과는달리 조건이 괄호 안에 있지 않기때문에 이탈하기 위한 내용을 while 본문 안에 넣어야함
>
>3. do while
>
>	**do** 를 통하여 일단 반복문을 실행
>	맨 마지막에 while문을 통해 조건을 확인 후 반복 여부를 결정
>	특이하게 while후 ‘ ; ‘ 세미콜론을 함 

#배열
>	같은 타입의 여러 변수를 하나의 묶음으로 다루는 것을 "배열"이라고 함
>	자료를 순차적으로 저장 할 수 있고 인덱스를 통해 해당 내용으로 직접 접근이 가능함
>	하지만, 한번 확보된 배열의 크기를 조절하기가 어렵기때문에 처음에 만들었던 크기보다
>	저장할 데이터의 양이 적어지면 차이가 발생하므로 메모리 낭비가 있을 수 있음
>
>
>
>
>
	public static void main(String[] args) {
		// 배열선언 
		int array[] = new int[6];
		int x,y,z;
		//배열입력
		array[0] = 434;
		array[1] = 43244;
		array[5] = 345437;
		array[3] = 6546546;
		// 범위를 넘어섰기 때문에 오류
		// array[6] = 947;
		// int 같은 경우 값이 들어가지않으면 자동으로 0으로 초기화 
				int array2[][] = new int[3][2];
		//      		  y  x 
				// 데이터셋의 크기, [번호, 제목, 내용, 날짜]
		// x축을 먼저 생각하고
		// x축 괄호 앞에 y축 공간을 정의해준다 
		int array2_1[][] = new int[100][4];
				/*
		for(y = 0 ; y <100 ; y++) {
			for (x=0; x<4; x++) {
				System.out.print("["+array2_1[y][x]+"]");
			}
			System.out.println("");
		}
		*/
				// 3차원 배열
		   x = 5;
		   y = 10; 
		   z = 7;
		  		   int array3[][][] = new int[z][y][x];
		  		   array3[3][5][2] = 352;
		   array3[2][0][3] = 203;
		   array3[6][9][1] = 691;
		  		   int zIndex = 0;
		   int yIndex = 0;
		   int xIndex = 0;
		  		   for(zIndex = 0 ; zIndex < z ; zIndex++) {
			   for(yIndex = 0 ; yIndex < y ; yIndex++) {
				   for(xIndex = 0 ; xIndex < x ; xIndex++) {
				System.out.print("["+array3[zIndex][yIndex][xIndex]+"]");
				   }
				   System.out.println("");
			   }
			   //3차원 배열은 각 배열을 층별로 나타낸다고 생각하면 편함 
			  System.out.println("--------------------");
		   }
				for(int i = 0 ; i < array.length ; i++){
			System.out.println("array["+i+"] : "+ array[i]);
		}
	}
	
#컬랙션
>	컬렉션즈 프래임워크라는 것은 다른 말로는 컨테이너라고도 부른다
>	즉, 값을 담는 그릇이라는 의미이다. 
>
>
>	그런데 그 값의 성격에 따라서 컨테이너의 성격이 조금씩 달라진다. 자바에서는 다양한 상황에서 사용할 수 있는 다양한 컨테이너를 제공하는데 이것을 컬렉션즈 프래임워크라고 부른다. ArrayList는 그중의 하나다
>
>	1) ArrayList
>
>	- List 인터페이스의 구현 클래스로, ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다
>
>	- 배열과 ArrayList는 인덱스로 객체를 관리한다는 점에서는 유사함
>
>	- 배열은 생성할 때 크기가 고정되고 사용중에 크기를 변경 할 수 없다
>
>	- ArrayList는 저장용량을 초과한 객체들이 들어오면 자동적으로 저장용량이 늘어난다


#제네릭
>	내 컬랙션에서 사용할 타입을 지정 
>
> 	제네릭이 없을경우 컬랙션에서 Object 형으로 변경되어있었기 때문에 꺼낼 때 해당 데이터형으로 캐스팅해야하는데 제네릭 <> 으로 선언을하면 타입을 지정하게 되므로 따로 캐스팅 할 필요가 없음


#클래스
>	클래스란 변수와 함수의 모음을 클래스명으로 정의한 것이다
>
>
>	- class 정의하기
>
>		class 명의 첫글자는 대문자
>
>		클래스안에 클래스를 만들 수 있다
>
>		내부클래스로 선언된 클래스들은 멤버 함수와 같이 외부에 선언된 변수와 함수들을 그대로 사용할 수 있다
>
>		내부클래스와 외부클래스는 같은 이름의 멤버를 만들 수 있다 (사용할땐 this or 외부클래스명.this.멤버변수)
>
>
>	- 오버로딩 / 오버라이딩
>
>		오버로드 : 들어오는 파라미터 타입이 다르거나 갯수가 다를 때, 오버로딩 파라미터가 같고 실행되는 내용이 다를 때 
>
>		오버라이드 : 사전적인 의미로 ‘…보다 더 중요하다’ 그러니 내 메소드를 사용하라고 이해하면 이해가 쉬울듯 (접근제한자를 제외하고 모두 같음)
>
>		서로 다른 클래스에서 직접 필드를 참조 할 수 없도록 get, set을 통해 접근 할 수 있도록 함

#접근제어자

>	public - 전체
>
>	private - 같은 클래스
>
>	protect - 같은 패키지
>
>	default - 같은 클래스, 같은 패키지


#상속

>	부모클래스의 속성과 기능을 자식클래스가 갖는 개념이다
>
>	상속을 받고싶으면 extends 를 사용하면 됨
>
>만약 상속받는쪽과 상속해주는쪽에 같은 변수가 있을때 사용하고싶은 변수를 지정할 때 this(상속받는 나를 지칭) 를 쓴다

#FILE IO
### 대용량 데이터를 처리할 경우에는 IO가 더 유리 

- IO (BufferedReader 읽기)

> 		public void readFile() {
		String filename = "/Users/kimkyuwan/Desktop/test.txt";
		// 1.파일생성
		File file = new File("/Users/kimkyuwan/Desktop/test.txt");
		// 2. 파일 유효성 체크
		if (file.exists()) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename),"UTF-8")) ){
			//try (BufferedReader br = new BufferedReader(new FileReader(file)) ) {
				// 3. buffer를 사용해서 파일을 읽는다
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일이 없습니다");
		}
	}

- IO (BufferedReader 쓰기)

>		public void writeFile() {
		String directory = "input"+File.separator;
		String filename = "test2.txt";
		File dir = new File(FILEROOT + directory);
		if(!dir.exists()){
			dir.mkdirs();// 경로상의 모든 디렉토리를 생성해줌 (경로에 내가 아직 만들지 않은 디렉토리가 있다면) mkdir은 맨 마지막 파일만 만들어줌
		}
		File file = new File(FILEROOT + directory + filename);
		if(file.exists()){
			System.out.println("파일이 존재합니다");
		}else{
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				String content = "Test";
				bw.write(content);
				bw.flush(); // 512바이트가 다 저장이 되어야 파일이 저장이 되지만, 저장할것이 그거보다 부족하면 flush 를 통해서 내용을 보내버림
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

- IO (FileInputStrem 읽기)

>		public void readStream() {
		String directory = "input" + File.separator;
		String filename = FILEROOT +  "test.txt";
		// 1. 유효성 검사를 위해 File 인스턴스 생성
		File file = new File(filename);
		// 2. 파일이 있으면
		if (file.exists()) {
			// 3. 파일을 불러오기위한 인풋스트림 인스턴스 생성
			try (FileInputStream fis = new FileInputStream(filename)) {
				int i;
				// 4. 돌면서 최소단위로 파일 읽기
				try {
					while ((i = fis.read()) != -1) {
						System.out.println(i);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
- IO (FileInputStrem 쓰기)

>			public void writeStream() {
			String directory = "input"+File.separator;
		String filename = "test3.txt";
		File dir = new File(FILEROOT + directory);
		if (!dir.exists()) {
			System.out.print("같은 파일 존재");
		}else{
			try(FileOutputStream fos = new FileOutputStream(FILEROOT + directory + filename)) {
				String content = " 작성할 내용 ";
				fos.write(content.getBytes());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

#FILE NIO
### 장점 : 과도한 스레드 생성을 피하고 스레드를 효과적으로 재사용한다는 점

- NIO (읽기)

>		public void readNio() {
		// 1. 경로생성 먼저
		Path path = Paths.get("/Users" + File.separator + "kimkyuwan/Desktop/","text.txt");
		try {
			byte rawData[] = Files.readAllBytes(path);
			String content = new String(rawData, StandardCharsets.UTF_8);
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



- NIO (쓰기)

>		public void writeNio() {
		String content =  "냉";
		Path path = Paths.get("/Users" + File.separator + "kimkyuwan/Desktop/","test5.txt");
		try {
			Files.write(path, content.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

--
