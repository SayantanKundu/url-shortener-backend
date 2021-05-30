package com.lowes.urlshortener.repository;

import com.lowes.urlshortener.model.URLModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends JpaRepository<URLModel, Long> {
}
