class VegetarianMeal implements MealPlan{

	int days;
	
	VegetarianMeal(int days){
		this.days = days;
	}

	public void displayDetails(){
		
		System.out.println("This Vegetarian Meal plan is set for "+days+ " days");
		
	}

	public void greetings(){
		
		System.out.println("Hello");
	}
}