
public class Credentials {

    private String _username;
    private String _password;

    private int _oldPasswordCounter;
    private String[] _oldPasswords;

    public Credentials(String username, String password) {
        this._username = username;
        this._password = password;
        _oldPasswordCounter = 0;
        _oldPasswords = new String[100];
    }

    public String getUsername() {
        return _username;
    }

    public boolean matchPassword(String password) {
        return _password.equals(password);
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (!matchPassword(oldPassword)) {
            return false;
        }
        if (matchPassword(newPassword)) {
            return false;
        }
        for (int i = 0; i < _oldPasswordCounter; i++) {
            if (_oldPasswords[i].equals(newPassword)) {
                return false;
            }
        }
        _oldPasswords[_oldPasswordCounter++] = _password;
        _password = newPassword;
        return true;
    }
}
