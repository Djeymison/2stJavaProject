package System2;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getinstance(){
        return instance;
    }

    public String TakeCity( String CEP ){
        return "Natal";
    }

    public String TakeState( String CEP){
        return "RN";
    }
}
