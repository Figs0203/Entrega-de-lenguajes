import java.util.List;

/**
 * Clase que representa la tarea de quitar las llantas del coche.
 */
public class TaskTyreOff implements PitCrewTeamInter {
    private int numberOfTires = 4; // Número de neumáticos a quitar (por defecto son 4)
    private boolean tireWorn = false; // Indica si los neumáticos están desgastados
    private boolean improveTire = false; // Indica si se deben mejorar los neumáticos
    protected int requiredPitTeamMembers; // Número requerido de miembros del equipo de tyre offs

    /**
     * Constructor por defecto de la clase TaskTyreOff.
     */
    public TaskTyreOff(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Método para mostrar la función de la tarea de quitar las llantas del coche.
     */
    public void speak() {
        System.out.println("Soy un tyre off, mi labor es quitar las llantas del coche.");
    }

    /**
     * Método para realizar la acción principal de la tarea de quitar las llantas
     * del coche.
     *
     * @param numberOfTires Número de neumáticos a quitar.
     * @param tireWorn      Indica si los neumáticos están desgastados.
     * @param improveTire   Indica si se deben mejorar los neumáticos.
     * @return true si hay problemas con los neumáticos, false si no hay problemas.
     */
    public boolean principalAction(int numberOfTires, boolean tireWorn, boolean improveTire) {
        // Verificación de problemas con los neumáticos
        if (tireWorn == this.getImproveTire() || improveTire == this.getImproveTire()) {
            System.out.println("recomendacion: se deben retirar los neumaticos \n");
            return true; // Hay problemas con los neumáticos
            
        } else if (numberOfTires == this.getNumberOfTires()) {
            System.out.println("recomendacion: no hay problema con los neumaticos \n");
            return false; // No hay problemas con los neumáticos
        } else {
            System.out.println("recomendacion: se deben rervisar los neumaticos \n");
            return true; // Hay problemas con los neumáticos
        }
    }

    /**
     * Getter para obtener el número de neumáticos a quitar.
     *
     * @return Número de neumáticos a quitar.
     */
    public int getNumberOfTires() {
        return this.numberOfTires;
    }

    /**
     * Setter para establecer el número de neumáticos a quitar.
     *
     * @param numberOfTires Número de neumáticos a quitar.
     */
    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    /**
     * Getter para obtener el estado de desgaste de los neumáticos.
     *
     * @return true si los neumáticos están desgastados, false en caso contrario.
     */
    public boolean getTireWorn() {
        return this.tireWorn;
    }

    /**
     * Setter para establecer el estado de desgaste de los neumáticos.
     *
     * @param tireWorn Indica si los neumáticos están desgastados.
     */
    public void setTireWorn(boolean tireWorn) {
        this.tireWorn = tireWorn;
    }

    /**
     * Getter para obtener el estado de mejora de los neumáticos.
     *
     * @return true si se deben mejorar los neumáticos, false en caso contrario.
     */
    public boolean getImproveTire() {
        return this.improveTire;
    }

    /**
     * Setter para establecer el estado de mejora de los neumáticos.
     *
     * @param improveTire Indica si se deben mejorar los neumáticos.
     */
    public void setImproveTire(boolean improveTire) {
        this.improveTire = improveTire;
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
