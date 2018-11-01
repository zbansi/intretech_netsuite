
package com.netsuite.webservices.lists.employees_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EmployeeCompensationCurrency的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeCompensationCurrency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_aed"/>
 *     &lt;enumeration value="_afa"/>
 *     &lt;enumeration value="_afn"/>
 *     &lt;enumeration value="_all"/>
 *     &lt;enumeration value="_amd"/>
 *     &lt;enumeration value="_ang"/>
 *     &lt;enumeration value="_aoa"/>
 *     &lt;enumeration value="_ars"/>
 *     &lt;enumeration value="_aud"/>
 *     &lt;enumeration value="_awg"/>
 *     &lt;enumeration value="_azn"/>
 *     &lt;enumeration value="_bam"/>
 *     &lt;enumeration value="_bbd"/>
 *     &lt;enumeration value="_bdt"/>
 *     &lt;enumeration value="_bgn"/>
 *     &lt;enumeration value="_bhd"/>
 *     &lt;enumeration value="_bif"/>
 *     &lt;enumeration value="_bmd"/>
 *     &lt;enumeration value="_bnd"/>
 *     &lt;enumeration value="_bob"/>
 *     &lt;enumeration value="_brl"/>
 *     &lt;enumeration value="_bsd"/>
 *     &lt;enumeration value="_btn"/>
 *     &lt;enumeration value="_bwp"/>
 *     &lt;enumeration value="_byn"/>
 *     &lt;enumeration value="_byr"/>
 *     &lt;enumeration value="_bzd"/>
 *     &lt;enumeration value="_cad"/>
 *     &lt;enumeration value="_cdf"/>
 *     &lt;enumeration value="_chf"/>
 *     &lt;enumeration value="_clp"/>
 *     &lt;enumeration value="_cny"/>
 *     &lt;enumeration value="_cop"/>
 *     &lt;enumeration value="_crc"/>
 *     &lt;enumeration value="_csd"/>
 *     &lt;enumeration value="_cuc"/>
 *     &lt;enumeration value="_cup"/>
 *     &lt;enumeration value="_cve"/>
 *     &lt;enumeration value="_cyp"/>
 *     &lt;enumeration value="_czk"/>
 *     &lt;enumeration value="_djf"/>
 *     &lt;enumeration value="_dkk"/>
 *     &lt;enumeration value="_dop"/>
 *     &lt;enumeration value="_dzd"/>
 *     &lt;enumeration value="_ecs"/>
 *     &lt;enumeration value="_eek"/>
 *     &lt;enumeration value="_egp"/>
 *     &lt;enumeration value="_ern"/>
 *     &lt;enumeration value="_etb"/>
 *     &lt;enumeration value="_eur"/>
 *     &lt;enumeration value="_fjd"/>
 *     &lt;enumeration value="_fkp"/>
 *     &lt;enumeration value="_gbp"/>
 *     &lt;enumeration value="_gel"/>
 *     &lt;enumeration value="_ggp"/>
 *     &lt;enumeration value="_ghc"/>
 *     &lt;enumeration value="_ghs"/>
 *     &lt;enumeration value="_gip"/>
 *     &lt;enumeration value="_gmd"/>
 *     &lt;enumeration value="_gnf"/>
 *     &lt;enumeration value="_gtq"/>
 *     &lt;enumeration value="_gyd"/>
 *     &lt;enumeration value="_hkd"/>
 *     &lt;enumeration value="_hnl"/>
 *     &lt;enumeration value="_hrk"/>
 *     &lt;enumeration value="_htg"/>
 *     &lt;enumeration value="_huf"/>
 *     &lt;enumeration value="_idr"/>
 *     &lt;enumeration value="_ils"/>
 *     &lt;enumeration value="_imp"/>
 *     &lt;enumeration value="_inr"/>
 *     &lt;enumeration value="_iqd"/>
 *     &lt;enumeration value="_irr"/>
 *     &lt;enumeration value="_isk"/>
 *     &lt;enumeration value="_jep"/>
 *     &lt;enumeration value="_jmd"/>
 *     &lt;enumeration value="_jod"/>
 *     &lt;enumeration value="_jpy"/>
 *     &lt;enumeration value="_kes"/>
 *     &lt;enumeration value="_kgs"/>
 *     &lt;enumeration value="_khr"/>
 *     &lt;enumeration value="_kmf"/>
 *     &lt;enumeration value="_kpw"/>
 *     &lt;enumeration value="_krw"/>
 *     &lt;enumeration value="_kwd"/>
 *     &lt;enumeration value="_kyd"/>
 *     &lt;enumeration value="_kzt"/>
 *     &lt;enumeration value="_lak"/>
 *     &lt;enumeration value="_lbp"/>
 *     &lt;enumeration value="_lkr"/>
 *     &lt;enumeration value="_lrd"/>
 *     &lt;enumeration value="_lsl"/>
 *     &lt;enumeration value="_ltl"/>
 *     &lt;enumeration value="_lvl"/>
 *     &lt;enumeration value="_lyd"/>
 *     &lt;enumeration value="_mad"/>
 *     &lt;enumeration value="_mdl"/>
 *     &lt;enumeration value="_mfg"/>
 *     &lt;enumeration value="_mga"/>
 *     &lt;enumeration value="_mkd"/>
 *     &lt;enumeration value="_mmk"/>
 *     &lt;enumeration value="_mnt"/>
 *     &lt;enumeration value="_mop"/>
 *     &lt;enumeration value="_mro"/>
 *     &lt;enumeration value="_mru"/>
 *     &lt;enumeration value="_mtl"/>
 *     &lt;enumeration value="_mur"/>
 *     &lt;enumeration value="_mvr"/>
 *     &lt;enumeration value="_mwk"/>
 *     &lt;enumeration value="_mxn"/>
 *     &lt;enumeration value="_myr"/>
 *     &lt;enumeration value="_mzm"/>
 *     &lt;enumeration value="_mzn"/>
 *     &lt;enumeration value="_nad"/>
 *     &lt;enumeration value="_ngn"/>
 *     &lt;enumeration value="_nio"/>
 *     &lt;enumeration value="_nok"/>
 *     &lt;enumeration value="_npr"/>
 *     &lt;enumeration value="_nzd"/>
 *     &lt;enumeration value="_omr"/>
 *     &lt;enumeration value="_pab"/>
 *     &lt;enumeration value="_pen"/>
 *     &lt;enumeration value="_pgk"/>
 *     &lt;enumeration value="_php"/>
 *     &lt;enumeration value="_pkr"/>
 *     &lt;enumeration value="_pln"/>
 *     &lt;enumeration value="_pyg"/>
 *     &lt;enumeration value="_qar"/>
 *     &lt;enumeration value="_rol"/>
 *     &lt;enumeration value="_ron"/>
 *     &lt;enumeration value="_rsd"/>
 *     &lt;enumeration value="_rub"/>
 *     &lt;enumeration value="_rur"/>
 *     &lt;enumeration value="_rwf"/>
 *     &lt;enumeration value="_sar"/>
 *     &lt;enumeration value="_sbd"/>
 *     &lt;enumeration value="_scr"/>
 *     &lt;enumeration value="_sdd"/>
 *     &lt;enumeration value="_sdg"/>
 *     &lt;enumeration value="_sek"/>
 *     &lt;enumeration value="_sgd"/>
 *     &lt;enumeration value="_shp"/>
 *     &lt;enumeration value="_sit"/>
 *     &lt;enumeration value="_skk"/>
 *     &lt;enumeration value="_sll"/>
 *     &lt;enumeration value="_sos"/>
 *     &lt;enumeration value="_spl"/>
 *     &lt;enumeration value="_srd"/>
 *     &lt;enumeration value="_srg"/>
 *     &lt;enumeration value="_ssp"/>
 *     &lt;enumeration value="_std"/>
 *     &lt;enumeration value="_stn"/>
 *     &lt;enumeration value="_svc"/>
 *     &lt;enumeration value="_syp"/>
 *     &lt;enumeration value="_szl"/>
 *     &lt;enumeration value="_thb"/>
 *     &lt;enumeration value="_tjs"/>
 *     &lt;enumeration value="_tmm"/>
 *     &lt;enumeration value="_tmt"/>
 *     &lt;enumeration value="_tnd"/>
 *     &lt;enumeration value="_top"/>
 *     &lt;enumeration value="_trl"/>
 *     &lt;enumeration value="_try"/>
 *     &lt;enumeration value="_ttd"/>
 *     &lt;enumeration value="_tvd"/>
 *     &lt;enumeration value="_twd"/>
 *     &lt;enumeration value="_tzs"/>
 *     &lt;enumeration value="_uah"/>
 *     &lt;enumeration value="_ugx"/>
 *     &lt;enumeration value="_usd"/>
 *     &lt;enumeration value="_uyu"/>
 *     &lt;enumeration value="_uzs"/>
 *     &lt;enumeration value="_veb"/>
 *     &lt;enumeration value="_vef"/>
 *     &lt;enumeration value="_ves"/>
 *     &lt;enumeration value="_vnd"/>
 *     &lt;enumeration value="_vuv"/>
 *     &lt;enumeration value="_wst"/>
 *     &lt;enumeration value="_wsx"/>
 *     &lt;enumeration value="_xaf"/>
 *     &lt;enumeration value="_xag"/>
 *     &lt;enumeration value="_xau"/>
 *     &lt;enumeration value="_xcd"/>
 *     &lt;enumeration value="_xdr"/>
 *     &lt;enumeration value="_xof"/>
 *     &lt;enumeration value="_xop"/>
 *     &lt;enumeration value="_xpd"/>
 *     &lt;enumeration value="_xpf"/>
 *     &lt;enumeration value="_xpt"/>
 *     &lt;enumeration value="_yer"/>
 *     &lt;enumeration value="_yum"/>
 *     &lt;enumeration value="_zar"/>
 *     &lt;enumeration value="_zmk"/>
 *     &lt;enumeration value="_zmw"/>
 *     &lt;enumeration value="_zrn"/>
 *     &lt;enumeration value="_zwd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeCompensationCurrency", namespace = "urn:types.employees_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeCompensationCurrency {

    @XmlEnumValue("_aed")
    AED("_aed"),
    @XmlEnumValue("_afa")
    AFA("_afa"),
    @XmlEnumValue("_afn")
    AFN("_afn"),
    @XmlEnumValue("_all")
    ALL("_all"),
    @XmlEnumValue("_amd")
    AMD("_amd"),
    @XmlEnumValue("_ang")
    ANG("_ang"),
    @XmlEnumValue("_aoa")
    AOA("_aoa"),
    @XmlEnumValue("_ars")
    ARS("_ars"),
    @XmlEnumValue("_aud")
    AUD("_aud"),
    @XmlEnumValue("_awg")
    AWG("_awg"),
    @XmlEnumValue("_azn")
    AZN("_azn"),
    @XmlEnumValue("_bam")
    BAM("_bam"),
    @XmlEnumValue("_bbd")
    BBD("_bbd"),
    @XmlEnumValue("_bdt")
    BDT("_bdt"),
    @XmlEnumValue("_bgn")
    BGN("_bgn"),
    @XmlEnumValue("_bhd")
    BHD("_bhd"),
    @XmlEnumValue("_bif")
    BIF("_bif"),
    @XmlEnumValue("_bmd")
    BMD("_bmd"),
    @XmlEnumValue("_bnd")
    BND("_bnd"),
    @XmlEnumValue("_bob")
    BOB("_bob"),
    @XmlEnumValue("_brl")
    BRL("_brl"),
    @XmlEnumValue("_bsd")
    BSD("_bsd"),
    @XmlEnumValue("_btn")
    BTN("_btn"),
    @XmlEnumValue("_bwp")
    BWP("_bwp"),
    @XmlEnumValue("_byn")
    BYN("_byn"),
    @XmlEnumValue("_byr")
    BYR("_byr"),
    @XmlEnumValue("_bzd")
    BZD("_bzd"),
    @XmlEnumValue("_cad")
    CAD("_cad"),
    @XmlEnumValue("_cdf")
    CDF("_cdf"),
    @XmlEnumValue("_chf")
    CHF("_chf"),
    @XmlEnumValue("_clp")
    CLP("_clp"),
    @XmlEnumValue("_cny")
    CNY("_cny"),
    @XmlEnumValue("_cop")
    COP("_cop"),
    @XmlEnumValue("_crc")
    CRC("_crc"),
    @XmlEnumValue("_csd")
    CSD("_csd"),
    @XmlEnumValue("_cuc")
    CUC("_cuc"),
    @XmlEnumValue("_cup")
    CUP("_cup"),
    @XmlEnumValue("_cve")
    CVE("_cve"),
    @XmlEnumValue("_cyp")
    CYP("_cyp"),
    @XmlEnumValue("_czk")
    CZK("_czk"),
    @XmlEnumValue("_djf")
    DJF("_djf"),
    @XmlEnumValue("_dkk")
    DKK("_dkk"),
    @XmlEnumValue("_dop")
    DOP("_dop"),
    @XmlEnumValue("_dzd")
    DZD("_dzd"),
    @XmlEnumValue("_ecs")
    ECS("_ecs"),
    @XmlEnumValue("_eek")
    EEK("_eek"),
    @XmlEnumValue("_egp")
    EGP("_egp"),
    @XmlEnumValue("_ern")
    ERN("_ern"),
    @XmlEnumValue("_etb")
    ETB("_etb"),
    @XmlEnumValue("_eur")
    EUR("_eur"),
    @XmlEnumValue("_fjd")
    FJD("_fjd"),
    @XmlEnumValue("_fkp")
    FKP("_fkp"),
    @XmlEnumValue("_gbp")
    GBP("_gbp"),
    @XmlEnumValue("_gel")
    GEL("_gel"),
    @XmlEnumValue("_ggp")
    GGP("_ggp"),
    @XmlEnumValue("_ghc")
    GHC("_ghc"),
    @XmlEnumValue("_ghs")
    GHS("_ghs"),
    @XmlEnumValue("_gip")
    GIP("_gip"),
    @XmlEnumValue("_gmd")
    GMD("_gmd"),
    @XmlEnumValue("_gnf")
    GNF("_gnf"),
    @XmlEnumValue("_gtq")
    GTQ("_gtq"),
    @XmlEnumValue("_gyd")
    GYD("_gyd"),
    @XmlEnumValue("_hkd")
    HKD("_hkd"),
    @XmlEnumValue("_hnl")
    HNL("_hnl"),
    @XmlEnumValue("_hrk")
    HRK("_hrk"),
    @XmlEnumValue("_htg")
    HTG("_htg"),
    @XmlEnumValue("_huf")
    HUF("_huf"),
    @XmlEnumValue("_idr")
    IDR("_idr"),
    @XmlEnumValue("_ils")
    ILS("_ils"),
    @XmlEnumValue("_imp")
    IMP("_imp"),
    @XmlEnumValue("_inr")
    INR("_inr"),
    @XmlEnumValue("_iqd")
    IQD("_iqd"),
    @XmlEnumValue("_irr")
    IRR("_irr"),
    @XmlEnumValue("_isk")
    ISK("_isk"),
    @XmlEnumValue("_jep")
    JEP("_jep"),
    @XmlEnumValue("_jmd")
    JMD("_jmd"),
    @XmlEnumValue("_jod")
    JOD("_jod"),
    @XmlEnumValue("_jpy")
    JPY("_jpy"),
    @XmlEnumValue("_kes")
    KES("_kes"),
    @XmlEnumValue("_kgs")
    KGS("_kgs"),
    @XmlEnumValue("_khr")
    KHR("_khr"),
    @XmlEnumValue("_kmf")
    KMF("_kmf"),
    @XmlEnumValue("_kpw")
    KPW("_kpw"),
    @XmlEnumValue("_krw")
    KRW("_krw"),
    @XmlEnumValue("_kwd")
    KWD("_kwd"),
    @XmlEnumValue("_kyd")
    KYD("_kyd"),
    @XmlEnumValue("_kzt")
    KZT("_kzt"),
    @XmlEnumValue("_lak")
    LAK("_lak"),
    @XmlEnumValue("_lbp")
    LBP("_lbp"),
    @XmlEnumValue("_lkr")
    LKR("_lkr"),
    @XmlEnumValue("_lrd")
    LRD("_lrd"),
    @XmlEnumValue("_lsl")
    LSL("_lsl"),
    @XmlEnumValue("_ltl")
    LTL("_ltl"),
    @XmlEnumValue("_lvl")
    LVL("_lvl"),
    @XmlEnumValue("_lyd")
    LYD("_lyd"),
    @XmlEnumValue("_mad")
    MAD("_mad"),
    @XmlEnumValue("_mdl")
    MDL("_mdl"),
    @XmlEnumValue("_mfg")
    MFG("_mfg"),
    @XmlEnumValue("_mga")
    MGA("_mga"),
    @XmlEnumValue("_mkd")
    MKD("_mkd"),
    @XmlEnumValue("_mmk")
    MMK("_mmk"),
    @XmlEnumValue("_mnt")
    MNT("_mnt"),
    @XmlEnumValue("_mop")
    MOP("_mop"),
    @XmlEnumValue("_mro")
    MRO("_mro"),
    @XmlEnumValue("_mru")
    MRU("_mru"),
    @XmlEnumValue("_mtl")
    MTL("_mtl"),
    @XmlEnumValue("_mur")
    MUR("_mur"),
    @XmlEnumValue("_mvr")
    MVR("_mvr"),
    @XmlEnumValue("_mwk")
    MWK("_mwk"),
    @XmlEnumValue("_mxn")
    MXN("_mxn"),
    @XmlEnumValue("_myr")
    MYR("_myr"),
    @XmlEnumValue("_mzm")
    MZM("_mzm"),
    @XmlEnumValue("_mzn")
    MZN("_mzn"),
    @XmlEnumValue("_nad")
    NAD("_nad"),
    @XmlEnumValue("_ngn")
    NGN("_ngn"),
    @XmlEnumValue("_nio")
    NIO("_nio"),
    @XmlEnumValue("_nok")
    NOK("_nok"),
    @XmlEnumValue("_npr")
    NPR("_npr"),
    @XmlEnumValue("_nzd")
    NZD("_nzd"),
    @XmlEnumValue("_omr")
    OMR("_omr"),
    @XmlEnumValue("_pab")
    PAB("_pab"),
    @XmlEnumValue("_pen")
    PEN("_pen"),
    @XmlEnumValue("_pgk")
    PGK("_pgk"),
    @XmlEnumValue("_php")
    PHP("_php"),
    @XmlEnumValue("_pkr")
    PKR("_pkr"),
    @XmlEnumValue("_pln")
    PLN("_pln"),
    @XmlEnumValue("_pyg")
    PYG("_pyg"),
    @XmlEnumValue("_qar")
    QAR("_qar"),
    @XmlEnumValue("_rol")
    ROL("_rol"),
    @XmlEnumValue("_ron")
    RON("_ron"),
    @XmlEnumValue("_rsd")
    RSD("_rsd"),
    @XmlEnumValue("_rub")
    RUB("_rub"),
    @XmlEnumValue("_rur")
    RUR("_rur"),
    @XmlEnumValue("_rwf")
    RWF("_rwf"),
    @XmlEnumValue("_sar")
    SAR("_sar"),
    @XmlEnumValue("_sbd")
    SBD("_sbd"),
    @XmlEnumValue("_scr")
    SCR("_scr"),
    @XmlEnumValue("_sdd")
    SDD("_sdd"),
    @XmlEnumValue("_sdg")
    SDG("_sdg"),
    @XmlEnumValue("_sek")
    SEK("_sek"),
    @XmlEnumValue("_sgd")
    SGD("_sgd"),
    @XmlEnumValue("_shp")
    SHP("_shp"),
    @XmlEnumValue("_sit")
    SIT("_sit"),
    @XmlEnumValue("_skk")
    SKK("_skk"),
    @XmlEnumValue("_sll")
    SLL("_sll"),
    @XmlEnumValue("_sos")
    SOS("_sos"),
    @XmlEnumValue("_spl")
    SPL("_spl"),
    @XmlEnumValue("_srd")
    SRD("_srd"),
    @XmlEnumValue("_srg")
    SRG("_srg"),
    @XmlEnumValue("_ssp")
    SSP("_ssp"),
    @XmlEnumValue("_std")
    STD("_std"),
    @XmlEnumValue("_stn")
    STN("_stn"),
    @XmlEnumValue("_svc")
    SVC("_svc"),
    @XmlEnumValue("_syp")
    SYP("_syp"),
    @XmlEnumValue("_szl")
    SZL("_szl"),
    @XmlEnumValue("_thb")
    THB("_thb"),
    @XmlEnumValue("_tjs")
    TJS("_tjs"),
    @XmlEnumValue("_tmm")
    TMM("_tmm"),
    @XmlEnumValue("_tmt")
    TMT("_tmt"),
    @XmlEnumValue("_tnd")
    TND("_tnd"),
    @XmlEnumValue("_top")
    TOP("_top"),
    @XmlEnumValue("_trl")
    TRL("_trl"),
    @XmlEnumValue("_try")
    TRY("_try"),
    @XmlEnumValue("_ttd")
    TTD("_ttd"),
    @XmlEnumValue("_tvd")
    TVD("_tvd"),
    @XmlEnumValue("_twd")
    TWD("_twd"),
    @XmlEnumValue("_tzs")
    TZS("_tzs"),
    @XmlEnumValue("_uah")
    UAH("_uah"),
    @XmlEnumValue("_ugx")
    UGX("_ugx"),
    @XmlEnumValue("_usd")
    USD("_usd"),
    @XmlEnumValue("_uyu")
    UYU("_uyu"),
    @XmlEnumValue("_uzs")
    UZS("_uzs"),
    @XmlEnumValue("_veb")
    VEB("_veb"),
    @XmlEnumValue("_vef")
    VEF("_vef"),
    @XmlEnumValue("_ves")
    VES("_ves"),
    @XmlEnumValue("_vnd")
    VND("_vnd"),
    @XmlEnumValue("_vuv")
    VUV("_vuv"),
    @XmlEnumValue("_wst")
    WST("_wst"),
    @XmlEnumValue("_wsx")
    WSX("_wsx"),
    @XmlEnumValue("_xaf")
    XAF("_xaf"),
    @XmlEnumValue("_xag")
    XAG("_xag"),
    @XmlEnumValue("_xau")
    XAU("_xau"),
    @XmlEnumValue("_xcd")
    XCD("_xcd"),
    @XmlEnumValue("_xdr")
    XDR("_xdr"),
    @XmlEnumValue("_xof")
    XOF("_xof"),
    @XmlEnumValue("_xop")
    XOP("_xop"),
    @XmlEnumValue("_xpd")
    XPD("_xpd"),
    @XmlEnumValue("_xpf")
    XPF("_xpf"),
    @XmlEnumValue("_xpt")
    XPT("_xpt"),
    @XmlEnumValue("_yer")
    YER("_yer"),
    @XmlEnumValue("_yum")
    YUM("_yum"),
    @XmlEnumValue("_zar")
    ZAR("_zar"),
    @XmlEnumValue("_zmk")
    ZMK("_zmk"),
    @XmlEnumValue("_zmw")
    ZMW("_zmw"),
    @XmlEnumValue("_zrn")
    ZRN("_zrn"),
    @XmlEnumValue("_zwd")
    ZWD("_zwd");
    private final String value;

    EmployeeCompensationCurrency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeCompensationCurrency fromValue(String v) {
        for (EmployeeCompensationCurrency c: EmployeeCompensationCurrency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
