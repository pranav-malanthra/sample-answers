import java.util.*;

public class MainClass {
    public static void main(String[] args){
        System.out.println(permutations("ABC"));
    }
    public static List<String> permutations(String str){
        List<String> words = new ArrayList<>();
        generatePermutation(str,0,str.length(),words);
        return words;
    }

    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
    public static void generatePermutation(String str, int start, int end, List<String> words)
    {

        if (start == end-1)
            words.add(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                str = swapString(str,start,i);
                generatePermutation(str,start+1,end,words);
                str = swapString(str,start,i);
            }
        }
    }


    public static boolean checkAnagram(String str1, String str2){
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        String aaa = string1.toString();
        if (new String(string1).equals(new String(string2))){
            return true;
        }
        return false;
    }

    public static long factorial(int num){
        long fact = 1;
        int i=1;
        if(num!=0){
            while(i<=num){
                fact*=i;
                i++;
            }
        }
        return fact;
    }

    public static int reversenumber(int number){
        int rev =0;
        int fact;
        while(number>0){
            fact = number%10;
            number = number/10;
            rev = rev*10 + fact;
        }
        return rev;
    }

    public static List<String> fizzBuzz(){
        List<String> result = new ArrayList<>();
        for(int i=1;i<100;i++){
            if(i%3 == 0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i%3 == 0){
                result.add("Fizz");
            }
            else if(i%5 ==0){
                result.add("Buzz");
            }
            else{
                result.add(i+"");
            }
        }
        return result;
    }
}
