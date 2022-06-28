package mx.org.jax.ws;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;
import mx.org.dto.Documento;

/**
 *
 * @author elopez
 */
@Stateless
@WebService(endpointInterface = "mx.org.jax.ws.IServicio")
public class ServicioImpl implements IServicio {

    @Override
    public double Sumar(double a, double b) {
        return a + b;
    }

    @Override
    public void setDocumento(Documento entity) {

        if (entity != null) {

            try {

                System.out.println("getName -->> " + entity.getName());
                System.out.println("getLatitud -->> " + entity.getLatitud());
                System.out.println("getLongitud -->> " + entity.getLongitud());

                byte[] code = entity.getCode();

                InputStream stream = new ByteArrayInputStream(code);

                Files.copy(stream, Paths.get("D:\\Users\\elopez\\Pictures\\photo-of-siberian-husky-puppy-2853130-1024x683_COPY_2.jpg"));

            } catch (IOException ex) {
                Logger.getLogger(ServicioImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
