public class Calculator {
    public static int sumWithoutLine(String str) {
        if(str.length() == 0) return 0;   //sum of each line seprated by comma
        String nums[] = str.split(",");
        int sum = 0;
        for(String n : nums) {
            if(n.length() == 0) sum+=0;
            else sum += Integer.parseInt(n);
        }
        return sum;
    }
    public static int sum(String str) {   //take raw string ans split a/c to newLine
       if(str.length() == 0) return 0;
       String next = "\n";
       if(str.contains(next)) {
           int sum = 0;
           String line[] = str.split(next);
           for(String l : line) {
               sum += sumWithoutLine(l);
           }
           return sum;
       }
       return sumWithoutLine(str);
    }
    public static void main(String args[]) {
        String inputString = "1\n2,,3";
        int res_sum = sum(inputString);
        System.out.println(res_sum);
    }
}