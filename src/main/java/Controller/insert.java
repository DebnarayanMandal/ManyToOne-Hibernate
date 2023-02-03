package Controller;

import java.util.ArrayList;
import java.util.List;

import Dao.Branchdao;
import Dto.Branch;
import Dto.Hospital;

public class insert {
	public static void main(String[] args) {

		Branch branch=new Branch();
		branch.setName("Apollo_Hospital004");
		
		
		Branch branch1=new Branch();
		branch1.setName("Apollo_Hospital005");
		
		
		Branch branch2=new Branch();
		branch2.setName("Apollo_Hospital006");
		
		
		Hospital hospital=new Hospital();
		hospital.setName("Apollo");
		
		
		branch.setHospital(hospital);
		
		List<Branch> b1 =new ArrayList<Branch>();
		b1.add(branch);
		b1.add(branch1);
		b1.add(branch2);
		
		
	
		Branchdao branchdao=new Branchdao();
		branchdao.insert(b1);
		
	}

}
