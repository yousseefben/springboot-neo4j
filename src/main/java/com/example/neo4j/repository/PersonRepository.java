package com.example.neo4j.repository;

import com.example.neo4j.domain.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Movie, Long> {

}
