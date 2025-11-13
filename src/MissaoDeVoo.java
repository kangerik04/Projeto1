public class MissaoDeVoo implements Missao {

    private Drone drone;
    private RegistroDados registrador;

    public MissaoDeVoo(Drone drone, RegistroDados registrador) {
        this.drone = drone;
        this.registrador = registrador;
    }

    @Override
    public void solicitarMissao() {
        System.out.println("MissaoDeVoo: missão solicitada.");
        String status = drone.verificarStatus();
        System.out.println("MissaoDeVoo: status do drone = " + status);
    }

    @Override
    public void executarMissao() {
        System.out.println("MissaoDeVoo: executando missão...");
        drone.enviarComandoVoo();
        registrador.registrar();
        Relatorio r = gerarRelatorio();
        r.exibir();
    }

    public Relatorio gerarRelatorio() {
        System.out.println("MissaoDeVoo: gerando relatório...");
        Relatorio rel = new Relatorio();
        rel.gerarPDF();
        return rel;
    }
}
