public class find_index_of_first_occurence{
    class Solution {
    public int strStr(String haystack, String needle) {
        
        // for(int i=0,j =needle.length();j<=needle.length();j++;i++){
        //     if(haystack.substring(i,j).equals(needle)){
        //         return i;
        //     }
        // }
        int j =needle.length();
        for(int i=0;i<haystack.length()-j+1;i++){
            
                if(haystack.substring(i,j+i).equals(needle)){
                    return i;
                }
            
        }
        return -1;
        
    }
}
    public static void main(String args[]){

    }
}