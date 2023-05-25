package cl.corona.bbookenvoc.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BBOOK_SDIPMGHDI")
public class bbookSdipmghdi {

    @Id
    @Column(name="audit_number" ,columnDefinition = "number(12)")
    protected Long auditNumber;

    @Column(name="tran_type" ,columnDefinition = "varchar2(1)")
    protected String tranType;

    @Column(name="pmg_po_number" ,columnDefinition = "number(12)")
    protected Integer pmgPoNumber;

    @Column(name="vendor_number" ,columnDefinition = "varchar2(15)")
    protected String vendorNumber;

    @Column(name="vpc_shp_point" ,columnDefinition = "number(6)")
    protected Integer vpcShpPoint;

    @Column(name="pmg_type_name" ,columnDefinition = "varchar2(40)")
    protected String pmgTypeName;

    @Column(name="org_lvl_number" ,columnDefinition = "number(12)")
    protected Integer orgLvlNumber;

    @Column(name="cap_chain_name" ,columnDefinition = "varchar2(30)")
    protected String capChainName;

    @Column(name="bas_usr_name" ,columnDefinition = "varchar2(40)")
    protected String basUsrName;

    @Column(name="pmg_lc_number" ,columnDefinition = "varchar2(20)")
    protected String pmgLcNumber;

    @Column(name="pmg_ship_via" ,columnDefinition = "varchar2(20)")
    protected String pmgShipVia;

    @Column(name="pmg_buyer" ,columnDefinition = "varchar2(40)")
    protected String pmgBuyer;

    @Column(name="vpc_apt_desc" ,columnDefinition = "varchar2(25)")
    protected String vpcAptDesc;

    @Column(name="pmg_fob" ,columnDefinition = "varchar2(20)")
    protected String pmgFob;

    @Column(name="curr_code" ,columnDefinition = "varchar2(3)")
    protected String currCode;

    @Column(name="pmg_effect_date" ,columnDefinition = "varchar2(10)")
    protected String pmgEffectDate;

    @Column(name="pmg_rate" ,columnDefinition = "number(8,3)")
    protected Integer pmgRate;

    @Column(name="dmt_code" ,columnDefinition = "number(1)")
    protected Integer dmtCode;

    @Column(name="trf_alloc_id" ,columnDefinition = "number(2)")
    protected Integer trfAllocId;

    @Column(name="pmg_entry_date" ,columnDefinition = "varchar2(10)")
    protected String pmgEntryDate;

    @Column(name="pmg_ship_date" ,columnDefinition = "varchar2(10)")
    protected String pmgShipDate;

    @Column(name="pmg_cancel_date" ,columnDefinition = "varchar2(10)")
    protected String pmgCancelDate;

    @Column(name="pmg_exp_rct_date" ,columnDefinition = "varchar2(10)")
    protected String pmgExpRctDate;

    @Column(name="pmg_pay_date" ,columnDefinition = "varchar2(10)")
    protected String pmgPayDate;

    @Column(name="distro_id" ,columnDefinition = "number(12)")
    protected Integer distroId;

    @Column(name="date_created" ,columnDefinition = "varchar2(10)")
    protected String dateCreated;

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1;

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2;

    @Column(name="pmg_po_notes" ,columnDefinition = "varchar2(2000)")
    protected String pmgPoNotes;

    @Column(name="pmg_recv_notes" ,columnDefinition = "varchar2(2000)")
    protected String pmgRecvNotes;

    @Column(name="pmg_pis_date" ,columnDefinition = "varchar2(10)")
    protected String pmgPisDate;

    @Column(name="pmg_ext_rct_date" ,columnDefinition = "varchar2(10)")
    protected String pmgExtRctDate;

    @Column(name="pmg_otb_bud_date" ,columnDefinition = "varchar2(10)")
    protected String pmgOtbBudDate;

    @Column(name="pmg_cncl_by_date" ,columnDefinition = "varchar2(10)")
    protected String pmgCnclByDate;

    @Column(name="po_auto_release" ,columnDefinition = "varchar2(1)")
    protected String poAutoRelease;

    @Column(name="pmg_allocator" ,columnDefinition = "varchar2(40)")
    protected String pmgAllocator;

    @Column(name="pmg_rate_override" ,columnDefinition = "varchar2(1)")
    protected String pmgRateOverride;

