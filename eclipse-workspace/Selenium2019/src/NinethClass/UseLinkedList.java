package NinethClass;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		
   
	
	List<String> list=new LinkedList<String>();
	
	list.add("NY");
	list.add("NJ");
	list.add("FL");
	
	Iterator it= list.iterator();
   while(it.hasNext()) {
	   
	   System.out.println(it.next());
	   
	   
   }
	
	list.remove("NY");
	
	System.out.println("after removing one node");
	
	Iterator it2= list.iterator();
	   while(it2.hasNext()) {
		   
		   System.out.println(it2.next());
		   
		   
	   }
	}
}