package edu.kh.Toy.model.dao;

import java.util.List;
import java.util.Map;

import edu.kh.Toy.model.dto.Toy;

public interface ToyDAO {

	List<Toy> toyAll();

	Toy toyDetail(int index);

	Map<String,Object> toyAdd(Toy toy)throws Exception;

	void saveFile()throws Exception;

	boolean toyComplete(int index)throws Exception;

	boolean toyUpdate(int index, String name, String content)throws Exception;

	Toy toyDelete(int index)throws Exception;

	boolean checkDuplicateToy(String name)throws Exception;

	

	

	
}
