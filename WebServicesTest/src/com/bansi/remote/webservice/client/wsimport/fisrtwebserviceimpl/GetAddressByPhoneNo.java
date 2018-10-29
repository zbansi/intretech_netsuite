
package com.bansi.remote.webservice.client.wsimport.fisrtwebserviceimpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * getAddressByPhoneNo complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getAddressByPhoneNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
/*
 * @XmlAccessorType(XmlAccessType.FIELD)
 * 
 * 表示使用这个类中的 private 非静态字段作为 XML 的序列化的属性或者元素。这里还可以选择属性，也就是使用 set/get
 * 方法来序列化属性或者元素。
 * 
 * @XmlType(name = "getAddressByPhoneNo", propOrder = {"arg0"})
 * 
 * 这里的 type 指的是 XML Schema 中的 type。要想理解 type 和 schema 的区别，需要先了解一下 XML Schema
 * 
 * 这些应该JAXB JAXP等相关的东西
 * 
 * @后面这些都是java的annotaion ，也就是注解，起到的是元数据的作用 在JAXB里面就是为了JavaBean跟XML绑定的 这个 JAXB
 * 参考实现在 JDK 1.6 开始已经从 J2EE 加入到 J2SE 类库中去了。 JAXB（Java Architecture for XML
 * Binding) 是一个业界的标准，是一项可以根据XML Schema产生Java类的技术。
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {//name = "getAddressByPhoneNo"
		"arg0" })
public class GetAddressByPhoneNo {

	protected String arg0;

	/**
	 * 获取arg0属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArg0() {
		return arg0;
	}

	/**
	 * 设置arg0属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArg0(String value) {
		this.arg0 = value;
	}

}
