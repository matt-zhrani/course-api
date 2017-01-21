package com.ahmedalzhrani.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
	
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core Java Description"),
			new Topic("JavaScript", "JavaScript", "JavaScript Description")
			));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String id){
		
		//loop through topics list to find topic with matching id
		for (Topic topic : topics) {
			if(topic.getId().equals(id)){
				return topic;
			}
		}
		return null;
		
		// using stream in Java 8
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		for (Topic oldTopic : topics) {
			if(oldTopic.getId().equals(id)){
				oldTopic.setId(topic.getId());
				oldTopic.setName(topic.getName());
				oldTopic.setDescription(topic.getDescription());
			}
		}
	}
	
	public String deleteTopic(String id){
		boolean IsDeleted =  topics.removeIf(t-> t.getId().equals(id));
		return "Is Topic deleted? " + IsDeleted;
	}

}
