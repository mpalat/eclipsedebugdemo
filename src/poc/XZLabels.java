package poc;

public class XZLabels {
	
	private static Node createAList(int n) {
		if (n<1)
			return null;
		
		Node head = new Node(0, null, null);
		Node curr = head;
		Node prev = null;
		for (int i = 1; i < n ; ++i) {
			 curr.next = new Node(i, prev, null);
			 prev = curr;
			 curr = curr.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Node head = createAList(5);
		System.out.println(head.next.val);
	}
	
}

class Node {
	int val;
	Node prev;
	Node next;
	
	public Node(int val, Node prev, Node next) {
		this.val = val;
		this.prev = prev;
		this.next = next;
	}
}