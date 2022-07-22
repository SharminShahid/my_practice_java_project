package loops;

public class WhileLoop {
    //Loops can execute a block of code as long as a specified condition is reached.
    //Loops are useful because it saves time, reduce error and make the codes more readable.

    public static void main(String[] args){
        //while loop:check the condition then execute the code.
        //Question: Print Numbers from 0 to 50
        int i = 0;
        while(i<=50){
            System.out.println(i);
            i++;
        }
        //practice: print 1 to 20
        int a = 1; // Initialization
        while(a<= 20){ //condition
            System.out.println(a);
            a = a+1; // Incremental or decremental part can be written in this way too.
                     // This part is very important in while loop.

            //Disadvantage of while loop: It will become infinite loop if we don't mention the incremental or decremental part.
        }


    }
}
