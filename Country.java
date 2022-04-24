public class Country implements Measurable, Comparable<Country>
{
   private String name;
   private double area;

   /**
       Construct a country with name and area.
       @param name country's name
       @param area total area of country
   */
   public Country(String name, double area)
   {
       this.name = name;
       this.area = area;
   }
   
    public double getMeasurement() {
       return area;
   }
   
   public int compareTo(Country c)
   {
       if(this.area > c.getMeasurement())
       {
           return 1;
       }
    
       else if(this.area < c.getMeasurement())
       {
           return -1;
       }
       else
       {
           return 0;
       }
   }
   
   public boolean compareTo(Measurable country) {
       return false;
   }
}
   