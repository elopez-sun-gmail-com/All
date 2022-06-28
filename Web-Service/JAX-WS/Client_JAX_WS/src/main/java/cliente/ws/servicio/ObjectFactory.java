
package cliente.ws.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente.ws.servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetDocumentoResponse_QNAME = new QName("http://ws.jax.org.mx/", "setDocumentoResponse");
    private final static QName _SumarResponse_QNAME = new QName("http://ws.jax.org.mx/", "SumarResponse");
    private final static QName _Sumar_QNAME = new QName("http://ws.jax.org.mx/", "Sumar");
    private final static QName _SetDocumento_QNAME = new QName("http://ws.jax.org.mx/", "setDocumento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente.ws.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link SetDocumentoResponse }
     * 
     */
    public SetDocumentoResponse createSetDocumentoResponse() {
        return new SetDocumentoResponse();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link SetDocumento }
     * 
     */
    public SetDocumento createSetDocumento() {
        return new SetDocumento();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDocumentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.org.mx/", name = "setDocumentoResponse")
    public JAXBElement<SetDocumentoResponse> createSetDocumentoResponse(SetDocumentoResponse value) {
        return new JAXBElement<SetDocumentoResponse>(_SetDocumentoResponse_QNAME, SetDocumentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.org.mx/", name = "SumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.org.mx/", name = "Sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.org.mx/", name = "setDocumento")
    public JAXBElement<SetDocumento> createSetDocumento(SetDocumento value) {
        return new JAXBElement<SetDocumento>(_SetDocumento_QNAME, SetDocumento.class, null, value);
    }

}
