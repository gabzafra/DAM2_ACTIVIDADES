package hashmap;

public class User {

  private String name;
  private String pass;
  private boolean logged;
  private int tries;


  public User() {
    this("", "");
  }

  public User(String name, String pass) {
    this.name = name;
    this.pass = pass;
    logged = false;
    this.tries = 0;
  }

  public boolean isLogged() {
    return logged;
  }

  public void setLogged(boolean logged) {
    this.logged = logged;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
