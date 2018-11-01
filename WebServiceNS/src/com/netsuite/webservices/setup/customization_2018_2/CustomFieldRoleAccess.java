
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationAccessLevel;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationSearchLevel;


/**
 * <p>CustomFieldRoleAccess complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomFieldRoleAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationAccessLevel" minOccurs="0"/>
 *         &lt;element name="searchLevel" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationSearchLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldRoleAccess", propOrder = {
    "role",
    "accessLevel",
    "searchLevel"
})
public class CustomFieldRoleAccess {

    protected RecordRef role;
    @XmlSchemaType(name = "string")
    protected CustomizationAccessLevel accessLevel;
    @XmlSchemaType(name = "string")
    protected CustomizationSearchLevel searchLevel;

    /**
     * ��ȡrole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRole() {
        return role;
    }

    /**
     * ����role���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRole(RecordRef value) {
        this.role = value;
    }

    /**
     * ��ȡaccessLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomizationAccessLevel }
     *     
     */
    public CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * ����accessLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationAccessLevel }
     *     
     */
    public void setAccessLevel(CustomizationAccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * ��ȡsearchLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomizationSearchLevel }
     *     
     */
    public CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }

    /**
     * ����searchLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationSearchLevel }
     *     
     */
    public void setSearchLevel(CustomizationSearchLevel value) {
        this.searchLevel = value;
    }

}
