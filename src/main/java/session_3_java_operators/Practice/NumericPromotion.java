package session_3_java_operators.Practice;

public class NumericPromotion {
    public static void main(String[] args) {
        short e = 12;
        int  f = e + 5;

        long a = 1000000000L;
        // wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE ;

        System.out.println("Max long value ; " + maxLongValue);
        System.out.println("Min long value :" + minLongValue);
        System.out.println("Max int value :" + maxIntValue);


    }
}
