package com.ca.mahima.stack.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
* Input: A = "aabc"
Output: "a#bb"
Explanation: For every character first non
repeating character is as follow-
"a" - first non-repeating character is 'a'
"aa" - no non-repeating character so '#'
"aab" - first non-repeating character is 'b'
"aabc" - first non-repeating character is 'b'
* */
public class NonRepeativeCharacterInString {
    public static void main(String[] args) {
        String str = "aabc";// output--> a#bb
        Map<Character,Integer> count = new HashMap<>();
        String out = "";
        Queue<Character> que = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            que.add(c);
            count.put(c,count.getOrDefault(c,0) +1);
            while (!que.isEmpty()) {

                if (count.get(que.peek()) > 1) {
                    que.remove();
                } else {
                    out = out + que.peek();
                    break;
                }
            }
            if (que.isEmpty()) {
                out += "#";
            }
        }

       System.out.print(out);

    }
}
