package com.ahmedalzhrani.springbootstarter.courses;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
@Transactional
public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicId);
}
