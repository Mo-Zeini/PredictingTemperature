
/*
 * This program predict temperature fir the rest of the day by knowing only the temperature at two different times in a day using the for loop.
 */

package PredictingTemperature;

public class Temperature1 {

	public static void main(String[] args) {
			
		int temp1 = 17; // Initialize the first temperature.
		int temp2 = 37; // Initialize the second temperature.
		int time1 = 7; // Initialize the first time.
		int time2 = 11;	// Initialize the second time.
		
		//The rate of change per hour
		int changeintemp = temp2 - temp1;
		int changeinhour = time2 - time1;
				
		int hour;
		double rateintemp = changeintemp / changeinhour;
		
		// display the temperature at 7 clock.
		System.out.printf("The temp at %d is %d%n",time1, temp1);
		time1 = time1 + 1; // Start counting from 8 clock.
			
		for (hour = time1; hour <= time2; hour++) {			
			temp1 = (int) (temp1 + rateintemp);
			
			// Display the other temperatures and hours.
			System.out.printf("The temp at %d is %d%n",hour, temp1);
		}
	}
}
