package ProgrammingClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters{
	public static void main(String[] args) {
		System.out.println("enter any string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		counter(str);
		s.close();
	}
	public static void counter(String str) {
		char [] strArray = str.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for(char c : strArray)
		{
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else {
				hmap.put(c, 1);
			}
		}
		//printing through for each loop
		for(Map.Entry entry : hmap.entrySet())
		{
			System.out.println("occurence of "+entry.getKey()+" is "+entry.getValue()+" times");
		}
	}
}