import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {

    List<Officer> officers;
    public ManagerOfficer(){
        this.officers = new ArrayList<>();
    }
    public void AddOfficers(Officer officer){
        this.officers.add(officer);
    }
    public List<Officer> searchOfficerByName(String name){
        return this.officers.stream().filter(officer -> officer.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInForOfficer(){
        this.officers.forEach(officer -> System.out.println(officer.ToString()));
    }
}
