package appLayer;

import dataLayer.DbUser;

public class User {

    public boolean isValidUserCredential(String username, String password) {

        DbUser dbUser = new DbUser();

        return dbUser.isValidUserLogin(username, password);
    }
}