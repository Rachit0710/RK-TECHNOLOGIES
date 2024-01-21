import java.util.Random;
public class generator {
    Random rand = new Random();

    public String Passwordgenerator(int n) {


//       Scanner scan = new Scanner(System.in);
//       System.out.println("Enter the Length of Password to be generated:");
//       int n = scan.nextInt();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxy!@#$%^&*()_+{}[]|?/.,><-~`0123456789";
//        String lower = "abcdefghijklmnopqrstuvwxy";
//        String number = "0123456789";
//        String special = "!@#$%^&*()_+{}[]|?/.,><-~`";



        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(upper.charAt(rand.nextInt(upper.length())));
//            sb.append(upper.charAt(rand.nextInt(lower.length())));
//            sb.append(upper.charAt(rand.nextInt(special.length())));
//            sb.append(upper.charAt(rand.nextInt(number.length())));

        }
        String pwd = sb.toString();
        return pwd;
    }
}