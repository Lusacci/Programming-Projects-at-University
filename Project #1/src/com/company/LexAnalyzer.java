package com.company;

/**
 * Created by James on 9/18/2016.
 */

public class LexAnalyzer
{
    // define your private fields as needed
    // So here inside this class, you need to define what the Lex Analyzer has, so the different kinds of tokens.

    char curr_char;  //the current symbol
    int index; //the position of the current symbol in the string.
    String s; // variable to be used as storage.

    public LexAnalyzer (String input)
    {
        //fill in code
        s = input; //store input into s.
        curr_char = s.charAt(0); //this sets it to the first character in the string.
        index = 0; //starting index is 0.

    }

    public void printTokenList()
    {
        //fill in code
        //So here you would call print_all_tokens, which should call on print_next_token.
        print_all_tokens();
    }

    //define other private methods as needed


    public boolean print_next_token()
    {


        //skip over white space " "
        while (curr_char == ' ')
        {
            if(!next_char())
            {
                return false;
            }
        }

        /*
        if curr_char is in the set { ( , ) , +, -, * , /, ; , = }
        print appropriate token type
        return true */

        switch (curr_char)
        {
            case '(': System.out.println("LEFTPAREN"); return next_char();
            case ')': System.out.println("RIGHTPAREN"); return next_char();
            case '+': System.out.println("PLUS"); return next_char();
            case '-': System.out.println("MINUS");  return next_char();
            case '*': System.out.println("TIMES");  return next_char();
            case '/': System.out.println("DIVIDE");  return next_char();
            case ';': System.out.println("SEMICOLON");  return next_char();
            case '=': System.out.println("ASSIGNMENT");  return next_char();
        }

        /*
        else if curr_char is a digit
        read additional digits and at most one decimal point
        print number token type with found number */

        if(Character.isDigit(curr_char))
        {
            int decimals = 0;
            String temp = "" + curr_char;
            boolean cont;
            while (cont = next_char())
            {
                if (curr_char == '.')
                {
                    ++decimals;
                    temp += '.';
                    //if decimals > 1 throw exception/syntax error
                    if(decimals > 1)
                    {
                        System.out.println("Syntax error at: " + curr_char + " too many decimals.");
                        return false;
                    }
                }
                else if (Character.isDigit(curr_char))
                {
                    temp += curr_char;
                }
                else // not a number or a decimal
                {
                    break;
                }
            }
            //Print our number.
            if (decimals == 0)
            {
                System.out.println("INTEGER " + temp);
            }
            else
            {
                System.out.println("FLOAT " + temp);
            }
            return cont; // return whether or not there is a next character
        }


        /* else if curr_char is a letter
        read any additional letters and digits
        check to see if resulting string is read or write
        if so, print keyword token type with the keyword
        else print IDENTIFIER with the name of identifier
        else print error message */

        if (Character.isLetter(curr_char))
        {
            String temp = "" + curr_char;
            boolean cont;
            while (cont = next_char())
            {
                if (Character.isLetterOrDigit(curr_char))
                {
                    temp += curr_char;
                }
                else
                {
                    break;
                }
            }
            switch(temp)
            {
                case "read": System.out.println("READ"); break;
                case "write": System.out.println("WRITE"); break;
                default: System.out.println("IDENTIFIER " + temp); break;
            }
            return cont;
        }
        System.out.println("Error, cannot resolve symbol: " + curr_char); //TODO fix this
        return false;
    }

    public void print_all_tokens()
    {
        /*Set curr_char to first character in string
            - I did this inside the constructor for Lex Analyzer. */
        int tokens = 0;
        while (print_next_token());
        tokens++;
        if(tokens == 0){
            System.out.println("Empty Token List.");
        }

    }
    public boolean next_char()
    {
        if(++index == s.length())
        {
            return false;
        }
        else
        {
            curr_char = s.charAt(index);
        }
        return true;
    }
}
