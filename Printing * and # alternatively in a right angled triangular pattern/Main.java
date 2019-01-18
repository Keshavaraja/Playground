import java.util.Scanner;
class Main 
{ 
	public static void main(String[] args)
    {
  		Scanner in = new Scanner(System.in);
        int n= in.nextInt();
      int i,j,line=1;
      for(i=1;i<=n;i++)
      {
       for(j=1;j<=i;j++)
       {
         if(line%2==1)
         {  
        System.out.print("*");
         }
         else
         { 
        System.out.print("#");
         }
         line=line+1;
       }
        System.out.print("\n");
      }
        
  		// Type your code here
    }
}