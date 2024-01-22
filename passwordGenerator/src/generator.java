import java.util.Random;
public class generator {
    Random rand = new Random();

    public String Passwordgenerator(int n) {

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxy!@#$%^&*()_+{}[]|?/.,><-~`0123456789";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(upper.charAt(rand.nextInt(upper.length())));

        }
        String pwd = sb.toString();
        return pwd;
    }
}