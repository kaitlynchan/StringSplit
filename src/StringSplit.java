import java.util.*;

//Kaitlyn Chan
//APCS Period 1
// October 25, 2016
//String Split finds all the ingredients inside a sandwich (between two slices of bread) in order to before the ultimate chef.

public class StringSplit 
{

	public static void main(String[] args) 
	{
		//prints the ingredients between the slices of bread in a sandwich
		split("bloodsweattearsbreadapplesbreadlettusbreadtomatobaconmayohambreadcheese");
		//prints the ingredients between the slices of bread in a spaced sandwich 
		splitSpaces("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
		
	}
	
	public static void split (String sandwich){
		
		//if there is no bread (carb free!)
		if (sandwich.indexOf("bread")<0){
			System.out.println("not a sandwich!");
		}
		
		//if there is only one slice of bread (open face sandwich!)
		//cut out string after first bread
		String bread = sandwich.substring(sandwich.indexOf("bread")+5);
		if (bread.indexOf("bread")<0){
			System.out.println("not a real sandwich!");
		}
		
		//we know that there is at least one slice of bread
		int slices = 1;
		//while there is still bread in the string, eliminate each slice 
		while (bread.indexOf("bread") >= 0){
			bread = bread.substring(bread.indexOf("bread")+5);
			slices++;
			
		}
		
		System.out.println("Slices of bread: " + slices);
		
		//take out all the bread and place ingredients into an array
		String [] ingredients = sandwich.split("bread");
		
		
		//if sandwich has stuff before first bread and ends in bread take all ingredients after the first element
		if ((sandwich.indexOf("bread")>0) && (bread.equals("")) ){
			for (int i = 1; i < ingredients.length; i++){
				System.out.print(ingredients[i]);
			}
		}
		
		//if sandwich begins in bread and ends in bread (like a normal sandwich) take all ingredients
		else if (bread.equals("")){
			for (int i = 0; i < ingredients.length; i++){
				System.out.print(ingredients[i]);
			}
		}
		
		//if a sandwich has stuff before and after the boundary slices take all ingredients between first and last element 
		else if (sandwich.indexOf("bread")>0){
			for (int i = 1; i < ingredients.length-1; i++){
				System.out.print(ingredients[i]);
			}
		}
		
		//if a sandwich begins in bread and has stuff after the last slice take all ingredients before last element 
		else {
			for (int i = 0; i < ingredients.length-1; i++){
				System.out.print(ingredients[i]);
			}
		}
		System.out.println();	
		
	}
	
	public static void splitSpaces (String sandwich){
		//take out the spaces in the sandwich string
		String [] nospacesandwich = sandwich.split("  ");
		
		//run the split method on the unspaced sandwich string
		split(Arrays.toString(nospacesandwich));
	}
	
}

		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		
		//play around with String.split! what happens if you "I really really like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		





