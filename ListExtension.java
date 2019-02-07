package ua.com.samsungitschool;

import java.util.List;

public class ListExtension implements IListDeleteByFilter<Integer>{

    @Override
    public List<Integer> deleteFromList(List<Integer> list, Integer deleteFilterKey) {
    	
        while (list.indexOf(deleteFilterKey) >= 0) {
          list.remove(list.indexOf(deleteFilterKey));
        }
        
        return list;
    }
}