    @Column(name="apply_vpc_chgalw" ,columnDefinition = "varchar2(1)")
    protected String applyVpcChgalw;

    @Column(name="pmg_ext_po_num" ,columnDefinition = "varchar2(20)")
    protected String pmgExtPoNum;

    @Column(name="jda_origin" ,columnDefinition = "varchar2(1)")
    protected String jdaOrigin;

    @Column(name="pmg_cnl_reas_cd" ,columnDefinition = "number(6)")
    protected Integer pmgCnlReasCd;

    @Column(name="pmg_req_flag" ,columnDefinition = "varchar2(1)")
    protected String pmgReqFlag;

    @Column(name="pmg_supp_chn_code" ,columnDefinition = "varchar2(2)")
    protected String pmgSuppChnCode;

    @Column(name="pmg_consol_center" ,columnDefinition = "number(12)")
    protected Integer pmgConsolCenter;

    @Column(name="pmg_fmt_code" ,columnDefinition = "varchar2(8)")
    protected String pmgFmtCode;

    @Column(name="pmg_tax_exc_hm" ,columnDefinition = "number(15,5)")
    protected Integer pmgTaxExcHm;

    @Column(name="pmg_tax_exc_lc" ,columnDefinition = "number(15,5)")
    protected Integer pmgTaxExcLc;

    @Column(name="pmg_tax_exc_po" ,columnDefinition = "number(15,5)")
    protected Integer pmgTaxExcPo;

    @Column(name="pmg_tot_tax_hm" ,columnDefinition = "number(15,5)")
    protected Integer pmgTotTaxHm;

    @Column(name="pmg_tot_tax_po" ,columnDefinition = "number(15,5)")
    protected Integer pmgTotTaxPo;

    @Column(name="frt_terms_desc" ,columnDefinition = "varchar2(20)")
    protected String frtTermsDesc;

    @Column(name="ship_via_desc" ,columnDefinition = "varchar2(20)")
    protected String shipViaDesc;

    @Column(name="fob_terms_desc" ,columnDefinition = "varchar2(20)")
    protected String fobTermsDesc;

    @Column(name="poe_cntry_name" ,columnDefinition = "varchar2(40)")
    protected String poeCntryName;

    @Column(name="poe_city" ,columnDefinition = "varchar2(40)")
    protected String poeCity;

    @Column(name="pmg_reallocate" ,columnDefinition = "varchar2(1)")
    protected String pmgReallocate;

    @Column(name="thread_id" ,columnDefinition = "number(3)")
    protected String threadId;

    @Column(name="pmg_adv_rpl_ref_nbr" ,columnDefinition = "varchar2(15)")
    protected String pmgAdvRplRefNbr;

    @Column(name="batch_num" ,columnDefinition = "number(12)")
    protected long batchNum;

    public bbookSdipmghdi() {
        super();
        // TODO Auto-generated constructor stub
    }

