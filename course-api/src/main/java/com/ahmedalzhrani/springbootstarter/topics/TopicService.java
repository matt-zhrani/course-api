package com.ahmedalzhrani.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);
	}
	
	public void saveTopic(Topic topic){
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id){
		topicRepository.delete(id);
	}

}
