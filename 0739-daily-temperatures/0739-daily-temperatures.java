class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int i=1;
        while(i<temp.length){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                int num = st.pop();
                arr[num] = i-num;
            }
            st.push(i);
            i++;
        }
        while(!st.isEmpty()){
            arr[st.pop()] = 0;
        }
        return arr;
    }
}