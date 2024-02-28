package edu.kh.Toy.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.Toy.model.dto.Toy;

public class ToyDAOImpl implements ToyDAO{

	private final String FILE_PATH = "/io_project/Toy.dat";
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	

	
	private List<Toy> toyList = null;
	
	
	public ToyDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				toyList = (ArrayList<Toy>)ois.readObject();
				
			} finally {
				
				if(ois != null)ois.close();
			}
			
		} else {
			
			File directory = new File("/io_project");
			
			if(directory.exists() ) directory.mkdir();
			
			toyList = new ArrayList<Toy>();
			
			toyList.add(new Toy("곰인형","귀여운 인형",false,LocalDateTime.now(),0));
			toyList.add(new Toy("파피","여자아이 인형",false,LocalDateTime.now(),0));
			toyList.add(new Toy("허기워기","팔이긴 인형",false,LocalDateTime.now(),0));
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH) );
				oos.writeObject(toyList);
				
			} finally {
				
				if(oos != null)oos.close();
			}
			
			System.out.println("@@@ toyList 파일 생성 완료 @@@");
		}
		
	}
/**
 * saveFile
 */
	@Override
	public void saveFile() throws Exception{
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(toyList);
		} finally {
			
			oos.close();
		}
		
	}
	
	@Override
	public List<Toy> toyAll() {
		
		return toyList;
	}
	
	@Override
	public Toy toyDetail(int index) {
		
		if(index < 0 || index >= toyList.size()) return null;
		
		
		return toyList.get(index);
	}
	
	@Override
	public Map<String,Object> toyAdd(Toy toy) throws Exception {
		
		
		if(toyList.add(toy)) {
			
		
			saveFile();
			
			int count = 0;
			for(Toy countToy : toyList) {
				if(countToy.getName().equals(toy.getName())) {
					count++;
					toy.setQuantity(toy.getQuantity());
					
					
				} 
				
			}
					
			Map<String,Object> toyMap = new HashMap<String,Object >();
			
			toyMap.put("toycount",count);
			toyMap.put("toyList",toyList);
			
			return toyMap;
		}
		
		return null;
		
	}
	
	@Override
	public boolean toyComplete(int index) throws Exception {
		if(index < 0 || index >= toyList.size()) return false;
				
		
		boolean complete = toyList.get(index).isComplete(); 
		toyList.get(index).setComplete(!complete);
		
		saveFile(); // 파일 저장
		
		
		return true;
	}
	
	@Override
	public boolean toyUpdate(int index, String name, String content) throws Exception{
		Toy toy = new Toy(name,content,
				toyList.get(index).isComplete(),
				toyList.get(index).getRegDate(),
				toyList.get(index).getQuantity()
				);
		if(toyList.set(index, toy) != null) {
			saveFile();
			return true;
		}
		return false;
	}
	
	@Override
	public Toy toyDelete(int index) throws Exception {
	
		if(index < 0 || index>=toyList.size()) return null;
		
		Toy toy = toyList.remove(index);
		
		saveFile();
		return toy;
	}
	
	@Override
	public boolean checkDuplicateToy(String name)throws Exception {
		// toyList에서 toy객체 하나씩 꺼내서
		// toy객체가 가진 이름이 name과 같은게 있는지 검사
		// 있으면 flag = true
		// 없으면 flag = false
		// return falg;
		
		boolean flag = true;
		
		
		for(Toy tot : toyList) {
			
			if(tot.getName().equals(name)) {
				flag = false;
			}
		}
		return flag;
	}
	
}
