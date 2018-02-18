import java.util.*;
import java.util.Scanner;



public class NodeTest {

	private static Node head;

	public static void main(String[] args){
		Node scanned = head;
		Scanner input = new Scanner(System.in);
		String scannedIngredient = input.next();
		//Node scannedIngredients = new Node();
		while (!scannedIngredient.equals("Quit")) {
			insert(scannedIngredient);
			System.out.println("Enter ingredient or 'Quit' to quit");
			input = new Scanner(System.in);
			scannedIngredient = input.next();
		}

		input.close();
		
		boolean bacon = false; 
		boolean bread = false;
		boolean eggs = false;
		boolean avocado = false;
		boolean banana = false;
		boolean chocolatechip = false;
		boolean oats = false;
		boolean cakemix = false;
		boolean oil = false;
		boolean noodles = false;
		boolean tomatosauce = false;
		
		String[] ingredients = {"Bacon", "Bread", "Eggs", "Avocado", "Banana", "Chocolate Chips", "Oats", "Cake Mix", "Oil", "Noodles", "Tomato Sauce"};
		boolean[] ingredientsVar = new boolean[11];
		Arrays.fill(ingredientsVar, Boolean.FALSE);

		Node N = head;
		while (N != null) {
			for (int j = 0; j < 11; j++) {
				if((N.id).equals(ingredients[j])) {
					ingredientsVar[j] = true;
				}
			}
			N = N.next;
		}

		for (int h = 0; h < 11; h++) {
			System.out.println(ingredientsVar[h]);
		}
		
		bacon = ingredientsVar[0];
		bread = ingredientsVar[1];
		eggs = ingredientsVar[2];
		avocado = ingredientsVar[3];
		banana = ingredientsVar[4];
		chocolatechip = ingredientsVar[5];
		oats = ingredientsVar[6];
		cakemix = ingredientsVar[7];
		oil = ingredientsVar[8];
		noodles = ingredientsVar[9];
		tomatosauce = ingredientsVar[10];

		determinePossibleRecipes(bacon, bread, eggs, avocado, banana, chocolatechip, oats, cakemix, oil, noodles, tomatosauce);

	}


	// ADDS INGRIDENTS
	public static void insert(String id) {
		if (head == null) {
			Node J = new Node(id);
			J.next = head;
			head = J;
		}
		else {
			Node N = new Node(id);
			Node H = head;
			while(H.next != null) {
				H = H.next;
			}
			H.next = N;
		}
	}

	// DECIDES WHICH RECIPES TO SEND OUT
	public static void determinePossibleRecipes(boolean bacon, boolean bread, boolean eggs, boolean avocado, boolean banana, boolean chocolatechip, boolean oats, boolean cakemix, boolean oil, boolean noodles, boolean tomatosauce) {
		if ((bacon && bread) || (bacon && eggs) || (eggs && bread)) {
			System.out.println("Why don't you cook scrambled eggs and bacon");
			System.out.println("Ingredients for Scrambled Eggs & Bacon: ");
			System.out.println("8 Bacon Slices");
			System.out.println("8 Eggs");
			System.out.println("Toast");
			System.out.println("Salt & Pepper");

			if (bacon == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some bacon!");
			}
			if (bread == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some bread!");
			}
			if (eggs == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some eggs!");
			}
		}
		if (avocado || bread) {
			System.out.println("Why don't you cook avocado toast");
			System.out.println("Ingredients for Avocado Toast: ");
			System.out.println("Bread");
			System.out.println("Avocado");
			System.out.println("Salt & Pepper");			
			if (bread == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some bread!");
			}
			if (avocado == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some avocados!");
			}
		}
		if ((banana && chocolatechip) || (banana && oats) || (oats && chocolatechip)) {
			System.out.println("Why don't you bake banana oat chocolate chip cookies");
			if (banana == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some bananas!");
			}
			if (chocolatechip == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some chocolatechips!");
			}
			if (oats == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some oats!");
			}

		}
		if (noodles || tomatosauce) {
			System.out.println("Why don't you make pasta");
			if (noodles == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some noodles!");
			}
			if (tomatosauce == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some tomato sauce!");
			}
		}
		if ((cakemix && eggs) || (cakemix && oil) || (oil && eggs)) {
			System.out.println("Why don't you bake a cake");
			if (cakemix == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some cakemix!");
			}
			if (eggs == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some eggs!");
			}
			if (oil == false) {
				System.out.println("You have almost everything for this recipe! Make sure to buy some oil!");
			}
		}
		else {
			System.out.println("Please add more ingredients to your pantry!");

		}
	}

}



