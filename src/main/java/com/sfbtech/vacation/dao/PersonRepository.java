package com.sfbtech.vacation.dao;

import com.sfbtech.vacation.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
//    @Query("from PersonEntity p where concat(p.lastName, ' ', p.firstName, ' ', p.patronymic) like concat('%', :name, '%') ")
//    List<PersonEntity> findPersonEntityBy(@Param("name") String name);
}
