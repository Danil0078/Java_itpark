package lesson12;

public class Cloning implements Cloneable {

    private  String name;
    private Long id;
    private Double size;
//1 метод клонирования
    public Cloning(Cloning copy){
        this.id = copy.id;
        this.name = copy.name;
        this.size = copy.size;
    }
//2 метод клонирования
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}


