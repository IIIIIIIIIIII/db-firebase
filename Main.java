import java.util.HashMap;
import java.util.Map;

public class Main {

  private static final String BASE_URL = "https://nx-mozi.firebaseio.com";
  private static int id = 1;

  public static void main(String... args) {

    FirebaseHelper fh = new FirebaseHelper(BASE_URL);

    Map<String, String> data = new HashMap<>();
    data.put("mail", "asd@dsa.com");
    data.put("name", "hardworker peter");
    fh.saveData("employees", id++, data);

    data.clear();
    data.put("mail", "test@mail.com");
    data.put("name", "harderworker sam");
    fh.saveData("employees", id++, data);

    System.exit(0);
  }
}