import java.util.ArrayList;

/**
 * Clase principal que contiene el método main para ejecutar la simulación de un
 * equipo de Fórmula 1 y su equipo de mecánicos.
 */
public class Main {

    /**
     * Método principal que inicia la simulación del equipo de Fórmula 1 y su equipo
     * de mecánicos.
     */

    public static void main(String[] args) {
        // Creación de un equipo de mecánicos de pit crew
        PitCrewTeamManager pitCrewTeam = new PitCrewTeamManager();
        pitCrewTeam.addListOfPitCrewMember(getListOfCrewMembers());
        pitCrewTeam.printInformation();

        // Ejecución de tareas específicas del equipo de mecánicos
        System.out.println("Tareas realizadas por el equipo de mecánicos :) \n");

        TaskTyreOn taskTyreOn = new TaskTyreOn(4);
        taskTyreOn.speak();
        taskTyreOn.principalAction(4, false, false);

        TaskTyreOff taskTyreOff = new TaskTyreOff(4);
        taskTyreOff.speak();
        taskTyreOff.principalAction(4, true, true);

        TaskFrontWingFlap taskFrontWingFlap = new TaskFrontWingFlap(2);
        taskFrontWingFlap.speak();
        taskFrontWingFlap.principalAction(3, 4, true);

        TaskLollipop taskLollipop = new TaskLollipop(1);
        taskLollipop.speak();
        taskLollipop.principalAction(true, true, true);

        TaskRearJack taskRearJack = new TaskRearJack(2);
        taskRearJack.speak();
        taskRearJack.principalAction(true, true, true);

        TaskTyreGunner taskTyreGunner = new TaskTyreGunner(4);
        taskTyreGunner.speak();
        taskTyreGunner.principalAction(true, true, true);

        // Creación de un equipo de pilotos A y adición de miembros exclusivos del
        // equipo de mecánicos
        System.out.println("**********************");
        System.out.println("Creando TeamDriverA");
        TeamDriverA teamDriverA = new TeamDriverA("TeamDriverA", "Red", 100);
        teamDriverA.getAllTeamInfo();
        System.out.println("Personas pertenecientes");

        // Convertir List<PitCrewMember> a ArrayList<PitCrewMember>
        ArrayList<PitCrewMember> pitCrewMembers = new ArrayList<>(pitCrewTeam.getListPitCrewMember());
        teamDriverA.addExclusivePitCrewMembers(pitCrewMembers);
        teamDriverA.showExclusivePitCrewMembers();


        // Creación de un equipo de pilotos B y adición de miembros exclusivos del
        // equipo de mecánicos
        System.out.println("**********************");
        System.out.println("Creando TeamDriverB");
        TeamDriverB teamDriverB = new TeamDriverB("TeamDriverB", "Mercedez", 95);
        teamDriverB.getAllTeamInfo();
        System.out.println("Personas pertenecientes");
        teamDriverB.addExclusivePitCrewMembers(pitCrewMembers); // Utilizamos la misma lista para TeamDriverB
        teamDriverB.showExclusivePitCrewMembers();

    }

    /**
     * Método estático que crea y devuelve una lista de miembros del equipo de
     * mecánicos de pit crew.
     *
     * @return Lista de miembros del equipo de mecánicos de pit crew.
     */
    public static ArrayList<PitCrewMember> getListOfCrewMembers() {
        ArrayList<PitCrewMember> listPitCrewMember = new ArrayList<>();

        // Se agregan miembros del equipo de mecánicos de pit crew
        listPitCrewMember.add(new PitCrewMember("Adrián", "Gutiérrez", 27, "Tyre gunner", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Diego", "Rodríguez", 29, "Tyre gunner", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Elena", "Fernández", 30, "Tyre gunner", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Raquel", "Sánchez", 32, "Tyre gunner", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("José", "Ortega", 31, "Tyre off", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Rubén", "Ramirez", 25, "Tyre off", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Manuela", "Zapata", 33, "Tyre off", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Pedro", "Martínez", 26, "Tyre off", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Sofía", "Díaz", 29, "Tyre on", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Agustín", "Figueroa", 19, "Tyre on", "BOTH"));
        listPitCrewMember.add(new PitCrewMember("Juan", "García", 28, "Tyre on", "TEAM_A"));
        listPitCrewMember.add(new PitCrewMember("Augusto", "Díaz", 29, "Tyre on", "TEAM_B"));
        listPitCrewMember.add(new PitCrewMember("David", "Rojas", 31, "Front jack", "TEAM_B"));
        listPitCrewMember.add(new PitCrewMember("Luis", "Hernández", 25, "Front jack", "TEAM_A"));
        listPitCrewMember.add(new PitCrewMember("Ana", "Gómez", 32, "Rear jack", "TEAM_A"));
        listPitCrewMember.add(new PitCrewMember("Laura", "Jiménez", 26, "Rear jack", "TEAM_B"));
        listPitCrewMember.add(new PitCrewMember("Javier", "Romero", 33, "Side jack", "TEAM_B"));
        listPitCrewMember.add(new PitCrewMember("Pablo", "López", 27, "Side jack", "TEAM_A"));
        listPitCrewMember.add(new PitCrewMember("Carolina", "Pérez", 28, "Front wing flap adjust", "TEAM_B"));
        listPitCrewMember.add(new PitCrewMember("María", "Martínez", 30, "Front wing flap adjust", "TEAM_A"));
        listPitCrewMember.add(new PitCrewMember("Sara", "Ruiz", 18, "Lollipop man", "BOTH"));

        return listPitCrewMember;
    }
}
