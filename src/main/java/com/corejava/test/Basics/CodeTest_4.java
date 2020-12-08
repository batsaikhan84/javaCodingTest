package com.corejava.test.Basics;

public class CodeTest_4 {
  /*
  
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

  altPairs("kitten") → "kien"
  altPairs("Chocolate") → "Chole"
  altPairs("CodingHorror") → "Congrr"
   */
  
  public String altPairs(String str) {
	//Write the code here..also change the default return statement
      String result = "";
      for (int i = 0; i < str.length(); i++) {
          if (i == 0 || i == 1 ||i == 4 ||i == 5 ||i == 8 ||i == 9) {
              result = result + str.substring(i, i+1);
          }
      }
      return result;
  }
}
