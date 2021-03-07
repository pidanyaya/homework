public class MainClass {
    public static void main(String[] args) {
        DBUtil dbUtil = new DBUtil();
        UserDao userDao = new UserDao(dbUtil);
        LoginForm loginForm = new LoginForm(userDao, "username", "password");
        loginForm.validate();
    }
}