
class ReverseString {

    String reverse(String inputString) {
        StringBuilder str = new StringBuilder();
        for(int i=inputString.length()-1 ;i>=0;i--)
            str.append(inputString.charAt(i));
        return str.toString();
    }
  
}