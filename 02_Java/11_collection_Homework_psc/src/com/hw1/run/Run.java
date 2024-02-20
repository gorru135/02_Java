package com.hw1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.hw1.model.dto.Friend;

public class Run {
	
    public static void main(String[] args) {
    	
    	List<Friend> friendList = new ArrayList<Friend>();
    	
    	//객체 추가 방법2 : Collections.addAll();
    	
    	/*Collections.addAll(friendList,new Friend("짱구"),new Friend("철수"),
    			new Friend("유리"),new Friend("훈이"),new Friend("맹구"));*/
    	
    	// 객체 추가 방법3 : List.of() : java 9 이상의 버전에서 사용 가능
    	/*List<Friend> friends = List.of(new Friend("짱구"),new Friend("철수"),
    			new Friend("유리"),new Friend("훈이"),new Friend("맹구")); */   	
    	
    	friendList.add(new Friend("짱구"));
    	friendList.add(new Friend("철수"));
    	friendList.add(new Friend("유리"));
    	friendList.add(new Friend("훈이"));
    	friendList.add(new Friend("맹구"));
        
    	/*int random = (int) (Math.random()*friendList.size());
    	
    	Friend leader = friendList.get(random);
    	
    	leader.pickLeader();*/
    	
    	// 랜덤으로 골목대장 뽑기 
    	// note ! Random random = new Random();
    	int randomIndex = (int)(Math.random() * friendList.size());
    	
    	Friend leader = friendList.get(randomIndex);
    	
    	leader.pickLeader();
    }
}
