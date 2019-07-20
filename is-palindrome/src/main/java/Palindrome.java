public class Palindrome {
    public boolean check(String sentence) {
        if(sentence.isEmpty())
            return  true;
        StringBuilder sentenceBuilder = new StringBuilder(sentence.toLowerCase().replace(" ",""));
        return sentenceBuilder.toString().equals(sentenceBuilder.reverse().toString());

    }
}
