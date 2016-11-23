package com.company;

public class Main {

    public static void main(String[] args) {
	/* Project #1 - Create a Lexicon Analyzer
       1.) Read from the input string.
           -To find an identifier, read as many characters as possible.
       2.) Determine what is made into a token
       3.) Tokenize the strings.
       4.) Output a token list that labels the tokens to their type and value in which they were found.
       5.) If unidentified character is found, print a useful message
           - Character and position number of character, exit the program.
    */
	    // Your syntax analyzer should work on any string
        // If an error is detected it should gracefully exit with your error message, printing only those tokens it has
        // recognized up to the detected error.

        String s = "x = 1z";
        System.out.println("Input String:"  + s);
        LexAnalyzer lex = new LexAnalyzer(s);
        System.out.println("Token List");
        lex.printTokenList();
        //Test Case 1 ″x = 12.78 ; y = apple + 5 * orange;z=3*(4 * y) “
        //Test Case 2 – ″read write 34 +5.678 -789.001 goodread+-* ″
        //Test Case 3 – ″ int y = 7 ; double z = 78.01 ″
        //Test Case 4 - ″ qwerty := 1234″
        //Test Case 5 - ″ total is 23. dollars ″
        //Test Case 6 - ″x = art2.1b″
        //Test Case 7: ″   ″ //This is not an error. You should print EMPTY TOKEN LIST

    }
}
