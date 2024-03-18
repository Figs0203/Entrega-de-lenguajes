import java.util.List;

/**
 * Clase que representa la tarea de estabilizar el carro cuando es levantado.
 */
public class TaskSideJack implements PitCrewTeamInter {
    private boolean changesPneumaticsInProcess = true; // Indica si hay un proceso de cambio de neumáticos en curso
    private boolean reparationInProcess = true; // Indica si hay un proceso de reparación en curso
    private boolean frontJackActivated = true; // Indica si el Front Jack está activado
    protected int requiredPitTeamMembers; // Número requerido de miembros del equipo de side jacks

    /**
     * Constructor por defecto de la clase TaskSideJack.
     */
    public TaskSideJack(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Método para mostrar la función de la tarea de estabilizar el carro.
     */
    public void speak() {
        System.out.println("Soy un side jack, mi labor es estabilizar el carro cuando este es levantado. \n");
    }

    /**
     * Método para realizar la acción principal de la tarea de estabilizar el carro.
     *
     * @param changesPneumaticsInProcess Indica si hay un proceso de cambio de
     *                                   neumáticos en curso.
     * @param reparationInProcess        Indica si hay un proceso de reparación en
     *                                   curso.
     * @param frontJackActivated         Indica si el Front Jack está activado.
     */
    public void principalAction(boolean changesPneumaticsInProcess, boolean reparationInProcess,
            boolean frontJackActivated) {
        // Verificación de condiciones y estabilidad del coche
        if (changesPneumaticsInProcess == this.getChangesPneumaticsInProcess()
                || reparationInProcess == this.getReparationInProcess()
                || frontJackActivated == this.getFrontJackActivated()) {
            System.out.println(
                    "recomendacion: El coche se mantiene estable durante el cambio de neumáticos, la reparación del ala delantera o el uso del front jack.\n");
        } else {
            System.out.println("recomendacion: No es necesario mantener la estabilidad del coche en este momento.\n");
        }
    }

    /**
     * Setter para indicar si hay un proceso de cambio de neumáticos en curso.
     *
     * @param changesPneumaticsInProcess Indica si hay un proceso de cambio de
     *                                   neumáticos en curso.
     */
    public void setChangesPneumaticsInProcess(boolean changesPneumaticsInProcess) {
        this.changesPneumaticsInProcess = changesPneumaticsInProcess;
    }

    /**
     * Getter para indicar si hay un proceso de cambio de neumáticos en curso.
     *
     * @return Indica si hay un proceso de cambio de neumáticos en curso.
     */
    public boolean getChangesPneumaticsInProcess() {
        return changesPneumaticsInProcess;
    }

    /**
     * Setter para indicar si hay un proceso de reparación en curso.
     *
     * @param reparationInProcess Indica si hay un proceso de reparación en curso.
     */
    public void setReparationInProcess(boolean reparationInProcess) {
        this.reparationInProcess = reparationInProcess;
    }

    /**
     * Getter para indicar si hay un proceso de reparación en curso.
     *
     * @return Indica si hay un proceso de reparación en curso.
     */
    public boolean getReparationInProcess() {
        return reparationInProcess;
    }

    /**
     * Setter para indicar si el Front Jack está activado.
     *
     * @param frontJackActivated Indica si el Front Jack está activado.
     */
    public void setFrontJackActivated(boolean frontJackActivated) {
        this.frontJackActivated = frontJackActivated;
    }

    /**
     * Getter para indicar si el Front Jack está activado.
     *
     * @return Indica si el Front Jack está activado.
     */
    public boolean getFrontJackActivated() {
        return frontJackActivated;
    }

    @Override
    public void addListOfPitCrewMember(List<PitCrewMember> listPitCrewMember) {

    }

    @Override
    public void printInformation() {

    }

    @Override
    public List<PitCrewMember> getListPitCrewMember() {
        return null;
    }
}
