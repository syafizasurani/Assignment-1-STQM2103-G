import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int choice=-1;
        int row1, row2, col1, col2;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("::::::::::: MATRIX CALCULATION :::::::::::\n"
                    + "MENU:\n"
                    + "1. Add Matrix\n"
                    + "2. Subtract Matrix\n"
                    + "3. Multiplication Matrix\n"
                    + "0. EXIT");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Choose your action: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println();
                    System.out.println("-------------MATRIX ADDITION-------------");
                    System.out.print("Enter the number of rows for Matrix-1: ");
                    row1 = sc.nextInt();
                    System.out.print("Enter the number of cols for Matrix-1: ");
                    col1 = sc.nextInt();
                    System.out.print("Enter the number of rows for Matrix-2: ");
                    row2 = sc.nextInt();
                    System.out.print("Enter the number of cols for Matrix-2: ");
                    col2 = sc.nextInt();

                    if(row1 != row2 || col1 != col2){
                        System.out.println();
                        System.out.println("--------------------------------------------------");
                        System.out.println("Matrix addition is not possible. Please try again.");
                        System.out.println("--------------------------------------------------");
                        System.out.println();
                    }
                    else if(row1 == 1 || row2 == 1 || col1 == 1 || col2 == 1){
                        System.out.println();
                        System.out.println("--------------------------------------------------");
                        System.out.println("Matrix addition is not possible. Please try again.");
                        System.out.println("--------------------------------------------------");
                        System.out.println();
                    }
                    else{
                        int matrix1[][] = new int[row1][col1];
                        int matrix2[][] = new int[row2][col2];
                        int add[][] = new int[row1][col1];
                        for(int i=0; i<row1; i++){
                            for(int j=0; j<col1; j++){
                                System.out.print("Enter Matrix-1 ["+i+","+j+"] : ");
                                matrix1[i][j] = sc.nextInt();
                            }
                        }
                        for(int i=0; i<row2; i++){
                            for(int j=0; j<col2; j++){
                                System.out.print("Enter Matrix-2 ["+i+","+j+"] : ");
                                matrix2[i][j] = sc.nextInt();
                            }
                        }
                        for(int i=0; i<row2; i++){
                            for(int j=0; j<col2; j++){
                                add[i][j] = matrix1[i][j] + matrix2[i][j];
                            }
                        }
                        //summary
                        System.out.println();
                        System.out.println("Matrix-1"+"\t"+"+"+"\t"+"Matrix-2"+"\t"+"="+"\t"+"Answer:");
                        for(int i=0; i<row1; i++){
                            for(int j=0; j<col1; j++){
                                System.out.print(matrix1[i][j]+" ");
                            }
                            System.out.print("\t"+"\t"+"\t");
                            for(int j=0; j<col1; j++){
                                System.out.print(matrix2[i][j]+" ");
                            }
                            System.out.print("\t"+"\t"+"\t");
                            for(int j=0; j<col1; j++){
                                System.out.print(add[i][j]+" ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("------------MATRIX SUBTRACTION------------");
                    System.out.print("Enter the number of rows for Matrix-1: ");
                    row1 = sc.nextInt();
                    System.out.print("Enter the number of cols for Matrix-1: ");
                    col1 = sc.nextInt();
                    System.out.print("Enter the number of rows for Matrix-2: ");
                    row2 = sc.nextInt();
                    System.out.print("Enter the number of cols for Matrix-2: ");
                    col2 = sc.nextInt();

                    if(row1 != row2 || col1 != col2){
                        System.out.println();
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Matrix subtraction is not possible. Please try again.");
                        System.out.println("-----------------------------------------------------");
                        System.out.println();
                    }
                    else if(row1 == 1 || row2 == 1 || col1 == 1 || col2 == 1){
                        System.out.println();
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Matrix subtraction is not possible. Please try again.");
                        System.out.println("-----------------------------------------------------");
                        System.out.println();
                    }
                    else{
                        int matrix1[][] = new int[row1][col1];
                        int matrix2[][] = new int[row2][col2];
                        int sub[][] = new int[row1][col1];
                        for(int i=0; i<row1; i++){
                            for(int j=0; j<col1; j++){
                                System.out.print("Enter Matrix-1 ["+i+","+j+"] : ");
                                matrix1[i][j] = sc.nextInt();
                            }
                        }
                        for(int i=0; i<row2; i++){
                            for(int j=0; j<col2; j++){
                                System.out.print("Enter Matrix-2 ["+i+","+j+"] : ");
                                matrix2[i][j] = sc.nextInt();
                            }
                        }
                        for(int i=0; i<row2; i++){
                            for(int j=0; j<col2; j++){
                                sub[i][j] = matrix1[i][j] - matrix2[i][j];
                            }
                        }
                        //summary
                        System.out.println();
                        System.out.println("Matrix-1"+"\t"+"-"+"\t"+"Matrix-2"+"\t"+"="+"\t"+"Answer:");
                        for(int i=0; i<row1; i++){
                            for(int j=0; j<col1; j++){
                                System.out.print(matrix1[i][j]+" ");
                            }
                            System.out.print("\t"+"\t"+"\t");
                            for(int j=0; j<col1; j++){
                                System.out.print(matrix2[i][j]+" ");
                            }
                            System.out.print("\t"+"\t"+"\t");
                            for(int j=0; j<col1; j++){
                                System.out.print(sub[i][j]+" ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("-----------MATRIX MULTIPLICATION-----------");
                    System.out.print("Enter the number of rows for Matrix-1: ");
                    row1 = sc.nextInt();
                    System.out.print("Enter the number of cols for Matrix-1: ");
                    col1 = sc.nextInt();
                    System.out.print("Enter the number of rows for Matrix-2: ");
                    row2 = sc.nextInt();
                    System.out.print("Enter the number of cols for Matrix-2: ");
                    col2 = sc.nextInt();

                    if(col1 != row2){
                        System.out.println();
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Matrix multiplication is not possible. Please try again.");
                        System.out.println("--------------------------------------------------------");
                        System.out.println();
                    }
                    else if(row1 == 1 || row2 == 1 || col1 == 1 || col2 == 1){
                        System.out.println();
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Matrix multiplication is not possible. Please try again.");
                        System.out.println("--------------------------------------------------------");
                        System.out.println();
                    }
                    else{
                        int matrix1[][] = new int[row1][col1];
                        int matrix2[][] = new int[row2][col2];
                        int multi[][] = new int[row1][col2];
                        for(int i=0; i<row1; i++){
                            for(int j=0; j<col1; j++){
                                System.out.print("Enter Matrix-1 ["+i+","+j+"] : ");
                                matrix1[i][j] = sc.nextInt();
                            }
                        }
                        for(int i=0; i<row2; i++){
                            for(int j=0; j<col2; j++){
                                System.out.print("Enter Matrix-2 ["+i+","+j+"] : ");
                                matrix2[i][j] = sc.nextInt();
                            }
                        }
                        for(int i=0; i<row1; i++){
                            for(int j=0; j<col2; j++){
                                for(int k=0; k<col1; k++) {
                                    multi[i][j] += matrix1[i][k] * matrix2[k][j];
                                }
                            }
                        }
                        //summary
                        System.out.println();
                        System.out.println("Matrix-1:");
                        for(int i=0; i<row1; i++) {
                            for (int j = 0; j < col1; j++) {
                                System.out.print(matrix1[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("Matrix-2:");
                        for(int i=0; i<row2; i++) {
                            for (int j = 0; j < col2; j++) {
                                System.out.print(matrix2[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("Answer:");
                        for(int i=0; i<row1; i++) {
                            for (int j = 0; j < col2; j++) {
                                System.out.print(multi[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Thankyou, see you again!");
                    break;
            }
        }while (choice != 0);
    }
}
