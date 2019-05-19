package strings;

import java.util.Iterator;
import java.util.Stack;

public class RemoveCharacter {

	public static void main(String[] args) {
		
		String str = "Programming";
		//char rem = 'm';
		/*
		char [] strArray = str.toCharArray();
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<strArray.length;i++) {
			st.push(strArray[i]);
		}
		
		//System.out.println(st);
		
		for(int j=0;j<st.size();j++) {
			if(st.elementAt(j)==rem) {
				st.remove(j);
				break;
			}
		}
		
		System.out.println(st);
		
		*/
		str = str.replace("m", "");
		System.out.println(str);
	
		
		
	}

}
