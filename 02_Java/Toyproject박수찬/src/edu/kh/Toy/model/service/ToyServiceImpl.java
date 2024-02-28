package edu.kh.Toy.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.Toy.model.dao.ToyDAO;
import edu.kh.Toy.model.dao.ToyDAOImpl;
import edu.kh.Toy.model.dto.Toy;

public class ToyServiceImpl implements ToyService{

	private ToyDAO dao = null;
	
	public ToyServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		dao = new ToyDAOImpl();
		
	}

	
	
	public Map<String, Object> toyAll() {
		
		
		List<Toy> toyList = dao.toyAll();
		
		int completeCount = 0;
		
		for(Toy toy : toyList) {
			
			if(toy.isComplete()) {
				completeCount++;
			}
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("장난감 목록", toyList);
		map.put("진행 여부", completeCount);
		
		return map;
	}


	
	public String dateFormat(LocalDateTime regDate) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
		String formattedDateTime = regDate.format(formatter);
		return formattedDateTime;
	}


	@Override
	public String toyDetail(int index) {
		// TODO Auto-generated method stub
		
		Toy toy = dao.toyDetail(index);
		
		if(toy == null) return null;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n---------------------------------------\n");
		sb.append(String.format("장난감 이름 : %s\n", toy.getName()));
		sb.append(String.format("생산일 : %s\n", dateFormat( toy.getRegDate() )));
		sb.append(String.format("완성여부 : %s\n",toy.isComplete() ? "O":"X" ));
		sb.append("\n[특이 사항]\n");
		sb.append("\n---------------------------------------\n");
		sb.append(String.format("%s\n", toy.getDetal()));
		return sb.toString();
		
	}


	@Override
	public Map<String,Object> toyAdd(String name, String content) throws Exception{
		
		Toy toy = new Toy(name,content,false,LocalDateTime.now(),0);
		Map<String,Object> map = dao.toyAdd(toy);
		
		return map;
	}
	
	@Override
	public boolean toyComplete(int index) throws Exception {
		
		 return dao.toyComplete(index);
	}
	
	@Override
	public boolean toyUpdate(int index, String name, String content) throws Exception{
		
		return dao.toyUpdate(index, name, content);
	}
	
	@Override
	public String toyDelete(int index) throws Exception {
		
		Toy toy = dao.toyDelete(index);
		
		if(toy == null) return null;
		
		return toy.getName();
	}
	
	@Override
	public boolean checkDuplicateToy(String name) throws Exception{
		
		return dao.checkDuplicateToy(name);
	}
	
}
