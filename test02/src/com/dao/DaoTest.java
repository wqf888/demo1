package com.dao;

import java.awt.event.FocusEvent;
import java.security.cert.CertPathValidatorException.BasicReason;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class DaoTest {
	
	
	static Random random = new Random();
	static {
		random.setSeed(System.currentTimeMillis());
	}
	
	
	
	public void test01(String str){
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<str.length();i++){
			list.add(""+str.charAt(i)+"");
		}
		
		HashSet<Object> hs = new HashSet<>();
		hs.addAll(list);
		List<Object> list2 = new ArrayList<>();
		list2.addAll(hs);
		
		System.out.println("原始数据");
		for (Object object : list) {
			System.out.print(object.toString());
		}
		
		System.out.println();
		System.out.println("去除重复项后的数据集");
		for (Object object : list2) {
			System.out.print(object.toString());
		}
		
		System.out.println();
		for (Object object : list2) {
			int count = 0;
			for(int i=0;i<str.length();i++){
				if(object.toString().equals(""+str.charAt(i)+"")){
					count++;
				}
				
			}
			System.out.println( object.toString()+"  "+count);
		}
		
		

		
		
	}
	
	
	

	
	@Test
	public void  test(){
		this.test01("abcabcddsdfsgafscxsfesfsfsdfascvxcvsafxcvsdfsdfdsdefff");
			
	}
	

	
	
	
}
