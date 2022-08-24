package Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern11(5);
    }

    //* * * * *
    //* * * * *
    //* * * * *
    //* * * * *
    //* * * * *
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //*
    //* *
    //* * *
    //* * * *
    //* * * * *
    private static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5 
    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //1
    //2 2
    //3 3 3
    //4 4 4 4
    //5 5 5 5 5
    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //* * * * *
    //* * * *
    //* * *
    //* *
    //*
    private static void pattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //1 2 3 4 5
    //1 2 3 4
    //1 2 3
    //1 2
    //1
    private static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //    *
    //   ***
    //  *****
    // *******
    //*********
    private static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*********
    // *******
    //  *****
    //   ***
    //    *
    private static void pattern8(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    *
    //   ***
    //  *****
    // *******
    //*********
    //*********
    // *******
    //  *****
    //   ***
    //    *
    private static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*
    //* *
    //* * *
    //* * * *
    //* * * * *
    //* * * * *
    //* * * *
    //* * *
    //* *
    //*
    private static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //1
    //0 1
    //1 0 1
    //0 1 0 1
    //1 0 1 0 1
    private static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            int startWith = (i & 1) == 1 ? 1 : 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(startWith+" ");
                startWith^=1;
            }
            System.out.println();

        }
    }

    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    private static void pattern12(int n) {
        for (int i = 0, k = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    //A
    //A B
    //A B C
    //A B C D
    //A B C D E
    private static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }

    //A B C D E
    //A B C D
    //A B C
    //A B
    //A
    private static void pattern14(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }

    //A
    //B B
    //C C C
    //D D D D
    //E E E E E
    private static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
    }

    //1      1
    //12    21
    //123  321
    //12344321
    private static void pattern16(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //    A
    //   ABA
    //  ABCBA
    // ABCDCBA
    //ABCDEDCBA
    private static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j));
            }
            for (int j = i; j > 0; j--) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }
    }

    //E
    //D E
    //C D E
    //B C D E
    //A B C D E
    private static void pattern18(int n) {
        char ch = 'E';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
            ch = (char) --ch;
        }
    }

    //**********
    //****  ****
    //***    ***
    //**      **
    //*        *
    //*        *
    //**      **
    //***    ***
    //****  ****
    //**********
    private static void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*        *
    //**      **
    //***    ***
    //****  ****
    //**********
    //****  ****
    //***    ***
    //**      **
    //*        *
    private static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        n--;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*****
    //*   *
    //*   *
    //*   *
    //*****
    private static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    //4 4 4 4 4 4 4
    //4 3 3 3 3 3 4
    //4 3 2 2 2 3 4
    //4 3 2 1 2 3 4
    //4 3 2 2 2 3 4
    //4 3 3 3 3 3 4
    //4 4 4 4 4 4 4
    private static void pattern22(int n) {
        int temp = n;
        n = 2 * n - 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int val = temp - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
