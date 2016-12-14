package com.sample.test;

import java.util.stream.Stream;

public class TestRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="0 - 22 1985--324";
		StringBuilder s2;
		String s3="";
		// TODO Auto-generated method stub
		s=s.replaceAll("[^\\d.]","");
	    //System.out.println(s.replaceAll("[^\\d.]",""));
	    System.out.println(s);
	    if(s.length()>4)
	    	System.out.println("return "+s);
	    s2=new StringBuilder(s);
	    
	    if(s.replaceAll("[^\\d.]","").length()%3==1)
	    {
	    	for(int i=0;i<s.length()-4;i=i+3)
	    	{
	    		s3+=s.substring(i,i+3)+"-";
	    		//i=i+3;
	    	}
	    	s3+=s.substring(s.length()-4,s.length()-2)+"-"+s.substring(s.length()-2,s.length());
	    }else if(s.replaceAll("[^\\d.]","").length()%3==0){
	    	for(int i=0;i<s.length();i=i+3)
	    	{
	    		s3+=s.substring(i,i+3)+"-";
	    	}
	    	s3=s3.substring(0,s3.length()-1);
	    }
	    else{
	    	for(int i=0;i<s.length()-3;i=i+3)
	    	{
	    		s3+=s.substring(i,i+3)+"-";
	    	}
	    	s3+=s.substring(s.length()-2,s.length());
	    }
	        // write your code in Java SE 8
	    System.out.println(s3);
	       
	    
	}

}
