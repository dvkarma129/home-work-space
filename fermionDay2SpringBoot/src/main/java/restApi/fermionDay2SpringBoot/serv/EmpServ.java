package restApi.fermionDay2SpringBoot.serv;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import restApi.fermionDay2SpringBoot.repo.EmpRepo;

@Service
@RequiredArgsConstructor
public class EmpServ {

	private final EmpRepo empRepo; 
}
