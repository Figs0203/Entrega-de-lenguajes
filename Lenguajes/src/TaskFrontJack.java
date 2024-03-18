import java.util.List;

/**
 * Clase que representa la tarea de levantar la parte frontal del coche durante
 * un pit stop.
 * Extiende la clase PitCrewTeam.
 */
public class TaskFrontJack implements PitCrewTeamInter {
    private boolean incapacitated = true; // Indica si el miembro está incapacitado
    private boolean pitStopFailed = true; // Indica si el pit stop falló
    private boolean pitStopLost = true; // Indica si se perdió el pit stop
    protected int requiredPitTeamMembers; // Número requerido de miembros del equipo de front jacks

    /**
     * Constructor por defecto de la clase TaskFrontJack.
     * Establece el número requerido de miembros del equipo de mecánicos.
     */
    public TaskFrontJack(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Método que muestra información sobre la tarea del FrontJack.
     */
    public void speak() {
        System.out.println("Soy un FrontJack, mi labor es levantar la parte frontal del coche para que " +
                "se le puedan colocar las llantas fácilmente.\n");
    }

    /**
     * Método que realiza la acción principal de la tarea del FrontJack.
     *
     * @param incapacitated Indica si el miembro está incapacitado.
     * @param pitStopFailed Indica si el pit stop falló.
     * @param pitStopLost   Indica si se perdió el pit stop.
     */
    public void principalAction(boolean incapacitated, boolean pitStopFailed, boolean pitStopLost) {
        if (incapacitated == this.getIncapacitated() || pitStopFailed == this.getPitStopFailed()
                || pitStopLost == this.getPitStopLost()) {
            System.out.println("recomendacion: ¡Se activa el miembro de repuesto para continuar con el proceso!");
        } else {
            System.out.println(
                    "recomendacion: El miembro y el pit stop están en condiciones óptimas. No se requiere el uso del miembro de repuesto.");
        }
    }


    /**
     * Método para establecer si el miembro está incapacitado.
     *
     * @param incapacitated Valor que indica si el miembro está incapacitado.
     */
    public void setIncapacitated(boolean incapacitated) {
        this.incapacitated = incapacitated;
    }

    /**
     * Método para obtener si el miembro está incapacitado.
     *
     * @return true si el miembro está incapacitado, false de lo contrario.
     */
    public boolean getIncapacitated() {
        return incapacitated;
    }

    /**
     * Método para establecer si el pit stop falló.
     *
     * @param pitStopFailed Valor que indica si el pit stop falló.
     */
    public void setPitStopFailed(boolean pitStopFailed) {
        this.pitStopFailed = pitStopFailed;
    }

    /**
     * Método para obtener si el pit stop falló.
     *
     * @return true si el pit stop falló, false de lo contrario.
     */
    public boolean getPitStopFailed() {
        return pitStopFailed;
    }

    /**
     * Método para establecer si se perdió el pit stop.
     *
     * @param pitStopLost Valor que indica si se perdió el pit stop.
     */
    public void setPitStopLost(boolean pitStopLost) {
        this.pitStopLost = pitStopLost;
    }

    /**
     * Método para obtener si se perdió el pit stop.
     *
     * @return true si se perdió el pit stop, false de lo contrario.
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
