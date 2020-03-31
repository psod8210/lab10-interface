public interface Measurable
{
   double getMeasurement();

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
		// WRITE CODE HERE
      return null;
   }
}
