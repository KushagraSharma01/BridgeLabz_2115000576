import java.util.*;
class Main{

	public static void main(String[] args){
	
		VegetarianMeal mp1 = new VegetarianMeal(30);
		VegetarianMeal mp2 = new VegetarianMeal(140);
		VeganMeal mp3 = new VeganMeal(60);
		KetoMeal mp4 = new KetoMeal(120);
		HighProtienMeal mp5 = new HighProtienMeal(10);
		
		
		Meal<VegetarianMeal> m1 = new Meal<>();
		Meal<VeganMeal> m2 = new Meal<>();
		Meal<KetoMeal> m3 = new Meal<>();
		Meal<HighProtienMeal> m4 = new Meal<>();

		m1.add(mp1);
		m1.add(mp2);
		m2.add(mp3);
		m3.add(mp4);
		m4.add(mp5);

		display(m1.mealPlans);
	}
	
	public static <T extends MealPlan> void display(List<T> l1){
	
		for(int i=0;i<l1.size();i++){
			l1.get(i).displayDetails();
		}
	
	}

}
