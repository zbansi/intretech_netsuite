
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Preferences complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Preferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warningAsError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disableMandatoryCustomFieldValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disableSystemNotesForCustomFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ignoreReadOnlyFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="runServerSuiteScriptAndTriggerWorkflows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferences", propOrder = {
    "warningAsError",
    "disableMandatoryCustomFieldValidation",
    "disableSystemNotesForCustomFields",
    "ignoreReadOnlyFields",
    "runServerSuiteScriptAndTriggerWorkflows"
})
public class Preferences {

    protected Boolean warningAsError;
    protected Boolean disableMandatoryCustomFieldValidation;
    protected Boolean disableSystemNotesForCustomFields;
    protected Boolean ignoreReadOnlyFields;
    protected Boolean runServerSuiteScriptAndTriggerWorkflows;

    /**
     * 获取warningAsError属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarningAsError() {
        return warningAsError;
    }

    /**
     * 设置warningAsError属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarningAsError(Boolean value) {
        this.warningAsError = value;
    }

    /**
     * 获取disableMandatoryCustomFieldValidation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMandatoryCustomFieldValidation() {
        return disableMandatoryCustomFieldValidation;
    }

    /**
     * 设置disableMandatoryCustomFieldValidation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMandatoryCustomFieldValidation(Boolean value) {
        this.disableMandatoryCustomFieldValidation = value;
    }

    /**
     * 获取disableSystemNotesForCustomFields属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableSystemNotesForCustomFields() {
        return disableSystemNotesForCustomFields;
    }

    /**
     * 设置disableSystemNotesForCustomFields属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableSystemNotesForCustomFields(Boolean value) {
        this.disableSystemNotesForCustomFields = value;
    }

    /**
     * 获取ignoreReadOnlyFields属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreReadOnlyFields() {
        return ignoreReadOnlyFields;
    }

    /**
     * 设置ignoreReadOnlyFields属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreReadOnlyFields(Boolean value) {
        this.ignoreReadOnlyFields = value;
    }

    /**
     * 获取runServerSuiteScriptAndTriggerWorkflows属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunServerSuiteScriptAndTriggerWorkflows() {
        return runServerSuiteScriptAndTriggerWorkflows;
    }

    /**
     * 设置runServerSuiteScriptAndTriggerWorkflows属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunServerSuiteScriptAndTriggerWorkflows(Boolean value) {
        this.runServerSuiteScriptAndTriggerWorkflows = value;
    }

}
