package cl.corona.bbookenvoc.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BBOOK_SDIPMGDTI")
public class bbookSdipmgdti {

    @Id
    @Column(name="audit_number" ,columnDefinition = "number(12)")
    protected Long auditNumber;

    @Column(name="tran_type" ,columnDefinition = "varchar2(1)")
    protected String tranType;

    @Column(name="pmg_seq_num" ,columnDefinition = "number(12)")
    protected Integer pmgSeqNum;

    @Column(name="pmg_po_number" ,columnDefinition = "number(12)")
    protected Integer pmgPoNumber;

    @Column(name="pmg_line_number" ,columnDefinition = "number(6)")
    protected Integer pmgLineNumber;

    @Column(name="prd_lvl_number" ,columnDefinition = "varchar2(15)")
    protected String prdLvlNumber;

    @Column(name="org_lvl_number" ,columnDefinition = "number(12)")
    protected Integer orgLvlNumber;

    @Column(name="pmg_dtl_type" ,columnDefinition = "number(1)")
    protected Integer pmgDtlType;

    @Column(name="vpc_case_pack_id" ,columnDefinition = "varchar2(25)")
    protected String vpcCasePackId;

    @Column(name="prd_upc" ,columnDefinition = "number(18)")
    protected Integer prdUpc;

    @Column(name="pmg_sell_qty" ,columnDefinition = "number(11,4)")
    protected Integer pmgSellQty;

    @Column(name="pmg_pack_qty" ,columnDefinition = "number(11,4)")
    protected Integer pmgPackQty;

    @Column(name="pmg_sell_cost" ,columnDefinition = "number(16,5)")
    protected Integer pmgSellCost;

    @Column(name="pmg_pack_cost" ,columnDefinition = "number(16,5)")
    protected Double pmgPackCost;

    @Column(name="pmg_res_sell_qty" ,columnDefinition = "number(11,4)")
    protected Integer pmgResSellQty;

    @Column(name="pmg_retail" ,columnDefinition = "number(11,3)")
    protected Integer pmgRetail;

    @Column(name="vpc_apt_desc" ,columnDefinition = "varchar2(25)")
    protected String vpcAptDesc;

    @Column(name="pmg_pay_date" ,columnDefinition = "varchar2(10)")
    protected String pmgPayDate;

    @Column(name="pmg_call_off_po" ,columnDefinition = "number(12)")
    protected Integer pmgCallOffPo;

    @Column(name="dmt_code" ,columnDefinition = "number(1)")
    protected Integer dmtCode;

    @Column(name="trf_alloc_id" ,columnDefinition = "number(2)")
    protected Integer trfAllocId;

    @Column(name="pmg_ship_date" ,columnDefinition = "varchar2(10)")
    protected String pmgShipDate;

    @Column(name="pmg_exp_rct_date" ,columnDefinition = "varchar2(10)")
    protected String pmgExpRctDate;

    @Column(name="pmg_cancel_date" ,columnDefinition = "varchar2(10)")
    protected String pmgCancelDate;

    @Column(name="pmg_manual_dist" ,columnDefinition = "varchar2(1)")
    protected String pmgManualDist;

    @Column(name="distro_id" ,columnDefinition = "number(12)")
    protected Integer distroId;

    @Column(name="pmg_ship_via" ,columnDefinition = "varchar2(20)")
    protected String pmgShipVia;

    @Column(name="pmg_fob" ,columnDefinition = "varchar2(20)")
    protected String pmgFob;

    @Column(name="rcv_qc_exp" ,columnDefinition = "number(2)")
    protected Integer rcvQcExp;

    @Column(name="style_prd_lvl_nbr" ,columnDefinition = "number(12)")
    protected Integer stylePrdLvlNbr;

    @Column(name="pmg_track_code" ,columnDefinition = "number(5)")
    protected Integer pmgTrackCode;

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

    @Column(name="pmg_allocator" ,columnDefinition = "varchar2(40)")
    protected String pmgAllocator;

    @Column(name="prd_cross_dock" ,columnDefinition = "varchar2(1)")
    protected String prdCrossDock;

    @Column(name="pmg_cncl_by_date" ,columnDefinition = "varchar2(10)")
    protected String pmgCnclByDate;

