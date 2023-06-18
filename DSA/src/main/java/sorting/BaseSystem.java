package sorting;

//Demonstrate STRATEGY design pattern
public abstract class SortSystem {
    //Composing interface refernece (has-a)
    Sortable iSortable;

    int[] sort(int[] arr){
        return iSortable.sort(arr);
    }

    void display(){
        System.out.println("SortSystem::display");
    }
    //setter method to override implementation instance assigned in constructor of xyzSort class
    public void setiSortable(Sortable iSortable) {
        this.iSortable = iSortable;
    }

}
