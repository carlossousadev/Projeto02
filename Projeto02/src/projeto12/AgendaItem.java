package projeto12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AgendaItem {
    private Colaborador colaborador;
    private Cliente cliente;
    private String local;
    private LocalDateTime dataAgendada;
    private String comentario;
    private String textoPostagem;
    private boolean aprovada;
    private String plataformaPostagem;

    public AgendaItem(Colaborador colaborador, String local, LocalDateTime dataAgendada) {
        this.colaborador = colaborador;
        this.local = local;
        this.dataAgendada = dataAgendada;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDateTime dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTextoPostagem() {
        return textoPostagem;
    }

    public void setTextoPostagem(String textoPostagem) {
        this.textoPostagem = textoPostagem;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public String getPlataformaPostagem() {
        return plataformaPostagem;
    }

    public void setPlataformaPostagem(String plataformaPostagem) {
        this.plataformaPostagem = plataformaPostagem;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Colaborador: " + colaborador.getNome());
        System.out.println("Local da Agenda: " + local);
        System.out.println("Data Agendada: " + dataAgendada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        if (cliente != null) {
            System.out.println("Nome do Cliente: " + cliente.getNome());
            if (aprovada) {
                System.out.println("Aprovada: Sim");
            } else {
                System.out.println("Aprovada: Não");
                if (comentario != null) {
                    System.out.println("Comentário do Cliente: " + comentario);
                }
            }
        }
        System.out.println("Texto para Postagem: " + textoPostagem);
        System.out.println("Plataforma de Postagem: " + plataformaPostagem);
    }
}
