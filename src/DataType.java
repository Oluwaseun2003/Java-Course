public class DataType {
    public static void main(String[] args)  {
        //DATA TYPES IN JAVA

        //1. STRINGS
        String fName = "Oluwaseun";
        String lName = "Oluwafemi";
        String fullName = fName + ' ' + lName;
        System.out.println(fullName);


        //NUMBER DATA TYPES
        //2. INT
        int i = 25;
        int o = 35;
        int p = 28;
        int w = 32;
        int all = i + o + p + w;
        System.out.println(all);


        //3. SHORT
        short num1 = -25;
        short num2 = -25;
        short num3 = 100;
        int sum = num1 + num2 + num3;
        short allNum = (short) sum;
        System.out.println(allNum);

        //3. LONG
        long myNum1 = 15000000L;
        long myNum2 = 14384002L;
        long allSum = myNum1 + myNum2;
        if(myNum2 > myNum1){
            System.out.println(allSum);
        }

        // FLOAT TYPES

        //4. FLOAT
        float you = 12.99f;
        float me = 12.01f;
        float youMe = you + me;
        System.out.println(youMe);

        //5. Double
        double You = 12.9999999d;
        double Me = 12.01111111d;
        double YouMe = You + Me;
        System.out.println(YouMe);

        //6. BOOLEAN
        boolean isFemiABoy = true;
        boolean isFemiShort = false;
        System.out.println(isFemiABoy);
        System.out.println(isFemiShort);

        //CHARACTER
        char firstLetter = 'D';
        char secondLetter = 'M';
        System.out.println(firstLetter + secondLetter);

    }
}
