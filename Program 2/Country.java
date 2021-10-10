
/**
 * Programming Assignment #2
 * Programmer: James Stanfield
 */
public class Country
{
    private String name;
    private int pop;
    private int area;
    
    public Country(String name, int pop, int area) {
        this.name = name;
        this.pop = pop;
        this.area = area;
    }
    
    public String getCountry() {
        return name;
    }
    
    public int getPopulation() {
        return pop;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getPopDensity() {
        return pop/area;
    }
    
    public void setCountry(String name) {
        this.name = name;
    }
    
    public void setPopulation(int pop) {
        this.pop = pop;
    }
    
    public void setArea(int area) {
        this.area = area;
    }
    
    public String printCountry() {
        return "Country: " + name + "\t" + "\tPopulation: "
        + pop + "\t" + "\tArea: " + area;
    }
    
}