    @Column(name="pmg_apply_dc_pack " ,columnDefinition = "varchar2(1)")
    protected String pmgApplyDcPack;

    @Column(name="pmg_dc_pack_qty" ,columnDefinition = "number(11,4)")
    protected Integer pmgDcPackQty;

    @Column(name="vpc_case_qty" ,columnDefinition = "number(11,4)")
    protected Integer vpcCaseQty;

    @Column(name="vpc_case_std_pack" ,columnDefinition = "number(11,4)")
    protected Integer vpcCaseStdPack;

    @Column(name="pmg_dist_sell_qty" ,columnDefinition = "number(11,4)")
    protected Integer pmgDistSellQty;

    @Column(name="pmg_dtl_tech_key" ,columnDefinition = "number(12)")
    protected Integer pmgDtlTechKey;

    @Column(name="pmg_ext_po_num" ,columnDefinition = "varchar2(20)")
    protected String pmgExtPoNum;

    @Column(name="pmg_loc_curr" ,columnDefinition = "varchar2(3)")
    protected String pmgLocCurr;

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

    @Column(name="pmg_spread_mult" ,columnDefinition = "number(10,3)")
    protected Integer pmgSpreadMult;

    @Column(name="frt_terms_desc" ,columnDefinition = "varchar2(20)")
    protected String frtTermsDesc;

    @Column(name="ship_via_desc" ,columnDefinition = "varchar2(20)")
    protected String shipViaDesc;

    @Column(name="fob_terms_desc" ,columnDefinition = "varchar2(20)")
    protected String fobTermsDesc;

    @Column(name="pmg_prd_vendor" ,columnDefinition = "varchar2(15)")
    protected String pmgPrdVendor;

    @Column(name="pmg_reallocate" ,columnDefinition = "varchar2(1)")
    protected String pmgReallocate;

    @Column(name="pmg_aal_method" ,columnDefinition = "varchar2(50)")
    protected String pmgAalMethod;

    @Column(name="pmg_apply_buy_multiple" ,columnDefinition = "varchar2(1)")
    protected String pmgApplyBuyMultiple;

    @Column(name="net_cost_flag" ,columnDefinition = "varchar2(1)")
    protected String netCostFlag;

    @Column(name="pmg_pack_net_cost" ,columnDefinition = "number(16,5)")
    protected Integer pmgPackNetCost;

    @Column(name="batch_num" ,columnDefinition = "number(12)")
    private long batchNum;


    public bbookSdipmgdti() {
        super();
        // TODO Auto-generated constructor stub
    }

