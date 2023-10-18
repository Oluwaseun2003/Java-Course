public class Casting   {
    public static void main(String [] args) {
        //WIDENING CASTING
        int mynum = 25;
        double myDoub = mynum;
        System.out.println(mynum);
        System.out.println(myDoub);

        //NARROWING CASTING
        double doub = 10.78d;
        int mainInt = (int) doub;
        System.out.println(doub); //Prints 10.78
        System.out.println(mainInt); //PRINTS 10 because int is used to store integers

    }
}
