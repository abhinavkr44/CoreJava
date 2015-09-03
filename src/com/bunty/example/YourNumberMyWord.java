package com.bunty.example;
import java.util.*;
public class YourNumberMyWord
{
	public void pw(long n,String ch)
	{
		String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};

		String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};

		if(n>19) { 
			System.out.print(ten[(int)n/10]+" "+one[(int)n%10]);
		} else { 
			System.out.print(one[(int)n]);
		}
		
		if(n>0)System.out.print(ch);
	}
	public static void main(String[] args)
	{
		long n=0;
		Scanner scanf = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		n  = scanf.nextLong();

		if(n<=0)
			System.out.println("Enter numbers greater than 0");
		else
		{
			YourNumberMyWord a = new YourNumberMyWord();
			a.pw((n/10000000000l)," Thousand");
			a.pw((n/1000000000)%100," Hundred");
			a.pw((n/10000000)%100," crore");
			a.pw(((n/100000)%100)," lakh");
			a.pw(((n/1000)%100)," thousand");
			a.pw(((n/100)%10)," hundred");
			a.pw((n%100)," ");
		}
	}
}