class TaskSchedular{
	
	class Node{
	
		int taskId;
		String name;
		int priority;
		String dueDate;
		
		Node next;
	
		Node(int taskId, String name, int priority, String dueDate){
		
			this.taskId = taskId;
			this.name = name;
			this.priority = priority;
			this.dueDate = dueDate;
		
			this.next = this;
		}
		
		public void display(){
			System.out.println("Task Id is : "+this.taskId);
			System.out.println("Task Name is : "+this.name);
			System.out.println("Task Priority is : "+this.priority);
			System.out.println("Task Due Date is : "+this.dueDate);
		}
		

	}
	
	Node head;
	Node tail;
	int size;
	
	TaskSchedular(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(int taskId, String name, int priority, String dueDate){
		
		Node nn = new Node(taskId, name, priority, dueDate);
		
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		
		if(head == null)
			head = nn;
			
		tail.next = head;
		
		size++;
		
		System.out.println("Node is added at Last");
	}
	
	public void addFirst(int taskId, String name, int priority, String dueDate){
		
		Node nn = new Node(taskId, name, priority, dueDate);
		
		Node temp = head;	
		
		head = nn;
		head.next = temp;
		
		tail.next = head;
		
		size++;
		
		System.out.println("Node is added at First");
	}
	
	public void addAt(int taskId, String name, int priority, String dueDate, int place){
		
		if(place > (size+1) || place <= 0){
			System.out.println("Can not add at this position");
			return;
		}
		if(place == 1){
			addFirst(taskId, name, priority, dueDate);
			return;
		}
		if(place == (size+1)){
			addLast(taskId, name, priority, dueDate);
			return;
		}
		
		
		Node temp = head;
		int c = 1;
		do{
			if(c == (place-1)){
				Node nn = new Node(taskId, name, priority, dueDate);
				nn.next = temp.next;
				temp.next = nn;
				System.out.println("Node has been added to the place "+place);
			}
			temp = temp.next;
			c++;
		}while(c <= place && temp != head);
		size++;
		
	}
	
	public void delete(int taskId){
		//if at first place
		if(head.taskId == taskId){
			head = head.next;
			tail.next = head;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		do{
			if(temp.taskId == taskId){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
			}
				
			prev = temp;
			temp = temp.next;
		}while(temp != head);
		
	}
	
	public void search(int priority){
		Node temp = head;
		boolean found = false;
		do{
			if(temp.priority == priority){
				temp.display();
				found = true;
			}
			temp = temp.next;
		}while(temp != head);
		
		if(!found)
			System.out.println("Cannot find the Task with Priority : "+priority);
	}
	
	public void displayAll(){
		
		Node temp = head;
		
		do{
			temp.display();
			System.out.println();
			temp = temp.next;
		}while(temp != head);
	}
	
	public void updateDueDate(int taskId, String dueDate){
		Node temp = head;
		
		do{
			if(temp.taskId == taskId){
				temp.dueDate = dueDate;
				return;
			}
			temp = temp.next;
		}while(temp != head);
		
		System.out.println("Can not find Task with Due Date : "+dueDate);
	}
	
}