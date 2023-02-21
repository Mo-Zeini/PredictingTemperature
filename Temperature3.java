
/*
 * This program predict temperature fir the rest of the day by knowing only the temperature at two different times in a day using the do-while loop.
 */

package PredictingTemperature;

public class Temperature3 {

	public static void main(String[] args) {
			
		int temp1 = 17;
		int temp2 = 37;
		int time1 = 7;
		int time2 = 11;		
		
		//The rate of change per hour
		int changeintemp = temp2 - temp1;
		int changeinhour = time2 - time1;
		
		
		int hour = time1 + 1; // Start counting from 8 clock.
		double rateintemp = changeintemp / changeinhour;
		
		// display the temperature at 7 clock.
		System.out.printf("The temp at %d is %d%n",time1, temp1);
			
		do {
			temp1 = (int) (temp1 + rateintemp);
			System.out.printf("The temp at %d is %d%n",hour, temp1);
			hour++;
		} while (hour <= time2);
	}	
}

