package com.icbc.demo.entity;

public class AccountBalance {

    private String zoneno;  //地区号，都是119，不关注
    private String actbrno;  //账户核算网点号，1或2，不考虑
    private String phybrno;  //账户物理网点号，1或2，不考虑
    private String accno;  //账号
    private String accnoseq;  //子协议序号，都是0，不关注
    private String currtype;  //币种
    private String subcode;  //科目号，不知道编码意思，有118101，201011，201012，202001，203011，203001等（银行账户科目在银行核算体系中属于表内负债类科目。一般按客户情况划分，包括工业存款、综合类企业存款、商业存款、个体存款。。。）
    private String loanno;  //借据编号，0,12，132,812等，不知道啥意思
    private String loansqno;  //借据序号，都是0，不关注
    private String nousef;  //新旧账户使用标志，都是0，不关注
    private String accatrbt; //账户属性，5或1，银行结算账户or存储账户
    private String status;  //账户状态，0或1，未到账，审核，失效等
    private int depquota;  //存款限额，全是0，不关注
    private String osaf;  //离岸标志，1或2，如香港企业在香港地区以外的银行开立的帐户就叫离岸帐户
    private int holdceil;  //税款保留额度，全是0，不关注
    //关注
    private long dbalance;  //借⽅余额
    private long cbalance;  //贷方余额
    private long dracm;  //借方核对积数
    private long cram;  //贷方核对积数，积数：账户每日余额累加；核对积数：从今年1月1日到当前日期的余额累加；利息= 积数*利率/365，如果这个人当前账户没有钱，但是积数很大，说明他的现金流很大
    private int odlmt;  //透支额度，都是0
    private String lsttrand;  //最后交易日
    private String accname;  //账户名称
    private String lncode;  //贷款种类代码，都是0，不关注
    private String acctype;  //帐户类型，都是0，不关注。银行账户类型按存款人不同分为单位银行结算账户和个人银行结算账户。单位银行结算账户按用途分为基本存款账户、一般存款账户、专用存款账户、临时存款账户。0 or 1，是否有对该账户做一些如冻结之类的操作
    private String procflag;  //处理标志，都是0，不关注。
    private int drintacm;  //借方积数息余，都是0
    //适当关注
    private int crintacm;  //贷方积数息余（息余=积数*利率）
    //关注
    private String protseno;  //协议编号
    private String subserno;  //子协议序号,都是12
    private String ptDt;  //都是2020-07-01-asi

    public String getZoneno() {
        return zoneno;
    }

    public void setZoneno(String zoneno) {
        this.zoneno = zoneno;
    }

    public String getActbrno() {
        return actbrno;
    }

    public void setActbrno(String actbrno) {
        this.actbrno = actbrno;
    }

    public String getPhybrno() {
        return phybrno;
    }

    public void setPhybrno(String phybrno) {
        this.phybrno = phybrno;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccnoseq() {
        return accnoseq;
    }

    public void setAccnoseq(String accnoseq) {
        this.accnoseq = accnoseq;
    }

    public String getCurrtype() {
        return currtype;
    }

    public void setCurrtype(String currtype) {
        this.currtype = currtype;
    }

    public String getSubcode() {
        return subcode;
    }

    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

    public String getLoanno() {
        return loanno;
    }

    public void setLoanno(String loanno) {
        this.loanno = loanno;
    }

    public String getLoansqno() {
        return loansqno;
    }

    public void setLoansqno(String loansqno) {
        this.loansqno = loansqno;
    }

    public String getNousef() {
        return nousef;
    }

    public void setNousef(String nousef) {
        this.nousef = nousef;
    }

    public String getAccatrbt() {
        return accatrbt;
    }

    public void setAccatrbt(String accatrbt) {
        this.accatrbt = accatrbt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDepquota() {
        return depquota;
    }

    public void setDepquota(int depquota) {
        this.depquota = depquota;
    }

    public String getOsaf() {
        return osaf;
    }

    public void setOsaf(String osaf) {
        this.osaf = osaf;
    }

    public int getHoldceil() {
        return holdceil;
    }

    public void setHoldceil(int holdceil) {
        this.holdceil = holdceil;
    }

    public long getDbalance() {
        return dbalance;
    }

    public void setDbalance(long dbalance) {
        this.dbalance = dbalance;
    }

    public long getCbalance() {
        return cbalance;
    }

    public void setCbalance(long cbalance) {
        this.cbalance = cbalance;
    }

    public long getDracm() {
        return dracm;
    }

    public void setDracm(long dracm) {
        this.dracm = dracm;
    }

    public long getCram() {
        return cram;
    }

    public void setCram(long cram) {
        this.cram = cram;
    }

    public int getOdlmt() {
        return odlmt;
    }

    public void setOdlmt(int odlmt) {
        this.odlmt = odlmt;
    }

    public String getLsttrand() {
        return lsttrand;
    }

    public void setLsttrand(String lsttrand) {
        this.lsttrand = lsttrand;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getLncode() {
        return lncode;
    }

    public void setLncode(String lncode) {
        this.lncode = lncode;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public String getProcflag() {
        return procflag;
    }

    public void setProcflag(String procflag) {
        this.procflag = procflag;
    }

    public int getDrintacm() {
        return drintacm;
    }

    public void setDrintacm(int drintacm) {
        this.drintacm = drintacm;
    }

    public int getCrintacm() {
        return crintacm;
    }

    public void setCrintacm(int crintacm) {
        this.crintacm = crintacm;
    }

    public String getProtseno() {
        return protseno;
    }

    public void setProtseno(String protseno) {
        this.protseno = protseno;
    }

    public String getSubserno() {
        return subserno;
    }

    public void setSubserno(String subserno) {
        this.subserno = subserno;
    }

    public String getPtDt() {
        return ptDt;
    }

    public void setPtDt(String ptDt) {
        this.ptDt = ptDt;
    }

    @Override
    public String toString() {
        return "AccountBalance{" +
                "zoneno='" + zoneno + '\'' +
                ", actbrno='" + actbrno + '\'' +
                ", phybrno='" + phybrno + '\'' +
                ", accno='" + accno + '\'' +
                ", accnoseq='" + accnoseq + '\'' +
                ", currtype='" + currtype + '\'' +
                ", subcode='" + subcode + '\'' +
                ", loanno='" + loanno + '\'' +
                ", loansqno='" + loansqno + '\'' +
                ", nousef='" + nousef + '\'' +
                ", accatrbt='" + accatrbt + '\'' +
                ", status='" + status + '\'' +
                ", depquota=" + depquota +
                ", osaf='" + osaf + '\'' +
                ", holdceil=" + holdceil +
                ", dbalance=" + dbalance +
                ", cbalance=" + cbalance +
                ", dracm=" + dracm +
                ", cram=" + cram +
                ", odlmt=" + odlmt +
                ", lsttrand='" + lsttrand + '\'' +
                ", accname='" + accname + '\'' +
                ", lncode='" + lncode + '\'' +
                ", acctype='" + acctype + '\'' +
                ", procflag='" + procflag + '\'' +
                ", drintacm=" + drintacm +
                ", crintacm=" + crintacm +
                ", protseno='" + protseno + '\'' +
                ", subserno='" + subserno + '\'' +
                ", ptDt='" + ptDt + '\'' +
                '}';
    }
}
