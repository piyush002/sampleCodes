package com.sample.test;

public class ZipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=99,B=99;
		String aTemp=String.valueOf(A);
		String bTemp=String.valueOf(B);
		StringBuilder result=new StringBuilder("");
		int loopSize=Math.min(aTemp.length(), bTemp.length());
		for(int i=0;i<loopSize;i++)
		{
			result.append(aTemp.charAt(i)).append(bTemp.charAt(i));
		}
		if(aTemp.length()>bTemp.length())
			System.out.println(result.append(aTemp.substring(loopSize, aTemp.length())));
		else
			System.out.println(result.append(bTemp.substring(loopSize, bTemp.length())));
	}

}
