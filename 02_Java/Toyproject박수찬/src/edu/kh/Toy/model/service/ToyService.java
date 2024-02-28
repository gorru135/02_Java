package edu.kh.Toy.model.service;
import java.time.LocalDateTime;
import java.util.Map;

public interface ToyService {

	/**
	 * 장난감 목록 반환 서비스
	 * @return todoList + 완료개수
	 */
	Map<String, Object> toyAll();

	String dateFormat(LocalDateTime regDate);

	String toyDetail(int index);

	Map<String,Object> toyAdd(String name, String string)throws Exception;

	boolean toyComplete(int index)throws Exception;

	boolean toyUpdate(int index, String name, String string)throws Exception;

	String toyDelete(int index)throws Exception;

	boolean checkDuplicateToy(String name)throws Exception;



	

	

	

	
}
