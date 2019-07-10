class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int digitCount=0, temp = numberToCheck, newNo=0;
		while(temp>0){
			temp =temp/10;
			digitCount++;
		}
		temp = numberToCheck;
		while(temp>0){
			int digit = temp % 10;
			temp=temp/10;
			newNo+= Math.pow(digit,digitCount);
		}
		
		return newNo == numberToCheck;
	}

}
