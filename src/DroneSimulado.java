public class DroneSimulado implements IDrone {

    @Override
    public String verificarStatus() {
        return "OK (Drone Simulado)";
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
