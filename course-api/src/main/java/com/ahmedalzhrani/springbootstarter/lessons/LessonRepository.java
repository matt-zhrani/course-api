package com.ahmedalzhrani.springbootstarter.lessons;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
@Transactional
public interface LessonRepository extends CrudRepository<Lesson, String> {
	
	public List<Lesson> findByCourseId(String courseId);
}
