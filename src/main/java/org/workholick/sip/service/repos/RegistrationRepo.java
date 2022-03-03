package org.workholick.sip.service.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.workholick.sip.service.entities.Login;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 01-03-2022
 **/
@Repository
public interface RegistrationRepo extends CrudRepository<Login, Long> {

    @Query("from Login where upper(userName)=:userName")
    public Login findByUserName(@Param("userName")String userName);

}
