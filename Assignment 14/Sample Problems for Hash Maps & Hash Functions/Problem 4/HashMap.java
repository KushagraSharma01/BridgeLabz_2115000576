import java.util.*;

class HashMap<K, V>{

	LinkedList<Node>[] arr;
	int size;
	int lambda = 2;
	
	@SuppressWarnings("unchecked")
	HashMap(){
		this.arr = new LinkedList[4];
		for(int i=0;i<arr.length;i++){
			arr[i] = new LinkedList<>();
		}
		this.size = 0;
	}
	
	class Node{
		K key;
		V value;
		 
			Node(K key, V value){
				this.key = key;
				this.value = value;
			}
	}
	
	@SuppressWarnings("unchecked")
	public void put(K key, V value){
		
		if(size/arr.length >= lambda){
			
			LinkedList<Node>[] arr2 = new LinkedList[arr.length*2];
			for(int i=0;i<arr2.length;i++){
				arr2[i] = new LinkedList<>();
			}
			for(int i=0;i<arr.length;i++){
				if(arr[i].size() == 0)
					continue;
				LinkedList<Node> temp = arr[i];
				arr2[i] = temp;
			}
			
			arr = arr2;
			
		}
		
		int index = key.hashCode();
		index = index % arr.length;
		
		LinkedList<Node> l1 = this.arr[index];
		boolean found = false;
		for(int i=0;i<l1.size();i++){
			
			if(key == l1.get(i).key){
				l1.get(i).value = value;
				found = true;
				break;
			}
		}
		
		if(!found){
			Node nn = new Node(key, value);
			l1.addLast(nn);
		}
		size++;
	
	}
	
	public void remove(K key){
		
		int index = key.hashCode();
		index = index % arr.length;
		
		LinkedList<Node> l1 = this.arr[index];
		boolean found = false;
		for(int i=0;i<l1.size();i++){
			
			if(key == l1.get(i).key){
				l1.remove(l1.get(i));
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("No Key found with the given key");
			return;
		}
		size--;
	}
	
	public void get(K key){
		
		int index = key.hashCode();
		index = index % arr.length;
		
		LinkedList<Node> l1 = arr[index];
		boolean found = false;
		for(int i=0;i<l1.size();i++){
			
			if(key == l1.get(i).key){
				System.out.println("Value of given key is "+l1.get(i).value);
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("No Key found with the given key");
			return;
		}
	
	}

}