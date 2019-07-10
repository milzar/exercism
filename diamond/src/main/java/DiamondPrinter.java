import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



class DiamondPrinter {

    List<String> printToList(char a) {
        int n = Character.toUpperCase(a) - 'A' + 1;
        List<String> result = new ArrayList<String>();
        char currentLetter = 'A';
        int mid = (2*n-1)/2;
        for(int i=0;i<n;i++){
            StringBuilder currentRow = new StringBuilder( initializeRow(2*n-1 ) );
            currentRow.setCharAt(i+mid , currentLetter  );
            currentRow.setCharAt(mid -i , currentLetter  );
            result.add(currentRow.toString());
            currentLetter++;
        }
        //Add Bottom half
        int len = result.size()-2;
        for(int i=len;i>=0;i--)
            result.add(result.get(i));        
        return result;

    }

    String initializeRow(int n){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++)
            str.append(' ');
            
        return str.toString();
    }

}
