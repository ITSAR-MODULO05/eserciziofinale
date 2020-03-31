package it.iftsrizzoli.eserciziofinale.domain;

public class CDServiceResponse {

	private CompactDisc cd;
	private boolean result;

	/**
	 * @param user
	 * @param result
	 */
	public CDServiceResponse(CompactDisc cd, boolean result) {
		this.cd = cd;
		this.result = result;
	}

	public CompactDisc getCd() {
		return cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "StudenteServiceResponse [CompactDisc=" + cd + ", result=" + result + "]";
	}

}
