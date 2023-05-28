public class ExtraCharacters {

    static char extra_Characters(String str1, String str2){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<str1.length();i++)
        {
            int ascii = str1.charAt(i);
            sum1+= ascii;//str1 = "abc"; str2= "abcd";
            System.out.println(sum1);
        }
        for(int j=0;j<str2.length();j++)
        {
            int ascii = str2.charAt(j);
            sum2+= ascii;
            System.out.println(sum2);
        }
        return ((char)(sum2-sum1));
    }


    public static void main(String[] args) {
        String s1= "abc";
        String s2="abcd";
        System.out.println(extra_Characters(s1,s2));
    }
}
