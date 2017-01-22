package com.kimkyuwan.bbs;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * 
 * @author kimkyuwan
 *
 */
public class BbsController {
	
	ArrayList<Bbs> database ;
	int count = 0;
	
	public BbsController() {
		database = new ArrayList<Bbs>();
		count = 0;
	}
	
	
	// C(create) R(read) U(update) D(delete) �� ����� �⺻���� �־����
	
	/**
	 * 
	 * @param bbs
	 */
	public void create(Bbs bbs) {
		count = count + 1;
		bbs.setBbs_no(count);
		
		Calendar cal = Calendar.getInstance();

		bbs.setDatetime(Util.getDatetime());
		
		database.add(bbs);
		
		String content = bbs.getBbs_no() +"/";
		content = content + bbs.getTitle() +"/" ;
		content = content + bbs.getContent() + "\n";

		System.out.println("content : "+content);
		Path path = Paths.get("/Users" + File.separator + "kimkyuwan/Desktop/", "database.txt");
		
		try {
			Files.write(path, content.getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	
	//Ư�� �� �б� 
	/**
	 * bbs_no�� �ش��ϴ� �� �б� 
	 * @param bbs_no
	 * @return
	 */
	public Bbs read(int bbs_no) {
		for(Bbs item : database) {
			if(item.getBbs_no() == bbs_no){
				return item;
			}
		}
		return null;
	}
	/**
	 * ��ü �� �б� 
	 * @return
	 */
	public ArrayList<Bbs> readAll() {
		return database;
	}
	/**
	 * ����
	 * @param bbs
	 */
	public void update(Bbs bbs) {
		// �ƹ��͵� ���ص� ��?
		
				
	}
	/**
	 * ����
	 * @param bbs_no
	 */
	public void delete(int bbs_no){
		
		for(Bbs item : database) {
			if(item.getBbs_no() == bbs_no){
				database.remove(item);
			}
		}
	}
	
	
}
