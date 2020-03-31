package it.iftsrizzoli.eserciziofinale.model;

import java.util.List;

import it.iftsrizzoli.eserciziofinale.domain.CDServiceResponse;
import it.iftsrizzoli.eserciziofinale.domain.CompactDisc;

public interface GestioneCDService {
	
	
	public CDServiceResponse addCD(CompactDisc cd);
	
	public List<CompactDisc> getAllCD();

}
