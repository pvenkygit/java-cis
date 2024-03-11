package Class3;
public class Loopex3 {
    
    public static void main(String args[]){
        int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);  
    // using for loop
    System.out.print("Using for loop");  
 for(i=2;i<count;++i)   
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
 //using while loop
 System.out.print("\nUsing while loop");
 n1=0;n2=1;n3=0;i=2;count=10;
 while(i<count){
    n3=n1+n2;    
    System.out.print(" "+n3);    
    n1=n2;    
    n2=n3;  
    i++;
 } 

 //using do while loop
 System.out.print("\nUsing do while loop");
 n1=0;n2=1;n3=0;i=2;count=10;
 do{
    n3=n1+n2;    
    System.out.print(" "+n3);    
    n1=n2;    
    n2=n3;  
    i++; 
 }while(i<count);

    }
}
