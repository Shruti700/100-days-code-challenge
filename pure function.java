//Pure function is the function which does not change or modify the state of argument/variable that are recieved when called/invoked.
// The ultimate result of the pure function depends upon the arguments that are recieved by the function.
import java.io.*;
class purefunction{
  public int pure(int x,int y){
    if(x>3) return x;
    else if(y<4) return y;
    else return 0;
  }
  public void main(){
    int a= 4,b=3;
    int r= pure(a,b);
    System.out.println(" Value of r after function call = "+r);
  }
}
