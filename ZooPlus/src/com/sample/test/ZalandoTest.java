package com.sample.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;



public class ZalandoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]A={60,140,100,100};
		int[]B={2,1,1,2};
		int M=5,X=2,Y=200;
		Set<Integer> distinctFloors=new HashSet<Integer>();
		List<Integer> temp=new ArrayList<Integer>();
		int result=0,pplCount=0,weightCount=0;
		if(A.length<X && IntStream.of(B).sum()<Y){
		    for(int i=0;i<B.length;i++){
		        distinctFloors.add(B[i]);
		    }
		   // return	distinctFloors.size()+1;
		    System.out.println(distinctFloors.size()+1);
		}
		for(int i=0;i<A.length;i++)
		{
			
			if(pplCount+1<=X && weightCount+A[i]<=Y)
				{	pplCount++;
				weightCount+=A[i];
				distinctFloors.add(B[i]);
				}
				else{
					result+=2;
					pplCount=0;
					weightCount=0;
					result+=distinctFloors.size();
					distinctFloors.clear();
					
					i--;
					
				}
				
			}
		if(pplCount!=0)
			result+=distinctFloors.size();
		System.out.println(result);
	//	return result;
		}
		
	}


