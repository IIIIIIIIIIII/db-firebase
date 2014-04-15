import com.firebase.client.Firebase;

import java.util.Map;

public class FirebaseHelper {

  private String url;

  public FirebaseHelper(String url) {
    this.url = url;
  }

  public void saveData(String collection,
                       int azonosito, Map<String, String> fields) {

    for (String key : fields.keySet()) {
      new Firebase(url + "/" + collection + "/" + azonosito + "/" + key)
          .setValue(fields.get(key));
    }
  }
}