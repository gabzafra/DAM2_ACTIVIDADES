package hashmap;

public class UserData {

  private String pass;
  private boolean logged;
  private int tries;


  public UserData() {
    this("");
  }

  public UserData(String pass) {
    this.pass = pass;
    logged = false;
    this.tries = 0;
  }

  public UserData(String pass, boolean logged, int tries) {
    this.pass = pass;
    this.logged = logged;
    this.tries = tries;
  }

  public boolean isLogged() {
    return logged;
  }

  public void setLogged(boolean logged) {
    this.logged = logged;
  }


  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public int getTries() {
    return tries;
  }

  public void setTries(int tries) {
    this.tries = tries;
  }
}
