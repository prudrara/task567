If you are creating your own Exception that is known as custom exception or user-defined exception. Java custom exceptions are used to customize the exception according to user need.

By the help of custom exception, you can have your own exception and message.

Let's see a simple example of java custom exception.

class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  
class TestCustomException1{  
  
   static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(13);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  
}  