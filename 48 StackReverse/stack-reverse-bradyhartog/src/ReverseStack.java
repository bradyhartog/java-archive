import java.util.ArrayList;
import java.util.Stack;

/**
 * Reverses the order of a sentence by means of a stack.
 */
public class ReverseStack {
    ArrayList<Stack<String>> sentenceList = new ArrayList<>();

    /**
     * Constructs a ReverseStack object.
     */
    public ReverseStack() {}

    /**
     * Accommodates the sentence to be reversed.
     * @param sentence input sentence
     */
    public void addSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        addSentenceStack(words, 0);
    }

    /**
     * Creates a stack containing a component sentence within the input sentence (as denoted by a period) and adds it to the list of component sentences.
     * @param words list of words of input sentence
     * @param startIndex starting index of next component sentence
     */
    public void addSentenceStack(String[] words, int startIndex) {
        Stack<String> sentenceStack = new Stack<>();
        for(int i = startIndex; i < words.length; i++) {
            if(words[i].contains(".")) {
                sentenceStack.push(words[i].toLowerCase().substring(0, words[i].length() - 1));
                sentenceList.add(sentenceStack);
                addSentenceStack(words, i + 1);
                break;
            } else {
                sentenceStack.push(words[i].toLowerCase());
            }
        }
    }

    /**
     * Creates the total reversed sentence.
     * @return reversed sentence
     */
    public String getReverseStack() {
        String output = "";
        for(Stack<String> sentence : sentenceList) {
            String firstWord = sentence.pop();
            output += firstWord.substring(0,1).toUpperCase() + firstWord.substring(1) + " ";
            while(sentence.size() > 1) {
                output += sentence.pop() + " ";
            }
            output += sentence.pop() + ". ";
        }
        return output;
    }
}