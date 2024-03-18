import java.util.List;

/**
 * Clase que representa la tarea del Lollipop Man.
 */
public class TaskLollipop implements PitCrewTeamInter {
    private boolean vehiclesPresents = true; // Indica si hay otros vehículos presentes en la calle de boxes
    private boolean personalPresent = true; // Indica si hay otras personas presentes en la calle de boxes
    private boolean carReady = true; // Indica si el carro está listo para salir
    protected int requiredPitTeamMembers; // Número requerido de miembros del equipo de Lollipop mans

    /**
     * Constructor por defecto de la clase TaskLollipop.
     */
    public TaskLollipop(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Método para mostrar la función del Lollipop Man.
     */
    public void speak() {
        System.out.println("Soy un Lollipop Man, mi labor es dar la señal para " +
                "soltar el auto.");
    }

    /**
     * Método para realizar la acción principal del Lollipop Man.
     *
     * @param vehiclesPresents Indica si hay otros vehículos presentes en la calle
     *                         de boxes.
     * @param personalPresent  Indica si hay otras personas presentes en la calle de
     *                         boxes.
     * @param carReady         Indica si el carro está listo para salir.
     */
    public void principalAction(boolean vehiclesPresents, boolean personalPresent, boolean carReady) {
        // Verificación de condiciones y advertencias
        if (vehiclesPresents == this.getVehiclesPresents() || personalPresent == this.getPersonalPresent()) {
            System.out.println("recomendacion: ¡Atención! Hay otros vehículos o personas presentes en la calle de boxes.\n");
        } else if (!carReady == this.getCarReady()) {
            System.out.println("recomendacion: El carro aún no está listo para salir.\n");
        } else {
            System.out.println("recomendacion: No se detectan riesgos potenciales. Se procede a liberar al conductor con seguridad.\n");
        }
    }

    /**
     * Setter para indicar si hay otros vehículos presentes en la calle de boxes.
     *
     * @param vehiclesPresents Indica si hay otros vehículos presentes en la calle
     *                         de boxes.
     */
    public void setVehiclesPresents(boolean vehiclesPresents) {
        this.vehiclesPresents = vehiclesPresents;
    }

    /**
     * Getter para indicar si hay otros vehículos presentes en la calle de boxes.
     *
     * @return Indica si hay otros vehículos presentes en la calle de boxes.
     */
    public boolean getVehiclesPresents() {
        return vehiclesPresents;
    }

    /**
     * Setter para indicar si hay otras personas presentes en la calle de boxes.
     *
     * @param personalPresent Indica si hay otras personas presentes en la calle de
     *                        boxes.
     */
    public void setPersonalPresent(boolean personalPresent) {
        this.personalPresent = personalPresent;
    }

    /**
     * Getter para indicar si hay otras personas presentes en la calle de boxes.
     *
     * @return Indica si hay otras personas presentes en la calle de boxes.
     */
    public boolean getPersonalPresent() {
        return personalPresent;
    }

    /**
     * Setter para indicar si el carro está listo para salir.
     *
     * @param carReady Indica si el carro está listo para salir.
     */
    public void setCarReady(boolean carReady) {
        this.carReady = carReady;
    }

    /**
     * Getter para indicar si el carro está listo para salir.
     *
     * @return Indica si el carro está listo para salir.
     */
    public boolean getCarReady() {
        return carReady;
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
