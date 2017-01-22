package com.kimkyuwan.bbs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

	private final String FILEROOT = "/Users" + File.separator + "kimkyuwan/Desktop/";

	
	public void readNio() {
		// 1. 경로생성 먼저
		Path path = Paths.get("/Users" + File.separator + "kimkyuwan/Desktop/","test.txt");
	
		try {
			byte rawData[] = Files.readAllBytes(path);
			String content = new String(rawData, StandardCharsets.UTF_8);
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeNio() {
		String content =  "냉";
		
		Path path = Paths.get("/Users" + File.separator + "kimkyuwan/Desktop/input","test5.txt");
		
		try {
			Files.write(path, content.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void writeStream() {
		
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

	
	
	
	public void readStream() {
		String directory = "input" + File.separator;
		String filename = FILEROOT +  "test.txt";

		// 1. 유효성 검사를 위해 File 인스턴스 생성
		File file = new File(filename);
		// 2. 파일이 있으면
		if (file.exists()) {
			// 3. 파일을 불러오기위한 인풋스트림 인스턴스 생성
			try (BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream(filename), "UTF-8"))) {

				byte spoon[] = new byte[1024];
				// 4. 돌면서 spoon단위로 파일 읽기
				String line;
				try {
					while ((line = br.readLine()) != null) {
					System.out.println(line);
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

	// 파일 쓰는 메소드
	public void writeFile() {
		
		String directory = "input"+File.separator;
		String filename = "test2.txt";
		
		File dir = new File(FILEROOT + directory);
		if (!dir.exists()) {
			dir.mkdirs();// 경로상의 모든 디렉토리를 생성해줌 (경로에 내가 아직 만들지 않은 디렉토리가 있다면)
							// mkdir은 맨 마지막 파일만 만들어줌

		}
		File file = new File(FILEROOT + directory + filename);
		if (file.exists()) {
			System.out.println("파일이 존재합니다");
		} else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				String content = "Test";
				bw.write(content);
				bw.flush(); // 512바이트가 다 저장이 되어야 파일이 저장이 되지만, 저장할것이 그거보다 부족하면
							// flush 를 통해서 내용을 보내버림
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 파일 읽는 메소드
	public void readFile() {

		String filename = "/Users/kimkyuwan/Desktop/test.txt";
		// 1.파일생성
		File file = new File("/Users/kimkyuwan/Desktop/test.txt");
		// 2. 파일 유효성 체크
		if (file.exists()) {

			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
				// try (BufferedReader br = new BufferedReader(new
				// FileReader(file)) ) {
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

}