    public bbookSdipmgdti(Long auditNumber, String tranType, Integer pmgSeqNum, Integer pmgPoNumber,
                          Integer pmgLineNumber, String prdLvlNumber, Integer orgLvlNumber, Integer pmgDtlType, String vpcCasePackId,
                          Integer prdUpc, Integer pmgSellQty, Integer pmgPackQty, Integer pmgSellCost, Double pmgPackCost,
                          Integer pmgResSellQty, Integer pmgRetail, String vpcAptDesc, String pmgPayDate, Integer pmgCallOffPo,
                          Integer dmtCode, Integer trfAllocId, String pmgShipDate, String pmgExpRctDate, String pmgCancelDate,
                          String pmgManualDist, Integer distroId, String pmgShipVia, String pmgFob, Integer rcvQcExp,
                          Integer stylePrdLvlNbr, Integer pmgTrackCode, String dateCreated, Date downloadDate1, Date downloadDate2,
                          String pmgPoNotes, String pmgRecvNotes, String pmgPisDate, String pmgExtRctDate, String pmgOtbBudDate,
                          String pmgAllocator, String prdCrossDock, String pmgCnclByDate, String pmgApplyDcPack, Integer pmgDcPackQty,
                          Integer vpcCaseQty, Integer vpcCaseStdPack, Integer pmgDistSellQty, Integer pmgDtlTechKey,
                          String pmgExtPoNum, String pmgLocCurr, Integer pmgTaxExcHm, Integer pmgTaxExcLc, Integer pmgTaxExcPo,
                          Integer pmgTotTaxHm, Integer pmgTotTaxPo, Integer pmgSpreadMult, String frtTermsDesc, String shipViaDesc,
                          String fobTermsDesc, String pmgPrdVendor, String pmgReallocate, String pmgAalMethod,
                          String pmgApplyBuyMultiple, String netCostFlag, Integer pmgPackNetCost, long batchNum) {
        super();
        this.auditNumber = auditNumber;
        this.tranType = tranType;
        this.pmgSeqNum = pmgSeqNum;
        this.pmgPoNumber = pmgPoNumber;
        this.pmgLineNumber = pmgLineNumber;
        this.prdLvlNumber = prdLvlNumber;
        this.orgLvlNumber = orgLvlNumber;
        this.pmgDtlType = pmgDtlType;
        this.vpcCasePackId = vpcCasePackId;
        this.prdUpc = prdUpc;
        this.pmgSellQty = pmgSellQty;
        this.pmgPackQty = pmgPackQty;
        this.pmgSellCost = pmgSellCost;
        this.pmgPackCost = pmgPackCost;
        this.pmgResSellQty = pmgResSellQty;
        this.pmgRetail = pmgRetail;
        this.vpcAptDesc = vpcAptDesc;
        this.pmgPayDate = pmgPayDate;
        this.pmgCallOffPo = pmgCallOffPo;
        this.dmtCode = dmtCode;
        this.trfAllocId = trfAllocId;
        this.pmgShipDate = pmgShipDate;
        this.pmgExpRctDate = pmgExpRctDate;
        this.pmgCancelDate = pmgCancelDate;
        this.pmgManualDist = pmgManualDist;
        this.distroId = distroId;
        this.pmgShipVia = pmgShipVia;
        this.pmgFob = pmgFob;
        this.rcvQcExp = rcvQcExp;
        this.stylePrdLvlNbr = stylePrdLvlNbr;
        this.pmgTrackCode = pmgTrackCode;
        this.dateCreated = dateCreated;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.pmgPoNotes = pmgPoNotes;
        this.pmgRecvNotes = pmgRecvNotes;
        this.pmgPisDate = pmgPisDate;
        this.pmgExtRctDate = pmgExtRctDate;
        this.pmgOtbBudDate = pmgOtbBudDate;
        this.pmgAllocator = pmgAllocator;
        this.prdCrossDock = prdCrossDock;
        this.pmgCnclByDate = pmgCnclByDate;
        this.pmgApplyDcPack = pmgApplyDcPack;
        this.pmgDcPackQty = pmgDcPackQty;
        this.vpcCaseQty = vpcCaseQty;
        this.vpcCaseStdPack = vpcCaseStdPack;
        this.pmgDistSellQty = pmgDistSellQty;
        this.pmgDtlTechKey = pmgDtlTechKey;
        this.pmgExtPoNum = pmgExtPoNum;
        this.pmgLocCurr = pmgLocCurr;
        this.pmgTaxExcHm = pmgTaxExcHm;
        this.pmgTaxExcLc = pmgTaxExcLc;
        this.pmgTaxExcPo = pmgTaxExcPo;
        this.pmgTotTaxHm = pmgTotTaxHm;
        this.pmgTotTaxPo = pmgTotTaxPo;
        this.pmgSpreadMult = pmgSpreadMult;
        this.frtTermsDesc = frtTermsDesc;
        this.shipViaDesc = shipViaDesc;
        this.fobTermsDesc = fobTermsDesc;
        this.pmgPrdVendor = pmgPrdVendor;
        this.pmgReallocate = pmgReallocate;
        this.pmgAalMethod = pmgAalMethod;
        this.pmgApplyBuyMultiple = pmgApplyBuyMultiple;
        this.netCostFlag = netCostFlag;
        this.pmgPackNetCost = pmgPackNetCost;
        this.batchNum = batchNum;
    }

