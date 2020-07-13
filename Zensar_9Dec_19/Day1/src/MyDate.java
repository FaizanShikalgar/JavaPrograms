
public class MyDate {

	int dd;
    String mon;
    int yy;
    
    public void displayDate(){
        System.out.println("Date is: "+dd+"-"+mon+"-"+yy);
    }
    public void init(){
        dd = 1;
        mon = "Jan";
        yy = 1900;
    }
    public void setDate(int d,String m,int y){
        dd = d;
        mon = m;
        yy = y;
    }
    
    public static void main(String args[]){
        MyDate d1; // Creation of reference
        d1 = new MyDate();//object is created
        d1.init();
        d1.displayDate();
        d1.setDate(6,"Feb",2018);
        d1.displayDate();
    }

}
