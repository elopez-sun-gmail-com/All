package mx.org.jax.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import mx.org.dto.Documento;

/**
 *
 * @author elopez
 */
@WebService
public interface IServicio {

    @WebMethod
    public double Sumar(double a, double b);
    
    @WebMethod
    public void setDocumento(Documento entity);
}

