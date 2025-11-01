/*Nnamdi Nwasinoke Jr.*/
public class SimpleCalc
{
	public static void main(String[] args) {

//Case 1: Even or Odd	    
	int n = 7;
    if (n % 2 == 0) 
        {System.out.println("Even");} 
    else
        {System.out.println("Odd");}

//Case 2: Largest of Three Numbers
    int a = 25, b = 42, c = 17;
    
    if ((a>b)&&(a>c))
        {System.out.println("Largest number: " + a);}
    else if ((b>a)&&(b>c))
        {System.out.println("Largest number: " + b);}
    else
        {System.out.println("Largest number: " + c);}

//Case 3: Grade Calculator

int score = 85; // You can change this value (0–100)

        if (score >= 90)
            {System.out.println("Grade: A");} 
        else if (score >= 80)
            {System.out.println("Grade: B");}
        else if (score >= 70)
            {System.out.println("Grade: C");}
        else if (score >= 60)
            {System.out.println("Grade: D");}
        else 
            {System.out.println("Grade: F");}
            
//Case 4: Simple Calculator with Switch
int x = 25, y = 50;
char op = '+'; 
    switch (op) {
        case '+': System.out.println("Result: " + (x + y));break;
        case '-': System.out.println("Result: " + (x - y));break;
        case '*': System.out.println("Result: " + (x * y));break;
        case '/': if (b != 0)
                    {System.out.println("Result: " + (x / y));}
                  else
                    {System.out.println("Error: Division by zero!");} break;
        default: System.out.println("Invalid operator!");}
//Case 5:
    System.out.println("Good Bye Have a Nice Day.");
		
		
		
		
		
		
		
		
		
		
		
	}
}
