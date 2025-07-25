    import java.util.Scanner;

    public class JaggedArrayuserinput {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][];

        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[3];

        System.out.println("enter elements for the jagged array");
        for(int i=0;i<arr.length;i++){
            System.out.println("enter " + arr[i].length + "elements for row " + i + ":");

            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

            System.out.println("jagged array elements");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            sc.close();
        }
    }

