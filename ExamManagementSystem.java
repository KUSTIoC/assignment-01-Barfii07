package exammanagementsystem;

/**
 *
 * @author MOON COMP&MOBILE
 */
public class ExamManagementSystem {
    public static void main(String[] args) {
        // TODO code application logic here
        Paper p1=new PaperPaper p1=new Paper("Java","CS103","Sir Ali","2nd","BS CS","Annual"," dept IIT room no 3 ",129,500,2,4,2020,8,30,0,false);
        
        Paper p2=new Paper("Islami Std","CS207","sir Amir","2nd","BS CS","Annual"," dept IIT room no 6",123,500,3,4,2020,8,30,0,false);
        
        Paper p3=new Paper("Eng","CS101","Sir Asif","1st","BS CS","Annual"," dept IIT room no 1",123,500,4,4,2020,8,30,0,false);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.println(p1.toString()+new Course("java","CS103,"MCS"));
        System.out.println(p2.toString()+new Course("Islami Std","CS102","MSC"));
        System.out.println(p3.toString()+new Course("English","CS201","BS CS"));
    }
    
}
