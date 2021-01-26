package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PedidoCabecera
 *
 */
@Entity

public class PedidoCabecera implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date fecha;
	private float subtotal;
	private float total;
	private float iva;
	private String estado;
	
	@ManyToOne
	@JoinColumn
	private Persona persona;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoCabecera")
	private List<PedidoDetalle> pedidosDetale;
	
	public PedidoCabecera() {
		super();
	}

	public PedidoCabecera(int id, Date fecha, float subtotal, float total, float iva, String estado, Persona persona,
			List<PedidoDetalle> pedidosDetale) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.total = total;
		this.iva = iva;
		this.estado = estado;
		this.persona = persona;
		this.pedidosDetale = pedidosDetale;
	}
	
	public PedidoCabecera(int id, Date fecha, float subtotal, float total, float iva, String estado, Persona persona) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.total = total;
		this.iva = iva;
		this.estado = estado;
		this.persona = persona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<PedidoDetalle> getPedidosDetale() {
		return pedidosDetale;
	}

	public void setPedidosDetale(List<PedidoDetalle> pedidosDetale) {
		this.pedidosDetale = pedidosDetale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(iva);
		result = prime * result + ((pedidosDetale == null) ? 0 : pedidosDetale.hashCode());
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		result = prime * result + Float.floatToIntBits(subtotal);
		result = prime * result + Float.floatToIntBits(total);
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
		PedidoCabecera other = (PedidoCabecera) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(iva) != Float.floatToIntBits(other.iva))
			return false;
		if (pedidosDetale == null) {
			if (other.pedidosDetale != null)
				return false;
		} else if (!pedidosDetale.equals(other.pedidosDetale))
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		if (Float.floatToIntBits(subtotal) != Float.floatToIntBits(other.subtotal))
			return false;
		if (Float.floatToIntBits(total) != Float.floatToIntBits(other.total))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PedidoCabecera [id=" + id + ", fecha=" + fecha + ", subtotal=" + subtotal + ", total=" + total
				+ ", iva=" + iva + ", estado=" + estado + ", persona=" + persona + ", pedidosDetale=" + pedidosDetale
				+ "]";
	}
   
	
}
