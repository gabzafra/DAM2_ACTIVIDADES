package hashmap;

public class User {

  private String name;
  private String pass;
  private int trys;

  public User(String name, String pass) {
    this.name = name;
    this.pass = pass;
    this.trys = 0;
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

  public int getTrys() {
    return trys;
  }

  public void setTrys(int trys) {
    this.trys = trys;
  }
}
