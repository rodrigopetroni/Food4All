package fiap.food4all.domain.cliente;

public record DadosListagemCliente(Long id, String nome, String email) {

    public DadosListagemCliente(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEmail());
    }

}
