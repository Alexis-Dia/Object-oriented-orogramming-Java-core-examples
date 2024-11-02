package by.bntu.fitr.povt.leetcode;

/**
 * Dynamic programming - 62. Unique Paths.
 * https://www.youtube.com/watch?v=GhiRlhPlJ9Q&t=376s
 */
class Test62 {

    public static void main(String[] args) {
        int number = uniquePaths(2, 5);
        System.out.println("number = " + number);
    }

    public static int uniquePaths(int n, int m) {
        return uniquePathsHelper(n, m, new int[n+1][m+1]);
    }

    public static int uniquePathsHelper(int n, int m, int[][] arr) {
        if (n<1 || m<1) {
            return 0;
        }
        if (n==1 || m==1) {
            return 1;
        }
        if (arr[n][m] != 0) {
            return arr[n][m];
        }
        arr[n][m] = uniquePathsHelper(n-1, m, arr) + uniquePathsHelper(n, m-1, arr);
        return arr[n][m];
    }





































}

