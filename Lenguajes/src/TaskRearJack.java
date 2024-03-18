import java.util.List;

/**
 * Clase que representa la tarea de levantar la parte trasera del coche.
 */
public class TaskRearJack implements PitCrewTeamInter {
    private boolean incapacitated = true; // Indica si el miembro está incapacitado
    private boolean pitStopFailed = true; // Indica si el pit stop ha fallado
    private boolean pitStopLost = true; // Indica si el pit stop se ha perdido
    protected int requiredPitTeamMembers; // Número requerido de miembros del equipo de rear jacks

    /**
     * Constructor por defecto de la clase TaskRearJack.
     */
    public TaskRearJack(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Método para mostrar la función de la tarea de levantar la parte trasera del
     * coche.
     */
    public void speak() {
        System.out.println("Soy un rear Jack, mi labor es levantar la parte trasera del coche para que " +
                "se le puedan colocar las llantas fácilmente.");
    }

    /**
     * Método para realizar la acción principal de la tarea de levantar la parte
     * trasera del coche.
     *
     * @param incapacitated Indica si el miembro está incapacitado.
     * @param pitStopFailed Indica si el pit stop ha fallado.
     * @param pitStopLost   Indica si el pit stop se ha perdido.
     */
    public void principalAction(boolean incapacitated, boolean pitStopFailed, boolean pitStopLost) {
        // Verificación de condiciones y activación del miembro de repuesto si es
        // necesario
        if (incapacitated == this.getIncapacitated() || pitStopFailed == this.getPitStopFailed()
                || pitStopLost == this.getPitStopLost()) {
            System.out.println("recomendacion: ¡Se activa el miembro de repuesto para continuar con el proceso! \n");
        } else {
            System.out.println(
                    "recomendacion: El miembro y el pit stop están en condiciones óptimas. No se requiere el uso del miembro de repuesto. \n");
        }
    }

    /**
     * Setter para el estado de incapacitación del miembro.
     *
     * @param incapacitated Indica si el miembro está incapacitado.
     */
    public void setIncapacitated(boolean incapacitated) {
        this.incapacitated = incapacitated;
    }

    /**
     * Getter para el estado de incapacitación del miembro.
     *
     * @return Indica si el miembro está incapacitado.
     */
    public boolean getIncapacitated() {
        return incapacitated;
    }

    /**
     * Setter para el estado de falla del pit stop.
     *
     * @param pitStopFailed Indica si el pit stop ha fallado.
     */
    public void setPitStopFailed(boolean pitStopFailed) {
        this.pitStopFailed = pitStopFailed;
    }

    /**
     * Getter para el estado de falla del pit stop.
     *
     * @return Indica si el pit stop ha fallado.
     */
    public boolean getPitStopFailed() {
        return pitStopFailed;
    }

    /**
     * Setter para el estado de pérdida del pit stop.
     *
     * @param pitStopLost Indica si el pit stop se ha perdido.
     */
    public void setPitStopLost(boolean pitStopLost) {
        this.pitStopLost = pitStopLost;
    }

    /**
     * Getter para el estado de pérdida del pit stop.
     *
     * @return Indica si el pit stop se ha perdido.
     */
    public boolean getPitStopLost() {
        return pitStopLost;
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
