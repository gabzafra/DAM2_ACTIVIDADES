package hashmap;

public class User {

  private String name;
  private String pass;
  private int tries;


  public User() {
    this("", "");
  }

  public User(String name, String pass) {
    this.name = name;
    this.pass = pass;
    this.tries = 0;
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
