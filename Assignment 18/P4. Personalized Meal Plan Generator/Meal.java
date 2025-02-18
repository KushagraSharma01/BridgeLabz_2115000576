import java.util.*;

class Meal<T extends MealPlan>{

	List<T> mealPlans;
	
	Meal(){
		
		mealPlans = new ArrayList<>();
	}
	
	public void add(T mealPlan){
		mealPlans.add(mealPlan);
	}
	
	public void remove(T mealPlan){
		mealPlans.remove(mealPlan);
	
	}

}