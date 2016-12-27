import java.util.*;
/** 
 *Class Quiz_MCQ1 is first class which deals with Multiple Choice Question
 * This class provides service to the client of 4 options for each Question
 * It also contains the answers. The client(In this case main) calls these 
 * questions and answers using the objects of Quiz_MCQ1 class and accessing 
 * the methods through That object.   
 **/
class Quiz_MCQ1{
	//All the Questions of this class are declared
	private String question[] ={ "In Which state the capital of United States Located?",
								  "In Which state the capital of India is Located?",
								  "What is the capital of Singapore?",
								  "What is the capital of Japan?",
								  "What is the capital of China?"};
	private int answer[] = {4,3,2,1,1};// Answers are declared
	// All the ArrayList for storing the options are declared
	private ArrayList<String> question1_options = new ArrayList<String>();
	private ArrayList<String> question2_options = new ArrayList<String>();
	private ArrayList<String> question3_options = new ArrayList<String>();
	private ArrayList<String> question4_options = new ArrayList<String>();
	private ArrayList<String> question5_options = new ArrayList<String>();

	/** 
	 *Returns void 
	 * 
	 *@param void
	 * 
	 *@return void
	 *
	 *Adds the option to the corresponding Array List objects for the specified Questions 
	 **/ 
	void setOptions()
	{
		question1_options.add("Washington");
		question1_options.add("Oregon");
		question1_options.add("NewYork");
		question1_options.add("Washington.D.C");
		question2_options.add("Odisha");
		question2_options.add("Andhra Pradesh");
		question2_options.add("Delhi");
		question2_options.add("Telangana");
		question3_options.add("Singapore");
		question3_options.add("City of Singapore");
		question3_options.add("Singapore City");
		question3_options.add("Republic of Singapore");
		question4_options.add("Tokyo");
		question4_options.add("Fukushima");
		question4_options.add("Hirosima");
		question4_options.add("Nagasaki");
		question5_options.add("Beijing");
		question5_options.add("Shanghai");
		question5_options.add("Guangzhou");
		question5_options.add("Tianjin");
	}
	/** 
	 *Returns the Question at the specified nextQuestion
	 * 
	 *@param nextQuestion – item number of the question
	 * 
	 *@return String with the specified index(nextQuestion).
	 *
	 *Returns null if the index is out of range 
	 **/ 
	
	String getQuestion(int nextQuestion)
	{
		return question[nextQuestion];
	}
	
	/** 
	 *Returns the ArrayList of String type at the specified nextOption
	 * 
	 *@param nextOption – item number of the next Question Options
	 * 
	 *@return ArrayList<String> with the specified nextOption of options type.
	 *
	 *Returns null if the index is out of range 
	 **/
	ArrayList<String> getQuestionOptions(int nextOption)
	{
		ArrayList <String> option = new ArrayList<String>();// Create an array List object
		// Based on the value of the next option the corresponding questions option
		//ArrayList are returned
		if(nextOption == 0)
		{
			option = question1_options;
		}
		if(nextOption == 1)
		{
			option = question2_options;
		}
		if(nextOption == 2)
		{
			option = question3_options;
		}
		if(nextOption == 3)
		{
			option = question4_options;
		}
		if(nextOption == 4)
		{
			option = question5_options;
		}
		return option;
		
	}
	/** 
	 *Returns the Integer at the specified nextAnswer
	 * 
	 *@param nextAnswer – item number at the nextAnswer value
	 * 
	 *@return integer with the specified nextAnswer in the answer Array.
	 *
	 *Returns null if the index is out of range 
	 **/
	int getAnswer(int nextAnswer)
	{
		return answer[nextAnswer];
	}
}
/** 
 *Class Quiz_MCQ2 which deals with Multiple Choice Question
 * This class provides service to the client of True/False choices for each Question
 * It also contains the answers. The client(In this case main) calls these 
 * questions and answers using the objects of Quiz_MCQ2 class and accessing 
 * the methods through That object.   
 **/

class Quiz_MCQ2 {
	// Initialize the number of Question
	private String Question[] = {"Eiffel Tower is in Paris?",
								  "Taj Mahal is in Peshawar, Pakistan",
								  "Statue of Liberty is in Portland, US",
								  "Lotus temple is located in Austrelia",
								  "Christ the Redeemer is in Rio de Janerio, Brazil"};
	private ArrayList<String> question_options = new ArrayList<String>();// Create an Array List 
	private int Answers[] = {1,2,2,2,1};//Set the answers 
	/** 
	 *Returns the String at the specified nextQuestion
	 * 
	 *@param nextQuestion – item number of the Question at the nextQuestion value
	 * 
	 *@return Question of String type with the specified nextQuestion in the Question Array.
	 *
	 *Returns null if the index is out of range 
	 **/
	String getQuestion(int nextQuestion)
	{
		return Question[nextQuestion];
	}
	/** 
	 *Returns void
	 * 
	 *@param void
	 * 
	 *@return void
	 *
	 *sets the Options to the question  
	 **/
	void setOption()
	{
		question_options.add("True");
		question_options.add("False");
	}
	/** 
	 *Returns the ArrayList of String type which is set for the options
	 * 
	 *@param void
	 * 
	 *@return ArrayList<String> which holds the options.
	 *
	 *Returns null if the index is out of range 
	 **/
	ArrayList<String> getOption()
	{
		return question_options; 
	}
	/** 
	 *Returns the Integer at the specified nextAnswer
	 * 
	 *@param nextAnswer – item number at the nextAnswer value
	 * 
	 *@return integer with the specified nextAnswer in the Answers Array.
	 *
	 *Returns null if the index is out of range 
	 **/
	int getAnswers(int nextAnswer)
	{
		return Answers[nextAnswer];
	}	
}




