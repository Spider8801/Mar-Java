//Random and Array index out of bound exception error
import java.util.Random ;
class firstcode
{
 public static void main(String[] args) {
  //System.out.println("Hello");
  Random r= new Random();
  int a[]= new int[20];
   for(int i=0;i<a.length;i++)
   {
     a[i]=r.nextInt(50);
   }
   try
   {
   System.out.println(a[52]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Array index out of Bound exception");
    }
   for(int i :a)
      System.out.println(i);
  }
}
