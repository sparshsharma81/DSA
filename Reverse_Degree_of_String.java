public class Reverse_Degree_of_String{
    public int reverseDegree(String s) {
        int sum =0;
       for(int i=0;i<s.length();i++){
        sum+= ((26 - ((int)s.charAt(i) - 97))) * (i+1);
        // System.out.println(sum);
       }
       return sum;
}
}