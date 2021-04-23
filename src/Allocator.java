import ast.*;

public class Allocator<T> extends BaseVisitor<T> {

    @Override
    public T visit(GlobalVariable n) {
        Type type = n.type();
        if(type.isNumeric()){
            n.memSize = 8;
            if(type.isInteger()){
                n.memSize = 4;
            }
        }
        else if(type.isString()){
            n.memSize =8; //Größe des Adresspointers
        }
        else if(type.isIndexable()){
            n.memSize = 8; // Größe des Adresspointers
        }
        return null;
    }

    @Override
    public T visit(Function n) {
        n.memSize = 24; //wir müssen laut x86-64-Konventionen 3 Register sichern
        return null;
    }

    @Override
    public T visit(LocalVariable n){
        Type type = n.type();
        if(type.isNumeric()){
            n.memSize = 8;
            if(type.isInteger()){
                n.memSize = 4;
            }
        }
        else if(type.isString()){
            n.memSize = 8; //Größe des Adresspointers
        }
        else if(type.isIndexable()){
            n.memSize = 8; // Größe des Adresspointers
        }
        return null;
    }

}
