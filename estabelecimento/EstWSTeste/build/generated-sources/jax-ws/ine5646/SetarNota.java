
package ine5646;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de setar_nota complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="setar_nota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="local_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setar_nota", propOrder = {
    "localId",
    "usuarioId",
    "nota"
})
public class SetarNota {

    @XmlElement(name = "local_id")
    protected String localId;
    @XmlElement(name = "usuario_id")
    protected String usuarioId;
    protected String nota;

    /**
     * Obtém o valor da propriedade localId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Define o valor da propriedade localId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Obtém o valor da propriedade usuarioId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioId() {
        return usuarioId;
    }

    /**
     * Define o valor da propriedade usuarioId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioId(String value) {
        this.usuarioId = value;
    }

    /**
     * Obtém o valor da propriedade nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define o valor da propriedade nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

}
