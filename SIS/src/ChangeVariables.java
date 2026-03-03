import java.util.Scanner;
import java.util.ArrayList;
public class ChangeVariables

	{
		static Scanner userInput = new Scanner(System.in);
			{
				changeVariable();
			}
			public static void changeVariable(Student student)
				{
					//new variable of grade
					String newgrade;
					
					System.out.println("Would you like to change a students Grade?"
							+ "1) Yes"
							+ "2) No");
					
					
					// directory.student.set(
					double newGrade = userInput.nextDouble();
					directory.student.setGrade(newGrade);
					
					int changeGrade = userInput.nextInt();
					int studentName = userInput.nextInt();
					if (changeGrade == 1)
						{
							System.out.println("Whose Grade do you wish to change?");
							
						}
				}
		
	}
