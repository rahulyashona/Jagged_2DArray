import java.util.Scanner;

class JaggedArray {
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int r=kb.nextInt();
        int [][]arr=new int[r][];
        int c;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter numbers of column in Row "+(i+1));
            c=kb.nextInt();
            arr[i]=new int[c];
            System.out.println("Enter values:");
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=kb.nextInt();
            }
        }
        int sum;
        System.out.println("The elements of the Jagged array are as follows:");
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
            System.out.print(" Sum is "+sum);
            System.out.println();
        }
    }
}
