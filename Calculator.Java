public class Calculator {
    public static int sum(String str) {
        if(str.length() == 0) return 0;
        String nums[] = str.split(",");
        int sum = 0;
        for(String n : nums) {
            if(n.length() == 0) sum+=0;
            else sum += Integer.parseInt(n);
        }
        return sum;
    }
    public static void main(String args[]) {
        String inputString = "1,2,,666,6";  //handle an unknown amount of numbers
        int res_sum = sum(inputString);
        System.out.println(res_sum);
    }
}