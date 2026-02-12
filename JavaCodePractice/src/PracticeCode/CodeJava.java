package PracticeCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.*;
import java.util.Set;

public class CodeJava {

	public static void main(String[] args) {
		
		int[] arr= {0,1,0,0,1,1,1,0};
		List<Integer> lst=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			lst.add(arr[i]);
		
		}
		
		
		Collections.sort(lst);
		System.out.println(lst);
		

	}
		
}
