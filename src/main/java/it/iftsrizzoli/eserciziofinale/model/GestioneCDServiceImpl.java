package it.iftsrizzoli.eserciziofinale.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.eserciziofinale.domain.CDServiceResponse;
import it.iftsrizzoli.eserciziofinale.domain.CompactDisc;

public class GestioneCDServiceImpl implements GestioneCDService {
	private static Logger logger = LoggerFactory.getLogger(GestioneCDServiceImpl.class);
	private static List<CompactDisc> lista = new ArrayList<>();
	static int id = 0;

	public CDServiceResponse addCD(CompactDisc cd) {
		logger.debug("Salvataggio dell'oggetto {}", cd);
		cd.setId(incrementId());
		lista.add(cd);
		return new CDServiceResponse(cd, true);
	}

	public List<CompactDisc> getAllCD() {
		logger.debug("Restituzione della lista di CD {} ", lista);
		return lista;
	}

	private static int incrementId() {
		id++;
		return id;
	}
}
