package Controller;

import java.util.ArrayList;
import java.util.List;

import Dao.Branchdao;
import Dto.Branch;
import Dto.Hospital;

public class Update {
	public static void main(String[] args) {

		Branch branch=new Branch();
		branch.setId(1);
		branch.setName("Apollo_Hospital006");
		
		
		Branch branch1=new Branch();
		branch1.setId(1);
		branch1.setName("Apollo_Hospital007");
		
		
		Branch branch2=new Branch();
		branch2.setId(1);
		branch2.setName("Apollo_Hospital005");
		
		
		Hospital hospital=new Hospital();
		hospital.setId(1);
		hospital.setName("Apollo");
		
		
		branch.setHospital(hospital);
		
		List<Branch> b1 =new ArrayList<Branch>();
		b1.add(branch);
		b1.add(branch1);
		b1.add(branch2);
		
		
	
		Branchdao branchdao=new Branchdao();
		branchdao.Update(b1);

}
}
