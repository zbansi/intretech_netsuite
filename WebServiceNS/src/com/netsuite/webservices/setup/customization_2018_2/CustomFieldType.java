
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationFieldType;


/**
 * <p>CustomFieldType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomFieldType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="fieldType" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationFieldType" minOccurs="0"/>
 *         &lt;element name="scriptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldType", propOrder = {
    "fieldType",
    "scriptId"
})
@XmlSeeAlso({
    ItemCustomField.class,
    TransactionColumnCustomField.class,
    EntityCustomField.class,
    ItemNumberCustomField.class,
    CustomRecordCustomField.class,
    TransactionBodyCustomField.class,
    OtherCustomField.class,
    CrmCustomField.class,
    ItemOptionCustomField.class
})
public abstract class CustomFieldType
    extends Record
{

    @XmlSchemaType(name = "string")
    protected CustomizationFieldType fieldType;
    protected String scriptId;

    /**
     * ��ȡfieldType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomizationFieldType }
     *     
     */
    public CustomizationFieldType getFieldType() {
        return fieldType;
    }

    /**
     * ����fieldType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationFieldType }
     *     
     */
    public void setFieldType(CustomizationFieldType value) {
        this.fieldType = value;
    }

    /**
     * ��ȡscriptId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptId() {
        return scriptId;
    }

    /**
     * ����scriptId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptId(String value) {
        this.scriptId = value;
    }

}
