class Bob{
    String hey(String inputString){
        boolean isStringEmpty =  inputString.trim().isEmpty() ;
        boolean containsAlpha = inputString.matches( ".*[a-zA-Z]+.*" ) ;

        if(  isStringEmpty  )
            return "Fine. Be that way!";    

        if(  inputString.equals(inputString.toUpperCase() )  && containsAlpha ){
            if(inputString.endsWith("?") )
                return "Calm down, I know what I'm doing!";
            
            return "Whoa, chill out!";
        }
        if(inputString.trim().endsWith("?"))
            return "Sure.";
        
        return "Whatever.";
    }
}