package restApi.fermionDay2SpringBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import restApi.fermionDay2SpringBoot.dto.EmpDto;

public interface EmpRepo extends JpaRepository<EmpDto, Integer> {

}
