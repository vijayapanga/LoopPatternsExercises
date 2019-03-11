package javaPractice;

public class LoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for(int j=0;j<10;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//****************************************************************

        for (int i = 0; i <=5; i++) {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//****************************************************************

        int k=5;
        for (int i = 0; i <=5; i++) {
            for(int j=0;j<k;j++)
            {
                System.out.print(" ");
            }
            k--;
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println();
//****************************************************************
        k=5;
        for (int i = 0; i <=5; i++) {
           for(int j=0;j<k;j++)
            {
                System.out.print(" ");
            }
           k--;
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }


            System.out.println();

        }

        System.out.println();
//****************************************************************

        k=5;
        for (int i = 0; i <=5; i++) {
            for(int j=0;j<k;j++)
            {
                System.out.print(" ");
            }
            k--;
            for(int j=0;j<=i;j++)
            {
                System.out.print(i);
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(i);
            }


            System.out.println();

        }
        System.out.println();
//****************************************************************
        k=5;
        for (int i = 0; i <=5; i++) {
            for(int j=0;j<k;j++)
            {
                System.out.print(" ");
            }
            k--;
            int m=i;
            for(int j=0;j<i;j++)
            {
                System.out.print(m);
                m--;
            }

            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }


            System.out.println();

        }
        System.out.println();


    }

}
