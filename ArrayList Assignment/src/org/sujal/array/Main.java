package org.sujal.array;
import java.util.*;



public class Main {

	public static void main(String[] args) {
		/*Q)Write a Java program to create a new array list,
		add some colors (string) and print out the collection.
		 */
		
		List<String> list = new ArrayList<>();
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("Yellow");
		
		System.out.println(list);
		
		/*Q) Modify the above Java program to insert an element
		 *  into the array list at the first position.
		 */
		
		list.add(0,"Purple");
		System.out.println(list);
		
		/*Q) Modify the above Java program to retrieve an element 
		 * (at a specified index) from a given array list.
		 */
		
		list.add(0,"Red");
		System.out.println(list);
		
		/* Q)Modify the above Java program to update specific 
		 * array element by given element.
		 */
		
		list.set(1, "Brown");
		System.out.println(list);
		
		/* Q) Modify the above Java program to remove 
		 * the third element from a array list.
		 */
		
		list.remove(2);
		System.out.println(list);
		
		/* Q) Modify the above Java program to search 
		 * an element in a array list
		 */
		
		String search = "Brown";
		System.out.println(list.contains(search));
		System.out.println();
		
		/* Q) Modify the above Java program to sort a given array list.
		 *  (Hint : Use the class Collections)
		 */
		
		System.out.println("Before Sorting ArrayList: "+ list);
		Collections.sort(list);
		System.out.println("After Sorting ArrayList: "+ list);
		System.out.println();
		
		/* Q)Modify the above Java program to copy one array list into another.
		 *  (Hint : Use the class Collections)
		 */
		
		ArrayList <String> cloneList = (ArrayList<String>) ((ArrayList<String>) list).clone();
		
		System.out.println("Original list: " + list);
		System.out.println("Clone list: " + cloneList);
		System.out.println();
		
		
		/* Q) Modify the above Java program to shuffle elements in a array list.
		 *  (Hint : Use the class Collections)
		 */
		
		System.out.println("Original list: " + cloneList);
		Collections.shuffle(cloneList);
		System.out.println("Shuffle list: " + cloneList);
		System.out.println();
		
		/* Q)Modify the above Java program to reverse elements in a array list. 
		 * (Hint : Use the class Collections)
		 */
		
		System.out.println("Original list: " + cloneList);
		Collections.reverse(cloneList);
		System.out.println("Reverse list: " + cloneList);
		System.out.println();
		
		
		/* Q) Write a Java program to create a new tree set, add some 
		 * colors (string) and print out the tree set
		 */
		
		TreeSet<String> treeList = new TreeSet<>();
		
		treeList.add("Blue");
		treeList.add("Red");
		treeList.add("Blue");
		treeList.add("Black");
		treeList.add("Green");
		
		
		
		System.out.println(treeList);
		
		/* Q) Modify the above Java program to add all the elements 
		 * of a specified tree set to another tree set.
		 */
		TreeSet<String> treeListClone = (TreeSet<String>) treeList.clone();
		
		System.out.println(treeListClone);
		
		/* Q) Modify the above Java program to create a reverse 
		 * order view of the elements contained in a given tree set.
		 */
		
		System.out.println("Ascending order of TreeSet: "+treeListClone);
		System.out.println("Descending order of TreeSet: "+treeListClone.descendingSet());
		
		/* Q)Modify the above Java program to get the 
		 * first and last elements in a tree set
		 */
		
		System.out.println("First Element of TreeList: "+ treeListClone.first());
		System.out.println("Last Element of TreeList: "+ treeListClone.last());
		
		/* Q)Write a Java program to get the element in a tree set which is greater than or 
		 * equal to the given element. (Hint : Use the ceiling method of the TreeSet)
		 */
		
		System.out.println(treeListClone.ceiling("Red"));
		
	}
	

}
