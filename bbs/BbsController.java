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
	
	
	// C(create) R(read) U(update) D(delete) 이 기능이 기본으로 있어야함
	
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
	
	
	//특정 글 읽기 
	/**
	 * bbs_no에 해당하는 글 읽기 
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
	 * 전체 글 읽기 
	 * @return
	 */
	public ArrayList<Bbs> readAll() {
		return database;
	}
	/**
	 * 수정
	 * @param bbs
	 */
	public void update(Bbs bbs) {
		// 아무것도 안해도 됨?
		
				
	}
	/**
	 * 삭제
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
