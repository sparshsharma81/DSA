public class smallest_palindrome_rearrangement{
    public String smallestPalindrome(String s) {
        
        
        //step1 -- to hame de rakha hai ki string palidrome hai..
        
        //aur hame use lexiographically(alphabetically) smallest palindrome string return karni hai
        //so phele hamari approach hogi har leeter ko count karna
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        StringBuilder firsthalf = new StringBuilder();
        String mid = "";
        
        //now building the first half in lexiographical order
        //to ham traverse kar rahe hai 26 words ki length par
        for(int i=0;i<26;i++){
            if(count[i]%2 == 1){
                mid = String.valueOf((char)(i + 'a'));
            }
            for(int j=0;j<count[i]/2;j++){
                //ab ham half characters ko first half me append kar rahe hai;
                firsthalf.append((char)(i + 'a'));
            }
        }
        
        //ab basic logic ye hoga lexiographical string ke liye ki first half ka reverse hoga second half
        //and we are excluding the mid strings;
        String secondhalf = new StringBuilder(firsthalf).reverse().toString();
        return firsthalf + mid + secondhalf;
        
    }

}