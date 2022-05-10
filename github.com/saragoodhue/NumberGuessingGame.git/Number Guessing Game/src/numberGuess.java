import java.util.Scanner;

public class numberGuess
	{
		static int secretNumber;

		public static void main(String[] args)
			{
				System.out.println("Welcome to my number game! Do you want your level to be 1, 2, or 3?");
				Scanner userLevel = new Scanner(System.in);
				int difficultyLevel = userLevel.nextInt();

				if (difficultyLevel == 1)
					{
						secretNumber = (int) (Math.random() * 5) + 1;
						System.out.println("I am thinking of a number between 1 and 5, can you guess it? ");
						Scanner userGuess = new Scanner(System.in);
					}

				else if (difficultyLevel == 2)
					{
						secretNumber = (int) (Math.random() * 50) + 1;
						System.out.println("I am thinking of a number between 1 and 50, can you guess it? ");
						Scanner userGuess = new Scanner(System.in);
					}

				else if (difficultyLevel == 3)
					{
						secretNumber = (int) (Math.random() * 100) + 1;
						System.out.println("I am thinking of a number between 1 and 100, can you guess it? ");
						Scanner userGuess = new Scanner(System.in);
					}

				boolean stillGuessing = true;

				do
					{

						int counter = 0;
						counter = counter + 1;
						int guess = userLevel.nextInt();

						if (guess > secretNumber)
							{
								System.out.println("Your guess is too high! Try again");
							}

						else if (guess < secretNumber)
							{
								System.out.println("Your guess is too low! Try again");
							}

						else if (guess == secretNumber)
							{
								System.out.println("You got it!");
								stillGuessing = false;

								if (counter > 1)
									{
										System.out.println("It took you " + counter + " tries");
									}

								else if (counter == 1)
									{
										System.out.println("It took you " + counter + " try");
									}

							}
					} while (stillGuessing);
			}

	}
