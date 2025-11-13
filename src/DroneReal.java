public class DroneReal implements Drone {

    @Override
    public String verificarStatus() {
        return "OK (Drone Real)";
    }

    @Override
    public void enviarComandoVoo() {
        System.out.println("DroneReal: enviando comando de voo...");
    }

    @Override
    public int verificarBateria() {
        return 80; 
    }
}
