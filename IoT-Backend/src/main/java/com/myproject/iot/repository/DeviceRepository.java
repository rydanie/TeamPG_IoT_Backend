package com.myproject.iot.repository;
//comment
import com.myproject.iot.domain.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource
public interface DeviceRepository extends JpaRepository<Device, Long> {
    List<Device> findByConName(String conName);
}
