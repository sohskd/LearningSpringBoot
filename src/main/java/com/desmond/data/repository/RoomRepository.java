package com.desmond.data.repository;

import com.desmond.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by desmond on 2/4/2017.
 */
public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);
    Room findByBedInfo(String BedInfo);
}
