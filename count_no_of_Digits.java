import java.util.*;
import java.io.*;
public class count_no_of_Digits{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    int n,count=0;
    System.out.println( "Enter the number");
    n=Integer.parseInt(br.readLine()); 
    while(n!=0)
    {
      n=n/10;
      count++;
    }
    System.out.println("count is "+count);
  }                     
}
