
package ine5646;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ine5646 package. 
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

    private final static QName _SetarNota_QNAME = new QName("http://ine5646/", "setar_nota");
    private final static QName _ListarLocaisResponse_QNAME = new QName("http://ine5646/", "listar_locaisResponse");
    private final static QName _SetarNotaResponse_QNAME = new QName("http://ine5646/", "setar_notaResponse");
    private final static QName _DetalhesLocalResponse_QNAME = new QName("http://ine5646/", "detalhes_localResponse");
    private final static QName _ListarLocais_QNAME = new QName("http://ine5646/", "listar_locais");
    private final static QName _ProcurarLocaisResponse_QNAME = new QName("http://ine5646/", "procurar_locaisResponse");
    private final static QName _DetalhesLocal_QNAME = new QName("http://ine5646/", "detalhes_local");
    private final static QName _VerificaLoginResponse_QNAME = new QName("http://ine5646/", "verifica_loginResponse");
    private final static QName _ProcurarLocais_QNAME = new QName("http://ine5646/", "procurar_locais");
    private final static QName _SetarComentarioResponse_QNAME = new QName("http://ine5646/", "setar_comentarioResponse");
    private final static QName _SetarComentario_QNAME = new QName("http://ine5646/", "setar_comentario");
    private final static QName _VerificaLogin_QNAME = new QName("http://ine5646/", "verifica_login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ine5646
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarLocaisResponse }
     * 
     */
    public ListarLocaisResponse createListarLocaisResponse() {
        return new ListarLocaisResponse();
    }

    /**
     * Create an instance of {@link SetarNotaResponse }
     * 
     */
    public SetarNotaResponse createSetarNotaResponse() {
        return new SetarNotaResponse();
    }

    /**
     * Create an instance of {@link SetarNota }
     * 
     */
    public SetarNota createSetarNota() {
        return new SetarNota();
    }

    /**
     * Create an instance of {@link VerificaLogin }
     * 
     */
    public VerificaLogin createVerificaLogin() {
        return new VerificaLogin();
    }

    /**
     * Create an instance of {@link SetarComentarioResponse }
     * 
     */
    public SetarComentarioResponse createSetarComentarioResponse() {
        return new SetarComentarioResponse();
    }

    /**
     * Create an instance of {@link ProcurarLocais }
     * 
     */
    public ProcurarLocais createProcurarLocais() {
        return new ProcurarLocais();
    }

    /**
     * Create an instance of {@link SetarComentario }
     * 
     */
    public SetarComentario createSetarComentario() {
        return new SetarComentario();
    }

    /**
     * Create an instance of {@link DetalhesLocal }
     * 
     */
    public DetalhesLocal createDetalhesLocal() {
        return new DetalhesLocal();
    }

    /**
     * Create an instance of {@link VerificaLoginResponse }
     * 
     */
    public VerificaLoginResponse createVerificaLoginResponse() {
        return new VerificaLoginResponse();
    }

    /**
     * Create an instance of {@link ProcurarLocaisResponse }
     * 
     */
    public ProcurarLocaisResponse createProcurarLocaisResponse() {
        return new ProcurarLocaisResponse();
    }

    /**
     * Create an instance of {@link ListarLocais }
     * 
     */
    public ListarLocais createListarLocais() {
        return new ListarLocais();
    }

    /**
     * Create an instance of {@link DetalhesLocalResponse }
     * 
     */
    public DetalhesLocalResponse createDetalhesLocalResponse() {
        return new DetalhesLocalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetarNota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "setar_nota")
    public JAXBElement<SetarNota> createSetarNota(SetarNota value) {
        return new JAXBElement<SetarNota>(_SetarNota_QNAME, SetarNota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLocaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "listar_locaisResponse")
    public JAXBElement<ListarLocaisResponse> createListarLocaisResponse(ListarLocaisResponse value) {
        return new JAXBElement<ListarLocaisResponse>(_ListarLocaisResponse_QNAME, ListarLocaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetarNotaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "setar_notaResponse")
    public JAXBElement<SetarNotaResponse> createSetarNotaResponse(SetarNotaResponse value) {
        return new JAXBElement<SetarNotaResponse>(_SetarNotaResponse_QNAME, SetarNotaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalhesLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "detalhes_localResponse")
    public JAXBElement<DetalhesLocalResponse> createDetalhesLocalResponse(DetalhesLocalResponse value) {
        return new JAXBElement<DetalhesLocalResponse>(_DetalhesLocalResponse_QNAME, DetalhesLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLocais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "listar_locais")
    public JAXBElement<ListarLocais> createListarLocais(ListarLocais value) {
        return new JAXBElement<ListarLocais>(_ListarLocais_QNAME, ListarLocais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcurarLocaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "procurar_locaisResponse")
    public JAXBElement<ProcurarLocaisResponse> createProcurarLocaisResponse(ProcurarLocaisResponse value) {
        return new JAXBElement<ProcurarLocaisResponse>(_ProcurarLocaisResponse_QNAME, ProcurarLocaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalhesLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "detalhes_local")
    public JAXBElement<DetalhesLocal> createDetalhesLocal(DetalhesLocal value) {
        return new JAXBElement<DetalhesLocal>(_DetalhesLocal_QNAME, DetalhesLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "verifica_loginResponse")
    public JAXBElement<VerificaLoginResponse> createVerificaLoginResponse(VerificaLoginResponse value) {
        return new JAXBElement<VerificaLoginResponse>(_VerificaLoginResponse_QNAME, VerificaLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcurarLocais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "procurar_locais")
    public JAXBElement<ProcurarLocais> createProcurarLocais(ProcurarLocais value) {
        return new JAXBElement<ProcurarLocais>(_ProcurarLocais_QNAME, ProcurarLocais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetarComentarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "setar_comentarioResponse")
    public JAXBElement<SetarComentarioResponse> createSetarComentarioResponse(SetarComentarioResponse value) {
        return new JAXBElement<SetarComentarioResponse>(_SetarComentarioResponse_QNAME, SetarComentarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetarComentario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "setar_comentario")
    public JAXBElement<SetarComentario> createSetarComentario(SetarComentario value) {
        return new JAXBElement<SetarComentario>(_SetarComentario_QNAME, SetarComentario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ine5646/", name = "verifica_login")
    public JAXBElement<VerificaLogin> createVerificaLogin(VerificaLogin value) {
        return new JAXBElement<VerificaLogin>(_VerificaLogin_QNAME, VerificaLogin.class, null, value);
    }

}
