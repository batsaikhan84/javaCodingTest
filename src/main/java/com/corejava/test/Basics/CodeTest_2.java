package com.corejava.test.Basics;

public class CodeTest_2 {
  /*
  
  Given a string, we'll say that the front is the first 3 chars of the string.
  If the string length is less than 3, the front is whatever is there.
  Return a new string which is 3 copies of the front.
  
  
  front3("Java") → "JavJavJav"
  front3("Chocolate") → "ChoChoCho"
  front3("abc") → "abcabcabc"
   */
  
  public String front3(String str) {
	//Write the code here..also change the default return statement
    String result = "";
	String[] strArr = str.split("");
	for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            result = result.concat(strArr[j]);
        }
    }
	return result;
  }
  
}
