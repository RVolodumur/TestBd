package asd.asd.asd.Dao;

import asd.asd.asd.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    @Query("from User u where u.userName=:xxx")
    User findOne(@Param("xxx") String userName);


}
