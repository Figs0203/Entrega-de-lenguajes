import java.util.List;

/**
 * Clase que representa la tarea de ajuste del alerón delantero del coche.
 */
public class TaskFrontWingFlap implements PitCrewTeamInter {
    private int tireWear = 30; // Desgaste de los neumáticos
    private int fuelLevel = 20; // Nivel de combustible
    private boolean rain = true; // Indica si está lloviendo
    protected int requiredPitTeamMembers; // Número requerido de miembros del equipo de front wing flaps

    /**
     * Constructor por defecto de la clase TaskFrontWingFlap.
     */
    public TaskFrontWingFlap(int requiredPitTeamMembers) {
        this.requiredPitTeamMembers = requiredPitTeamMembers;
    }

    /**
     * Método para mostrar la función de la tarea de ajuste del alerón delantero.
     */
    public void speak() {
        System.out.println("Soy un Front Wing Flap Adjust, mi labor es aplicar cambios " +
                "aerodinámicos al alerón delantero del coche.");
    }

    /**
     * Método para realizar la acción principal de la tarea de ajuste del alerón
     * delantero.
     *
     * @param tireWear  Desgaste de los neumáticos.
     * @param fuelLevel Nivel de combustible.
     * @param rain      Indica si está lloviendo.
     */
    public void principalAction(int tireWear, int fuelLevel, boolean rain) {
        // Verificación de condiciones y recomendaciones
        if (rain == this.getRain()) {
            System.out.println("recomendacion: Está lloviendo. Se recomienda usar neumáticos con mayor agarre.");
        } else {
            System.out.println("No se presentan problemas de agarre por lluvia.");
        }

        if (tireWear >= this.getTireWear()) {
            System.out.println("recomendacion: Desgaste de neumáticos alto. Se recomienda aumentar el agarre delantero.");
        } else {
            System.out.println("Desgaste de neumáticos dentro de los límites aceptables.");
        }

        if (fuelLevel < this.getFuelLevel()) {
            System.out.println("recomendacion: Nivel de combustible bajo. Se recomienda mejorar la eficiencia aerodinámica. \n");
        } else {
            System.out.println("Nivel de combustible suficiente.");
        }
    }

    /**
     * Setter para el desgaste de los neumáticos.
     *
     * @param tireWear Desgaste de los neumáticos.
     */
    public void setTireWear(int tireWear) {
        this.tireWear = tireWear;
    }

    /**
     * Getter para el desgaste de los neumáticos.
     *
     * @return Desgaste de los neumáticos.
     */
    public int getTireWear() {
        return tireWear;
    }

    /**
     * Setter para el nivel de combustible.
     *
     * @param fuelLevel Nivel de combustible.
     */
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    /**
     * Getter para el nivel de combustible.
     *
     * @return Nivel de combustible.
     */
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Setter para la lluvia.
     *
     * @param rain Indica si está lloviendo.
     */
    public void setRain(boolean rain) {
        this.rain = rain;
    }

    /**
     * Getter para la lluvia.
     *
     * @return Indica si está lloviendo.
     */
    public boolean getRain() {
        return rain;
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
