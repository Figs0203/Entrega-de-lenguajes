import java.util.List;

/**
 * Clase que representa la tarea de un miembro de equipo encargado de utilizar
 * una pistola para quitar y colocar las tuercas de las ruedas.
 */
public class TaskTyreGunner implements PitCrewTeamInter {
    private boolean errorColocationWheel = true; // Indica si hay un error en la colocación de la rueda
    private boolean engineFailure = true; // Indica si hay una falla del motor
    private boolean securityFailed = true; // Indica si hay un fallo de seguridad
    protected int requiredPitTeamMembers; // Número requerido de miembros del equipo de tyre gunners

    /**
     * Constructor por defecto de la clase TaskTyreGunner.
     */
    public TaskTyreGunner(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Método para mostrar la función de la tarea del miembro encargado de las
     * tuercas de las ruedas.
     */
    public void speak() {
        System.out.println("Soy un tyre gunner, mi labor es utilizar una pistola para quitar y colocar las " +
                "tuercas de las ruedas.");
    }

    /**
     * Método para realizar la acción principal de la tarea del miembro encargado de
     * las tuercas de las ruedas.
     *
     * @param errorColocationWheel Indica si hay un error en la colocación de la
     *                             rueda.
     * @param engineFailure        Indica si hay una falla del motor.
     * @param securityFailed       Indica si hay un fallo de seguridad.
     */
    public void principalAction(boolean errorColocationWheel, boolean engineFailure, boolean securityFailed) {
        // Verificación de condiciones y problemas detectados
        if (errorColocationWheel == this.getErrorColocationWheel() || engineFailure == this.getEngineFailure()
                || securityFailed == this.getSecurityFailed()) {
            System.out.println("recomendacion:¡Se detectó un problema que requiere detener el automóvil de inmediato!\n");
        } else {
            System.out.println("recomendacion: No se detectaron problemas que requieran detener el automóvil. Puede continuar.\n");
        }
    }

    /**
     * Setter para indicar si hay un error en la colocación de la rueda.
     *
     * @param errorColocationWheel Indica si hay un error en la colocación de la
     *                             rueda.
     */
    public void setErrorColocationWheel(boolean errorColocationWheel) {
        this.errorColocationWheel = errorColocationWheel;
    }

    /**
     * Getter para indicar si hay un error en la colocación de la rueda.
     *
     * @return Indica si hay un error en la colocación de la rueda.
     */
    public boolean getErrorColocationWheel() {
        return errorColocationWheel;
    }

    /**
     * Setter para indicar si hay una falla del motor.
     *
     * @param engineFailure Indica si hay una falla del motor.
     */
    public void setEngineFailure(boolean engineFailure) {
        this.engineFailure = engineFailure;
    }

    /**
     * Getter para indicar si hay una falla del motor.
     *
     * @return Indica si hay una falla del motor.
     */
    public boolean getEngineFailure() {
        return engineFailure;
    }

    /**
     * Setter para indicar si hay un fallo de seguridad.
     *
     * @param securityFailed Indica si hay un fallo de seguridad.
     */
    public void setSecurityFailed(boolean securityFailed) {
        this.securityFailed = securityFailed;
    }

    /**
     * Getter para indicar si hay un fallo de seguridad.
     *
     * @return Indica si hay un fallo de seguridad.
     */
    public boolean getSecurityFailed() {
        return securityFailed;
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