    public bbookSdipmghdi(Long auditNumber, String tranType, Integer pmgPoNumber, String vendorNumber,
                          Integer vpcShpPoint, String pmgTypeName, Integer orgLvlNumber, String capChainName, String basUsrName,
                          String pmgLcNumber, String pmgShipVia, String pmgBuyer, String vpcAptDesc, String pmgFob, String currCode,
                          String pmgEffectDate, Integer pmgRate, Integer dmtCode, Integer trfAllocId, String pmgEntryDate,
                          String pmgShipDate, String pmgCancelDate, String pmgExpRctDate, String pmgPayDate, Integer distroId,
                          String dateCreated, Date downloadDate1, Date downloadDate2, String pmgPoNotes, String pmgRecvNotes,
                          String pmgPisDate, String pmgExtRctDate, String pmgOtbBudDate, String pmgCnclByDate, String poAutoRelease,
                          String pmgAllocator, String pmgRateOverride, String applyVpcChgalw, String pmgExtPoNum, String jdaOrigin,
                          Integer pmgCnlReasCd, String pmgReqFlag, String pmgSuppChnCode, Integer pmgConsolCenter, String pmgFmtCode,
                          Integer pmgTaxExcHm, Integer pmgTaxExcLc, Integer pmgTaxExcPo, Integer pmgTotTaxHm, Integer pmgTotTaxPo,
                          String frtTermsDesc, String shipViaDesc, String fobTermsDesc, String poeCntryName, String poeCity,
                          String pmgReallocate, String threadId, String pmgAdvRplRefNbr, long batchNum) {
        super();
        this.auditNumber = auditNumber;
        this.tranType = tranType;
        this.pmgPoNumber = pmgPoNumber;
        this.vendorNumber = vendorNumber;
        this.vpcShpPoint = vpcShpPoint;
        this.pmgTypeName = pmgTypeName;
        this.orgLvlNumber = orgLvlNumber;
        this.capChainName = capChainName;
        this.basUsrName = basUsrName;
        this.pmgLcNumber = pmgLcNumber;
        this.pmgShipVia = pmgShipVia;
        this.pmgBuyer = pmgBuyer;
        this.vpcAptDesc = vpcAptDesc;
        this.pmgFob = pmgFob;
        this.currCode = currCode;
        this.pmgEffectDate = pmgEffectDate;
        this.pmgRate = pmgRate;
        this.dmtCode = dmtCode;
        this.trfAllocId = trfAllocId;
        this.pmgEntryDate = pmgEntryDate;
        this.pmgShipDate = pmgShipDate;
        this.pmgCancelDate = pmgCancelDate;
        this.pmgExpRctDate = pmgExpRctDate;
        this.pmgPayDate = pmgPayDate;
        this.distroId = distroId;
        this.dateCreated = dateCreated;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.pmgPoNotes = pmgPoNotes;
        this.pmgRecvNotes = pmgRecvNotes;
        this.pmgPisDate = pmgPisDate;
        this.pmgExtRctDate = pmgExtRctDate;
        this.pmgOtbBudDate = pmgOtbBudDate;
        this.pmgCnclByDate = pmgCnclByDate;
        this.poAutoRelease = poAutoRelease;
        this.pmgAllocator = pmgAllocator;
        this.pmgRateOverride = pmgRateOverride;
        this.applyVpcChgalw = applyVpcChgalw;
        this.pmgExtPoNum = pmgExtPoNum;
        this.jdaOrigin = jdaOrigin;
        this.pmgCnlReasCd = pmgCnlReasCd;
        this.pmgReqFlag = pmgReqFlag;
        this.pmgSuppChnCode = pmgSuppChnCode;
        this.pmgConsolCenter = pmgConsolCenter;
        this.pmgFmtCode = pmgFmtCode;
        this.pmgTaxExcHm = pmgTaxExcHm;
        this.pmgTaxExcLc = pmgTaxExcLc;
        this.pmgTaxExcPo = pmgTaxExcPo;
        this.pmgTotTaxHm = pmgTotTaxHm;
        this.pmgTotTaxPo = pmgTotTaxPo;
        this.frtTermsDesc = frtTermsDesc;
        this.shipViaDesc = shipViaDesc;
        this.fobTermsDesc = fobTermsDesc;
        this.poeCntryName = poeCntryName;
        this.poeCity = poeCity;
        this.pmgReallocate = pmgReallocate;
        this.threadId = threadId;
        this.pmgAdvRplRefNbr = pmgAdvRplRefNbr;
        this.batchNum = batchNum;
    }

