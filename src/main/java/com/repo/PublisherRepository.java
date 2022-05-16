package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}
