import java.util.List;

/**
 * Esta clase representa una tarea realizada por el equipo de mecánicos de pits para colocar neumáticos.
 * Extiende la clase PitCrewTeam.
 */
public class TaskTyreOn implements PitCrewTeamInter {

    /** La cantidad de neumáticos que se deben colocar. */
    private int numberOfTires = 0;

    /** Indica si se necesitan neumáticos. */
    private boolean needTires = true;

    /** Indica si se están utilizando neumáticos nuevos. */
    private boolean newTires = true;

    /** Indica el número de tyre ons en el equipo de pits. */
    protected int requiredPitTeamMembers;

    /**
     * Construye un objeto TaskTyreOn y establece el número requerido de miembros del equipo de pits en 4.
     */
    public TaskTyreOn(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Imprime una declaración describiendo la tarea de colocar neumáticos.
     */
    public void speak() {
        System.out.println("Soy un tyre on, mi labor es cargar las llantas y encajarlas en el carro.");
    }

    /**
     * Comprueba si la acción principal se puede realizar según los parámetros proporcionados.
     * @param numberOfTires La cantidad de neumáticos.
     * @param needTires Indica si se necesitan neumáticos.
     * @param newTires Indica si se están utilizando neumáticos nuevos.
     * @return true si la acción se puede realizar, false en caso contrario.
     */
    public boolean principalAction(int numberOfTires, boolean needTires, boolean newTires) {
        if (numberOfTires == this.getNumberOfTires() || this.getNumberOfTires() < 5 || needTires == this.getNeedTires()
                || newTires == this.getNewTires()) {
                    System.out.println("recomendacion: se deben colocar nuevos neumaticos \n");
            return true;
        } else {
            return false;
        }
    }

    /**
     * Establece la cantidad de neumáticos que se deben colocar.
     * @param numberOfTires La cantidad de neumáticos.
     */
    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    /**
     * Obtiene la cantidad de neumáticos que se deben colocar.
     * @return La cantidad de neumáticos.
     */
    public int getNumberOfTires() {
        return numberOfTires;
    }

    /**
     * Establece si se necesitan neumáticos.
     * @param needTires Indica si se necesitan neumáticos.
     */
    public void setNeedTires(boolean needTires) {
        this.needTires = needTires;
    }

    /**
     * Obtiene si se necesitan neumáticos.
     * @return true si se necesitan neumáticos, false en caso contrario.
     */
    public boolean getNeedTires() {
        return needTires;
    }

    /**
     * Establece si se están utilizando neumáticos nuevos.
     * @param newTires Indica si se están utilizando neumáticos nuevos.
     */
    public void setNewTires(boolean newTires) {
        this.newTires = newTires;
    }

    /**
     * Obtiene si se están utilizando neumáticos nuevos.
     * @return true si se están utilizando neumáticos nuevos, false en caso contrario.
     */
    public boolean getNewTires() {
        return newTires;
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
