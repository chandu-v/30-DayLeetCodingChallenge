package MayLeetCode.Week1;

import java.math.BigInteger;

public class Day1FirstBad {

    public static void main(String[] args) {

        System.out.println(firstBadVersion(2126753390));
    }

    public static boolean isBadVersion(int i) {
        if (i >= 1702766719) {
            return true;
        } else {
            return false;
        }
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = (start + end) / 2;
        if (!isBadVersion(end - 1)) {
            return end;
        }
        // Go Forward
        // Go Backward
        // System.out.println(whereDoIGo(start, mid, end));
        int result = whereDoIGo(start, mid, end);
        return result;
    }

    private static int whereDoIGo(int start, int mid, int end) {
        boolean startResult = isBadVersion(start);
        boolean endResult = isBadVersion(end);
        boolean midResult = isBadVersion(mid);
        if (!isBadVersion(end - 1)) {
            return end;
        }
        if (start == mid) {
            if (isBadVersion(start)) {
                return start;
            } else {
                return end;
            }
        }
        // if midResult is a bad version then all it's next versions will also be bad.
        if (midResult) {
            // if the preceeding version is also bad version then we have to move to the 1st
            // half.
            // else return the mid value.
            if (!isBadVersion(mid - 1)) {
                return mid;
            }
            // If before is true then we should check for the 1st half
            else {
                end = mid;
                BigInteger startBig = new BigInteger(start + "");
                BigInteger endBig = new BigInteger(end + "");
                mid = (startBig.add(endBig)).divide(new BigInteger(2+"")).intValue();
                return whereDoIGo(start, mid, end);
            }
        }
        // We have to move forward in this case until we get out midResult true.
        else {
            start = mid;
            BigInteger startBig = new BigInteger(start + "");
            BigInteger endBig = new BigInteger(end + "");
            mid = (startBig.add(endBig).divide(new BigInteger("" + 2)).intValue());

            return whereDoIGo(start, mid, end);
        }
    }
}