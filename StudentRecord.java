public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   public double average(int first, int last)
   {
        double sum = 0;  
        for(int i=first; i<=last; i++)
        {
             sum += scores[i];
        }
        return sum/(last-first+1);
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   public boolean hasImproved()
   {
      for(int i=1; i<scores.length; i++)
      {
          if(scores[i]<scores[i-1])
          return false;
      }
      return true;
   }  
   
   /** if the values in scores have improved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
       double sum = 0;
       int start;
       if(hasImproved())
       start = scores.length/2;
       else
       start = 0;
       for(int i=start; i<scores.length; i++)
       {
           sum += scores[i];
       }
       return sum/(scores.length-start);
   }
}