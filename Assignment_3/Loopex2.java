package Class3;
public class Loopex2 {
    public static void main(String args[]){
        // Program to find sum of natural numbers from 1 to 1000
        //using for loop
    int sum = 0;
    int n = 1000;
    for (int i = 1; i <= n; ++i) {
      
      sum += i;    
    }
       
    System.out.println("using for loop Sum = " + sum);
    //using while loop
    sum=0;
    n=1000;
    int j=1;
    while(j<= n){
        sum += j;   
        j++;
    }
    System.out.println("using while loop Sum = " + sum);

    //using do while loop
    sum=0;
    n=1000;
    int k=1;
    do{
        sum+=1;
        k++;

    }while(k<=n);

    System.out.println("using do while loop Sum = " + sum);
    }
}
