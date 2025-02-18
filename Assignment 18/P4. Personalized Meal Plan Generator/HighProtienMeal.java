class HighProtienMeal implements MealPlan{

	int days;
	
	HighProtienMeal(int days){
		this.days = days;
	}

	public void displayDetails(){
		
		System.out.println("This High Protien Meal plan is set for "+days+ " days");
		
	}
	public void greetings(){
		
		System.out.println("Hello");
	}

}