import java.lang.Exception;
public class Calculator {
    public static int sumWithoutLine(String str) throws  Exception{   //sum of each deliminated line having no \n
        if(str.length() == 0) return 0;
        String nums[] = str.split(",");
        int sum = 0;
        for(String n : nums) {
            if(n.length() == 0) sum+=0;
            else {
                int val = Integer.parseInt(n);
                if(val < 0) throw new Exception();
                sum += val;
            }
        }
        return sum;
    }
    public static int sumWithLine(String str) throws  Exception{   //sum of each deliminated line having next line character
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
    public static int sum(String str) throws  Exception{  //checks for deliminator
        if(str.length() == 0)return 0;
        if(str.length() > 3 && (str.charAt(0) == '/' && str.charAt(1) == '/')) {
            int sum = 0;
            String del = Character.toString(str.charAt(2));
            String del_line[] = str.substring(3).split(del);
            for(String d : del_line) {
                sum += sumWithLine(d);
            }
            return sum;
        }
        return sumWithLine(str);
    }
    public static void main(String args[]) {
        String inputString = "//'1''-2,3,4\n1,4,2'-2";
        try {
            int res_sum = sum(inputString);
            System.out.println(res_sum);
        }
        catch(Exception e) {
            System.out.println("negatives not allowed");
        }

    }
}