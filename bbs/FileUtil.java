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
		// 1. ��λ��� ����
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
		String content =  "��";
		
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
			System.out.print("���� ���� ����");
		}else{
			try(FileOutputStream fos = new FileOutputStream(FILEROOT + directory + filename)) {
				String content = " �ۼ��� ���� ";
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

		// 1. ��ȿ�� �˻縦 ���� File �ν��Ͻ� ����
		File file = new File(filename);
		// 2. ������ ������
		if (file.exists()) {
			// 3. ������ �ҷ��������� ��ǲ��Ʈ�� �ν��Ͻ� ����
			try (BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream(filename), "UTF-8"))) {

				byte spoon[] = new byte[1024];
				// 4. ���鼭 spoon������ ���� �б�
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

	// ���� ���� �޼ҵ�
	public void writeFile() {
		
		String directory = "input"+File.separator;
		String filename = "test2.txt";
		
		File dir = new File(FILEROOT + directory);
		if (!dir.exists()) {
			dir.mkdirs();// ��λ��� ��� ���丮�� �������� (��ο� ���� ���� ������ ���� ���丮�� �ִٸ�)
							// mkdir�� �� ������ ���ϸ� �������

		}
		File file = new File(FILEROOT + directory + filename);
		if (file.exists()) {
			System.out.println("������ �����մϴ�");
		} else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				String content = "Test";
				bw.write(content);
				bw.flush(); // 512����Ʈ�� �� ������ �Ǿ�� ������ ������ ������, �����Ұ��� �װź��� �����ϸ�
							// flush �� ���ؼ� ������ ��������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// ���� �д� �޼ҵ�
	public void readFile() {

		String filename = "/Users/kimkyuwan/Desktop/test.txt";
		// 1.���ϻ���
		File file = new File("/Users/kimkyuwan/Desktop/test.txt");
		// 2. ���� ��ȿ�� üũ
		if (file.exists()) {

			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
				// try (BufferedReader br = new BufferedReader(new
				// FileReader(file)) ) {
				// 3. buffer�� ����ؼ� ������ �д´�
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
			System.out.println("������ �����ϴ�");
		}

	}

}
