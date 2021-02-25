package generics;

/**
 * 들어오는 값과 나가는 값을 T 형으로 바꿔 줘야**/
class GenList<T>{
    private Object[] nums;
    private int current;
    public GenList(){
        nums = new Object[3];
        current = 0;
    }
    public void add(T num){
        nums[current] = num;
        current++;

    }
    public T get(int index){
        return (T)nums[index];
    }
}

public class DemoGen {
    public static void main(String[] args) {
        GenList<String> list = new GenList();
        list.add("박소정");
//        list.add(26); // String 이 아닌게 들어오니 error 발생 타입의 안정성 보
//        int a = (Integer)list.get(0); //
    }
}