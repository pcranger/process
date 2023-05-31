package java_lang.thebrownbox._2Darray;

import java.util.ArrayList;

/**
 * @author hieutm
 * 5/29/2023
 * 11:24 AM
 */
public class _1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int richest = 0;
        for(int i = 0; i< m; i++){
            int wealth = 0;
            for(int j = 0; i< n; i++){
                wealth += accounts[i][j];
            }
            if(wealth > richest) richest = wealth;
        }
        return richest;
    }

}
