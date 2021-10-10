/**
 * Programming Assignment #2
 * Programmer: James Stanfield
 */
import java.util.*;
import java.io.*;
public class LargestCountry
{
    public static void main(String[] args) throws FileNotFoundException
    {
        readCountry("countrydata.txt");
        countryWithLargestArea(countries);
        countryWithLargestPopulation(countries);
        countryWithLargestPopulationDensity(countries);
    }

    static ArrayList<Country> countries = new ArrayList<Country>();
    public static ArrayList<Country> readCountry(String fileName)
    throws FileNotFoundException 
    {
        File file = new File(fileName);
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            Country country = new Country(in.next(),in.nextInt(),in.nextInt());
            countries.add(country);
            int count = 0;
        }
        return countries;
    }

    public static Country countryWithLargestArea(ArrayList<Country> countries) {
        Country largestArea = countries.get(0);
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getArea() > largestArea.getArea()) {
                largestArea = countries.get(i);
            }
        }
        System.out.println("The country with the largest area is:");
        System.out.println(largestArea.printCountry());
        return largestArea;
    }

    public static Country countryWithLargestPopulation(ArrayList<Country> countries) 
    {
        Country largestPop = countries.get(0);
        for (int j = 0; j < countries.size(); j++) {
            if (countries.get(j).getPopulation() > largestPop.getPopulation()) {
                largestPop = countries.get(j);
            }
        }
        System.out.println("The country with the largest population is:");
        System.out.println(largestPop.printCountry());
        return largestPop;
    }

    public static Country countryWithLargestPopulationDensity
    (ArrayList<Country> countries) {
        Country largestPopDens = countries.get(0);
        for (int k = 0; k < countries.size(); k++) {
            if (countries.get(k).getPopDensity() >
            largestPopDens.getPopDensity()) {
                largestPopDens = countries.get(k);
            }
        }
        System.out.println("The country with the largest Population Density is:");
        System.out.println(largestPopDens.printCountry());
        return largestPopDens;
    }
}