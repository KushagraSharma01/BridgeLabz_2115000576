import java.util.*;

class Storage<T extends WarehouseItem>{

	List<T> items;
	
	Storage(){
		items = new ArrayList<>();
	}
	
	public void add(T item){
		items.add(item);
	}
	
	public void remove(String name){
		int idx = -1;
		for(int i=0;i<items.size();i++){
			if(items.get(i).name.equals(name)){
				idx = i;
				break;
			}
		}
		
		if(idx != -1)
			items.remove(idx);
	}
	


}