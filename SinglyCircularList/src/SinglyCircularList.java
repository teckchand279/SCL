
public class SinglyCircularList {
		static class Node{
			private int data;
			private Node next;
			public Node() {
				data = 0;
				next = null;
			}
			public Node(int value) {
				data = value;
				next = null;
			}
		}
		
		private Node head;
		public SinglyCircularList() {
			head = null;
		}
		
		public boolean isEmpty() {
			return head == null;
		}
		
		public void displayList() {
			if(!isEmpty()) {
				
				Node trav = head;
				System.out.print("List : ");
				do {
					
					System.out.print(" " + trav.data);
					
					trav = trav.next;
				}while(trav != head);
				System.out.println("");
			}
		}
		
		public void addFirst(int value) {
			
			Node newnode = new Node(value);
			
			if(isEmpty()) {
				
				head = newnode;
			
				newnode.next = head;
			}
			
			else {
				
				newnode.next = head;
				
				Node trav = head;
				while(trav.next != head)
					trav = trav.next;
				
				trav.next = newnode;
			
				head = newnode;
			}
		}
		
		public void addLast(int value) {
		
			Node newnode = new Node(value);
		
			if(isEmpty()) {
				
				head = newnode;
			
				newnode.next = head;
			}
			
			else {
				
				newnode.next = head;
			
				Node trav = head;
				while(trav.next != head)
					trav = trav.next;
				
				trav.next = newnode;
			}
		}
		
		public void addPos(int value, int pos) {
			
				Node nn = new Node(value);
				Node temp = head;
				if (head == null || pos <= 1) {
					head = nn;
					nn.next = head;
				} else {
					for (int i = 1; i < pos - 1; i++) {
						if (temp.next == head)
							break; 
						temp = temp.next;
					}
					nn.next = temp.next;
					temp.next = nn;
				}
			}
		
		
		public void delFirst() {
			
			if(isEmpty())
				
				return;
			
			else if(head.next == head)
				
				head = null;
			
			else {
			
				Node trav = head;
				while(trav.next != head)
					trav = trav.next;
				
				trav.next = head.next;
			
				head = head.next;
			}
		}
		
		public void delLast() {
		
			if(isEmpty())
				
				return;
			
			else if(head.next == head)
				
				head = null;
			
			else {
				
				Node trav = head;
				while(trav.next.next != head)
					trav = trav.next;
			
				trav.next = head;
			}
		}
		
		public void delPos(int pos) {
			Node temp = null;
			Node trav = head;
			if (head == null || head.next==head) {
				System.out.println("list is empty");
				head=null;
				return;
			} else {
				for (int i = 1; i < pos; i++) {
					if (trav.next == head) {
						break;
					} else {
						temp = trav;
						trav = trav.next;
					}
				}
				temp.next = trav.next;
			}
		}
		
		public void delAll() {
			head = null;
		}

	}