    @Override
    public String toString() {
        return "BbookSdipmgdti [auditNumber=" + auditNumber + ", tranType=" + tranType + ", pmgSeqNum=" + pmgSeqNum
                + ", pmgPoNumber=" + pmgPoNumber + ", pmgLineNumber=" + pmgLineNumber + ", prdLvlNumber=" + prdLvlNumber
                + ", orgLvlNumber=" + orgLvlNumber + ", pmgDtlType=" + pmgDtlType + ", vpcCasePackId=" + vpcCasePackId
                + ", prdUpc=" + prdUpc + ", pmgSellQty=" + pmgSellQty + ", pmgPackQty=" + pmgPackQty + ", pmgSellCost="
                + pmgSellCost + ", pmgPackCost=" + pmgPackCost + ", pmgResSellQty=" + pmgResSellQty + ", pmgRetail="
                + pmgRetail + ", vpcAptDesc=" + vpcAptDesc + ", pmgPayDate=" + pmgPayDate + ", pmgCallOffPo="
                + pmgCallOffPo + ", dmtCode=" + dmtCode + ", trfAllocId=" + trfAllocId + ", pmgShipDate=" + pmgShipDate
                + ", pmgExpRctDate=" + pmgExpRctDate + ", pmgCancelDate=" + pmgCancelDate + ", pmgManualDist="
                + pmgManualDist + ", distroId=" + distroId + ", pmgShipVia=" + pmgShipVia + ", pmgFob=" + pmgFob
                + ", rcvQcExp=" + rcvQcExp + ", stylePrdLvlNbr=" + stylePrdLvlNbr + ", pmgTrackCode=" + pmgTrackCode
                + ", dateCreated=" + dateCreated + ", downloadDate1=" + downloadDate1 + ", downloadDate2="
                + downloadDate2 + ", pmgPoNotes=" + pmgPoNotes + ", pmgRecvNotes=" + pmgRecvNotes + ", pmgPisDate="
                + pmgPisDate + ", pmgExtRctDate=" + pmgExtRctDate + ", pmgOtbBudDate=" + pmgOtbBudDate
                + ", pmgAllocator=" + pmgAllocator + ", prdCrossDock=" + prdCrossDock + ", pmgCnclByDate="
                + pmgCnclByDate + ", pmgApplyDcPack=" + pmgApplyDcPack + ", pmgDcPackQty=" + pmgDcPackQty
                + ", vpcCaseQty=" + vpcCaseQty + ", vpcCaseStdPack=" + vpcCaseStdPack + ", pmgDistSellQty="
                + pmgDistSellQty + ", pmgDtlTechKey=" + pmgDtlTechKey + ", pmgExtPoNum=" + pmgExtPoNum + ", pmgLocCurr="
                + pmgLocCurr + ", pmgTaxExcHm=" + pmgTaxExcHm + ", pmgTaxExcLc=" + pmgTaxExcLc + ", pmgTaxExcPo="
                + pmgTaxExcPo + ", pmgTotTaxHm=" + pmgTotTaxHm + ", pmgTotTaxPo=" + pmgTotTaxPo + ", pmgSpreadMult="
                + pmgSpreadMult + ", frtTermsDesc=" + frtTermsDesc + ", shipViaDesc=" + shipViaDesc + ", fobTermsDesc="
                + fobTermsDesc + ", pmgPrdVendor=" + pmgPrdVendor + ", pmgReallocate=" + pmgReallocate
                + ", pmgAalMethod=" + pmgAalMethod + ", pmgApplyBuyMultiple=" + pmgApplyBuyMultiple + ", netCostFlag="
                + netCostFlag + ", pmgPackNetCost=" + pmgPackNetCost + ", batchNum=" + batchNum + "]";
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

    public Integer getPmgSeqNum() {
        return pmgSeqNum;
    }

    public void setPmgSeqNum(Integer pmgSeqNum) {
        this.pmgSeqNum = pmgSeqNum;
    }

    public Integer getPmgPoNumber() {
        return pmgPoNumber;
    }

    public void setPmgPoNumber(Integer pmgPoNumber) {
        this.pmgPoNumber = pmgPoNumber;
    }

    public Integer getPmgLineNumber() {
        return pmgLineNumber;
    }

    public void setPmgLineNumber(Integer pmgLineNumber) {
        this.pmgLineNumber = pmgLineNumber;
    }

    public String getPrdLvlNumber() {
        return prdLvlNumber;
    }

    public void setPrdLvlNumber(String prdLvlNumber) {
        this.prdLvlNumber = prdLvlNumber;
    }

    public Integer getOrgLvlNumber() {
        return orgLvlNumber;
    }

    public void setOrgLvlNumber(Integer orgLvlNumber) {
        this.orgLvlNumber = orgLvlNumber;
    }

    public Integer getPmgDtlType() {
        return pmgDtlType;
    }

    public void setPmgDtlType(Integer pmgDtlType) {
        this.pmgDtlType = pmgDtlType;
    }

    public String getVpcCasePackId() {
        return vpcCasePackId;
    }

    public void setVpcCasePackId(String vpcCasePackId) {
        this.vpcCasePackId = vpcCasePackId;
    }

    public Integer getPrdUpc() {
        return prdUpc;
    }

    public void setPrdUpc(Integer prdUpc) {
        this.prdUpc = prdUpc;
    }

    public Integer getPmgSellQty() {
        return pmgSellQty;
    }

    public void setPmgSellQty(Integer pmgSellQty) {
        this.pmgSellQty = pmgSellQty;
    }

    public Integer getPmgPackQty() {
        return pmgPackQty;
    }

    public void setPmgPackQty(Integer pmgPackQty) {
        this.pmgPackQty = pmgPackQty;
    }

    public Integer getPmgSellCost() {
        return pmgSellCost;
    }

    public void setPmgSellCost(Integer pmgSellCost) {
        this.pmgSellCost = pmgSellCost;
    }

    public Double getPmgPackCost() {
        return pmgPackCost;
    }

    public void setPmgPackCost(Double pmgPackCost) {
        this.pmgPackCost = pmgPackCost;
    }

    public Integer getPmgResSellQty() {
        return pmgResSellQty;
    }

    public void setPmgResSellQty(Integer pmgResSellQty) {
        this.pmgResSellQty = pmgResSellQty;
    }

    public Integer getPmgRetail() {
        return pmgRetail;
    }

    public void setPmgRetail(Integer pmgRetail) {
        this.pmgRetail = pmgRetail;
    }

    public String getVpcAptDesc() {
        return vpcAptDesc;
    }

    public void setVpcAptDesc(String vpcAptDesc) {
        this.vpcAptDesc = vpcAptDesc;
    }

    public String getPmgPayDate() {
        return pmgPayDate;
    }

    public void setPmgPayDate(String pmgPayDate) {
        this.pmgPayDate = pmgPayDate;
    }

    public Integer getPmgCallOffPo() {
        return pmgCallOffPo;
    }

    public void setPmgCallOffPo(Integer pmgCallOffPo) {
        this.pmgCallOffPo = pmgCallOffPo;
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

    public String getPmgShipDate() {
        return pmgShipDate;
    }

    public void setPmgShipDate(String pmgShipDate) {
        this.pmgShipDate = pmgShipDate;
    }

    public String getPmgExpRctDate() {
        return pmgExpRctDate;
    }

    public void setPmgExpRctDate(String pmgExpRctDate) {
        this.pmgExpRctDate = pmgExpRctDate;
    }

    public String getPmgCancelDate() {
        return pmgCancelDate;
    }

    public void setPmgCancelDate(String pmgCancelDate) {
        this.pmgCancelDate = pmgCancelDate;
    }

    public String getPmgManualDist() {
        return pmgManualDist;
    }

    public void setPmgManualDist(String pmgManualDist) {
        this.pmgManualDist = pmgManualDist;
    }

    public Integer getDistroId() {
        return distroId;
    }

    public void setDistroId(Integer distroId) {
        this.distroId = distroId;
    }

    public String getPmgShipVia() {
        return pmgShipVia;
    }

    public void setPmgShipVia(String pmgShipVia) {
        this.pmgShipVia = pmgShipVia;
    }

    public String getPmgFob() {
        return pmgFob;
    }

    public void setPmgFob(String pmgFob) {
        this.pmgFob = pmgFob;
    }

    public Integer getRcvQcExp() {
        return rcvQcExp;
    }

    public void setRcvQcExp(Integer rcvQcExp) {
        this.rcvQcExp = rcvQcExp;
    }

    public Integer getStylePrdLvlNbr() {
        return stylePrdLvlNbr;
    }

    public void setStylePrdLvlNbr(Integer stylePrdLvlNbr) {
        this.stylePrdLvlNbr = stylePrdLvlNbr;
    }

    public Integer getPmgTrackCode() {
        return pmgTrackCode;
    }

    public void setPmgTrackCode(Integer pmgTrackCode) {
        this.pmgTrackCode = pmgTrackCode;
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

    public String getPmgAllocator() {
        return pmgAllocator;
    }

    public void setPmgAllocator(String pmgAllocator) {
        this.pmgAllocator = pmgAllocator;
    }

    public String getPrdCrossDock() {
        return prdCrossDock;
    }

    public void setPrdCrossDock(String prdCrossDock) {
        this.prdCrossDock = prdCrossDock;
    }

    public String getPmgCnclByDate() {
        return pmgCnclByDate;
    }

    public void setPmgCnclByDate(String pmgCnclByDate) {
        this.pmgCnclByDate = pmgCnclByDate;
    }

    public String getPmgApplyDcPack() {
        return pmgApplyDcPack;
    }

    public void setPmgApplyDcPack(String pmgApplyDcPack) {
        this.pmgApplyDcPack = pmgApplyDcPack;
    }

    public Integer getPmgDcPackQty() {
        return pmgDcPackQty;
    }

    public void setPmgDcPackQty(Integer pmgDcPackQty) {
        this.pmgDcPackQty = pmgDcPackQty;
    }

    public Integer getVpcCaseQty() {
        return vpcCaseQty;
    }

    public void setVpcCaseQty(Integer vpcCaseQty) {
        this.vpcCaseQty = vpcCaseQty;
    }

    public Integer getVpcCaseStdPack() {
        return vpcCaseStdPack;
    }

    public void setVpcCaseStdPack(Integer vpcCaseStdPack) {
        this.vpcCaseStdPack = vpcCaseStdPack;
    }

    public Integer getPmgDistSellQty() {
        return pmgDistSellQty;
    }

    public void setPmgDistSellQty(Integer pmgDistSellQty) {
        this.pmgDistSellQty = pmgDistSellQty;
    }

    public Integer getPmgDtlTechKey() {
        return pmgDtlTechKey;
    }

    public void setPmgDtlTechKey(Integer pmgDtlTechKey) {
        this.pmgDtlTechKey = pmgDtlTechKey;
    }

    public String getPmgExtPoNum() {
        return pmgExtPoNum;
    }

    public void setPmgExtPoNum(String pmgExtPoNum) {
        this.pmgExtPoNum = pmgExtPoNum;
    }

    public String getPmgLocCurr() {
        return pmgLocCurr;
    }

    public void setPmgLocCurr(String pmgLocCurr) {
        this.pmgLocCurr = pmgLocCurr;
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

    public Integer getPmgSpreadMult() {
        return pmgSpreadMult;
    }

    public void setPmgSpreadMult(Integer pmgSpreadMult) {
        this.pmgSpreadMult = pmgSpreadMult;
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

    public String getPmgPrdVendor() {
        return pmgPrdVendor;
    }

    public void setPmgPrdVendor(String pmgPrdVendor) {
        this.pmgPrdVendor = pmgPrdVendor;
    }

    public String getPmgReallocate() {
        return pmgReallocate;
    }

    public void setPmgReallocate(String pmgReallocate) {
        this.pmgReallocate = pmgReallocate;
    }

    public String getPmgAalMethod() {
        return pmgAalMethod;
    }

    public void setPmgAalMethod(String pmgAalMethod) {
        this.pmgAalMethod = pmgAalMethod;
    }

    public String getPmgApplyBuyMultiple() {
        return pmgApplyBuyMultiple;
    }

    public void setPmgApplyBuyMultiple(String pmgApplyBuyMultiple) {
        this.pmgApplyBuyMultiple = pmgApplyBuyMultiple;
    }

    public String getNetCostFlag() {
        return netCostFlag;
    }

    public void setNetCostFlag(String netCostFlag) {
        this.netCostFlag = netCostFlag;
    }

    public Integer getPmgPackNetCost() {
        return pmgPackNetCost;
    }

    public void setPmgPackNetCost(Integer pmgPackNetCost) {
        this.pmgPackNetCost = pmgPackNetCost;
    }


}
