package sg.nus.iss.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.nus.iss.mvc.model.Staff;

@Repository
public interface staffRepository extends JpaRepository<Staff,String>{

	public Staff findByStaffName(String staffname);
}