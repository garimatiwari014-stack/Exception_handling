class YoungerAgeException extends RuntimeException{
    YoungerAgeException(){
        super("You are not eligible");
    }
    YoungerAgeException(String msg){
        super(msg);

    }
}
class customRuntimeException{
    public static void main(String[]args){
        int age = 16 ;
        try{
            if(age < 18){
                throw new YoungerAgeException("You are not eligible for voting");
            }
            else{
                System.out.println("You are eligible for voting ");
            }
        }
        catch(YoungerAgeException e){
            System.out.println(e.getMessage());
        }
        
    }}
