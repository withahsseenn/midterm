import javax.management.loading.PrivateClassLoader;

public class Bicycle implements CarbonFootprint{
	//We will find the carbon foot of the bike here.

		
		private static double FOOTPRINT_PER_MILE_BY_the_food_you_ate = 165;
		
		private String id;
		private double miles;
		
		//we made a get set because we couldn't reach it from outside.
		public Bicycle(String id,double miles) {
			
			setId(id);
			setMiles(miles);
			
	}
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public double getMiles() {
			return miles;
		}


		public void setMiles(double miles) {
			this.miles = miles;
		}


		@Override
		public double getCarbonFootprint() {
			double footprint = 0;
			footprint = getMiles()*FOOTPRINT_PER_MILE_BY_the_food_you_ate;			
			return footprint;
		}
		
		//our printing code
		public String toString() {
			StringBuilder string = new StringBuilder();
			string.append(getId());
			string.append("\nMiles Traveled: " + getMiles());
			string.append("\nPowered by the food you ate : " + FOOTPRINT_PER_MILE_BY_the_food_you_ate);
			return string.toString();
			
		}
	
}
