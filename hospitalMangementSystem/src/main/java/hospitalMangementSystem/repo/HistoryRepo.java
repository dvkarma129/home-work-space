
package hospitalMangementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import hospitalMangementSystem.Entity.History;
import hospitalMangementSystem.Entity.Patient;

public interface HistoryRepo extends JpaRepository<History, Long>{

	History findTopByPatientOrderByDateAdmittedDesc(Patient patient);

}