    @Override
    public String toString() {
        return "BbookSdipmghdi [auditNumber=" + auditNumber + ", tranType=" + tranType + ", pmgPoNumber=" + pmgPoNumber
                + ", vendorNumber=" + vendorNumber + ", vpcShpPoint=" + vpcShpPoint + ", pmgTypeName=" + pmgTypeName
                + ", orgLvlNumber=" + orgLvlNumber + ", capChainName=" + capChainName + ", basUsrName=" + basUsrName
                + ", pmgLcNumber=" + pmgLcNumber + ", pmgShipVia=" + pmgShipVia + ", pmgBuyer=" + pmgBuyer
                + ", vpcAptDesc=" + vpcAptDesc + ", pmgFob=" + pmgFob + ", currCode=" + currCode + ", pmgEffectDate="
                + pmgEffectDate + ", pmgRate=" + pmgRate + ", dmtCode=" + dmtCode + ", trfAllocId=" + trfAllocId
                + ", pmgEntryDate=" + pmgEntryDate + ", pmgShipDate=" + pmgShipDate + ", pmgCancelDate=" + pmgCancelDate
                + ", pmgExpRctDate=" + pmgExpRctDate + ", pmgPayDate=" + pmgPayDate + ", distroId=" + distroId
                + ", dateCreated=" + dateCreated + ", downloadDate1=" + downloadDate1 + ", downloadDate2="
                + downloadDate2 + ", pmgPoNotes=" + pmgPoNotes + ", pmgRecvNotes=" + pmgRecvNotes + ", pmgPisDate="
                + pmgPisDate + ", pmgExtRctDate=" + pmgExtRctDate + ", pmgOtbBudDate=" + pmgOtbBudDate
                + ", pmgCnclByDate=" + pmgCnclByDate + ", poAutoRelease=" + poAutoRelease + ", pmgAllocator="
                + pmgAllocator + ", pmgRateOverride=" + pmgRateOverride + ", applyVpcChgalw=" + applyVpcChgalw
                + ", pmgExtPoNum=" + pmgExtPoNum + ", jdaOrigin=" + jdaOrigin + ", pmgCnlReasCd=" + pmgCnlReasCd
                + ", pmgReqFlag=" + pmgReqFlag + ", pmgSuppChnCode=" + pmgSuppChnCode + ", pmgConsolCenter="
                + pmgConsolCenter + ", pmgFmtCode=" + pmgFmtCode + ", pmgTaxExcHm=" + pmgTaxExcHm + ", pmgTaxExcLc="
                + pmgTaxExcLc + ", pmgTaxExcPo=" + pmgTaxExcPo + ", pmgTotTaxHm=" + pmgTotTaxHm + ", pmgTotTaxPo="
                + pmgTotTaxPo + ", frtTermsDesc=" + frtTermsDesc + ", shipViaDesc=" + shipViaDesc + ", fobTermsDesc="
                + fobTermsDesc + ", poeCntryName=" + poeCntryName + ", poeCity=" + poeCity + ", pmgReallocate="
                + pmgReallocate + ", threadId=" + threadId + ", pmgAdvRplRefNbr=" + pmgAdvRplRefNbr + ", batchNum="
                + batchNum + "]";
    }

    public Long getAuditNumber() {
        return auditNumber;
    }

