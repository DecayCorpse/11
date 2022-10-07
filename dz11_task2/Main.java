package dz11_task2;

public class Main {
    public static void main(String[] args) {
        SignUp user;
        try {
            user =  SignUp.getInstance("fdbnddsfhdывирывиh","9a9sы1виыиыиfa1fgb","9a9sы1виыиыиfa1fgb");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
