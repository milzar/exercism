import java.util.HashMap;

class TwelveDays {
    HashMap<Integer,String> dayInWords;
    HashMap<Integer, String> gifts;

    TwelveDays(){
        dayInWords= new HashMap<Integer,String>();
        gifts= new HashMap<Integer, String>();
        dayInWords.put(1,"first");
        dayInWords.put(2,"second");
        dayInWords.put(3,"third");
        dayInWords.put(4,"fourth");
        dayInWords.put(5,"fifth");
        dayInWords.put(6,"sixth");
        dayInWords.put(7,"seventh");
        dayInWords.put(8,"eighth");
        dayInWords.put(9,"ninth");
        dayInWords.put(10,"tenth");
        dayInWords.put(11,"eleventh");
        dayInWords.put(12,"twelfth");

        gifts.put(1,"a Partridge in a Pear Tree");
		gifts.put(2,"two Turtle Doves");
		gifts.put(3,"three French Hens");
		gifts.put(4,"four Calling Birds");
		gifts.put(5,"five Gold Rings");
		gifts.put(6,"six Geese-a-Laying");
		gifts.put(7,"seven Swans-a-Swimming");
		gifts.put(8,"eight Maids-a-Milking");
		gifts.put(9,"nine Ladies Dancing");
		gifts.put(10,"ten Lords-a-Leaping");
		gifts.put(11,"eleven Pipers Piping");
        gifts.put(12,"twelve Drummers Drumming");
    }

    String verse(int verseNumber) {
        return String.format("On the %s day of Christmas my true love gave to me: %s.\n",
                            dayInWords.get(verseNumber), getVerseEndinging(verseNumber));
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

    String getVerseEndinging(int verseNumber){
        StringBuilder verseEndBuilder = new StringBuilder();

        for(int i=verseNumber;i>1;i--){
            verseEndBuilder.append(  String.format("%s, ", gifts.get(i) ) );
            if(i == 2)
                verseEndBuilder.append( String.format("and "));
        }

        verseEndBuilder.append(gifts.get(1));
        return verseEndBuilder.toString();
    }
}
