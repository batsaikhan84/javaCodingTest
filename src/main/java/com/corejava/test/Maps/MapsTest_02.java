package com.corejava.test.Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MapsTest_02 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(wordAppend(arr));
    }
  /*
  Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th,
  etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
  wordAppend(["a", "b", "a"]) → "a"
  wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
  wordAppend(["a", "", "a"]) → "a"
  */
    public static String wordAppend(String[] strings) {
        List<String> uniqueStrings = new ArrayList<>();
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (!uniqueStrings.contains(strings[i])) {
                uniqueStrings.add(strings[i]);
            }
        }
        Iterator<String> it = uniqueStrings.iterator();
        while(it.hasNext()) {
            int counter = 0;
            for (int m = 0; m < strings.length; m++) {
                System.out.println(strings[m]);
                System.out.println(it.next());
//                if (strings[m].equals(it.next())) {
//                    counter++;
//                    if (counter % 2 == 0) {
//                        result = result + strings[m];
//                    }
//                }
            }
        }
        return result;
//        for (int n = 0; n < uniqueStrings.size(); n++) {
//            int counter = 0;
//            for (int m = 0; m < strings.length; m++) {
//                if (uniqueStrings.get(n).equals(strings[m])) {
//                    counter++;
//                    if (counter % 2 == 0) {
//                        result = result + strings[m];
//                    }
//                }
//            }
//        }
    }
}
