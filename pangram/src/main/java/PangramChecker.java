import java.util.Set;
import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> hash= new HashSet<Character>();
        for( char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
              hash.add(Character.toLowerCase(ch) );
            }
        }

        if(hash.size() >= 26  )
          return true;
        else
          return false;
    }

}
