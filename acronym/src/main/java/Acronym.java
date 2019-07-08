class Acronym {
    String sentence;
    Acronym(String phrase) {
        sentence = new String();
        sentence = phrase;
    }

    String get() {
        boolean wordStart = true;
        StringBuilder result = new StringBuilder();
        for(char ch : sentence.toCharArray()){
            if(wordStart && Character.isLetter(ch)  ){
                result.append(Character.toUpperCase(ch) );
                wordStart = false;
            }
            else if ( ch == ' ' || ch == '-')
                wordStart =true;
        }
        return result.toString();
    }

}
