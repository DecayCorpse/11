package dz11_task2;

import org.w3c.dom.ls.LSOutput;

public class SignUp {
    private String login;
    private String pasword;
    private String confirmPasword;


    public SignUp(String login, String pasword, String confirmPasword) {

        this.login = login;

        this.pasword = pasword;

        this.confirmPasword = confirmPasword;
    }


    public static SignUp getInstance(String login, String pasword, String confirmPasword) throws Exception {

        if (login.length() > 20) {
            throw new Exception("WrongLoginExeption покороче свой логин сделай, а то он меня не впечатляет");
        }
        if (login.contains(" ")) {
            throw new Exception("WrongLoginExeption пробел убери, а то он меня не впечатляет");
        }
        if (pasword.length() > 20) {
            throw new Exception("WrongPasswordExeption покороче свой пароль сделай, а то он меня не впечатляет");
        }
        if (pasword.contains(" ")) {
            throw new Exception("WrongPasswordExeption пробел убери из пароля, а то он меня не впечатляет");
        }
//        if (pasword.contains("[0-9]")) {
//
//        } else {
//            throw new Exception("WrongPasswordExeption цифру поставь в пароль, а то ее отвутствие меня не впечатляет");
//        }
        if(confirmPasword != pasword){
            throw new Exception("WrongConfirmPaswordExeption чёт пароли у тебя не совпадают... меня это не впечатляет");
        }


        return null;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getConfirmPasword() {
        return confirmPasword;
    }

    public void setConfirmPasword(String confirmPasword) {
        this.confirmPasword = confirmPasword;
    }


}
