public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        String s = sc.next();
        int a = Character.getNumericValue(s.charAt(0));
        int b = Character.getNumericValue(s.charAt(2));
        System.out.println(a + b);
        }
    }
}
