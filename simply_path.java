public class simply_path{
    public String simplifyPath(String path) {
        Stack<String>st = new Stack<>();
        String[]dr = path.split("/");
        for(String s : dr){
            if(s.equals(".") || s.isEmpty())continue;
            if(s.equals("..")){
                if(!st.isEmpty())st.pop();
                
            }
            else st.push(s);

        }
        return "/" + String.join("/",st);
    }

}