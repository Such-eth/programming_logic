import java.util.Stack;  
class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='(' || a=='{' || a=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){return false;}
                char b=stack.pop();
                if(a=='}'&&b!='{' || a==']'&&b!='[' || a==')'&&b!='('){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}