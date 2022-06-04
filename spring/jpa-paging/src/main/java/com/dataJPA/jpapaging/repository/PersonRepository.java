package com.dataJPA.jpapaging.repository;

import com.dataJPA.jpapaging.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends PagingAndSortingRepository<Person,Integer> {



}
