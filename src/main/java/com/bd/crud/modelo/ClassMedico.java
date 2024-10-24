package com.bd.crud.modelo;

import java.sql.Date;
import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="TBL_MEDICO")
public class ClassMedico {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IDMEDICOCL3;
	private String NOMBRECL3;
	private String APELLIDOCL3;
	private String EMAIL;
	private String DNICL3;
	private String ESTADOCIVILCL3;
	
	private LocalDate FECHANACIMCL3;
	
	
	
	
	
	public ClassMedico() {
		//super();
		
	}
		
	
	public ClassMedico(int iDMEDICOCL3, String nOMBRECL3, String aPELLIDOCL3, String eMAIL, String dNICL3,
			String eSTADOCIVILCL3, LocalDate fECHANACIMCL3) {
		super();
		IDMEDICOCL3 = iDMEDICOCL3;
		NOMBRECL3 = nOMBRECL3;
		APELLIDOCL3 = aPELLIDOCL3;
		EMAIL = eMAIL;
		DNICL3 = dNICL3;
		ESTADOCIVILCL3 = eSTADOCIVILCL3;
		FECHANACIMCL3 = fECHANACIMCL3;
	}
	
	
	
	public int getIDMEDICOCL3() {
		return IDMEDICOCL3;
	}
	public void setIDMEDICOCL3(int iDMEDICOCL3) {
		IDMEDICOCL3 = iDMEDICOCL3;
	}
	public String getNOMBRECL3() {
		return NOMBRECL3;
	}
	public void setNOMBRECL3(String nOMBRECL3) {
		NOMBRECL3 = nOMBRECL3;
	}
	public String getAPELLIDOCL3() {
		return APELLIDOCL3;
	}
	public void setAPELLIDOCL3(String aPELLIDOCL3) {
		APELLIDOCL3 = aPELLIDOCL3;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getDNICL3() {
		return DNICL3;
	}
	public void setDNICL3(String dNICL3) {
		DNICL3 = dNICL3;
	}
	public String getESTADOCIVILCL3() {
		return ESTADOCIVILCL3;
	}
	public void setESTADOCIVILCL3(String eSTADOCIVILCL3) {
		ESTADOCIVILCL3 = eSTADOCIVILCL3;
	}
	public LocalDate getFECHANACIMCL3() {
		return FECHANACIMCL3;
	}
	public void setFECHANACIMCL3(LocalDate fECHANACIMCL3) {
		FECHANACIMCL3 = fECHANACIMCL3;
	}

	



	
	
	
	
	
	

}
