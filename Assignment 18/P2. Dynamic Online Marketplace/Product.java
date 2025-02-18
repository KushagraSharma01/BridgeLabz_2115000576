class Product<T>{

	
	T instance;
	
	Product(T instance){
		this.instance = instance;
		
	}
	
	public T getInstance(){
		
		return instance;
		
	}

	
	
}