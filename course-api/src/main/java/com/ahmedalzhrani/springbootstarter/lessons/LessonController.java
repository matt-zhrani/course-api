package com.ahmedalzhrani.springbootstarter.lessons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahmedalzhrani.springbootstarter.courses.Course;

@RestController
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}/lessons")
	public List<Lesson> displayAllLessons(@PathVariable String courseId){
		return lessonService.getAllLessons(courseId);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public Lesson displayLesson(@PathVariable String id){
		
		return lessonService.getLesson(id);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void deleteLesson(@PathVariable String id){
		lessonService.deleteLesson(id);
	}
	
	@RequestMapping(method= RequestMethod.POST, value = "/topics/{topicId}/courses/{courseId}/lessons")
	public void createLesson(@RequestBody Lesson lesson, @PathVariable String courseId){
		lesson.setCourse(new Course(courseId,"","",""));
		lessonService.addLesson(lesson);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}/lessons")
	public void updateLesson(@RequestBody Lesson lesson, @PathVariable String courseId){
		lesson.setCourse(new Course(courseId,"","",""));
		lessonService.updateLesson(lesson);
	}

}
