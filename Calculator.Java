public class Calculator {
    public static int sum(String str) {
        if(str.length() == 0) return 0;
        String nums[] = str.split(",");
        int sum = 0;
        for(String n : nums)
            sum += Integer.parseInt(n);
        return sum;
    }
    public static void main(String args[]) {
        String inputString = "1,2";
        int res_sum = sum(inputString);
        System.out.println(res_sum);
    }
}