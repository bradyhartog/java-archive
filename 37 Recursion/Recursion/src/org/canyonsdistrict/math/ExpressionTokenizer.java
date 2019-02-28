package org.canyonsdistrict.math;

/**
 * This class breaks up a string describing an expression
 * into tokens: numbers, parenthesis, and operators.
 */
public class ExpressionTokenizer {

    private String input;
    private int start;
    private int end;

    /**
     * Constructs a tokenizer
     * @param input the string to tokenize
     */
    public ExpressionTokenizer(String input){
        this.input = input;
        start = 0;
        end = 0;
        nextToken(); //find the first token
    }

    /**
     * Peeks at the next token without consuming it
     * @return the next token or null if there are no more tokens
     */
    public String peekToken(){
        if(start >= input.length()){
            return null;
        }
        return input.substring(start, end);
    }

    /**
     * Gets the next token and moves the tokenizer to the following token.
     * @return the next token or null if there are no more tokens
     */
    public String nextToken(){
        String r = peekToken();
        start = end;
        if(start >= input.length()){
            return r;
        }
        if(Character.isDigit(input.charAt(start))){
            end = start + 1;
            while (end < input.length() && Character.isDigit(input.charAt(end))){
                end++;
            }
        } else {
            end = start + 1;
        }
        return r;
    }
}
