import java.util.ArrayList;
import java.util.Arrays;

class Proverb {
    ArrayList<String> wordList;

    Proverb(String[] words) {
        wordList = new ArrayList<String>(Arrays.asList(words));
    }

    String recite() {
        StringBuilder proverbString = new StringBuilder();


        for(int i=0; i<wordList.size()-1;i++ ){
            proverbString.append(String.format("For want of a %s the %s was lost.\n",wordList.get(i), wordList.get(i+1)) );
        }
        if(wordList.size() >0)
            proverbString.append( String.format("And all for the want of a %s.",wordList.get(0) ));
        
        return proverbString.toString();
    }

}
