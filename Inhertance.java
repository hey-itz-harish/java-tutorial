public class Inhertance {
    int count ;   
}

class subclass  extends Inhertance{
    void print_increment(){
        System.out.println(++count);
    }
}
class main{
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.print_increment();
    }
}
