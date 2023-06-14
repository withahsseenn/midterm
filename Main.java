import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		//we created an arraylist.
		ArrayList<CarbonFootprint> footprintItems = new ArrayList<CarbonFootprint>();
		double totalFootprint = 0;
		
		
		try {//we made an addition with the add method in try.
			footprintItems.add(new Building("Ahsen's House", 8, 170, 145, 350, 693,	100, 100, 0));
			footprintItems.add(new Car("Ahsen's Range Rover", 10000, 25));
			footprintItems.add(new Bicycle("Ahsen's Bicycle", 1000));

			//we have printed the elements of our list.
			for (CarbonFootprint item : footprintItems) {
				double footprint = item.getCarbonFootprint();
				totalFootprint += footprint;
				System.out.println("\nItem: " + item.toString());

				
			}
		} catch (Exception exception) {
			System.out.println("Error computing the carbon footprint.");
		}
	}

	}


