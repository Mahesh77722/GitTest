import java.util.Scanner;

public class StarDiamonadPattern {
// It's want work on even number like 4,6,8,10,12 etc
/*
           
    j   |   1 2 3 4 5 6 7
  ------|------------------------
   i=1  |        *
   i=2  |      * * *
   i=3  |    * * * * *
   i=4  |  * * * * * * *
   i=5  |    * * * * *
   i=6  |      * * *
   i=7  |        *
*/
    public static void main(String[] args) {
        System.out.println("Enter Number of Row:");
        Scanner sc= new Scanner(System.in);//for Input
        int size= sc.nextInt();//Size of row
        int i,o;
        int numberColumn = 1;//It's for horizontal triangle shape
        int space= size / 2;//It's will space between the triangle and it look like diamond || --->Space is 3<---
        for(i=1;i<=size;i++){
            for(o=1;o<=space;o++){//spacing for diamond that loop at the start
                System.out.print(" ");
            }
            if(i<(size/2+1)){//if condition will check that size is half
                space--;//3-1=2 space got at left side of column it look like vertical triangle
            }
            else {
                space++;//after the half part increase the space look like reverse vertical triangle
            }
            for(o=1;o<=numberColumn;o++){//this loop for printing the number
                System.out.print("*");//printing Star
            }
			//IT is for getting Diamond look 
            if(i<(size/2+1)) {//Smaller then half of size it will pluse 2
                numberColumn = numberColumn + 2;
            }else{//it will decrease after half of size to bring Diamond Shape
                numberColumn = numberColumn - 2;
            }
            System.out.println();
        }
    }
}