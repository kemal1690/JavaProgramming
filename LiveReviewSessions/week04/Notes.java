package week04;

public class Notes {
    public static void main(String[] args) {
        /*
        Conditional Statements in JAVA (Control FLOW statements)
        If Condition:
        - single if statements (door: opens only if condition is true)
        - if ...else...
        - if ...else if ... else if...else
        - nested if
        Switch: very similar multi branch ifs (like an elevator)

        Ternary Operator:
    -> variable = condition ? trueValue : falseValue;
===================================
        All conditionals work with boolean values (true, false)
  * Comparison operators
   > , > , >= ,<= , == , !=
  * boolean variables
        - boolean isMarried = false;
  * String :  equals()  method reveal boolean result (true, false)
 * isDisplayed() -> produces boolean result
 ==============================
        A
        if(condition){
            B
        }else{
            C
        }
        D

        1. Condition is true
        A
                B
        D
                * C will be skipped
        2. Condition is false
        A
                C
        D
                * B will be skipped
                -----------------------------------------------------------------
                add a class AmazonFreeShipping
add main method
        assign double value to totalPrice variable

        if totalPrice is more than or equal to 25
        print "FREE SHIPPING ELIGIBILE. Your order total: $55"
        ELSE
        print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"
                -----------------------------------------------------------------
                Shortcut for alignment:
        command + option + L : MAC
        CTRL + ALT + L : Windows
                --------------------------------------
        how can I make a regular directory a source root?
        So I can create JAVA files
        marc directory as > sources root
                ---------------------------
                Nested If:
        We can put IF statement inside another If statement

        add new class VendingNestedIf
add main method

        selection = "drink" or can be "snack"
        drinkItem = "tea" , "coke"
        snackItem = "chips" , "candy"

        when selection is "drink":
        "drink option is selected"

        when drinkItem is "tea":
        "tea is selected"
        when drinkItem is "coke":
        "coke is selected"
        when selection is "snack"
        "snack option is selected"

        when snackItem is "chips":
        "chips item is selected"
        when snackItem is "candy":
        "candy item is selected"
                ========================================

        REPLIT: we have a lot of replit practice, over 250
                - graudally giving the tasks
        IS NOT OUR PRIORITY
======================
        Sometimes we can skip using curly {} braces with if conditions
        WHEN:
        if you have only one statement in the IF block
        ADVICE:
        ALWAYS use curly braces

 ===================SWITCH STATEMENTS======================
        add new class AdaireApartments
 main method

 #### WELCOME TO ADAIRE APARTMENTS ####

        numberOfBedrooms = 0, 1, 2

        startingPrice = 0;

        when numberOfBedrooms 0:
        print: "Studio apartment selected"
        startingPrice -> 1454

        when numberOfBedrooms 1:
        print: "One bedroom apartment selected"
        startingPrice -> 1725

        when numberOfBedrooms 2:
        print: "Two bedroom apartment selected"
        startingPrice -> 2899

        default:
        print "5 bedroom currently unavailable"

                ------
        "Starting price $1454"
                ==================================
        switch statement is present in all programming languages
        it acts like multi branch if statement
        easer to read, sometimes faster

        RULES:
-> it can only perform == (equals) Can NOT handle <=, >=
-> works only with byte, short, char and int,  Strings

                =========================
        DEBUG
        When you have some kind of bug in your code, you want to find it and fix it

        Steps:
        1. put breakpoint by clicking on left panel where line numbers are
        2. Run as DEBUG (BUG ICON)
        3. Your compiler stops the execution at that line
        4. To move your compiler step by step "click on step over"

        Benefit: you can see the flow of the execution of your codes, variables and their values
    */
    }
}



