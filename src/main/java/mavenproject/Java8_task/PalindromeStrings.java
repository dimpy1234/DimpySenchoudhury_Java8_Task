package mavenproject.Java8_task;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class PalindromeStrings {
    public static void checkPalindrome(List<String> l1){
        List<String> l2=new ArrayList<String>();
        for(String i:l1)
        {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
        System.out.println("Palindrome Strings are: "+l2);
    }
    public static void main(String args[]){
        List<String> list= new ArrayList<>();
        list.add("apple");
        list.add("Madam");
        list.add("banana");
        list.add("mom");
        list.add("rotator");
        list.add("school");
        list.add("Wow");
        System.out.println("List is: "+list);
        PalindromeStrings.checkPalindrome(list);
    }


}
