package com.ahmedalzhrani.springbootstarter.topics;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface TopicRepository extends CrudRepository<Topic, String> {

}
