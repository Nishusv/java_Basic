/*
 * Writing to the console
In this exercise, you will practice writing to the console using the System.out.print(), System.out.println(), and System.out.printf() methods.

You have been provided with variables of different data types: number (int), price (double), isAvailable (boolean), grade (char), and name (String).

Use the System.out.print() and System.out.println() methods to output each variable to the console, ensuring each variable is properly labeled.

Use the System.out.printf() method to output all the variables in a single formatted string.

Expected output:

Number: 42
Price: 12.99
Availability: true
Grade: A
Name: Alice
Formatted Output: Name: Alice, Number: 42, Price: 12.99, Availability: true, Grade: A
 */
public class ConsoleOutput {
    public static void main(String[] args) {
        int number = 50;
        double price = 14.480;
        boolean isAvailable = true;
        char grade = 'A';
        String name = "Nikshep";
        // Normal output formate
        System.out.println("Number:"+ number);
        System.out.println("Price %.2f:"+price);
        System.out.println("Avalibility:"+isAvailable);
        System.out.println("Name:"+name);
        System.out.println("Grade:"+grade);
        // Formated output in the console
       /*
        System.out.printf("Name:",name);
        System.out.printf("Number:",number);
        System.out.printf("Price %.2f:",price);
        System.out.printf("Avalibility:",isAvailable);
        System.out.printf("Grade:",grade); 
       */
      // Using print and println methods
        System.out.print("Number: ");
        System.out.println(number);
        
        System.out.print("Price: ");
        System.out.println(price);
        
        System.out.print("Availability: ");
        System.out.println(isAvailable);
        
        System.out.print("Grade: ");
        System.out.println(grade);
        
        System.out.print("Name: ");
        System.out.println(name);
       // Using printf for formatted single-line output
        System.out.printf(
            "Formatted Output: Name: %s, Number: %d, Price: %.2f, Availability: %b, Grade: %c%n",
            name, number, price, isAvailable, grade
        );

    }
    
}
