package Diogof.Facade;

import System1.CRMService;
import System2.CepApi;

public class Facade {
    public void MoveClient(String name, String cep ) {
        String City = CepApi.getinstance().TakeCity(cep);
        String State = CepApi.getinstance().TakeState(cep);

        CRMService.SaveClient(name, cep, City, State);
    }
}
