public class DroneSimulado implements Drone {

    @Override
    public String verificarStatus() {
        return "OK";
    }

    @Override
    public void enviarComandoVoo() {
        System.out.println("DroneSimulado: simulando comando de voo...");
    }

    @Override
    public int verificarBateria() {
        return 100; 
    }
}
