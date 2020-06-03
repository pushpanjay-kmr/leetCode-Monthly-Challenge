package com.hashinclude.june.twenty.three;

import java.util.Arrays;

/**
 * @author pushpanjay.kumar created on 3/6/20
 */
public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b)->{
            int t1 = a[1] - a[0];
            int t2 = b[1] - b[0];
            return t2-t1;
        });

        int i=0;
        int n = costs.length;
        int cost =0;
        for(;i<n/2;i++){
            cost+=costs[i][0];
        }
        for(;i<n;i++){
            cost+=costs[i][1];
        }
        return cost;
    }
}
