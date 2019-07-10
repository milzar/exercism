class Darts {
    Double distance;
    Darts(double x, double y) {
        distance = new Double( Math.sqrt( x*x + y*y)  );
    }

    int score() {
        
        if(distance <= 1.0)
            return 10;
        else if(distance <= 5.0)
            return 5;
        else if (distance <= 10.0 )
            return 1;
        else    
            return 0;
    }

}
