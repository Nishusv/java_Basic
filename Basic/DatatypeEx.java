public class DatatypeEx {
// Primitive Data Types example
    public static void main(String[] args) {

        // The byte data type can store a whole number between -128 and 127
        byte age = 25;
        // The short data type can store a whole number between -32,768 and 32,767
        short year = 2020;
        // The int data type can store a whole number between -2,147,483,648 and 2,147,483,647
        int population = 1000000;
        // The long data type can store a whole number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807
        long distance = 100000000;
        // The float data type can hold a value from 1.4e-045 to 3.4028235e+38
        float weight = 68.5f;
        // The double data type can hold a value from 4.9e-324 to 1.7976931348623157e+308
        double height = 178.6;
        // A character data type, also known as char, is used to store a single character, such as a letter, number, or symbol
        char grade = 'A';
        // The Unicode value for the letter A is 65, so we could also initialize the char variable as:
        char grade2 = 65;
        // The boolean data type is used to store a true or false value
        boolean isStudent = true;
    }
}

/*
 primitive data types are stored in the stack (stored in a fixed amount of memory and have a specific size)

non-primitive data types are stored in the heap (have a variable size and their memory is allocated dynamically)

primitive data types have a value

⚫ non-primitive data types have a reference to an object

primitive data types have a predefined set of operations that can be performed on them

⚫ non-primitive data types can have custom methods defined for them
 */