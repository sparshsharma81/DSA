public class print_all_substrings {
    public static String print(String s, String up){
        if(up.length() == 0)System.out.println(s);
        char ch = up.charAt(0);
        print(s+ch ,up.substring(1))
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Strint str = sc.nextLine();
        ArrayList<String>sub = new ArrayList<>();
        sub = print(sub,"",str);
    }
    
}
