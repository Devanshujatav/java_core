package in.devanshu.code.generics_class;

public class Box <T>{
    private T item;

    public T getItem(){
        return this.item;
    }

    public void setItem(T item){
        this.item = item;
    }
}

class main{
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("pen");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println(integerBox.getItem());
    }
}
