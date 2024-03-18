/**
 * Esta clase representa un equipo de Fórmula 1.
 */
public class F1Team {
    private String name; // Nombre del equipo
    private int foundationYear; // Año de fundación del equipo
    private int budget; // Presupuesto del equipo
    private int trophies; // Número de trofeos del equipo

    /**
     * Constructor de la clase F1Team.
     *
     * @param name           Nombre del equipo.
     * @param foundationYear Año de fundación del equipo.
     * @param budget         Presupuesto del equipo.
     * @param trophies       Número de trofeos del equipo.
     */
    public F1Team(String name, int foundationYear, int budget, int trophies) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.budget = budget;
        this.trophies = trophies;
    }

    /**
     * Establece el nombre del equipo.
     *
     * @param name Nombre del equipo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el nombre del equipo.
     *
     * @return Nombre del equipo.
     */
    public String getName() {
        return name;
    }

    /**
     * Presenta al equipo con su nombre y algunos datos relevantes.
     */
    public void presentTeam() {
        System.out.println("¡Bienvenidos al equipo de Fórmula 1: " + name + "!");
        System.out.println("Somos un equipo fundado en " + foundationYear + ".");
        System.out.println("Tenemos un presupuesto de $" + budget + ".");
        System.out.println("Hasta ahora, hemos ganado " + trophies + " trofeos en competiciones.");
    }

    /**
     * Determina la situación económica del equipo en base a su presupuesto.
     */
    public void economyOfTeam() {
        if (this.getBudget() > 0 && this.getBudget() < 50000000) {
            System.out.println("El presupuesto del equipo es bajo, hay que limitar gastos.");
        } else if (this.getBudget() >= 50000000 && this.getBudget() < 100000000) {
            System.out.println("El presupuesto del equipo es medio, se permiten gastos controlados.");
        } else if (this.getBudget() >= 100000000 && this.getBudget() < 135000000) {
            System.out.println("El presupuesto del equipo es alto, se permiten gastos ambiciosos.");
        } else if (this.getBudget() >= 135000000) {
            System.out.println("El presupuesto del equipo supera el máximo establecido por la normativa," +
            "hay que recortar presupuesto.");
        } else {
            System.out.println("El presupuesto ingresado no tiene ningún sentido.");
        }
    }
    
    /**
     * Calcula el número de años que el equipo ha estado compitiendo.
     */
    public void calculateYearsInCompetition() {
        int currentYear = 2024;
        int yearsInCompetition = currentYear - foundationYear;
        if (foundationYear <= currentYear && foundationYear >= 1950) {
            System.out.println("El equipo lleva compitiendo " + yearsInCompetition + " años.");
        } else {
            System.out.println("El año de fundación del equipo no es válido.");
        }
    }
    /**
     * Establece el año de fundación del equipo.
     *
     * @param foundationYear Año de fundación del equipo.
     */
    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
    
    /**
     * Obtiene el año de fundación del equipo.
     *
     * @return Año de fundación del equipo.
     */
    public int getFoundationYear() {
        return foundationYear;
    }
    
    /**
     * Establece el presupuesto del equipo.
     *
     * @param budget Presupuesto del equipo.
     */
    public void setBudget(int budget) {
        this.budget = budget;
    }
    
    /**
     * Obtiene el presupuesto del equipo.
     *
     * @return Presupuesto del equipo.
     */
    public int getBudget() {
        return budget;
    }
    
    /**
     * Establece el número de trofeos del equipo.
     *
     * @param trophies Número de trofeos del equipo.
     */
    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
    
    /**
     * Obtiene el número de trofeos del equipo.
     *
     * @return Número de trofeos del equipo.
     */
    public int getTrophies() {
        return trophies;
    }
}
