package entities;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos(){
        contatos = new HashMap<>();
    }

    public void adicionarContato(final String nome, final Integer telefone){
        this.contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!contatos.isEmpty()){
            contatos.remove(nome);
        }
        else {
            System.out.println("Está lista de contatos está vazia!");
        }
    }

    public void exibirContatos(){
        contatos.forEach((String, Integer) -> {
            System.out.println("Chave: " + String + ", Valor: " + Integer);
        });
    }

    public Integer pesquisarPorNome(String nome){
        Integer telefone = null;
        if (!contatos.isEmpty()){
            if (!contatos.containsKey(nome)){
                System.out.println("Contato não existe na agenda!");
            }
            else{
                telefone = contatos.get(nome);
            }
        }
        else {
            System.out.println("Está lista de contatos está vazia!");
        }
        return telefone;
    }
}
