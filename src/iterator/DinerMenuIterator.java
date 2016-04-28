package iterator;

import java.util.ArrayList;

public class DinerMenuIterator implements Iterator {
 
	private ArrayList<MenuItem> items;
	private int position =0;
	
	
	public DinerMenuIterator(ArrayList<MenuItem> items){
		this.items=items;
	}
	
	@Override
	public MenuItem next() {
         MenuItem menuItem =items.get(position);
         position = position + 1;
         return menuItem;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.size() || items.get(position)==null){
			 return false;
	     } else {
	    	 return true;
	     }	
	}

}
