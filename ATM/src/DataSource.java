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





















































/*

    int n = 0;
        switch (name) {
                case "Saivardhan" -> {
                if (Objects.equals(passcode, "Saivardhan@96")) n = 1;
                }
                case "Kittu" -> {
                if (Objects.equals(passcode, "Kittu@96")) n = 1;
                }
                case "Manu" -> {
                if (Objects.equals(passcode, "Manu@96")) n = 1;
                }
                case "Srinu" -> {
                if (Objects.equals(passcode, "Srinu@96")) n = 1;
                }
                }
                return n;*/
