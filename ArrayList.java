class ArrayList{
    public static void main(String args[]){
    
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add delete get set add element in between size
        list.add(0);
        list.remove(3);
        list.add(1, 1);
        list.set(0, 5);
        int size = list.size();
        //loops iteration 
        for(i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}

