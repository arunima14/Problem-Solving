class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        for(int i=0; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost)
            return -1;

        int start = 0, gasRemaining = 0;
        for(int i=0; i<gas.length; i++){
            gasRemaining += (gas[i]-cost[i]);

            if(gasRemaining < 0){
                start = i+1;
                gasRemaining = 0;
            }
        }

        return start;
    }
}