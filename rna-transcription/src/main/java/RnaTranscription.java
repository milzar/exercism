class RnaTranscription {

    String transcribe(String dnaStrand) {
      String result="";
      for(char ch : dnaStrand.toCharArray()){
          result+= complement(ch);
      }
      return result;
    }

    char complement(char ch){
      if(ch == 'G')
        return 'C';
      else if(ch == 'C')
        return 'G';
      else if(ch == 'T')
        return 'A';
      else if(ch == 'A')
        return 'U';
      else
        return '.';
    }

}
