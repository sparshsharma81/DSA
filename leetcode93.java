public class leetcode93{
   
    static List<String>answer;
    private static void work(String s, int count, String an){

        //now we gonna check the base 
        if(s.length() == 0 && count == 4){
            //now we got our answer 
            answer.add(an.substring(0,an.length()-1));
            return;
        }
        if(count >4)return;

        if(s.length() == 0)return;

        //first we take the first characters...
          String s1 = "";


          if(s.length() >=1){            
                        s1+= s.charAt(0);
                        work(s.substring(1),count+1,an+s1+".");
         }

        //now we gonna take character 2
       if(s.length() >=2){

                        if(s.charAt(0) == '0')return;
                        s1+=s.charAt(1);
                        work(s.substring(2),count+1,an+s1+".");
       }

       if(s.length() >=3){
        //now we gonna take third
                        s1+= s.charAt(2);
                        if(Integer.parseInt(s1)<=255){
                        work(s.substring(3),count+1,an+s1+".");
                        }
       }

               
    }
    public List<String> restoreIpAddresses(String s) {
        //let us try 

        if(s.length() <4 || s.length() >12)return new ArrayList<>();
        int count =0;

        answer = new ArrayList<>();
        work(s,0,"");

        return answer;

    
}
public static void main(String args[]){
    leetcode93 l = new leetcode93();
    System.out.println(l.restoreIpAddresses("25525511135"));
}

}
