package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
