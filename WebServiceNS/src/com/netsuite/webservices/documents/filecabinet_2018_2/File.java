
package com.netsuite.webservices.documents.filecabinet_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.documents.filecabinet_2018_2.types.FileAttachFrom;
import com.netsuite.webservices.documents.filecabinet_2018_2.types.FileEncoding;
import com.netsuite.webservices.documents.filecabinet_2018_2.types.MediaType;
import com.netsuite.webservices.documents.filecabinet_2018_2.types.TextFileEncoding;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>File complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="File">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachFrom" type="{urn:types.filecabinet_2018_2.documents.webservices.netsuite.com}FileAttachFrom" minOccurs="0"/>
 *         &lt;element name="mediaTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{urn:types.filecabinet_2018_2.documents.webservices.netsuite.com}MediaType" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="folder" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaFile" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="textFileEncoding" type="{urn:types.filecabinet_2018_2.documents.webservices.netsuite.com}TextFileEncoding" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encoding" type="{urn:types.filecabinet_2018_2.documents.webservices.netsuite.com}FileEncoding" minOccurs="0"/>
 *         &lt;element name="altTagCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bundleable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideInBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="siteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featuredDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="siteCategoryList" type="{urn:filecabinet_2018_2.documents.webservices.netsuite.com}FileSiteCategoryList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "File", propOrder = {
    "name",
    "attachFrom",
    "mediaTypeName",
    "fileType",
    "content",
    "folder",
    "fileSize",
    "url",
    "urlComponent",
    "mediaFile",
    "textFileEncoding",
    "description",
    "encoding",
    "altTagCaption",
    "isOnline",
    "isInactive",
    "clazz",
    "bundleable",
    "department",
    "hideInBundle",
    "isPrivate",
    "owner",
    "caption",
    "storeDisplayThumbnail",
    "siteDescription",
    "featuredDescription",
    "lastModifiedDate",
    "createdDate",
    "siteCategoryList"
})
public class File
    extends Record
{

    protected String name;
    @XmlSchemaType(name = "string")
    protected FileAttachFrom attachFrom;
    protected String mediaTypeName;
    @XmlSchemaType(name = "string")
    protected MediaType fileType;
    protected byte[] content;
    protected RecordRef folder;
    protected Double fileSize;
    protected String url;
    protected String urlComponent;
    protected RecordRef mediaFile;
    @XmlSchemaType(name = "string")
    protected TextFileEncoding textFileEncoding;
    protected String description;
    @XmlSchemaType(name = "string")
    protected FileEncoding encoding;
    protected String altTagCaption;
    protected Boolean isOnline;
    protected Boolean isInactive;
    @XmlElement(name = "class")
    protected String clazz;
    protected Boolean bundleable;
    protected String department;
    protected Boolean hideInBundle;
    protected Boolean isPrivate;
    protected RecordRef owner;
    protected String caption;
    protected RecordRef storeDisplayThumbnail;
    protected String siteDescription;
    protected String featuredDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected FileSiteCategoryList siteCategoryList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取attachFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileAttachFrom }
     *     
     */
    public FileAttachFrom getAttachFrom() {
        return attachFrom;
    }

    /**
     * 设置attachFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileAttachFrom }
     *     
     */
    public void setAttachFrom(FileAttachFrom value) {
        this.attachFrom = value;
    }

    /**
     * 获取mediaTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypeName() {
        return mediaTypeName;
    }

    /**
     * 设置mediaTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypeName(String value) {
        this.mediaTypeName = value;
    }

    /**
     * 获取fileType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getFileType() {
        return fileType;
    }

    /**
     * 设置fileType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setFileType(MediaType value) {
        this.fileType = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * 获取folder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFolder() {
        return folder;
    }

    /**
     * 设置folder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFolder(RecordRef value) {
        this.folder = value;
    }

    /**
     * 获取fileSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFileSize() {
        return fileSize;
    }

    /**
     * 设置fileSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFileSize(Double value) {
        this.fileSize = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * 获取urlComponent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlComponent() {
        return urlComponent;
    }

    /**
     * 设置urlComponent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlComponent(String value) {
        this.urlComponent = value;
    }

    /**
     * 获取mediaFile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getMediaFile() {
        return mediaFile;
    }

    /**
     * 设置mediaFile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setMediaFile(RecordRef value) {
        this.mediaFile = value;
    }

    /**
     * 获取textFileEncoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TextFileEncoding }
     *     
     */
    public TextFileEncoding getTextFileEncoding() {
        return textFileEncoding;
    }

    /**
     * 设置textFileEncoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TextFileEncoding }
     *     
     */
    public void setTextFileEncoding(TextFileEncoding value) {
        this.textFileEncoding = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取encoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileEncoding }
     *     
     */
    public FileEncoding getEncoding() {
        return encoding;
    }

    /**
     * 设置encoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileEncoding }
     *     
     */
    public void setEncoding(FileEncoding value) {
        this.encoding = value;
    }

    /**
     * 获取altTagCaption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltTagCaption() {
        return altTagCaption;
    }

    /**
     * 设置altTagCaption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltTagCaption(String value) {
        this.altTagCaption = value;
    }

    /**
     * 获取isOnline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnline() {
        return isOnline;
    }

    /**
     * 设置isOnline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnline(Boolean value) {
        this.isOnline = value;
    }

    /**
     * 获取isInactive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * 设置isInactive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * 获取bundleable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundleable() {
        return bundleable;
    }

    /**
     * 设置bundleable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundleable(Boolean value) {
        this.bundleable = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * 获取hideInBundle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideInBundle() {
        return hideInBundle;
    }

    /**
     * 设置hideInBundle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideInBundle(Boolean value) {
        this.hideInBundle = value;
    }

    /**
     * 获取isPrivate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * 设置isPrivate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * 获取owner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOwner() {
        return owner;
    }

    /**
     * 设置owner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOwner(RecordRef value) {
        this.owner = value;
    }

    /**
     * 获取caption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 设置caption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * 获取storeDisplayThumbnail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }

    /**
     * 设置storeDisplayThumbnail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStoreDisplayThumbnail(RecordRef value) {
        this.storeDisplayThumbnail = value;
    }

    /**
     * 获取siteDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDescription() {
        return siteDescription;
    }

    /**
     * 设置siteDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDescription(String value) {
        this.siteDescription = value;
    }

    /**
     * 获取featuredDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturedDescription() {
        return featuredDescription;
    }

    /**
     * 设置featuredDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturedDescription(String value) {
        this.featuredDescription = value;
    }

    /**
     * 获取lastModifiedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * 设置lastModifiedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * 获取createdDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置createdDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * 获取siteCategoryList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSiteCategoryList }
     *     
     */
    public FileSiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }

    /**
     * 设置siteCategoryList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSiteCategoryList }
     *     
     */
    public void setSiteCategoryList(FileSiteCategoryList value) {
        this.siteCategoryList = value;
    }

    /**
     * 获取internalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * 设置internalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * 获取externalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * 设置externalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
