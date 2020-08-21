package com.leetcode.iege.solution.topinterview.easy.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false

 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        String sSorted = Stream.of(s.split(""))
                .sorted()
                .collect(Collectors.joining());

        String tSorted = Stream.of(t.split(""))
                .sorted()
                .collect(Collectors.joining());

        return sSorted.equals(tSorted);
    }

    public boolean isAnagramOptimal(String s, String t) {
        int[] sBucket = new int[26];
        int[] tBucket = new int[26];

        for(char c: s.toCharArray()){
            sBucket[c - 'a']++;
        }

        for(char c: t.toCharArray()){
            tBucket[c - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(sBucket[i] != tBucket[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("anagram", "naagram"));
    }
}
