class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] maxEnergyFromTheindex = new int[energy.length];
        int maxEnergy = Integer.MIN_VALUE;;
        for(int i=energy.length-1;i>=0;i--){
            maxEnergyFromTheindex[i] = energy[i]+(i+k<energy.length?maxEnergyFromTheindex[i+k]:0);
            maxEnergy = Math.max(maxEnergy,maxEnergyFromTheindex[i]);
        }
        return maxEnergy;
    }
}