import pkg.*;
import java.util.*;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	ArrayList<Integer> arr =  new ArrayList<Integer>(3);
		arr.add(0);
		arr.add(1);
		arr.add(2);
		toStringArrayList(arr);
	}
	public static void toStringArrayList(ArrayList<Integer>arr){
	System.out.println(arr.get(0)); 
	System.out.println(arr.get(1));
	System.out.println(arr.get(2));
	}



		
}
