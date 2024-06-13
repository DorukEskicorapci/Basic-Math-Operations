import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;


public class userinput{

    //AscendingOrdering
    static void AscendingOrdering(int array[]){

        int small = 0;


        for(int i = 0; i < array.length;i++){
            for(int j = i + 1; j < array.length;j++){
                if(array[i] > array[j]){
                    small = array[i];
                    array[i] = array[j];
                    array[j] = small;
                }
            }
        }

        for(int i = 0; i < array.length;i++){

           System.out.print(array[i] + " ");

        }

    }

    //DescendingOrdering
    static void DescendingOrdering(int array[]){
        int biggernumber = 0;



        for(int i = 0; i < array.length;i++){
            for(int j = i + 1; j < array.length;j++){
                if(array[i] < array[j]){
                    biggernumber = array[i];
                    array[i] = array[j];
                    array[j] = biggernumber;
                }
            }
        }


        for(int i = 0; i < array.length;i++){

           System.out.print(array[i] + " ");

        }
    }


    //Average
    static void Average(int count, int array[]){

        double sum = 0;

        for(int i = 0; i< count; i++){
            sum += array[i];
        }

        double ave = sum/count;
        System.out.println(ave);

    }


    static void PrimeNumbers(int array[]){

        // int temp[] = new int[100];
        // int k = 0;
        for(int i = 0; i < array.length; i++){
            int durum = 0;
            if(array[i] <= 1){
                //empty
            } else

                for (int j = 2; j < array[i]; j++){
                    if (array[i] % j == 0){
                        durum = 1;
                    }
                }
                if(durum==0)
                {
                    System.out.print(array[i]+ " ");
                }
        }


        // for(int i = 0; i < temp.length;i++){

        //     if(temp[i] != 0){
        //         System.out.print(temp[i] + " ");
        //     }
        // }

    }

    static void EvenNumbers(int array[]){

        int zero = 0;
        
        Stack<Integer> stk= new Stack<>();
        Stack<Integer> stkreverse= new Stack<>();

        for(int i = 0; i < array.length;i++){

            if(array[i] == 1 && array[i] == -1){
                //empty
            }else if(array[i] == 0){
                stk.push(zero);
            }else if (array[i] % 2 == 0){

                stk.push(array[i]);

            }
        }

        
        // System.out.println("Elements in Stack: " + stk);

        Iterator<Integer> iterator = stk.iterator();
        Iterator<Integer> iterator2 = stkreverse.iterator();

        while(iterator.hasNext()) {
            stkreverse.push(stk.pop());
        }
        while(iterator2.hasNext()) {
            System.out.print(stkreverse.pop() + " ");
        }
    }



    static void OddNumbers(int array[]){
        int temp[] = new int[array.length];
        int k = 0;

        for(int i = 0; i < array.length;i++){

            if(array[i] == 0){
                //empty
            }else if (array[i] % 2 != 0){
                temp[k] = array[i];
                k++;
            }
        }

        for(int i = 0; i < temp.length;i++){
            if(temp[i] != 0){
                System.out.print(temp[i] + " ");
            }
         }
    }



    //runs the program
    static void driver(){
        Scanner myObj = new Scanner(System.in);
        System.out.println();

        // Asks the count of the number
        System.out.print("How many numbers?: ");
        int count = myObj.nextInt();



        // Asks the required numbers
        int[] array = new int[count];
        for(int i = 0; i< count; i++){
            System.out.println();
            System.out.print((i +1) + ". rakami gir: ");
            int temp = myObj.nextInt();
            array[i] = temp;
        }

        //Learns the calculation
        System.out.println();
        System.out.println("------------------");
        System.out.println("1. Ascending Order");
        System.out.println("2. Descending Order");
        System.out.println("3. Average");
        System.out.println("4. Prime Numbers");
        System.out.println("5. Even Numbers");
        System.out.println("6. Odd Numbers");
        System.out.println();
        System.out.println("7. Try Again");
        System.out.println();

        System.out.print("Which operation would you like to use?: ");

        int methodcall = myObj.nextInt();


        // calls the proper method


        if(methodcall==1){
            System.out.print("Result: ");
            AscendingOrdering(array);

        }else if (methodcall == 2){
            System.out.print("Result: ");
            DescendingOrdering(array);

        }else if(methodcall == 3){
            System.out.print("Result: ");
            Average(count, array);

        }else if(methodcall == 4){
            System.out.print("Result: ");
            PrimeNumbers(array);

        }else if(methodcall == 5){
            System.out.print("Result: ");
            EvenNumbers(array);

        }else if(methodcall == 6){
            System.out.print("Result: ");
            OddNumbers(array);

        } else if(methodcall == 7){
            driver();
        }else{
            System.out.println("ERROR");
        }
    }

    static void driver2(){
        driver();

        Scanner myObj = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("1. Yes");
        System.out.println("2. No");

        System.out.print("Would you like to try again?: ");
        int check = myObj.nextInt();

        if (check == 1){
            System.out.println("========================");
            driver2();
        }
    }


    public static void main(String[] args) {
         driver2();
    }
}