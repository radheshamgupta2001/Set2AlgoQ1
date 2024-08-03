public class Set2_AlgoQ5 {

    public static void main(String[] args) {
        String s = "abcabcdabc";
        System.out.println(maxOperations(s)); 
    }

    public static int maxOperations(String s) {
        int operations = 0;
        while (!s.isEmpty()) {
            int len = s.length();
            boolean found = false;

            
            for (int i = 1; i <= len / 2; i++) {
                if (s.substring(0, i).equals(s.substring(i, 2 * i))) {
                    
                    s = s.substring(i);
                    operations++;
                    found = true;
                    break;
                }
            }
           
            if (!found) {
               
                operations++;
                break;
            }
        }
        return operations;
    }
}
