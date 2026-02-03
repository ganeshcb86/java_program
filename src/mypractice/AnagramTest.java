package mypractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramTest {
public static void main(String[] args) {
	
	String s1="ANAGRAM";
	String s2="NAGARAM";
	
	Map<Character, Long> map1 = s1.toLowerCase().chars().mapToObj(c->(char)c)
	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	Map<Character, Long> map2 = s2.toLowerCase().chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(map1);
	System.out.println(map2);
	
	if(map1.equals(map2)) {
		System.out.println("Stringd are anagram");
	}
	else {
		System.out.println("Strings are not anagram");
	}
	
	
}

}
