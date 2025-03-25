package ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void AdicionarEvento(LocalDate data,String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximaEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximaEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximaEvento + "acontecerá na data " + proximaData);
                break;
            }
        }

    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.AdicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 27), "Evento 1", "Atração 1");
        agendaEventos.AdicionarEvento(LocalDate.of(2018, Month.APRIL, 19), "Evento 2", "Atração 2");
        agendaEventos.AdicionarEvento(LocalDate.of(2013, Month.JUNE, 21), "Evento 3", "Atração 3");
        agendaEventos.AdicionarEvento(LocalDate.of(2025, Month.MARCH, 24), "Evento 4", "Atração 4");
        agendaEventos.AdicionarEvento(LocalDate.of(2025, Month.MARCH, 25), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

    
}