    public void setAuditNumber(Long auditNumber) {
        this.auditNumber = auditNumber;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public Integer getPmgPoNumber() {
        return pmgPoNumber;
    }

    public void setPmgPoNumber(Integer pmgPoNumber) {
        this.pmgPoNumber = pmgPoNumber;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    public Integer getVpcShpPoint() {
        return vpcShpPoint;
    }

    public void setVpcShpPoint(Integer vpcShpPoint) {
        this.vpcShpPoint = vpcShpPoint;
    }

    public String getPmgTypeName() {
        return pmgTypeName;
    }

    public void setPmgTypeName(String pmgTypeName) {
        this.pmgTypeName = pmgTypeName;
    }

    public Integer getOrgLvlNumber() {
        return orgLvlNumber;
    }

    public void setOrgLvlNumber(Integer orgLvlNumber) {
        this.orgLvlNumber = orgLvlNumber;
    }

    public String getCapChainName() {
        return capChainName;
    }

    public void setCapChainName(String capChainName) {
        this.capChainName = capChainName;
    }

    public String getBasUsrName() {
        return basUsrName;
    }

    public void setBasUsrName(String basUsrName) {
        this.basUsrName = basUsrName;
    }

    public String getPmgLcNumber() {
        return pmgLcNumber;
    }

    public void setPmgLcNumber(String pmgLcNumber) {
        this.pmgLcNumber = pmgLcNumber;
    }

    public String getPmgShipVia() {
        return pmgShipVia;
    }

    public void setPmgShipVia(String pmgShipVia) {
        this.pmgShipVia = pmgShipVia;
    }

    public String getPmgBuyer() {
        return pmgBuyer;
    }

    public void setPmgBuyer(String pmgBuyer) {
        this.pmgBuyer = pmgBuyer;
    }

    public String getVpcAptDesc() {
        return vpcAptDesc;
    }

    public void setVpcAptDesc(String vpcAptDesc) {
        this.vpcAptDesc = vpcAptDesc;
    }

    public String getPmgFob() {
        return pmgFob;
    }

    public void setPmgFob(String pmgFob) {
        this.pmgFob = pmgFob;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getPmgEffectDate() {
        return pmgEffectDate;
    }

    public void setPmgEffectDate(String pmgEffectDate) {
        this.pmgEffectDate = pmgEffectDate;
    }

    public Integer getPmgRate() {
        return pmgRate;
    }

    public void setPmgRate(Integer pmgRate) {
        this.pmgRate = pmgRate;
    }

    public Integer getDmtCode() {
        return dmtCode;
    }

    public void setDmtCode(Integer dmtCode) {
        this.dmtCode = dmtCode;
    }

    public Integer getTrfAllocId() {
        return trfAllocId;
    }

    public void setTrfAllocId(Integer trfAllocId) {
        this.trfAllocId = trfAllocId;
    }

    public String getPmgEntryDate() {
        return pmgEntryDate;
    }

    public void setPmgEntryDate(String pmgEntryDate) {
        this.pmgEntryDate = pmgEntryDate;
    }

    public String getPmgShipDate() {
        return pmgShipDate;
    }

    public void setPmgShipDate(String pmgShipDate) {
        this.pmgShipDate = pmgShipDate;
    }

    public String getPmgCancelDate() {
        return pmgCancelDate;
    }

    public void setPmgCancelDate(String pmgCancelDate) {
        this.pmgCancelDate = pmgCancelDate;
    }

    public String getPmgExpRctDate() {
        return pmgExpRctDate;
    }

    public void setPmgExpRctDate(String pmgExpRctDate) {
        this.pmgExpRctDate = pmgExpRctDate;
    }

    public String getPmgPayDate() {
        return pmgPayDate;
    }

    public void setPmgPayDate(String pmgPayDate) {
        this.pmgPayDate = pmgPayDate;
    }

    public Integer getDistroId() {
        return distroId;
    }

    public void setDistroId(Integer distroId) {
        this.distroId = distroId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDownloadDate1() {
        return downloadDate1;
    }

    public void setDownloadDate1(Date downloadDate1) {
        this.downloadDate1 = downloadDate1;
    }

    public Date getDownloadDate2() {
        return downloadDate2;
    }

    public void setDownloadDate2(Date downloadDate2) {
        this.downloadDate2 = downloadDate2;
    }

    public String getPmgPoNotes() {
        return pmgPoNotes;
    }

    public void setPmgPoNotes(String pmgPoNotes) {
        this.pmgPoNotes = pmgPoNotes;
    }

    public String getPmgRecvNotes() {
        return pmgRecvNotes;
    }

    public void setPmgRecvNotes(String pmgRecvNotes) {
        this.pmgRecvNotes = pmgRecvNotes;
    }

    public String getPmgPisDate() {
        return pmgPisDate;
    }

    public void setPmgPisDate(String pmgPisDate) {
        this.pmgPisDate = pmgPisDate;
    }

    public String getPmgExtRctDate() {
        return pmgExtRctDate;
    }

    public void setPmgExtRctDate(String pmgExtRctDate) {
        this.pmgExtRctDate = pmgExtRctDate;
    }

    public String getPmgOtbBudDate() {
        return pmgOtbBudDate;
    }

    public void setPmgOtbBudDate(String pmgOtbBudDate) {
        this.pmgOtbBudDate = pmgOtbBudDate;
    }

    public String getPmgCnclByDate() {
        return pmgCnclByDate;
    }

    public void setPmgCnclByDate(String pmgCnclByDate) {
        this.pmgCnclByDate = pmgCnclByDate;
    }

    public String getPoAutoRelease() {
        return poAutoRelease;
    }

    public void setPoAutoRelease(String poAutoRelease) {
        this.poAutoRelease = poAutoRelease;
    }

    public String getPmgAllocator() {
        return pmgAllocator;
    }

    public void setPmgAllocator(String pmgAllocator) {
        this.pmgAllocator = pmgAllocator;
    }

    public String getPmgRateOverride() {
        return pmgRateOverride;
    }

    public void setPmgRateOverride(String pmgRateOverride) {
        this.pmgRateOverride = pmgRateOverride;
    }

    public String getApplyVpcChgalw() {
        return applyVpcChgalw;
    }

    public void setApplyVpcChgalw(String applyVpcChgalw) {
        this.applyVpcChgalw = applyVpcChgalw;
    }

    public String getPmgExtPoNum() {
        return pmgExtPoNum;
    }

    public void setPmgExtPoNum(String pmgExtPoNum) {
        this.pmgExtPoNum = pmgExtPoNum;
    }

    public String getJdaOrigin() {
        return jdaOrigin;
    }

    public void setJdaOrigin(String jdaOrigin) {
        this.jdaOrigin = jdaOrigin;
    }

    public Integer getPmgCnlReasCd() {
        return pmgCnlReasCd;
    }

    public void setPmgCnlReasCd(Integer pmgCnlReasCd) {
        this.pmgCnlReasCd = pmgCnlReasCd;
    }

    public String getPmgReqFlag() {
        return pmgReqFlag;
    }

    public void setPmgReqFlag(String pmgReqFlag) {
        this.pmgReqFlag = pmgReqFlag;
    }

    public String getPmgSuppChnCode() {
        return pmgSuppChnCode;
    }

    public void setPmgSuppChnCode(String pmgSuppChnCode) {
        this.pmgSuppChnCode = pmgSuppChnCode;
    }

    public Integer getPmgConsolCenter() {
        return pmgConsolCenter;
    }

    public void setPmgConsolCenter(Integer pmgConsolCenter) {
        this.pmgConsolCenter = pmgConsolCenter;
    }

    public String getPmgFmtCode() {
        return pmgFmtCode;
    }

    public void setPmgFmtCode(String pmgFmtCode) {
        this.pmgFmtCode = pmgFmtCode;
    }

    public Integer getPmgTaxExcHm() {
        return pmgTaxExcHm;
    }

    public void setPmgTaxExcHm(Integer pmgTaxExcHm) {
        this.pmgTaxExcHm = pmgTaxExcHm;
    }

    public Integer getPmgTaxExcLc() {
        return pmgTaxExcLc;
    }

    public void setPmgTaxExcLc(Integer pmgTaxExcLc) {
        this.pmgTaxExcLc = pmgTaxExcLc;
    }

    public Integer getPmgTaxExcPo() {
        return pmgTaxExcPo;
    }

    public void setPmgTaxExcPo(Integer pmgTaxExcPo) {
        this.pmgTaxExcPo = pmgTaxExcPo;
    }

    public Integer getPmgTotTaxHm() {
        return pmgTotTaxHm;
    }

    public void setPmgTotTaxHm(Integer pmgTotTaxHm) {
        this.pmgTotTaxHm = pmgTotTaxHm;
    }

    public Integer getPmgTotTaxPo() {
        return pmgTotTaxPo;
    }

    public void setPmgTotTaxPo(Integer pmgTotTaxPo) {
        this.pmgTotTaxPo = pmgTotTaxPo;
    }

    public String getFrtTermsDesc() {
        return frtTermsDesc;
    }

    public void setFrtTermsDesc(String frtTermsDesc) {
        this.frtTermsDesc = frtTermsDesc;
    }

    public String getShipViaDesc() {
        return shipViaDesc;
    }

    public void setShipViaDesc(String shipViaDesc) {
        this.shipViaDesc = shipViaDesc;
    }

    public String getFobTermsDesc() {
        return fobTermsDesc;
    }

    public void setFobTermsDesc(String fobTermsDesc) {
        this.fobTermsDesc = fobTermsDesc;
    }

    public String getPoeCntryName() {
        return poeCntryName;
    }

    public void setPoeCntryName(String poeCntryName) {
        this.poeCntryName = poeCntryName;
    }

    public String getPoeCity() {
        return poeCity;
    }

    public void setPoeCity(String poeCity) {
        this.poeCity = poeCity;
    }

    public String getPmgReallocate() {
        return pmgReallocate;
    }

    public void setPmgReallocate(String pmgReallocate) {
        this.pmgReallocate = pmgReallocate;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getPmgAdvRplRefNbr() {
        return pmgAdvRplRefNbr;
    }

    public void setPmgAdvRplRefNbr(String pmgAdvRplRefNbr) {
        this.pmgAdvRplRefNbr = pmgAdvRplRefNbr;
    }

    public long getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(long batchNum) {
        this.batchNum = batchNum;
    }

}
