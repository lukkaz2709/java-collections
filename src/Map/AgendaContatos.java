package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }
   public void removerContato(String nome){
    if(!agendaContatosMap.isEmpty()){
        agendaContatosMap.remove(nome);
    }
   }
   public void exibirContato(){
    System.out.println(agendaContatosMap);
   }
   public Integer pesquisaPorNome(String nome){
    Integer numeroPorNome = null;
    if(!agendaContatosMap.isEmpty()){
        numeroPorNome = agendaContatosMap.get(nome);
    }
    return numeroPorNome;
   }

   public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("lucas", 3456680);
    agendaContatos.adicionarContato("lucas", 3456689);
    agendaContatos.adicionarContato("lucas Dutra", 3456667);
    agendaContatos.adicionarContato("lucas CEAT", 3456676);
    agendaContatos.adicionarContato("João silva", 3456643);
    agendaContatos.adicionarContato("lucas", 3456680);

    agendaContatos.exibirContato();

    agendaContatos.removerContato("João silva");
    agendaContatos.exibirContato();

    System.out.println("O numero é: " + agendaContatos.pesquisaPorNome("Lucas CEAT"));
   }
}
