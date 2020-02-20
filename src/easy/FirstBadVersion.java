package easy;

public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static boolean isBadVersion(int version) {
        return version >= 4;
    }

    public static int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left<right) {
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }

        if(left == right && isBadVersion(left)){
            return left;
        }

        return -1;
    }

}
