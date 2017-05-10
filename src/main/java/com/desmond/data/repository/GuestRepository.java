package com.desmond.data.repository;

import com.desmond.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by desmond on 9/4/2017.
 */
@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}
