public class ReverseTester {
    public static void main(String[] args) {
        String sentence = "Mary had a little lamb. Its fleece was white as snow.";
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.addSentence(sentence);
        System.out.println(reverseStack.getReverseStack());
    }
}