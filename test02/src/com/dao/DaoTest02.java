package com.dao;

import org.junit.Test;

public class DaoTest02 {

	@Test
	public void test02(){
		
        float num=10,N=1f;
        int people=10;
        float count = 0;
        for(int i=0;i<10;i++){
            System.out.println("the number"+people+"can get "+num/people*N);
            count = count + num/people*N;
            num=num-num/people*N;
            people--;
        }
        System.out.println("there remain"+num);
        System.out.println(count);
    }		
		
		
	
	
	
}
