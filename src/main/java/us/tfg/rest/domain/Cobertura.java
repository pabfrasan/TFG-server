package us.tfg.rest.domain;

import java.time.LocalDateTime;

public class Cobertura {

	private Long id;

	private String dbm;

	private String coordenadas;

	private LocalDateTime fecha;

	private String tipoFrecuencia;

	private String operadora;

	private String fabricante;

	private String modelo;

	private String androidVersion;

	private String sdkVersion;

	public Cobertura(Long id, String dbm, String coordenadas, LocalDateTime fecha, String tipoFrecuencia, String operadora,
			String fabricante, String modelo, String androidVersion, String sdkVersion) {
		super();
		this.id = id;
		this.dbm = dbm;
		this.coordenadas = coordenadas;
		this.fecha = fecha;
		this.tipoFrecuencia = tipoFrecuencia;
		this.operadora = operadora;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.androidVersion = androidVersion;
		this.sdkVersion = sdkVersion;
	}
	public Cobertura() {

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDbm() {
		return dbm;
	}

	public void setDbm(String dbm) {
		this.dbm = dbm;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTipoFrecuencia() {
		return tipoFrecuencia;
	}

	public void setTipoFrecuencia(String tipoFrecuencia) {
		this.tipoFrecuencia = tipoFrecuencia;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getSdkVersion() {
		return sdkVersion;
	}

	public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((androidVersion == null) ? 0 : androidVersion.hashCode());
		result = prime * result + ((coordenadas == null) ? 0 : coordenadas.hashCode());
		result = prime * result + ((dbm == null) ? 0 : dbm.hashCode());
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = (int) (prime * result + id);
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((operadora == null) ? 0 : operadora.hashCode());
		result = prime * result + ((sdkVersion == null) ? 0 : sdkVersion.hashCode());
		result = prime * result + ((tipoFrecuencia == null) ? 0 : tipoFrecuencia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cobertura other = (Cobertura) obj;
		if (androidVersion == null) {
			if (other.androidVersion != null)
				return false;
		} else if (!androidVersion.equals(other.androidVersion))
			return false;
		if (coordenadas == null) {
			if (other.coordenadas != null)
				return false;
		} else if (!coordenadas.equals(other.coordenadas))
			return false;
		if (dbm == null) {
			if (other.dbm != null)
				return false;
		} else if (!dbm.equals(other.dbm))
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (operadora == null) {
			if (other.operadora != null)
				return false;
		} else if (!operadora.equals(other.operadora))
			return false;
		if (sdkVersion == null) {
			if (other.sdkVersion != null)
				return false;
		} else if (!sdkVersion.equals(other.sdkVersion))
			return false;
		if (tipoFrecuencia == null) {
			if (other.tipoFrecuencia != null)
				return false;
		} else if (!tipoFrecuencia.equals(other.tipoFrecuencia))
			return false;
		return true;
	}


}
