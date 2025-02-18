class KetoMeal implements MealPlan{

	int days;
	
	KetoMeal(int days){
		this.days = days;
	}

	public void displayDetails(){
		
		System.out.println("This Keto Meal plan is set for "+days+ " days");
		
	}
	public void greetings(){
		
		System.out.println("Hello");
	}

}