class Quiz{
	/** 
	 *Returns void
	 * 
	 *@param args[] is used if the User wants to send any parameter to the main 
	 * (This Project does not need parameter to be specified in the argument)
	 *@return void
	 *main is the control center for the project. It instantiates the objects based on
	 *the user input. The object for Quiz_MCQ1 class gets created if the user inputs 1.
	 *The object for Quiz_MCQ2 class gets created if the user chooses True/False type 
	 *Question. Based on User Input the methods of the class are called. The Question is 
	 *set and the option is displayed for each question. The User inputs answer. 
	 *The answer is validated and the results are displayed.    
	 **/
	public static void main(String args[])
	{
		int counter=0 ;
		final short CLEAR = 0;
		final short SET = 1;
		int input_choice = 0;
		short valid_input = CLEAR;
		short quiz1 = CLEAR;
		short quiz2 = CLEAR;
		System.out.println("Enter The Type of Quiz You Wish To Take");
		System.out.println("Press 1 and Enter for Multiple Choice Quiz (1-4)");
		System.out.println("Press 2 and Enter for Multiple Choice Quiz (True/False)");
		
		while(CLEAR == valid_input)// checks if the input is valid or else the loop repeats 
		{
			try{//try is initiated here for each exception which can occur at the User input
				Scanner input = new Scanner(System.in);//Scanner class is needed for the user to input 
				// This statement can cause exception if user inputs any thing other than number
				input_choice = Integer.parseInt(input.nextLine());//The input from the user is converted in to integer
				
				if((1 != input_choice) && (2 != input_choice))// if the User does not input either 1 or 2 
				{
					System.out.println("Enter Valid Input");
					System.out.println("Enter The Type of Quiz You Wish To Take");
					System.out.println("Press 1 and Enter for Multiple Choice Quiz (1-4)");
					System.out.println("Press 2 and Enter for Multiple Choice Quiz (True/False)");
					valid_input = CLEAR;// Set invalid input
				}
				else
				{
					if(1 == input_choice)
					{
						
						valid_input = SET;//set valid input if the User inputs 1
						quiz1 = SET;// Set Quiz 1 flag for later use 
					}
					else
					{
					valid_input = SET;//set valid input if the User inputs 2
					quiz2 = SET;// Set Quiz 2 flag for later Use 
					}
				}
				
			}catch(Exception e)// Handling the exception by parseInt method of the scanner class
			{// Using the Exception class just to handle it or else NumberFormatException can be Used 
				valid_input = CLEAR;
				System.out.println("Enter Numeric Input");// User defined message
				System.out.println("Enter The Type of Quiz You Wish To Take");
				System.out.println("Press 1 and Enter for Multiple Choice Quiz (1-4)");
				System.out.println("Press 2 and Enter for Multiple Choice Quiz (True/False)");
			}
			
		}
		valid_input = CLEAR; // If the above loop is executed correctly then clear the Valid input.
		if(SET == quiz1)// If Quiz2 flag is SET from earlier input then go inside 
		{
			System.out.println("Welcome to Multiple Choice Quiz");
			System.out.println("********Instructions******");
			System.out.println("**************************");
			System.out.println("*You Have to Select the options from 1 out of 4 choice*");
			System.out.println("*For Each Correct Answer you will get 1 point and for each wrong answer 0 point*");
			System.out.println("*So Lets Get Started .. All the Best..*");
			Quiz_MCQ1 quiz_mcq1 = new Quiz_MCQ1();// Object of the Quiz1 class is created 
			System.out.println("**************************");
			quiz_mcq1.setOptions();// Set the Quiz 1 options 
			for(int i=0;i<5;i++)// Loop is required to roll through all the Questions and hence reduces code 
			{
				valid_input = CLEAR; //Setting valid input clear each time so that you can get into the while loop  
				System.out.println("Question"+(i+1)+"."+quiz_mcq1.getQuestion(i));// get the question from quiz_mcq1 
				//
				ArrayList <String> options = new ArrayList<String>();// Create the ArrayList object
				options = quiz_mcq1.getQuestionOptions(i);//returns the ArrayList to options  
				for(int j=0;j<4;j++)
				{
					System.out.println((j+1) + "."+ options.get(j)); // Get the Options from the ArrayList 
																	//and populate it to the User
				}
				while(CLEAR == valid_input)// checks if the input is valid or else the loop repeats
				{
					try{//try is initiated here for each exception which can occur at the User input
						Scanner input = new Scanner(System.in);//Scanner class is needed for the user to input 
						// This statement can cause exception if user inputs any thing other than number
						input_choice = Integer.parseInt(input.nextLine());//The input from the user is converted in to integer
						if(input_choice == quiz_mcq1.getAnswer(i))// if the input is correct
						{
							counter++;// Increment the counter to count number of correct answers 
							System.out.println("Correct Option");
							valid_input = SET;// set valid option
						}
						//If the input is other than 1 or 2 or 3 or 4
						else if((1 != input_choice) && (2 != input_choice)&& (3 != input_choice) && (4 != input_choice))
						{
							System.out.println("Enter Valid Input from 1-4");
							valid_input = CLEAR;// clear the flag to repaeat is the user inputs anything other than 1,2,3,4
						}
						else
						{
							System.out.println("Incorrect Option");
							System.out.println("The Correct Choice is  " + quiz_mcq1.getAnswer(i));
							valid_input = SET;//Set for incorrect option 
						}
						
					}catch(Exception e)// Handling the exception by parseInt method of the scanner class
					{// Using the Exception class just to handle it or else NumberFormatException can be Used
						valid_input = CLEAR;// Clear this flag to repeat the while loop
						System.out.println("Enter Valid Input from 1-4");// User defined message
					}
					
				}
			}
			System.out.println("*****************Results***************");
			System.out.println("Number of Questions : 5");
			System.out.println("Number of Correct Answer: "+counter);
			float percentage = (((float)counter/5)*100); // chnage it to percentage 
			System.out.println("Percentage = "+percentage);
		}
		valid_input = CLEAR; // If the above loop is executed correctly then clear the Valid input.
		if(SET == quiz2)// If Quiz2 flag is SET from earlier input then go inside 
		{
			System.out.println("Welcome to Multiple Choice Quiz");
			System.out.println("********Instructions******");
			System.out.println("**************************");
			System.out.println("*You Have to Select the options from 1 out 2 choices of true or False*");
			System.out.println("*For Each Correct Answer you will get 1 point and for each wrong answer 0 point*");
			System.out.println("*So Lets Get Started .. All the Best..*");
			Quiz_MCQ2 quiz_mcq2 = new Quiz_MCQ2();// Object of the Quiz2 class is created
			System.out.println("**************************");
			quiz_mcq2.setOption();// Set the Quiz 2 options 
			for(int i=0;i<5;i++)// Loop is required to roll through all the Questions and hence reduces code 
			{
				valid_input = CLEAR; //Setting valid input clear each time so that you can get into the while loop
				System.out.println("Question"+(i+1)+"."+quiz_mcq2.getQuestion(i));
				ArrayList <String> options = new ArrayList<String>();
				options = quiz_mcq2.getOption();// get the question from quiz_mcq1
				for(int j=0;j<2;j++)
				{
					System.out.println((j+1) + "."+ options.get(j));// Get the Options since they are True/False 
				}
				while(CLEAR == valid_input)// checks if the input is valid or else the loop repeats
				{
					try{
						Scanner input = new Scanner(System.in);//Scanner class is needed for the user to input 
						// This statement can cause exception if user inputs any thing other than number
						input_choice = Integer.parseInt(input.nextLine());//The input from the user is converted in to integer
						if(input_choice == quiz_mcq2.getAnswers(i))// if the input is correct
						{
							counter++;// Increment the counter
							System.out.println("Correct Option");
							valid_input = SET;// Set the valid input to exit from the while loop 
						}
						else if((1 != input_choice) && (2 != input_choice))// If the choice are not 1 or 2
						{
							System.out.println("Enter Valid Input from 1-2");
							valid_input = CLEAR;// Set the Valid input clear to repeat the while loop 
						}
						else
						{
							System.out.println("Incorrect Option");
							System.out.println("The Correct Choice is  " + quiz_mcq2.getAnswers(i));// gets the correct option
							valid_input = SET;// set valid input since the user input is valid 
						}
						
					}catch(Exception e)// Handling the exception by parseInt method of the scanner class
					{// Using the Exception class just to handle it or else NumberFormatException can be Used
						valid_input = CLEAR;// Set it as invalid input since User entered other than numbers 
						//and repeat the loop
						System.out.println("Enter Valid Input from 1-2");
					}
					
				}
			}
			System.out.println("*****************Results***************");
			System.out.println("Number of Questions : 5");
			System.out.println("Number of Correct Answer: "+counter);
			float percentage = (((float)counter/5)*100);// Set the percentage in float
			System.out.println("Percentage = "+percentage);
		}
	}
}


