package com.zettamine.day3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberOfWordsAndUniqWors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student's Article");
		String stuArticle=sc.nextLine();
		String regex="[,:;?!\\s]+";
		String[] str=stuArticle.split(regex );
		
		System.out.println("no of words in a string : " + str.length);

		Set<String> uniqSet=new TreeSet<>();
		for(int i=0;i<str.length;i++) {
			uniqSet.add(str[i]);
		}
		System.out.println("No of Uniq Wors: "+uniqSet.size());

		sc.close();
			
		}

	}


