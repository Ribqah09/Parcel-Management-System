package smartparcelmanagement;

import java.util.LinkedList;
import java.util.List;

public class AuthenticationSystem {
    
    private static class Credential {
        String username;
        String password;

        Credential(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
    private final List<Credential> adminCredentials = new LinkedList<>();
    public AuthenticationSystem() {
        adminCredentials.add(new Credential("admin", "admin123"));
    }

    private boolean isValid(List<Credential> credentials, String username, String password) {
        for (Credential cred : credentials) {
            if (cred.username.equals(username) && cred.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
    public boolean isValidAdmin(String username, String password) {
        return isValid(adminCredentials, username, password);
    }
}

