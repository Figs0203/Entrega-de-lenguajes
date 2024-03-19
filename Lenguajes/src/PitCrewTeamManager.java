import java.util.ArrayList;
import java.util.List;

public class PitCrewTeamManager implements PitCrewTeamInter {
    private List<PitCrewMember> listPitCrewMember = new ArrayList<>();

    @Override
    public void addListOfPitCrewMember(List<PitCrewMember> listPitCrewMember) {
        for (PitCrewMember pitCrewMember : listPitCrewMember) {
            if (this.validateAge(pitCrewMember.getAge())) {
                this.listPitCrewMember.add(pitCrewMember);
            }
            else {
                System.out.println("No es posible agregar por edad: " + pitCrewMember.getName());
            }
        }
    }

    @Override
    public void printInformation() {
        System.out.println("Información de los miembros del equipo de mecánicos:");
        if (!listPitCrewMember.isEmpty()) {
            for (PitCrewMember pitCrewMember : listPitCrewMember) {
                System.out.println("Nombre y apellido: " + pitCrewMember.getName() + " " + pitCrewMember.getLastName());
                System.out.println("Edad: " + pitCrewMember.getAge());
                System.out.println("Rol: " + pitCrewMember.getRol());
                System.out.println("Trabaja para (WorksFor): " + pitCrewMember.getWorksFor());
                System.out.println();
            }
        } else {
            System.out.println("La lista de miembros del pit crew está vacía.");
        }
    }

    @Override
    public List<PitCrewMember> getListPitCrewMember() {
        return listPitCrewMember;
    }

    private boolean validateAge(int age) {
        return age >= 18 && age <= 60;
    }
}
