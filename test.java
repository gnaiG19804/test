/**
 * test
 */
public class test {
public static void main(String[] args) {
  exam dt1=new exam();
  dt1.getDt()[0]=new essay("Cau 1:Viet bai van", 75, "ABC");
  dt1.getDt()[1]=new essay("Cau 2:Viet doan van", 50, "DEF");
  choice[] c1 = {new choice("20", false), new choice("30", false), new choice("10", true), new choice("40", false)};
  dt1.getDt()[2]=new multiple_choice("Cau 3:Co bao nhieu:", 25,c1);
  choice[] c2 = {new choice("20", false), new choice("30", false), new choice("10", false), new choice("40", true)};
  dt1.getDt()[3]=new multiple_choice("Cau 4:Co bao nhieu:", 50,c2);
  dt1.display();
  System.out.println("Do kho cua de thi:"+dt1.DKTB());
  System.out.println(dt1); 
  }
}