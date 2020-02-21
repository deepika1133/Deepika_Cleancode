package com.deepika;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//import java.io.*;
//package com.deepika;
@SuppressWarnings("unused")
public class SimpleInterest
{

	private static Scanner sc;

	public static void main(String[] args) throws NumberFormatException, IOException 
	{

	    { 
	        int principle,rate,time;
	        sc = new Scanner(System.in);
	        System.out.println("Enter Priciple,Rate and Time ");
	        principle=sc.nextInt();
	        rate=sc.nextInt();
	        time=sc.nextInt();
	        int SimpleInterest = (principle*rate*time)/100;
	        System.out.println("Simple Interest  earned is "+ SimpleInterest);   
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        bw.write(SimpleInterest);
	       
	    }
	}

	public String getSimpleInterest() {
		// TODO Auto-generated method stub
		return null;
	}}
	        
	   
	

