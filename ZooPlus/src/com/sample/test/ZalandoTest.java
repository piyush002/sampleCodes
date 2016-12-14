package com.sample.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZalandoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]A={1,1,1,1};
		int[]B={100,100,100,100};
		int M=1,X=4,Y=400;
		Set<Integer> distinctFloors=new HashSet<Integer>();
		int result=0,pplCount=0,weightCount=0;
		if(A.length<=X &&  Arrays.stream(B).sum()<=Y){
			distinctFloors.addAll(IntStream.of(B).boxed().collect(Collectors.toList()));
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
					result+=distinctFloors.size()+1;
					pplCount=1;
					weightCount=A[i];
					distinctFloors.clear();
					distinctFloors.add(B[i]);
				}
				
			}
			result+=distinctFloors.size()+1;
		System.out.println(result);
		//return result;
		}
		
	}


