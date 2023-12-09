public class MyInteger {
    private static int value = 14;
    private int value2 = 0;
    MyInteger(){
    }

    MyInteger(int newValue){
        value = newValue;
        value2 = newValue;
    }

    public static int getValue(){
        return value;
    }

    public static boolean isEven(){
        if(value % 2 == 0) return true;
        else return false;
    }
    public static boolean isEven(int x){
        if(x % 2 == 0) return true;
        else return false;
    }

    public static boolean isOdd(){
        if(value % 2 == 0) return false;
        else return true;
    }
    public static boolean isOdd(int y){
        if(y % 2 == 0) return false;
        else return true;
    }

    public static boolean isPrime(){
        boolean is = true;
        for(int i = 2; i < value / 2; i++){
            if(value % i == 0){
                is = false;
                break;
            }
        }
        if(is == false && value != 2) return false;
        else return true;
    }
    public static boolean isPrime(int z){
        boolean is = true;
        for(int i = 2; i < z / 2; i++){
            if(z % i == 0){
                is = false;
                break;
            }
        }
        if(is == false && z != 2) return false;
        else return true;
    }

    public boolean equals(int p){
        if(p == value2) return true;
        else return false;
    }
    public boolean equals(MyInteger q){
        if(q.getValue() == value2) return true;
        else return false;
    }

    public static void parseInt(char[] aChar){
        int[] aInt = new int[aChar.length];

        for(int i = 0; i < aChar.length; i++){
            aInt[i] = aChar[i] - '0';
            System.out.print(aInt[i] + " ");
        }
        System.out.println();
    }

    public static void parseInt(String aString){
        int[] aInt2 = new int[aString.length()];

        for(int i = 0; i < aString.length(); i++){
            aInt2[i] = Integer.valueOf(aString.charAt(i));
            System.out.print(aInt2[i] + " ");
        }
        System.out.println();
    }

}
