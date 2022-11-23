package System1;

public class CRMService {
    private CRMService(){
        super();
    }
    public static void SaveClient(String Name,  String CEP, String City, String State){
        System.out.println("Save cliente on CRM system...");
        System.out.println(Name);
        System.out.println(CEP);
        System.out.println(City);
        System.out.println(State);
    }
}
