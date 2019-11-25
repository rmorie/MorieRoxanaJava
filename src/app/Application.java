package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import menu.Food;

public class Application {

	static HashSet<Food> hs = new HashSet<Food>();
	public static void main(String[] args) throws IOException {
		while(true) {
			System.out.println("1.Food:");
			System.out.println("2.Foodlog:");
			System.out.println("3.Statistics");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String input =  in.readLine();
			Integer option = Integer.parseInt(input);
			switch (option) {
			case 1 :
				FoodMenu();
				//				for (Food item : hs) {
				System.out.println(hs.toString());
				//
				//				}

			}
		}
	}

	public static void FoodMenu () throws IOException {

		Food aliment = new Food();
		// clear screen;
		System.out.println("1.Adauga aliment:");
		System.out.println("2.Stergere aliment:");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input =  in.readLine();
		Integer option = Integer.parseInt(input);
		switch (option) {
		case 1 : 
			System.out.println("Introduceti alimentul:");
			BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
			String input2 =  in2.readLine();
			String[] arr = input2.split(" ");	
			aliment.setName(arr[0]);
			Float temp = Float.parseFloat(arr[2]);
			aliment.setCalorii(temp);
			aliment.setUm(arr[1]);
			hs.add(aliment);
			break;

		case 2:
			System.out.println("Numele alimentului ce trebuie sters:");
			BufferedReader in3 = new BufferedReader(new InputStreamReader(System.in));
			String input3 =  in3.readLine();
			hs.remove(input3);
			break;

		}


	}

}
