package ArrayListPractice;
import java.util.*;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("amy");
		list.add("louis");
		list.add("amy");
		list.add("henry");
		System.out.println(list());
		
	}
	
	public static ArrayList<String>list(){
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("123");
		return list1;	
	}
	
	public int maxLength(ArrayList<String> list){
	    if (!list.isEmpty()){
	    	
	   
	    	int maxLength = 0;
	    	for(int i=0; i<list.size(); i++){
	    		String currentString = list.get(i);
	    		int length = currentString.length();
	    		if(length > maxLength){
	    			maxLength = length;
	    		}
	    	}
	    	return maxLength;
	    }
	    return 0;
	}
	
	public ArrayList<String> swapPairs(ArrayList<String> list){
		if (list.size() % 2 == 0){
			for(int i=0; i<list.size(); i++){
				String temp = list.get(i+1);
				list.remove(i+1);
				list.add(i, temp);
				i += 1;
			}
			
		}else{
			for(int i=0; i<list.size()-1; i++){
				String temp = list.get(i+1);
				list.remove(i+1);
				list.add(i, temp);
				i += 1;
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
