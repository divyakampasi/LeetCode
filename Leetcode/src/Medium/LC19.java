package Medium;

public class LC19 {
	
	public static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static Node removeNthNodeFromEnd(Node head, int n) {
		Node dummy = new Node(-1);
		dummy.next = head;
		
		Node firstPtr = dummy;
		Node secondPtr = dummy;
		
		for(int i = 0; i < n; i++) {
			secondPtr = secondPtr.next;
		}
		
		while(secondPtr.next != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
			
		}
		
		firstPtr.next = firstPtr.next.next;
		
		return dummy.next;
	}
	
	static void printList(Node head)
	  {
	    Node ptr = head;
	    while (ptr != null) {
	      System.out.print(ptr.data + " ");
	      ptr = ptr.next;
	    }
	    System.out.println();
	  }
	
	public static void main(String[] args)
	  {
	    Node head = new Node(1);
	    head.next = new Node(2);
	    head.next.next = new Node(3);
	    head.next.next.next = new Node(4);
	    head.next.next.next.next = new Node(5);
	    System.out.println("Linked List before Deletion:");
	    printList(head);

	    head = removeNthNodeFromEnd(head, 2);

	    System.out.println("Linked List after Deletion:");
	    printList(head);
	  }

}
