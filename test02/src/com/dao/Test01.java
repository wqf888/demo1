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
		  // 发100元红包，10人抢
		  // TODO Auto-generated method stub
		  // 发红包总金额100元
		  double S = 15000;
		  // 0-100之间9个节点，加首尾11个点赋值给数组a
		  double[] a = new double[31];
		  // 第一个数是0
		  a[0] = 0;
		  // 最后一个数是100
		  a[a.length - 1] = S;
		  // 生成9个数随机节点并保留两位小数
		  for (int m = 1; m < a.length - 1; m++){
		    a[m] = Double.valueOf(String.format("%.2f", S * Math.random()));
		  }
		  // 冒泡排序对9个点进行排序
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
		  //红包金额赋值给数组aa
		  double[] aa = new double[a.length - 1];
		  // 后一项减前一项的差值为红包金额
		  for (int n = 0; n < a.length - 1; n++){
		    double mon = a[n + 1] - a[n];
		    //用自己的算法实现四舍五入保留两位小数
		    int n1 = (int) (mon * 1000);
		    int c = n1 % 10;
		    if (c > 4)
		      mon = (double) ((n1 + 10) / 10) / 100;
		    else
		      mon = (double) (n1 / 10) / 100;
		    aa[n] = mon;
		  }
		  //列表打乱数组aa中的顺序，实现抢红包的次序与红包金额匹配随机
		  List<Double> list = new ArrayList<>();
		  for(int i = 0; i < aa.length; i++){
		    list.add(aa[i]);
		  }
		  Collections.shuffle(list);
		  int xiao = 0;
		  double count = 0;
		  for(double i:list){
			  xiao++;
			  System.out.println("第"+xiao+"个红包："+i);
			  count = count + i;
		  }
		  count = Double.valueOf(String.format("%0.2f", count));
		  System.out.println("总金额是："+count);		
		  return count;
	}


}










