package com.devaloo;

public class Strings {
    public static void main(String[] args) {
        String name = "Deva";
        System.out.println(name);
        String anotherName = new String("Kumar");
        System.out.println(anotherName);

        String name2 = "Deva";
        String name3 = new String("Deva");

        // ==   compares references
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name2 == name3);

        // char charAt(int index)
        System.out.println(name.charAt(2));

        // int length()
        System.out.println(anotherName.length());

        // String substring(int beginIndex) or String substring(int beginIndex, int endIndex)
        System.out.println(name.substring(2));
        System.out.println(anotherName.substring(1,4));

        // boolean contains(String sequence)
        System.out.println(name2.contains("e"));

        // boolean equals(Object obj)  -- compares values rather than reference
        System.out.println(name.equals(name2));
        System.out.println(name3.equals(name));

        // boolean isEmpty()
        System.out.println(name.isEmpty());
        String s = "";
        System.out.println(s.isEmpty());

        // String concat(String str)
        String fullName = name.concat(" Kumar");
        System.out.println(fullName);

        // String replace(char old, char new)  [char or String]
        fullName = fullName.replace("Deva","Pavan");
        System.out.println(fullName);
        System.out.println();

        // String[] split(String regex)
        String sentence = "Hi My name is Deva";
        String[] words = sentence.split(" ");
        for(String str: words)
            System.out.println(str);

        // int indexOf(String str)
        System.out.println(fullName.indexOf('m'));

        // String toLowerCase()
        System.out.println(fullName.toLowerCase());

        // String toUpperCase()
        System.out.println(fullName.toUpperCase());

        // String trim()  -- to remove starting and trailing spaces
        String otherName = "   this is trimmed   ";
        System.out.println(otherName.trim());

        // boolean startsWith(String str)
        System.out.println(fullName.startsWith("Pav"));
        System.out.println(fullName.startsWith("pav"));

        // boolean endsWith(String str)
        System.out.println(fullName.endsWith("r"));

        //  int compareTo(String str)  -- compares two strings lexicographically
        String str1 = "deva";
        String str2 = "deva";
        String str3 = "raju";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));

        // char[] toCharArray(String str)
        char[] nameChar = fullName.toCharArray();
        for(char ch: nameChar)
            System.out.print(ch+" ");
        System.out.println();

        // Anagrams - Optimal Solution

        String a = "listen";
        String b = "silent";
        boolean isAnagram = true;
        int[] countOfLetters = new int[256];
        if (a.length() != b.length()) {
            isAnagram = false;
        } else {
            for(char c: a.toCharArray()) {
                countOfLetters[c]++;
            }
            for(char c: b.toCharArray()) {
                countOfLetters[c]--;
            }
            for(int i=0;i<256;i++) {
                if (countOfLetters[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        if (isAnagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }
}
