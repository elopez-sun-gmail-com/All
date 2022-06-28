package mx.org.client.jax.ws;

import cliente.ws.servicio.Documento;
import cliente.ws.servicio.IServicio;
import cliente.ws.servicio.ServicioImplService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author elopez
 */
public class Test {

    public static void main(String[] args) throws IOException {

        IServicio proxy = new ServicioImplService().getServicioImplPort();

        double resultado = proxy.sumar(9.6, 0.4);

        Documento entity = new Documento();

        {
            String filePath = "D:\\Users\\elopez\\Pictures\\photo-of-siberian-husky-puppy-2853130-1024x683.jpg";

            byte[] bytes = Files.readAllBytes(Paths.get(filePath));

            entity.setName("photo-of-siberian-husky-puppy-2853130-1024x683.jpg");
            entity.setLatitud(4654.5465);
            entity.setLongitud(-94654.5465);
            entity.setCode(bytes);

            proxy.setDocumento(entity);
        }

        System.out.println("Resultado -->> " + resultado);

    }
}
