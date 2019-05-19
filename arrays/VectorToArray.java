package arrays;

import java.util.Vector;

public class VectorToArray {

	public static void main(String[] args) {
		
		Vector<Integer> vt = new Vector<Integer>();
		vt.add(10);
		vt.add(20);
		vt.add(30);
		
		Object [] arr = vt.toArray();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
