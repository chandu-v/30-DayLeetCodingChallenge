package MayLeetCode.Week1;

public class Day4Compliement {
    public static void main(String[] args) {
        Day4Compliement obj = new Day4Compliement();
        int num = 5;
        int result = obj.findComplement(num);
        System.out.println(result);
    }

    private int findComplement(int num) {

            int i = num;
            String s = getBinaryValue(i);
            String c = getComplString(s);
            int d = getNumberFromBinary(c);
            int k = getNumberFromBinary(s);
            System.out.println(String.format("%d\t%d\t%s\t%s\t%d", i,k,s,c,d));
        return k;
    }

    private int getNumberFromBinary(String c) {
        int p = 0 ;
        int result = 0;
        int j = 0 ;
        for(int i = c.length()-1 ; i>=0 ; i--){
            if(c.charAt(i) == '1'){
                result += Math.pow(2, j);
            }
            j++;
        }
        return result;
    }

    private String getBinaryValue(int i) {
        String s = "";
        while (i != 0) {
            if (i % 2 == 0) {
                s = 0 + s;
            } else {
                s = 1 + s;
            }
            i = i / 2;
        }
        return s;
    }

    private String getComplString(String s){
        String result = "";
        for(char c : s.toCharArray()){
            if(c == '0'){
                result+='1';
            }else{
                result+='0';
            }
        }
        return result;
    }
}