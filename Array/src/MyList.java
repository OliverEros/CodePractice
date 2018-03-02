public class MyList {

    private Object[] storage;
    private int counter = 0;
    private int specificCounter = 0;
    private int size = 10;




    public MyList() {
        storage = new Object[size];
    }

    public int checkLength(){
        return storage.length;
    }

    public void add(Object obj) {
       increaseSize(counter);
        storage[counter] = obj;
        counter++;
    }

    public void addItemSpecifically(int specificCounter, Object obj) {
        increaseSize(specificCounter);
        storage[counter] = obj;
    }

    public Object returnItem(int address) {
        return storage[address].toString();

    }


    public boolean isEmpty(){
        boolean a = false;
        for (Object item : storage){
            if(item == null){
                a = true;
            }else{
                System.out.println("Not Empty");
                a = false;
                break;
            }
        }
        return a;
    }

    public void increaseSize(int index){
        int oldStorage = storage.length;
        int newStorage = oldStorage + 10;
        newStorage = newStorage;
        if(index >= storage.length){
            this.storage = new Object[newStorage];
            this.storage = storage.clone();
        }
    }








}






