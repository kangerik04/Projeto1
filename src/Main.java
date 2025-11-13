public class Main {

    public static void main(String[] args) {
        Drone drone = new DroneSimulado();

        RegistroDados reg = new DadosSensor();

        Missao missao = new MissaoDeVoo(drone, reg);

        missao.solicitarMissao();
        missao.executarMissao();

        System.out.println("Bateria do drone: " + drone.verificarBateria() + "%");
    }
}
