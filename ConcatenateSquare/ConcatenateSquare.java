public class ConcatenateSquare {
  //Returns number of digits of positive integer represented in decimal
  public static int intLength(int n) {
    int length = (int)(Math.log10(n)+1);
    return length; //Return length
  }
  
  public static void main(String[] args) {
    int maxX = 328; //Challenge specifies result less than 328
    double y;
    for (int x=1; x<maxX; x++){ //Iterate over every possibility
        int temp = intLength(x+1); //Get the length of the candidate's successor in decimal
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
