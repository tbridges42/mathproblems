public class HelloWorld {
  public static void main(String[] args) {
    for (int i=1; i<=100; i++){
      boolean fizzBuzz = false;
      if (i%3==0){
        System.out.print("Fizz");
        fizzBuzz = true;
      }
      if (i%5==0){
        System.out.print("Buzz");
        fizzBuzz = true;
      }
      if (!fizzBuzz){
        System.out.println(i);
      }
      else{
        System.out.println("");
      }
    }
  }
}