public class Engineer extends Officer{
    private String branch;

    public Engineer(String name, int age, String gender, String address, String  branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    @Override
    public String ToString(){
        return "Engineer:{" +
                "branch: " +branch+ '\''+
                "name: " +name+ '\''+
                "age: " +age+ '\''+
                "gender: " +gender+ '\''+
                "address: " +address+ '\''+
        '}';
    }
}
