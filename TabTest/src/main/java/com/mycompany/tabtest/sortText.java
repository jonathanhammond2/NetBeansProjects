package com.mycompany.tabtest;

//import static com.mycompany.tabtest.SortSearchAlgs.insertionSort;
//import static com.mycompany.tabtest.SortSearchAlgs.swapElements;
import java.util.LinkedList;
import javafx.scene.text.Text;

/**
 *
 * @author jonn
 */
public class sortText extends LinkedList<Text>{
    
    
    
    public void quickSortTxt(int first, int last) {
        //only to quickSort for more than three array elements
        if (last - first > 3) {
            //what's the middle element
            int mid = first + (last - first) / 2;
            //sort the first, middle, and last elements
            if (getIntVal(first) > getIntVal(mid)) {
                swapTxtElements(first, mid);
            }
            if (getIntVal(mid) > getIntVal(last - 1)) {
                swapTxtElements(mid, last - 1);
            }
            if (getIntVal(first) > getIntVal(mid)) {
                swapTxtElements(first, mid);
            }
            
            //move the pivot to the end
            swapTxtElements(mid, last - 1);
            int pivotValue = getIntVal(last - 1);
            
            //start from both sides and work inwatds
            int indexFromLeft = first + 1;
            int indexFromRight = last - 2;
            boolean done = false; //this becomes true once all the elements
            //are positioned relative to the pivot
            while (!done) {
                //move from the left until we find an element greater than the pivot
                while (getIntVal(indexFromLeft) < pivotValue) {
                    indexFromLeft++;
                }
                //move from the right until we have an element less than the pivot
                while (getIntVal(indexFromRight) > pivotValue) {
                    indexFromRight--;
                }
                //provided that the left and right pointers have not crossed
                //swap the elemeents
                if (indexFromLeft < indexFromRight) {
                    swapTxtElements(indexFromLeft, indexFromRight);
                    indexFromLeft++;
                    indexFromRight--;
                } else {
                    done = true;
                }
            }
            //once the pointers cross, move the pivot into the correct location
            swapTxtElements(last - 1, indexFromLeft);
            
            //let's use quickSort to sort each subarray on either side of the pivot
            quickSortTxt(first, indexFromLeft);
            quickSortTxt(indexFromLeft + 1, last);
            
        } else {
            insertionSortTxt(first, last);
        }
    }
    
    public void insertionSortTxt(int first, int last){
        for (int i = first+1; i<last; i++){
            Text next = super.get(i);
            //start searching backwards for where we're going to insert next
            int iFill = i - 1;
            while (iFill >=0 && getIntVal(next) < getIntVal(iFill)){
                //As long as this is true, move the iFill element up one to make space
                super.set(iFill+1, super.get(iFill));
//                getIntVal(iFill+1) = getIntVal(iFill);
                iFill--;
            }
            //When we're done, we know where our element belongs
//            a[iFill + 1] = next;
            super.set(iFill+1, next);
        }
    }
    
    public int getIntVal(Text t){
        return Integer.parseInt(t.getText());
    }
    
    public int getIntVal(int i){
        return Integer.parseInt(super.get(i).getText());
    }
    
    public void setIntVal(int i, int j){
//        super.set(i, new Text(j + ""));
        super.get(i).setText(j + "");
    }
    
    public void swapTxtElements(int i, int j){
       Text temp = super.get(i);
       super.set(i, super.get(j));
       super.set(j, temp);
       
//       Text temp = t.get(i);
//       t.set(i, t.get(j));
//       t.set(j, temp);
//        int[] nums = new int[txt.size()];
//        for (int k = 0; k<txt.size(); k++){
//            nums[k]=Integer.parseInt(txt.get(k).getText());
//        }
//        quickSort(nums,0,txt.size());
//            
//            for (int l = 0; l<txt.size(); l++){
//            txt.get(l).setText(nums[l] + "");}
   }
}
