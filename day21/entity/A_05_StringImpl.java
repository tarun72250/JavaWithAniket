package day21.entity;

import day21.utils.A_05_StringOperations;

public class A_05_StringImpl implements A_05_StringOperations {

	@Override
	public void reverse(String str) //diva   avid
	{
		StringBuilder s = new StringBuilder();//Why use StringBuilder
		//we know that String create immutable objects
		//but with StringBuilder we create mutable objects
		for(int i=str.length()-1 ;i>=0 ;i--) {
		     s.append(str.charAt(i));
		}
		System.out.println("Reversed String : "+s.toString());
	}

	@Override
	public int length(String str) //aniket
	{
		int length = 0;//6
		for(char ch :str.toCharArray()) {
			length ++;
		}
		return length;
	}

	@Override
	public void toUppercase(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				sb.append((char) (ch-32));
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println("UpperCase letter :"+sb.toString());
	}

	@Override
	public boolean isPalindrome(String str) {
		return false;
	}

	@Override
	public String append(String str1, String str2) {
		return null;
	}
}
