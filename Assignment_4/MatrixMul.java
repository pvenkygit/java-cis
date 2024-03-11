
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MatrixMul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no.of rows & columns for 1st matrix");
        int x1 = s.nextInt(), y1=s.nextInt();
        System.out.println("Enter no.of rows & columns for 2nd matrix");
        int x2 = s.nextInt(), y2=s.nextInt();
        if(y1!=x2)
        {
            System.out.println("Cannot be multiplies as 'y1!=x2'");
            System.exit(0);
        }
        int a[][]= new int[x1][y1];
        int b[][]= new int[x2][y2];

        System.out.println("Initialize values of 1st matrix, Enter "+x1*y1+" values");
        for(int i=0;i<x1;i++)
        {
            for(int j=0;j<y1;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("initialize values of 2nd matrix, Enter "+x2*y2+" values");
        for(int i=0;i<x2;i++)
        {
            for(int j=0;j<y2;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("First matrix");
        for(int i=0;i<x1;i++)
        {
            for(int j=0;j<y1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second matrix");
        for(int i=0;i<x2;i++)
        {
            for(int j=0;j<y2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        MatrixMul m= new MatrixMul();
        int c[][]=m.mul(a,b);
        System.out.println("Multiplied matrix");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] mul(int [][] a,int [][] b){
        int x1 = a.length, y1=a[0].length;
        int x2 = b.length, y2=b[0].length;
        int c[][]= new int[x1][y2];
        for(int i=0;i<x1;i++)
        {
            for(int j=0;j<x2;j++)
            {
                for(int k=0;k<y2;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}