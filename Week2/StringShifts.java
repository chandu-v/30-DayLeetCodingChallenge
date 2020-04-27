package Week2;

public class StringShifts {

    public static void main(String[] args) {
        String s = "abc";
        int [][] shift = new int[][]{{0,1},{1,2}};

        stringShift(s,shift);
    }

    private static String stringShift(String s, int[][] shift) {
    String result = s;
    for(int i = 0 ; i < shift.length ; i++){
        int direction = shift[i][0];
        int amount = shift[i][1];
        result = moveIt(direction,amount,result);
    }
    return result;
    }

    private static String moveIt(int direction, int amount, String result) {
        String s = "";
        switch(direction){
            case 0:
                s+=result.substring(result.length()-amount-1, result.length());
                s+=result.substring(0, amount);
            break;
            case 1:
            s+=result.substring(result.length()-amount, result.length());
            s = s+result.replace(s, "") ;  
            break;
        }
        System.out.println(s);
        return s;
    }

}