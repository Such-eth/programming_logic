class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullBottles = numBottles, emptyBottles = 0, totalDrunk = 0;
        while(fullBottles>=numExchange){
            fullBottles=fullBottles-numExchange+1;
            numExchange++;
            totalDrunk++;
        }
        return totalDrunk+numBottles;
    }
}