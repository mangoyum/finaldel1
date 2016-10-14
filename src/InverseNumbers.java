import java.util.Scanner; //import scanner to read user input

//create the class
public class InverseNumbers {

	//create main method
	public static void main(String[] args) {
		
		//create variable for reader input
		int readerInput = readDataFromUser();
		
		// create variable for converted data value of reader input
		int convertedData = convertData (readerInput);
		
		//return value of converted data
		returnData (convertedData);
	}
	//this method requires entering reader input
	public static int readDataFromUser() { //a method outside of main method
		System.out.println("Enter a valid number:"); //asks user to enter a number
		Scanner myInput = new Scanner(System.in);//create scanner object
		int readerInput = myInput.nextInt(); //declaring/instantiating 
	
		myInput.close(); //needs to be closed otherwise it wastes memory
		return readerInput;//puts out readerInput
		
	}
	//this method converts data
	public static int convertData(int userData) {
		int userNumber = userData;
		int answer = 0;//setting the value to 0
		int remainder = 1;//setting the value greater than 0; 
		//if 0 the output will be 0 and it won't go through the while loop
		while (remainder > 0) {
			remainder = userNumber%10;
			//the remainder of any number divided by 10 will produce the last digit as remainder
	/* ex: 765 % 10 equals remainder of 5 *10 = 50
	 * 76 % 10 equals remainder of 6 -- (50 + 6) * 10 = 560
	 * 7 % 10 equals remainder of 7 -- (560 + 7) * 10 = 5670
	 * 
	 */
			
			answer = (answer + remainder)*10; // this helps move the digit over to the left by one
			
			userNumber = userNumber/10;//now the user number is 76 and the while loop repeats
			
			
			
		} 
		return answer/100; // 5670/10 = 567 which is inverse of 765
		//must divide by 100 to return value at appropriate number of digits
				

	}
	public static void returnData(int inverseData){
		System.out.println(inverseData); //output inverse number
	}
	}
	

