package edu.kh.Toy.model.dao;

import java.util.List;

import edu.kh.Toy.model.dto.Toy;

public interface ToyDAO {

	List<Toy> toyAll();

	Toy toyDetail(int index);

	int toyAdd(Toy toy)throws Exception;

	void saveFile()throws Exception;

	boolean toyComplete(int index)throws Exception;
}
