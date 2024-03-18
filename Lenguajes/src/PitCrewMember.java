/**
 * Clase que representa a un miembro del equipo de mecánicos de pit crew.
 */
public class PitCrewMember {
    private int age; // Edad del miembro del equipo
    private String rol; // Rol del miembro del equipo
    private String name; // Nombre del miembro del equipo
    private String lastName; // Apellido del miembro del equipo
    private String worksFor; // Equipo para el que trabaja el miembro del equipo

    /**
     * Constructor de la clase PitCrewMember.
     *
     * @param name       Nombre del miembro del equipo.
     * @param lastName   Apellido del miembro del equipo.
     * @param age        Edad del miembro del equipo.
     * @param rol        Rol del miembro del equipo.
     * @param inWorksFor Equipo para el que trabaja el miembro del equipo.
     */
    public PitCrewMember(String name, String lastName, int age, String rol, String inWorksFor) {
        this.age = age;
        this.rol = rol;
        this.name = name;
        this.lastName = lastName;
        this.worksFor = inWorksFor;
    }

    /**
     * Obtiene la edad del miembro del equipo.
     *
     * @return Edad del miembro del equipo.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Establece la edad del miembro del equipo.
     *
     * @param age Edad del miembro del equipo.
     */
    public void setAge(int age) {
        if (age > 100) {
            this.age = 100;
        } else if (age < 1) {
            this.age = 1;
        }
    }

    /**
     * Obtiene el rol del miembro del equipo.
     *
     * @return Rol del miembro del equipo.
     */
    public String getRol() {
        return this.rol;
    }

    /**
     * Establece el rol del miembro del equipo.
     *
     * @param rol Rol del miembro del equipo.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene el nombre del miembro del equipo.
     *
     * @return Nombre del miembro del equipo.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Establece el nombre del miembro del equipo.
     *
     * @param name Nombre del miembro del equipo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el apellido del miembro del equipo.
     *
     * @return Apellido del miembro del equipo.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Establece el apellido del miembro del equipo.
     *
     * @param lastName Apellido del miembro del equipo.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene el equipo para el que trabaja el miembro del equipo.
     *
     * @return Equipo para el que trabaja el miembro del equipo.
     */
    public String getWorksFor() {
        return this.worksFor;
    }

    /**
     * Establece el equipo para el que trabaja el miembro del equipo.
     *
     * @param inWorksFor Equipo para el que trabaja el miembro del equipo.
     */
    public void setWorksFor(String inWorksFor) {
        this.worksFor = inWorksFor;
    }
}
