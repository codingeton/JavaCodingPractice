package strings;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String str = "    India is my country";
		int count = 0;
		
		char [] strArray = new char[str.length()];
		
		
		for(int i=0;i<strArray.length;i++) {
			strArray[i] = str.charAt(i);
			
			 if( ((i>0)&&(strArray[i]!=' ')&&(strArray[i-1]==' ')) || ((strArray[0]!=' ')&&(i==0)) ) {
				 count++;
			 }
		}
		
		System.out.println(count);
		
		
		
		
//		String str = "Java is cool";
//		
//		String [] strArr = str.split("\\s");
//		
//		System.out.println(strArr.length);

	}

}
