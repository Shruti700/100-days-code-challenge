//Impure function is the function which change or modify the state of argument/variable that are recieved when called/invoked.
// The ultimate result of the impure function depends upon the changes of the arguments that are recieved by the function.
import java.io*;
class ImpureFunction{
  static int h;
  public void display(ImpureFunction R){
    R.h=R.h*50;}
  public void main(){
    ImpureFunction obj =new ImpureFunction();
    obj.h=25;
    System.out.println("Value of h before function call = "+obj.h);
    display(obj);
    System.out.println("Value of h after function call= "+obj.h);
  }
}
//Result:
//Value of h before function call = 25
//Value of h after function call = 1250
    
