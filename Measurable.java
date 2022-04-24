public interface Measurable
{
   double getMeasurement();
   int compareTo(Country c);

   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasurement();
      }
      if (objects.length > 0)
      {
         return sum / objects.length;
      }
      else
      {
         return 0;
      }
   }

   /**
      Finds the Measurable object with the largest measurement of a given list of objects.
      @param objects an array of Measurable objects
      @return the Measurable object with maximum/largest value, null if array is empty
   */
   public static Measurable max(Measurable[] objects)
   {
       Measurable answer = null;
       double value = 0;
       for (Measurable ans : objects)
       {
           double value1 = ans.getMeasurement();
           if(value1 > value)
           {
               answer = ans;
               value = value1;
           }
       }
       if(objects.length < 0) {
           return null;
       }
       else
       {
           return answer;
       }
   }
}