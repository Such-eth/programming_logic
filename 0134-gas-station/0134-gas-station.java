class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totGas=0;
        int totCost=0;
        int ans = 0;
        int remainingGas=0;
        for(int i=0;i<gas.length;i++){
            remainingGas+=gas[i]-cost[i];
            if(remainingGas<0){
                ans = i+1;
                remainingGas=0;
            }
            totGas+=gas[i];
            totCost+=cost[i];
        }
        if(totCost>totGas)
            return -1;
        return ans;
    }
}