public class ThirdClass {

    public ThirdClass(){
        System.out.println("Wywołuję pierwszy konstruktor");
    }

    public ThirdClass(String variable){
        this();
        System.out.println(variable);
    }
}
