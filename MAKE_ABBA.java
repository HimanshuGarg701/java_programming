/*
Given two strings, a and b, return the result of putting them together in the order abba,
e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
 */
package school;


public class MAKE_ABBA {
    public static void main(String[] args){
        String answer = makeAbba("Hi", "Bye");
        System.out.println(answer);
    }
public static String makeAbba(String a, String b) {
  return (a+b+b+a);
}

}
