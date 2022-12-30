package com.example.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.domain.Tour;

import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer>{
  Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);

  @RestResource(exported = false)
  <S extends Tour> S save(S s);

  @RestResource(exported = false)
  <S extends Tour> Iterable<S> saveAll(Iterable<S> iterable);

  @RestResource(exported = false)
  void deleteById(Integer integer);

  @RestResource(exported = false)
  void delete(Tour tour);

  @RestResource(exported = false)
  void deleteAll(Iterable<? extends Tour> iterable);

  @RestResource(exported = false)
  void deleteAll();

  @RestResource(exported = false)
  Optional<Tour> findById(int tourId);
}
