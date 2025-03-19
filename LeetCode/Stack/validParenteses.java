class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            char par = s.charAt(i);
            switch(par){
                case '(': // pass through
                case '{': // pass through
                case '[': 
                    stack.push(par);
                    break;
                case ')':
                    if(stack.isEmpty() || '(' != stack.pop()){
                        return false;
                    }
                    break;
                case '}':
                if(stack.isEmpty() || '{' != stack.pop()){
                        return false;
                    }
                    break;
                case ']':
                if(stack.isEmpty() || '[' != stack.pop()){
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid");

            }
        }
        return stack.isEmpty();
    }
}

//Time  complexity : O(n)
//Space complexity : O(n)
