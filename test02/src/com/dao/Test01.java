package com.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.experimental.theories.Theories;

public class Test01 {
	

 
public static void main(String[] args){
		Test01 test01 = new Test01();
	 	double count = test01.hongbao();
	 	System.out.println(count);
	 	//	 	for(int i=0;i<1;){
//	 		if(count%2!=0.0){
//			test01.hongbao();
//			
//	 		}else{
//	 			break;
//	 		}
//	 	}
		
}




	public double hongbao(){
		  // ��100Ԫ�����10����
		  // TODO Auto-generated method stub
		  // ������ܽ��100Ԫ
		  double S = 15000;
		  // 0-100֮��9���ڵ㣬����β11���㸳ֵ������a
		  double[] a = new double[31];
		  // ��һ������0
		  a[0] = 0;
		  // ���һ������100
		  a[a.length - 1] = S;
		  // ����9��������ڵ㲢������λС��
		  for (int m = 1; m < a.length - 1; m++){
		    a[m] = Double.valueOf(String.format("%.2f", S * Math.random()));
		  }
		  // ð�������9�����������
		  for (int i = 1; i < a.length - 2; i++){
		    for (int j = 1; j < a.length - 1 - i; j++){
		      if (a[j] > a[j + 1]){
		        double temp;
		        temp = a[j];
		        a[j] = a[j + 1];
		        a[j + 1] = temp;
		      }
		    }
		  }
		  //�����ֵ������aa
		  double[] aa = new double[a.length - 1];
		  // ��һ���ǰһ��Ĳ�ֵΪ������
		  for (int n = 0; n < a.length - 1; n++){
		    double mon = a[n + 1] - a[n];
		    //���Լ����㷨ʵ���������뱣����λС��
		    int n1 = (int) (mon * 1000);
		    int c = n1 % 10;
		    if (c > 4)
		      mon = (double) ((n1 + 10) / 10) / 100;
		    else
		      mon = (double) (n1 / 10) / 100;
		    aa[n] = mon;
		  }
		  //�б��������aa�е�˳��ʵ��������Ĵ����������ƥ�����
		  List<Double> list = new ArrayList<>();
		  for(int i = 0; i < aa.length; i++){
		    list.add(aa[i]);
		  }
		  Collections.shuffle(list);
		  int xiao = 0;
		  double count = 0;
		  for(double i:list){
			  xiao++;
			  System.out.println("��"+xiao+"�������"+i);
			  count = count + i;
		  }
		  count = Double.valueOf(String.format("%0.2f", count));
		  System.out.println("�ܽ���ǣ�"+count);		
		  return count;
	}


}










