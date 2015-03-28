public class ConcatenateSquare {
  //Returns number of digits of positive integer represented in decimal
  public static int intLength(int x) {
    int length=0;
    while (x > 0){ //Iterate over each digit
      x = x/10; //Subtract one digit
      length++; //Increment length
    }
    return length; //Return length
  }
  
  public static void main(String[] args) {
    int maxX = 328; //Challenge specifies result less than 328
    double y;
    for (int x=1; x<maxX; x++){ //Iterate over every possibility
        int temp = intLength(x); //Get the length of the candidate in decimal
        if (x % 10 == 9){
          temp = temp-1;  //Candidates ending in 9 require an extra space for successor
        }
        temp = (int)Math.pow(10,temp);
        temp = x*temp; //Shift candidate left to make room for successor
        temp = temp+x+1; //Add successor
        y = Math.sqrt(temp); //Take the square root
        if (y % 1 == 0){ //Check for whole number
          System.out.println(x); //Print result if successful
        }
    }
    
  }
}