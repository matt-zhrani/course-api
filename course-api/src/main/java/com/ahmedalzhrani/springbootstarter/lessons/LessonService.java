package com.ahmedalzhrani.springbootstarter.lessons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	
	@Autowired
	LessonRepository lessonRepository;
	
	
	public List<Lesson> getAllLessons(String courseId){
		List<Lesson> lessons = new ArrayList<Lesson>();
		lessonRepository.findByCourseId(courseId).forEach(lessons::add);
		return lessons;
	}
	
	public Lesson getLesson(String id){
		return lessonRepository.findOne(id);
	}
	
	public void deleteLesson(String id){
		lessonRepository.delete(id);
	}
	
	public void addLesson(Lesson lesson){
		lessonRepository.save(lesson);
	}
	
	public void updateLesson(Lesson lesson){
		lessonRepository.save(lesson);
	}

}
