/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */

/*
 * You're writing a program for a food factory business complete the implementations of the
 * food and food factory classes in the editor below such that when the following code is called
 * by the main method:
 * 
 * FoodFactory myFoods = new FoodFactory();
 * Food food1 = myFoods.getFood("FastFood");
 * Food food2 = myFoods.getFood("Fruit");
 * System.out.println("My Name is: + food1.getClass().getName());
 * System.out.println("My name is: + food2.getClass().getName());
 * System.out.println("Our superclass is:"+ food1.getClass().getSuperclass().getName());
 * 
 * food1.serverFood();
 * food2.serverFood();
 * 
 * 
 * OutPut:
 * 
 * My name is: FastFood
 * My name is: Fruit
 * Our superclass is : Food
 * I'm serving FastFood
 * I'm serving Fruit
 *
 *Note: You must declare additional classes and or methods to successfully complete this challenge
 * 
 */
public class FoodFactory extends Food{
	
	String name;
	public Food getFood(String string) {
       if (string.equals("FastFood")) {
            Food f = new FastFood();
            f.name = string;
            return f;
        } else {
            Food f = new Fruit();
            f.name = string;
            return f;
        }
    }
}
