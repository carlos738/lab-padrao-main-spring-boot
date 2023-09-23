package facade.subsistema2;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Belo horizonte, Santos";
    }

    public String recuperarEstado(String cep) {
        return "MG, SP";
    }
}