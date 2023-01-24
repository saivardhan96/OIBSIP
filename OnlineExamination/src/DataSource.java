import java.util.HashMap;
import java.util.Objects;

public class DataSource {
    HashMap<String,String> dataa=new HashMap<>();
    public DataSource(){
        dataa.put("1","1");
        dataa.put("Kittu","Kittu@96");
        dataa.put("Manu","Manu@96");
        dataa.put("Srinu","Srinu@96");
    }

    public boolean query(String user){
        return dataa.containsKey(user);
    }
    public boolean db(String name,String passcode) {
        return Objects.equals(dataa.get(name),passcode);
    }
}
