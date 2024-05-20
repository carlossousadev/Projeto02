package projeto12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgenciaPublicidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<AgendaItem> agendas = new ArrayList<>();

        while (true) {
            System.out.println("Quem está inserindo a informação? Digite '1' para Cliente ou '2' para Colaborador:");
            String tipoPessoa = scanner.nextLine();
            if (tipoPessoa.equalsIgnoreCase("1")) {
                System.out.println("Digite o número da agenda que deseja aprovar (Digite 0 para sair):");
                int numeroAgenda = Integer.parseInt(scanner.nextLine());
                if (numeroAgenda == 0) {
                    break;
                }
                boolean agendaEncontrada = false;
                for (AgendaItem item : agendas) {
                    if (item.getCliente() != null && agendas.indexOf(item) == (numeroAgenda - 1)) {
                        System.out.println("Aprovar a agenda? (S/N)");
                        String resposta = scanner.nextLine();
                        if (resposta.equalsIgnoreCase("S")) {
                            item.setAprovada(true);
                        } else {
                            System.out.println("Digite um comentário para justificar a não aprovação:");
                            String comentario = scanner.nextLine();
                            item.setAprovada(false);
                            item.setComentario(comentario);
                        }
                        agendaEncontrada = true;
                        break;
                    }
                }
                if (!agendaEncontrada) {
                    System.out.println("Agenda não encontrada.");
                }
            } else if (tipoPessoa.equalsIgnoreCase("2")) {
                System.out.println("Digite o seu nome (Colaborador):");
                String nomeColaborador = scanner.nextLine();
                System.out.println("Digite o local da agenda:");
                String local = scanner.nextLine();
                System.out.println("Digite a data e hora da agenda (Formato: dd/MM/yyyy HH:mm:ss):");
                String dataAgendadaStr = scanner.nextLine();
                LocalDateTime dataAgendada = LocalDateTime.parse(dataAgendadaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                System.out.println("Digite o nome do cliente:");
                String nomeCliente = scanner.nextLine();
                System.out.println("Digite o texto para postagem:");
                String textoPostagem = scanner.nextLine();
                System.out.println("Digite a plataforma de postagem:");
                String plataformaPostagem = scanner.nextLine();
                agendas.add(new AgendaItem(new Colaborador(nomeColaborador), local, dataAgendada));
                for (AgendaItem item : agendas) {
                    if (item.getCliente() == null && item.getColaborador().getNome().equalsIgnoreCase(nomeColaborador)) {
                        item.setCliente(new Cliente(nomeCliente));
                        item.setTextoPostagem(textoPostagem);
                        item.setPlataformaPostagem(plataformaPostagem);
                    }
                }
            } else {
                System.out.println("Tipo de pessoa inválido.");
            }

            System.out.println("Deseja adicionar outra informação? (S/N)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        for (int i = 0; i < agendas.size(); i++) {
            System.out.println("Agenda " + (i + 1) + ":");
            agendas.get(i).exibirInformacoes();
            System.out.println();
        }

        scanner.close();
    }
}
