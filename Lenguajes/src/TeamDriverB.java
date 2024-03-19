import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un equipo de conducir B que extiende la clase TaskSideJack.
 */
public class TeamDriverB {

    /** Lista de miembros exclusivos del equipo de pit crew. */
    private List<PitCrewMember> listExclusivePitCrewMembers = new ArrayList<>();

    /** Nombre del equipo. */
    private String teamName;

    /** Marca del auto. */
    private String carBrand;

    /** Número de carreras realizadas. */
    private int numberOfRaces;

    /**
     * Constructor de la clase TeamDriverB.
     * @param teamName Nombre del equipo.
     * @param carBrand Marca del auto.
     * @param numberOfRaces Número de carreras realizadas.
     */
    public TeamDriverB(String teamName, String carBrand, int numberOfRaces) {
        this.teamName = teamName;
        this.carBrand = carBrand;
        this.numberOfRaces = numberOfRaces;
    }

    /**
     * Muestra los miembros exclusivos del equipo de pit crew.
     */
    public void showExclusivePitCrewMembers() {
        for (PitCrewMember pitCrewMember : this.listExclusivePitCrewMembers) {
            System.out.println(pitCrewMember.getName() + " " + pitCrewMember.getLastName());
        }
    }

    /**
     * Agrega miembros exclusivos al equipo de pit crew.
     * @param listPitCrewMember Lista de miembros del pit crew.
     */
    public void addExclusivePitCrewMembers(ArrayList<PitCrewMember> listPitCrewMember) {
        for (int i = 0; i < listPitCrewMember.size(); i++) {
            PitCrewMember pitCrewMember = listPitCrewMember.get(i);
            if (pitCrewMember.getWorksFor().equals("TEAM_B")) {
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
     * Obtiene la marca del auto.
     * @return Marca del auto.
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * Establece la marca del auto.
     * @param carBrand Marca del auto.
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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
        System.out.println("marca del auto: " + carBrand);
        System.out.println("Numero de carreras realizadas: " + numberOfRaces);
        return "Nombre de equipo: " + teamName + "\nMarca de auto: " + carBrand + "\nNumero de carreras realizadas: "
                + numberOfRaces;
    }

    /**
     * Cambia la marca del auto.
     * @param newBrand Nueva marca del auto.
     */
    public void changeCarBrand(String newBrand) {
        if (newBrand != null && !newBrand.isEmpty()) {
            this.carBrand = newBrand;
            System.out.println("La marca del vehículo ha sido cambiada a: " + newBrand);
        } else {
            System.out.println("Error: La nueva marca no puede estar vacía.");
        }
    }
}
