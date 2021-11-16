package de.hft_stuttgart.scma.middlewareproject.repository;

import de.hft_stuttgart.scma.middlewareproject.model.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends CrudRepository<Bike, Long> {

}
