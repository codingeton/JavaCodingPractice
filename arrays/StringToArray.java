package arrays;

public class StringToArray {

	public static void main(String[] args) {
		
		String str = "JavaCode";
		char[] str_2 = str.toCharArray();
		for(int i=0;i<str_2.length;i++) {
			System.out.print(str_2[i]);
		}
		System.out.println("\n********************");
		String st = "Java Code";
		String[] str_3 = st.split("");
		for(int i=0;i<str_3.length;i++) {
			System.out.print(str_3[i]);
		}

	}

}
