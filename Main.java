public class Main {
    
    public static void main(String[] args) {

        //Test 1
        //first java program

            /* 
                This
                is a 
                multi-line
                comment 
            */

                System.out.print("I like Pizza!! ");
                System.out.println("Its really good!!");
                System.out.println("I like to eat it with cheese and pepperoni!! ");


        // Test 2 
            // 1. declaration of a variable
            // 2. assignment of a value to the variable
                //INT
                    int age = 21;
                    int year = 2026;
                    int quantity = 1;
                    System.out.println(age);
                    System.out.println(year);
                    System.out.println(quantity);
                    System.out.println("I am " + age + " years old.");
                    System.out.println("The current year is " + year);
                    System.out.println("I have " + quantity + " pizza.");

                    //DOUBLE
                    double price = 12.99;
                    double tax = 0.08;
                    double total = price + (price * tax);

                    System.out.println("The total price of the pizza is $" + total);

                    //CHAR
                    char grade = 'A';
                    char letter = 'B';
                    char symbol = '#';

                    System.out.println("My grade is " + grade);
                    System.out.println("The letter is " + letter);
                    System.out.println("The symbol is " + symbol);
                    
                    //BOOLEAN
                    boolean isHungry = true;
                    boolean isTired = false;

                    System.out.println("Am I hungry? " + isHungry);
                    System.out.println("Am I tired? " + isTired);

                    // if statement
                    if (isHungry) {
                        System.out.println("I am hungry, I will eat pizza.");
                    } 
                    else {
                        System.out.println("I am not hungry, I will NOTTT eat pizza.");
                    }



        
    }
}
