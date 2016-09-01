import java.util.ArrayList;
import java.util.List;

public class PingPong {

  public List<Object> runPingPong(int countUpTo){
    List<Object> result = new ArrayList<Object>();
    for (int i = 1; i <= countUpTo; i++){
      result.add(i);
    }
    return result;
  }

}
