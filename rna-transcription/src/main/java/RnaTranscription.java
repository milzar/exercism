import java.util.HashMap;

class RnaTranscription {
    HashMap<Character,Character> hash = new HashMap<Character,Character>();
    
    RnaTranscription(){
        hash.put('G', 'C');
        hash.put('C','G');
        hash.put('T','A');
        hash.put('A','U');
    }

    String transcribe(String dnaStrand) {
      StringBuilder result=new StringBuilder();
      for(char ch : dnaStrand.toCharArray()){
          result.append( hash.get(ch) );
      }
      return result.toString();
    }

    
}
