package lesson12.cornercase;

import lesson12.MethodException;
import lesson12.UnnamedException;

public class B extends A {

    @Override
    protected void a()  {
        try {
            super.a();
        }catch (MethodException e){
            e.printStackTrace();
        }
    }

    void b(){

    }
}
