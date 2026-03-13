//leetcode -- 17. Letter Combinations of a Phone Number 
import java.util.*;
// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent based on the mapping of digits to letters on a phone keypad. The mapping is as follows:
// 2: "abc"
public class letter_combination{
    public class LetterCombinations {
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            if(digits.length() == 0) return ans;
            String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            backtrack(ans, digits, "", 0, mapping);
            return ans;
        }
        public void backtrack(List<String> ans, String digits, String current, int index, String[] mapping){
            if(index == digits.length()){
                ans.add(current);
                return;
            }
            String letters = mapping[digits.charAt(index) - '0'];
            for(int i=0;i<letters.length();i++){
                backtrack(ans, digits, current + letters.charAt(i), index + 1, mapping);
            }
        }
    }
    public static void main(String args[]){
        String digit = "23";
        System.out.println(new LetterCombinations().letterCombinations(digit));
    }
}