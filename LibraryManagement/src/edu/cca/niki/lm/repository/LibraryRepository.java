package edu.cca.niki.lm.repository;
import java.util.ArrayList;
import java.util.List;

import edu.cca.niki.lm.blueprint.LibraryCRUD;
import edu.cca.niki.lm.models.Library;
public class LibraryRepository implements LibraryCRUD{
    private List<Library> libraries=null;
	
	public  LibraryRepository() {
		libraries=new ArrayList<>();
		libraries.add(new Library("Alice",6543.00,43,6));
		libraries.add(new Library("Border",3456.00,65,8));
		libraries.add(new Library("Ilia",6547.00,67,9));
		libraries.add(new Library("Land",1234.00,44,5));
		// TODO Auto-generated constructor stub
	}
	@Override
	public Integer create(Library l) {
		libraries.add(l);
	 return l.getId();
	}

	@Override
	public List<Library> readAll() {
		// TODO Auto-generated method stub
		return libraries;
	}

	@Override
	public Library readOne(Integer id) {
	  int index=-1;
	  for(int i=0;i<libraries.size();i++)
	  {
		  if(libraries.get(i).getId().equals(id)) {
			  index=i;
			  break;
		  }
	  }
	  if(index!=-1)
	  {
		  return libraries.get(index);
	  }
	  else {
		  return null;
	  }
	}

	@Override
	public Library update(Integer id, Library l) {
		Library li=readOne(id);
		if(li!=null) {
			li.setBname(l.getBname());
			li.setPrice(l.getPrice());
			li.setRacknumber(l.getRacknumber());
			li.setCopy(l.getCopy());
			}
		return li;
	}

	@Override
	public Boolean delete(Integer id) {
		/*Boolean isDeleted=false;
		Product pr=readOne(id);
		if(pr!=null)
		{
			isDeleted=products.remove(pr);
		}
		return isDeleted*/
		return libraries.remove(readOne(id));
	}
	
      
}
