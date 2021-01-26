package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PedidoDetalle
 *
 */
@Entity

public class PedidoDetalle implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cantidad;
	private float total;
	
	@ManyToOne
	@JoinColumn
	private PedidoCabecera pedidoCabecera;
	
	@ManyToOne
	private Producto productosPedido;
	
	public PedidoDetalle() {
		super();
	}
	
	public PedidoDetalle(int id, int cantidad, float total, PedidoCabecera pedidoCabecera, Producto producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.total = total;
		this.pedidoCabecera = pedidoCabecera;
		this.productosPedido = producto;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public PedidoCabecera getPedidoCabecera() {
		return pedidoCabecera;
	}

	public void setPedidoCabecera(PedidoCabecera pedidoCabecera) {
		this.pedidoCabecera = pedidoCabecera;
	}

	public Producto getProducto() {
		return productosPedido;
	}

	public void setProducto(Producto producto) {
		this.productosPedido = producto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + id;
		result = prime * result + ((pedidoCabecera == null) ? 0 : pedidoCabecera.hashCode());
		result = prime * result + ((productosPedido == null) ? 0 : productosPedido.hashCode());
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
		PedidoDetalle other = (PedidoDetalle) obj;
		if (cantidad != other.cantidad)
			return false;
		if (id != other.id)
			return false;
		if (pedidoCabecera == null) {
			if (other.pedidoCabecera != null)
				return false;
		} else if (!pedidoCabecera.equals(other.pedidoCabecera))
			return false;
		if (productosPedido == null) {
			if (other.productosPedido != null)
				return false;
		} else if (!productosPedido.equals(other.productosPedido))
			return false;
		if (Float.floatToIntBits(total) != Float.floatToIntBits(other.total))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PedidoDetalle [id=" + id + ", cantidad=" + cantidad + ", total=" + total + ", pedidoCabecera="
				+ pedidoCabecera + ", producto=" + productosPedido + "]";
	}
	
	
   
}
