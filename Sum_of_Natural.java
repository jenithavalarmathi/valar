import java.util.*;
import java.io.*;
public class Sum_of_Natural{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    int n,i,sum=0;
    System.out.println( "Enter the number");
    n=Integer.parseInt(br.readLine()); 
    for(i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    System.out.println("sum is "+sum);
  }                     
}
