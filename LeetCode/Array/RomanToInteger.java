class Solution {

    private final String[][] SYMBOLS = new String[][]{
        {"I","1"},{"V","5"},{"X","10"},{"L","50"},{"C","100"},{"D","500"},{"M","1000"}
    };

    private int getSymbolValue(char symbol){
        for(String[] row:SYMBOLS){
            //To convert char into String -> (symbol + "")
            if(row[0].equals(symbol  + "")){
                return Integer.parseInt(row[1]);
            }
        }
        return 0;
    } 

    public int romanToInt(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            int currValue = getSymbolValue(current);

            //Checking whether the next value exist or not
            if(i + 1 < s.length()){
                char next = s.charAt(i+1);
                int nextValue = getSymbolValue(next);
                //Checking wheather the next value is less than the current value
                //If Yes then we simply add to the result
                //Example VI -> 5 + 1 = 6
                if(nextValue <= currValue){
                    result += currValue;
                }
                //If next value is large than the current value then we subtract it
                //Example IV -> 5 - 1 = 4
                else{
                    result += (nextValue - currValue);
                    i++;
                }
            }
            //If there is no next value we simply add current value to result
            else{
                result += currValue;
            }
        }
        return result;
    }
}

//Space complexity = constant
//Time complexity  = O(n)
