
/**
 * Driver for the class StudentRecord
 *
 * @JKim 
 * @version (0.1)
 */
public class StudentRecordTester
{
    public static void main(String[] args)
    {
        int[] a={50,50,20,80,30};
        int[] b={20,50,50,53,80};
        int[] c={20,50,50,80};
        
        StudentRecord[] students = new StudentRecord[3];
        students[0] = new StudentRecord(a);
        students[1] = new StudentRecord(b);
        students[2] = new StudentRecord(c);
    }
}
