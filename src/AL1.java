import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;  
class AL1{  
 public static void main(String args[]){  
  //ArrayList<String> list=new ArrayList<String>();
//Hello 13555m
	 
	 LinkedList<String> list=new LinkedList<String>(); 
  list.add("Ravi");  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  
  //ListIterator<String> itr=list.listIterator(); 
  Iterator itr=list.iterator();  
  System.out.println(list.get(2));
  while(itr.hasNext()){  
   System.out.println(itr.next());}
  System.out.println(list);
//
 System.out.println(list);

  for(String obj:list) {
	  System.out.println(obj);
  //ghjfcgh
   
 // // /
  // Ab First Commit
	  //l1
 }  
}}


