import java.util.List;

/**
 * Interfaz que representa un equipo de mecánicos de pit crew.
 */
public interface PitCrewTeamInter {
    /**
     * Método para agregar una lista de miembros del equipo de mecánicos.
     *
     * @param listPitCrewMember Lista de miembros del equipo de mecánicos.
     */
    void addListOfPitCrewMember(List<PitCrewMember> listPitCrewMember);

    /**
     * Método para imprimir la información de los miembros del equipo de mecánicos.
     */
    void printInformation();

    /**
     * Método para obtener la lista de miembros del equipo de mecánicos.
     *
     * @return Lista de miembros del equipo de mecánicos.
     */
    List<PitCrewMember> getListPitCrewMember();
}
