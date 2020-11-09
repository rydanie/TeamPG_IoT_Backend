package com.myproject.iot.repository;
//comment
//imports all the stuff
import com.myproject.iot.domain.Gateway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//when it goes looking for this the @ tells it where to find it
@RepositoryRestResource
public interface GatewayRepository extends JpaRepository<Gateway, Long> {

}
