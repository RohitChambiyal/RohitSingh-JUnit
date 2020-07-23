package com.maven.tddjunitdemo;

public class RemoveFirst2Chars {

	public String remove(String string) {
		int len = string.length();
		String result = "";
		if(len==0)
				result=string;
		else if(len==1) {
			if(string.charAt(0)=='A')
				result = "";
			else
				result = string;
		}
		else {
			for(int i=0;i<2;i++) {
				if(string.charAt(i)!='A')
					result +=string.charAt(i);
			}
			for(int i=2;i<len;i++)
					result+= string.charAt(i);
		}
		return result;
	}

}
