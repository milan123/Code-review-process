import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayCopyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> l1 = new ArrayList<String>();
		l1.add("Hello");
		l1.add("World");
		List<String> l2 = new ArrayList<String>(l1); //A new arrayList.
//
//		Collections.copy(l2, l1);
//		System.out.println(l1);
//		System.out.println(l2);
		System.out.println(getIndexForO("Hello world"));
	}
	
	
	public static int getIndexForO(String str){
		int toReturn = -1;
		int len = str.length();
		for(int i = 0; i < len; i++){
			char c = str.charAt(i);
			if(c == 'o'){
				toReturn = i;
				continue;
			}
		}

		return toReturn;
		
	}
	
	public static int indexOf(String s, char ch){
		int toReturn = -1;
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == ch){
				toReturn = i;
				continue;
			}
		}
	
		
	}
	

}
