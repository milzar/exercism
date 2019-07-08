import java.util.HashMap;

class TwelveDays {
    HashMap<Integer,String> dayMap;
    HashMap<Integer, String> verseMap;


    TwelveDays(){
        dayMap = new HashMap<Integer,String>();
        verseMap= new HashMap<Integer, String>();
        dayMap.put(1,"first");
        dayMap.put(2,"second");
        dayMap.put(3,"third");
        dayMap.put(4,"fourth");
        dayMap.put(5,"fifth");
        dayMap.put(6,"sixth");
        dayMap.put(7,"seventh");
        dayMap.put(8,"eighth");
        dayMap.put(9,"ninth");
        dayMap.put(10,"tenth");
        dayMap.put(11,"eleventh");
        dayMap.put(12,"twelfth");

        verseMap.put(1,"a Partridge in a Pear Tree");
		verseMap.put(2,"two Turtle Doves");
		verseMap.put(3,"three French Hens");
		verseMap.put(4,"four Calling Birds");
		verseMap.put(5,"five Gold Rings");
		verseMap.put(6,"six Geese-a-Laying");
		verseMap.put(7,"seven Swans-a-Swimming");
		verseMap.put(8,"eight Maids-a-Milking");
		verseMap.put(9,"nine Ladies Dancing");
		verseMap.put(10,"ten Lords-a-Leaping");
		verseMap.put(11,"eleven Pipers Piping");
        verseMap.put(12,"twelve Drummers Drumming");
        

    }

    String getVerseEnd(int verseNumber){
        StringBuilder verseEnd = new StringBuilder();

        for(int i=verseNumber;i>1;i--){
            verseEnd.append(  String.format("%s, ", verseMap.get(i) )  );
            if(i == 2)
                verseEnd.append( String.format("and "));
        }

        verseEnd.append(verseMap.get(1));
        
        return verseEnd.toString();
    }

    String verse(int verseNumber) {
        return String.format("On the %s day of Christmas my true love gave to me: %s.\n",dayMap.get(verseNumber), getVerseEnd(verseNumber));
    }

    String verses(int startVerse, int endVerse) {
      StringBuilder result  = new StringBuilder();
      for(int i=startVerse; i<=endVerse;i++){
          result.append( verse(i) );
          if(i<endVerse)
            result.append("\n");
      }
      return result.toString();
    }

    String sing() {
          return verses(1,12);
    }
}
