
package model;

/**
 *
 * @author Andres
 */
public enum Activities {
    COFFEE_COLLECTOR("recolector de cafe",new Farm().calculateSalaryCaficultor()), 
    CROP_CUT("guadañador",new Farm().SALARY_FOR_DAY), 
    ANIMAL_CARETAKER("cuidador de animales",new Farm().SALARY_FOR_DAY);
    private String type;
    private double salary;
    private int startTime;
    private int finalTime;

    private Activities(String type, double salary) {
        this.type = type;
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }
    

    
    
    
}
