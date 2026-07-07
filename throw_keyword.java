 
 
 
 public class throw_keyword {


    public static void main(String [] args){
        int age = 18 ;
        if(age > 18){
            System.out.println("You are eligible to vote");
        }
        else{
            throw new ArithmeticException("You are not eligible to vote");
        }
    }
}
