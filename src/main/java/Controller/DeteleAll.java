package Controller;

import Dao.Branchdao;

public class DeteleAll {
	public static void main(String[] args) {
		Branchdao branchdao= new Branchdao();
		branchdao.DeleteAll();
	}

}
