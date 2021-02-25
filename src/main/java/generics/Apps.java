package generics;

class ObjectList{
    private Object[] nums;
    private int current;
    public ObjectList(){
        nums = new Object[3];
        current = 0;
    }
    public void add(Object num){
        nums[current] = num;
        current++;

    }
    public Object get(int index){
        return nums[index];
    }
}

public class Apps {
    public static void main(String[] args) {
        ObjectList list = new ObjectList();
        list.add("박소정");
        list.add(26);
        System.out.println("넣는건 에러 안남");
        int a = (Integer)list.get(0);
    }
}
