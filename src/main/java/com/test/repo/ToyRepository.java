package com.test.repo;

import com.test.entity.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ToyRepository extends JpaRepository<Toy, Long> {
}
