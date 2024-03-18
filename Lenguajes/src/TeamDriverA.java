import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un equipo de conducir A.
 */
public class TeamDriverA {

    /** Lista de miembros exclusivos del equipo de pit crew. */
    private List<PitCrewMember> listExclusivePitCrewMembers = new ArrayList<>();

    /** Nombre del equipo. */
    private String teamName;

    /** Color del auto. */
    private String carColor;

    /** Número de carreras realizadas. */
    private int numberOfRaces;

    /**
     * Constructor de la clase TeamDriverA.
     * @param teamName Nombre del equipo.
     * @param carColor Color del auto.
     * @param numberOfRaces Número de carreras realizadas.
     */
    public TeamDriverA(String teamName, String carColor, int numberOfRaces) {
        this.teamName = teamName;
        this.carColor = carColor;
        this.numberOfRaces = numberOfRaces;
    }

    /**
     * Muestra los miembros exclusivos del equipo de pit crew.
     */
    public void showExclusivePitCrewMembers() {
        for (PitCrewMember pitCrewMember : this.listExclusivePitCrewMembers) {
            System.out.println(pitCrewMember.getName());
        }
    }

    /**
     * Agrega miembros exclusivos al equipo de pit crew.
     * @param listPitCrewMember Lista de miembros del pit crew.
     */
    public void addExclusivePitCrewMembers(ArrayList<PitCrewMember> listPitCrewMember) {
        for (int i = 0; i < listPitCrewMember.size(); i++) {
            PitCrewMember pitCrewMember = listPitCrewMember.get(i);
            if (pitCrewMember.getWorksFor().equals("TEAM_A")) {
                this.listExclusivePitCrewMembers.add(pitCrewMember);
            }
        }
    }


    /**
     * Obtiene el nombre del equipo.
     * @return Nombre del equipo.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Establece el nombre del equipo.
     * @param teamName Nombre del equipo.
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Obtiene el color del auto.
     * @return Color del auto.
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * Establece el color del auto.
     * @param carColor Color del auto.
     */
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    /**
     * Obtiene el número de carreras realizadas.
     * @return Número de carreras realizadas.
     */
    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    /**
     * Establece el número de carreras realizadas.
     * @param numberOfRaces Número de carreras realizadas.
     */
    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }

    /**
     * Obtiene toda la información del equipo.
     */
    public void getAllTeamInfo() {
        this.teamInfo();
    }

    /**
     * Retorna la información del equipo.
     * @return Información del equipo.
     */
    private String teamInfo() {
        System.out.println("¡Bienvenidos al equipo " + teamName + "!");
        System.out.println("Color del auto: " + carColor);
        System.out.println("Numero de carreras realizadas: " + numberOfRaces);
        return "Nombre de equipo: " + this.teamName + "\nColor de auto: " + this.carColor
                + "\nNumero de carreras realizadas: " + this.numberOfRaces;
    }

    /**
     * Cambia el color del auto.
     * @param newColor Nuevo color del auto.
     */
    public void changeCarColor(String newColor) {
        if (newColor != null && !newColor.isEmpty()) {
            this.carColor = newColor;
            System.out.println("El color del auto ha sido cambiado a: " + newColor);
        } else {
            System.out.println("Error: El nuevo color no puede estar vacío.");
        }
    }
}
