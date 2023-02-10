class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<Integer>();
        for (String a : tokens) {
            if (!(a.equals("+") || a.equals("*") || a.equals("-") || a.equals("/"))) {
                st.push(Integer.parseInt(a));
            } else {
                int x = st.pop();
                int y = st.pop();
                switch (a) {
                    case "+" -> st.push(add(y, x));
                    case "-" -> st.push(sub(y, x));
                    case "*" -> st.push(mul(y, x));
                    default -> st.push(div(y, x));
                }
            }
        }
        return st.pop();
    }
    public static int add(int a,int b){return a+b;}
    public static int sub(int a,int b){return a-b;}
    public static int mul(int a,int b){return a*b;}
    public static int div(int a,int b){return a/b;}
}