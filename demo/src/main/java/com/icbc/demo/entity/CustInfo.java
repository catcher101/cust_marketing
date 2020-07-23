package com.icbc.demo.entity;

//'ECIS_AFCE017_个人客户基本信息日终下载文件数据表'
public class CustInfo {

    private String createdZoneno; //创建地区号，表格上都是119
    private String createdBrno;  //创建网点号
    private String individualid;  //TB1010记录ID
    private String seqNo;   //序号
    private String dapcode;  //资料分区代码
    private String individualStat;  //个人记录状态
    private String regType;  //开户证件类型，表格上是0或1，不知道代表什么
    private String regNo;  //开户证件号码
    private String name;  //当地语言姓名
    private String enName;  //英文名
    private String lastName;  //姓
    private String midName; //中间名
    private String firstName;  //名
    private String natIdNo;  //国家ID
    private String dfltGreet;  //缺省称呼
    private String gender;  //性别，只考虑编码为1和2的客户，1位男性，2为女性
    private String race;  //民族
//    关注，数据格式可能要修改
    private String birthday; //出生日期
    private String cityOfBirth; //出生城市
    private String cntryOfBirth; //出生国家
    private String maritalStat;  //婚姻状况
    private String maritalStatDate; //婚姻生效日期
    private String educLevel;  //文化程度（教育程度）
    private String dateofgraduate;  //取得最高文化程度时间
//    适当关注
    private String techniquelevel;  //技术职称
//    适当关注
    private String prof;  //职业
    private String profStat;  //职业状态（在职、待业、失业，不过不知道哪个编码代表哪个）
    private String executivelevel;  //行政级别，不知道各个编码代表什么，不考虑了
    private String startWorkDate; //参加工作时间，不考虑了
    //适当关注
    private String employer;  //工作公司（雇佣者名称）,icbc等等
    private String employerType;  //工作公司类别
    private String empStartDate;  //工作开始日，不考虑了
    private String empStat;   //工作状态，貌似都是0
    private String noOfDpnd;  //供养人口，0或90，不知道代表什么
//    适当关注
    private String crRskRating; //信贷风险评估，0或90，不知道代表什么
    private String empNo;  //工作证号，很多空白，应该没什么用
//    适当关注
    private String icbcemplyeeflag;  //工行员工标志，0或1
    private String customerinothbank;  //是否他行客户标志，0或2，0多2少
//    适当关注
    private String govBnftRcptFlag;  //政府救济标志，0或2，0少2多
    private String greencardflag; //绿卡标志，大部分是0，不考虑吧
    private String howRefer;  //客户来源，全是0，不关注
    private String nonadultflag;  //未成年标志，全是0，不关注
    private String salesStat;   //客户销售状态，全是0，不关注
    private String tempresidentflag;  //暂时居留标志，有0有1
//    适当关注
    private String localornot;  //是否本地居民，有0有1,0少1多
    private String blacklistcustflag; //黑名单/关注客户标志，有0,2,4,51,0多
    //适当关注
    private String customerlevel;  //客户级别，有51,29，3，13,37，42，32，53等。或者说五个等级： A级客户：有明显的业务需求，并且预计能够在一个月内成交； B级客户：有明显的业务需求，并且预计能够在三个月内成交； C级客户：有明显的业务需求，并且预计能够在半年内成交；D级客户：有潜在的业务需求的客户或者有明显需求但需要在至少半年后才可能成交；E级客户：没有需求或者没有任何成交机会，也叫死亡客户。
    private String customermanager;  //客户经理编号，空白，29，13,37等等，不关注
    private String seccustomermanager;  //副客户经理编号，大多空白，还有0,1,4，不关注
    private String numoftransaction;  //每天正常交易量，0,4,1,2000000等，不考虑吧
    private String amtoftransaction;  //每天正常交易额(科威特第纳尔币种的金额支持三位小数)，0,4,5,1000000,2000000,3000000等，不知道啥
//    适当关注
    private String useofdeposit;  //存款用途，0未知,1商务,2投资,3其他，4个人,5其他
    private String sourceofdeposit; //存款资金来源，0,1,3,5,7，不知道代表啥
    private String nameofmotherbemar; //母亲未婚时的姓名，空白，0,6，不关注
    private String religion;  //宗教，0或6,111应该是列错位
    private String citycode;  //城市代码，0或111
    private String customertype;  //客户类别,0或111,好像错列了
    private String backup1;  //FOVA0905版本启用，用于保存“州,郡,省”数据字典，数据字典取值来自国家州代码参数表。都是0，不关注
    private String backup2;  //是否收税标识,全是0，不关注
    private String backup3;  //免税额(科威特第纳尔币种的金额支持三位小数),0或空白，不关注
    private String backup4;  //空白，0,5,备用字段4，不关注
    //适当关注
    private String custAttribute;  //客户状态，0正常，1死亡，2接管，3冻结，4停业，5异常，6待审核
    private String advRecvFlag;  //是否接收广告，0多1少
    private String prvCntInd;  //是否同意记录私人信息标志，0,999,11,2,3，不知道代表啥
    private String bankRelated;  //客户和银行的关系，0,3,5，11,17,20,24等，不知道啥意思
    private String riskScore;  //黑名单关注度得分，0,2，还有错列的日期，不关注了
    private String nextRevDate;  //下一审查日期，不关注吧
    private String domicileCnt;  //现居住国家，0,446,344，不知道代表啥
    private String domicilePrv;  //现居住省份，0,446,344，不知道代表啥
    private String riskCnt;  //  风险国，0,446,344，不知道代表啥
    private String residenActDate;  //税务及居民状况生效日期，不关注
    private String foreverType; //是否本国永久居民，0,1,2,3，不关注
    private String degreeId; //非本地居民所在国身份ID。空白与繁体字，不关注
    //适当关注
    private String coPost;  //公司职衔。财务会计，高级技术员，分行经理，文员等，但大多空白
    private String hireKind;  //受雇性质，0,2,3，也有日期错列，不知道啥意思
    private String agreementEndDate; //约满日期，9999/12/31或2003/7/2，不知道啥意思
    //适当关注
    private String advMobileFlag; //是否接受新产品介绍的电话/采访，0或1,0多1少
    private String advExtendFlag; //是否希望接受新产品推广的邮件，0多1少
    private String creditGrade; //信用局评分，0或空白，不关注
    private String creditValue; //信用局评级，0,1,3，空白，不关注
    private String custType; //客户类型，0或1，0多1少，不考虑吧
    private String enNameRule; //英文名使用规则，0多1少，不关注
    private String deliveryOption; //寄送选项，都是0，不考虑
    private String deliverTo;  //寄送部门，都是0，不考虑
    private String writtenLanguage;  //书面语言，都是0，不考虑
    private String speakingLanguage;  //会话语言，都是0，不考虑
    private String existNameDate;  //现有名称生效日期，大部分是9999/12/31，不考虑
    private String birthdateFlag;  //出生日期完整标志，都是0，不考虑
    private String residenceStatus;  //居住情况，0或空或错列，不考虑
    private String resStatusDesc;  //居住情况说明，大部分是空，不考虑
    private String residenceDate;  //入住日期，大部分是9999/12/31，不考虑
    private String resCountryDesc;  //居住国说明，大部分空白
    private String profDesc;  //职业说明，工程、高级技术员、文员等，大部分空白
    private String highRiskInd;  //高危行业，都是0，不考虑
    private String highRiskDesc;  //高危行业说明，大都空白，不考虑
    private String noOfKids;  //儿童个数，都是0，不考虑
    private String religionDesc;  //宗教性质说明，大都空白，不考虑
    private String affirmFlag;  //是否确认标志，都是0，不考虑
    private String affirmDate;  //确认日期，都是9999/12/31，不考虑
    private String belongBrno;  //客户归属网点，都是0，不考虑
    private String custAttrChgDate; //客户状态改变日期，都是9999/12/31，不考虑
    private String kycReasonCode; //证件不齐全原因代码，都是0，不考虑
    private String kycCompleteFlag; //证件齐全标志，都是0，不考虑
    private String kycCompleteDate; //证件齐全日期，都是9999/12/31，不考虑
    private String kycMissingDoc;  //缺失的证件名称，大都空白，不考虑
    private String titleName; //称谓
    private String bk1; //是否愿意接收短信,0多1少
    private String bk2; //备用2，都是0，不考虑
    private String bk3; //区域标识，0多3少，不考虑
    private String bk4; //备用4，都是0，不考虑
    private String bk5; //备用5，都是0，不考虑
    private String bk6; //备用6，都是0，不考虑
    private String bk7; //备用7，都是9999/12/31，不考虑
    private String bk8; //备用8，都是空白，不考虑
    private String bk9; //母亲名，都是空白，不考虑
    private String bk10; //父亲姓名，都是空白，不考虑
    private String prefLang; //语言编号，都是0，不考虑
    private String primNat; //国籍，446,156,344,158
    private String secNat; //第二国籍，都是0，不考虑
    private String createdTs; //记录创建时间戳
    private String updatedTs; //记录修改时间戳,都是9999-12-31-00.00.00.000000，不考虑
    private String createdDateSys; //创建日期（系统）
    private String createdDateBus; //创建日期(业务）
    private String updatedDateSys; //修改日期（系统）
    private String updatedDateBus; //修改日期(业务）
    private String updatedZoneno;  //修改地区号，119多104少，不考虑
    private String updatedBrno;  //修改网点号，0,1,1000,0多1少
    private String createdBy;  //创建柜员，不考虑
    private String updatedBy;  //修改柜员，1多12少，不考虑
    private String createdPgm;  //创建程序，不考虑
    private String updatedPgm;  //修改程序，不考虑
    private String createdApp;  //创建应用，很多空白，不考虑
    private String updatedApp;  //修改应用，不考虑
    private String createdSystemId;  //建立记录的系统ID，都是0，不考虑
    private String updatedSystemId;  //更新记录的系统ID，都是0，不考虑
    private String checkedBy;  //很多空白，不考虑
    private String ptDt;  //都是2023-06-03-asi

    public String getCreatedZoneno() {
        return createdZoneno;
    }

    public void setCreatedZoneno(String createdZoneno) {
        this.createdZoneno = createdZoneno;
    }

    public String getCreatedBrno() {
        return createdBrno;
    }

    public void setCreatedBrno(String createdBrno) {
        this.createdBrno = createdBrno;
    }

    public String getIndividualid() {
        return individualid;
    }

    public void setIndividualid(String individualid) {
        this.individualid = individualid;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getDapcode() {
        return dapcode;
    }

    public void setDapcode(String dapcode) {
        this.dapcode = dapcode;
    }

    public String getIndividualStat() {
        return individualStat;
    }

    public void setIndividualStat(String individualStat) {
        this.individualStat = individualStat;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNatIdNo() {
        return natIdNo;
    }

    public void setNatIdNo(String natIdNo) {
        this.natIdNo = natIdNo;
    }

    public String getDfltGreet() {
        return dfltGreet;
    }

    public void setDfltGreet(String dfltGreet) {
        this.dfltGreet = dfltGreet;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getCntryOfBirth() {
        return cntryOfBirth;
    }

    public void setCntryOfBirth(String cntryOfBirth) {
        this.cntryOfBirth = cntryOfBirth;
    }

    public String getMaritalStat() {
        return maritalStat;
    }

    public void setMaritalStat(String maritalStat) {
        this.maritalStat = maritalStat;
    }

    public String getMaritalStatDate() {
        return maritalStatDate;
    }

    public void setMaritalStatDate(String maritalStatDate) {
        this.maritalStatDate = maritalStatDate;
    }

    public String getEducLevel() {
        return educLevel;
    }

    public void setEducLevel(String educLevel) {
        this.educLevel = educLevel;
    }

    public String getDateofgraduate() {
        return dateofgraduate;
    }

    public void setDateofgraduate(String dateofgraduate) {
        this.dateofgraduate = dateofgraduate;
    }

    public String getTechniquelevel() {
        return techniquelevel;
    }

    public void setTechniquelevel(String techniquelevel) {
        this.techniquelevel = techniquelevel;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getProfStat() {
        return profStat;
    }

    public void setProfStat(String profStat) {
        this.profStat = profStat;
    }

    public String getExecutivelevel() {
        return executivelevel;
    }

    public void setExecutivelevel(String executivelevel) {
        this.executivelevel = executivelevel;
    }

    public String getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(String startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployerType() {
        return employerType;
    }

    public void setEmployerType(String employerType) {
        this.employerType = employerType;
    }

    public String getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(String empStartDate) {
        this.empStartDate = empStartDate;
    }

    public String getEmpStat() {
        return empStat;
    }

    public void setEmpStat(String empStat) {
        this.empStat = empStat;
    }

    public String getNoOfDpnd() {
        return noOfDpnd;
    }

    public void setNoOfDpnd(String noOfDpnd) {
        this.noOfDpnd = noOfDpnd;
    }

    public String getCrRskRating() {
        return crRskRating;
    }

    public void setCrRskRating(String crRskRating) {
        this.crRskRating = crRskRating;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getIcbcemplyeeflag() {
        return icbcemplyeeflag;
    }

    public void setIcbcemplyeeflag(String icbcemplyeeflag) {
        this.icbcemplyeeflag = icbcemplyeeflag;
    }

    public String getCustomerinothbank() {
        return customerinothbank;
    }

    public void setCustomerinothbank(String customerinothbank) {
        this.customerinothbank = customerinothbank;
    }

    public String getGovBnftRcptFlag() {
        return govBnftRcptFlag;
    }

    public void setGovBnftRcptFlag(String govBnftRcptFlag) {
        this.govBnftRcptFlag = govBnftRcptFlag;
    }

    public String getGreencardflag() {
        return greencardflag;
    }

    public void setGreencardflag(String greencardflag) {
        this.greencardflag = greencardflag;
    }

    public String getHowRefer() {
        return howRefer;
    }

    public void setHowRefer(String howRefer) {
        this.howRefer = howRefer;
    }

    public String getNonadultflag() {
        return nonadultflag;
    }

    public void setNonadultflag(String nonadultflag) {
        this.nonadultflag = nonadultflag;
    }

    public String getSalesStat() {
        return salesStat;
    }

    public void setSalesStat(String salesStat) {
        this.salesStat = salesStat;
    }

    public String getTempresidentflag() {
        return tempresidentflag;
    }

    public void setTempresidentflag(String tempresidentflag) {
        this.tempresidentflag = tempresidentflag;
    }

    public String getLocalornot() {
        return localornot;
    }

    public void setLocalornot(String localornot) {
        this.localornot = localornot;
    }

    public String getBlacklistcustflag() {
        return blacklistcustflag;
    }

    public void setBlacklistcustflag(String blacklistcustflag) {
        this.blacklistcustflag = blacklistcustflag;
    }

    public String getCustomerlevel() {
        return customerlevel;
    }

    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel;
    }

    public String getCustomermanager() {
        return customermanager;
    }

    public void setCustomermanager(String customermanager) {
        this.customermanager = customermanager;
    }

    public String getSeccustomermanager() {
        return seccustomermanager;
    }

    public void setSeccustomermanager(String seccustomermanager) {
        this.seccustomermanager = seccustomermanager;
    }

    public String getNumoftransaction() {
        return numoftransaction;
    }

    public void setNumoftransaction(String numoftransaction) {
        this.numoftransaction = numoftransaction;
    }

    public String getAmtoftransaction() {
        return amtoftransaction;
    }

    public void setAmtoftransaction(String amtoftransaction) {
        this.amtoftransaction = amtoftransaction;
    }

    public String getUseofdeposit() {
        return useofdeposit;
    }

    public void setUseofdeposit(String useofdeposit) {
        this.useofdeposit = useofdeposit;
    }

    public String getSourceofdeposit() {
        return sourceofdeposit;
    }

    public void setSourceofdeposit(String sourceofdeposit) {
        this.sourceofdeposit = sourceofdeposit;
    }

    public String getNameofmotherbemar() {
        return nameofmotherbemar;
    }

    public void setNameofmotherbemar(String nameofmotherbemar) {
        this.nameofmotherbemar = nameofmotherbemar;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1;
    }

    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2;
    }

    public String getBackup3() {
        return backup3;
    }

    public void setBackup3(String backup3) {
        this.backup3 = backup3;
    }

    public String getBackup4() {
        return backup4;
    }

    public void setBackup4(String backup4) {
        this.backup4 = backup4;
    }

    public String getCustAttribute() {
        return custAttribute;
    }

    public void setCustAttribute(String custAttribute) {
        this.custAttribute = custAttribute;
    }

    public String getAdvRecvFlag() {
        return advRecvFlag;
    }

    public void setAdvRecvFlag(String advRecvFlag) {
        this.advRecvFlag = advRecvFlag;
    }

    public String getPrvCntInd() {
        return prvCntInd;
    }

    public void setPrvCntInd(String prvCntInd) {
        this.prvCntInd = prvCntInd;
    }

    public String getBankRelated() {
        return bankRelated;
    }

    public void setBankRelated(String bankRelated) {
        this.bankRelated = bankRelated;
    }

    public String getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore;
    }

    public String getNextRevDate() {
        return nextRevDate;
    }

    public void setNextRevDate(String nextRevDate) {
        this.nextRevDate = nextRevDate;
    }

    public String getDomicileCnt() {
        return domicileCnt;
    }

    public void setDomicileCnt(String domicileCnt) {
        this.domicileCnt = domicileCnt;
    }

    public String getDomicilePrv() {
        return domicilePrv;
    }

    public void setDomicilePrv(String domicilePrv) {
        this.domicilePrv = domicilePrv;
    }

    public String getRiskCnt() {
        return riskCnt;
    }

    public void setRiskCnt(String riskCnt) {
        this.riskCnt = riskCnt;
    }

    public String getResidenActDate() {
        return residenActDate;
    }

    public void setResidenActDate(String residenActDate) {
        this.residenActDate = residenActDate;
    }

    public String getForeverType() {
        return foreverType;
    }

    public void setForeverType(String foreverType) {
        this.foreverType = foreverType;
    }

    public String getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(String degreeId) {
        this.degreeId = degreeId;
    }

    public String getCoPost() {
        return coPost;
    }

    public void setCoPost(String coPost) {
        this.coPost = coPost;
    }

    public String getHireKind() {
        return hireKind;
    }

    public void setHireKind(String hireKind) {
        this.hireKind = hireKind;
    }

    public String getAgreementEndDate() {
        return agreementEndDate;
    }

    public void setAgreementEndDate(String agreementEndDate) {
        this.agreementEndDate = agreementEndDate;
    }

    public String getAdvMobileFlag() {
        return advMobileFlag;
    }

    public void setAdvMobileFlag(String advMobileFlag) {
        this.advMobileFlag = advMobileFlag;
    }

    public String getAdvExtendFlag() {
        return advExtendFlag;
    }

    public void setAdvExtendFlag(String advExtendFlag) {
        this.advExtendFlag = advExtendFlag;
    }

    public String getCreditGrade() {
        return creditGrade;
    }

    public void setCreditGrade(String creditGrade) {
        this.creditGrade = creditGrade;
    }

    public String getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(String creditValue) {
        this.creditValue = creditValue;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getEnNameRule() {
        return enNameRule;
    }

    public void setEnNameRule(String enNameRule) {
        this.enNameRule = enNameRule;
    }

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public String getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(String deliverTo) {
        this.deliverTo = deliverTo;
    }

    public String getWrittenLanguage() {
        return writtenLanguage;
    }

    public void setWrittenLanguage(String writtenLanguage) {
        this.writtenLanguage = writtenLanguage;
    }

    public String getSpeakingLanguage() {
        return speakingLanguage;
    }

    public void setSpeakingLanguage(String speakingLanguage) {
        this.speakingLanguage = speakingLanguage;
    }

    public String getExistNameDate() {
        return existNameDate;
    }

    public void setExistNameDate(String existNameDate) {
        this.existNameDate = existNameDate;
    }

    public String getBirthdateFlag() {
        return birthdateFlag;
    }

    public void setBirthdateFlag(String birthdateFlag) {
        this.birthdateFlag = birthdateFlag;
    }

    public String getResidenceStatus() {
        return residenceStatus;
    }

    public void setResidenceStatus(String residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    public String getResStatusDesc() {
        return resStatusDesc;
    }

    public void setResStatusDesc(String resStatusDesc) {
        this.resStatusDesc = resStatusDesc;
    }

    public String getResidenceDate() {
        return residenceDate;
    }

    public void setResidenceDate(String residenceDate) {
        this.residenceDate = residenceDate;
    }

    public String getResCountryDesc() {
        return resCountryDesc;
    }

    public void setResCountryDesc(String resCountryDesc) {
        this.resCountryDesc = resCountryDesc;
    }

    public String getProfDesc() {
        return profDesc;
    }

    public void setProfDesc(String profDesc) {
        this.profDesc = profDesc;
    }

    public String getHighRiskInd() {
        return highRiskInd;
    }

    public void setHighRiskInd(String highRiskInd) {
        this.highRiskInd = highRiskInd;
    }

    public String getHighRiskDesc() {
        return highRiskDesc;
    }

    public void setHighRiskDesc(String highRiskDesc) {
        this.highRiskDesc = highRiskDesc;
    }

    public String getNoOfKids() {
        return noOfKids;
    }

    public void setNoOfKids(String noOfKids) {
        this.noOfKids = noOfKids;
    }

    public String getReligionDesc() {
        return religionDesc;
    }

    public void setReligionDesc(String religionDesc) {
        this.religionDesc = religionDesc;
    }

    public String getAffirmFlag() {
        return affirmFlag;
    }

    public void setAffirmFlag(String affirmFlag) {
        this.affirmFlag = affirmFlag;
    }

    public String getAffirmDate() {
        return affirmDate;
    }

    public void setAffirmDate(String affirmDate) {
        this.affirmDate = affirmDate;
    }

    public String getBelongBrno() {
        return belongBrno;
    }

    public void setBelongBrno(String belongBrno) {
        this.belongBrno = belongBrno;
    }

    public String getCustAttrChgDate() {
        return custAttrChgDate;
    }

    public void setCustAttrChgDate(String custAttrChgDate) {
        this.custAttrChgDate = custAttrChgDate;
    }

    public String getKycReasonCode() {
        return kycReasonCode;
    }

    public void setKycReasonCode(String kycReasonCode) {
        this.kycReasonCode = kycReasonCode;
    }

    public String getKycCompleteFlag() {
        return kycCompleteFlag;
    }

    public void setKycCompleteFlag(String kycCompleteFlag) {
        this.kycCompleteFlag = kycCompleteFlag;
    }

    public String getKycCompleteDate() {
        return kycCompleteDate;
    }

    public void setKycCompleteDate(String kycCompleteDate) {
        this.kycCompleteDate = kycCompleteDate;
    }

    public String getKycMissingDoc() {
        return kycMissingDoc;
    }

    public void setKycMissingDoc(String kycMissingDoc) {
        this.kycMissingDoc = kycMissingDoc;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getBk1() {
        return bk1;
    }

    public void setBk1(String bk1) {
        this.bk1 = bk1;
    }

    public String getBk2() {
        return bk2;
    }

    public void setBk2(String bk2) {
        this.bk2 = bk2;
    }

    public String getBk3() {
        return bk3;
    }

    public void setBk3(String bk3) {
        this.bk3 = bk3;
    }

    public String getBk4() {
        return bk4;
    }

    public void setBk4(String bk4) {
        this.bk4 = bk4;
    }

    public String getBk5() {
        return bk5;
    }

    public void setBk5(String bk5) {
        this.bk5 = bk5;
    }

    public String getBk6() {
        return bk6;
    }

    public void setBk6(String bk6) {
        this.bk6 = bk6;
    }

    public String getBk7() {
        return bk7;
    }

    public void setBk7(String bk7) {
        this.bk7 = bk7;
    }

    public String getBk8() {
        return bk8;
    }

    public void setBk8(String bk8) {
        this.bk8 = bk8;
    }

    public String getBk9() {
        return bk9;
    }

    public void setBk9(String bk9) {
        this.bk9 = bk9;
    }

    public String getBk10() {
        return bk10;
    }

    public void setBk10(String bk10) {
        this.bk10 = bk10;
    }

    public String getPrefLang() {
        return prefLang;
    }

    public void setPrefLang(String prefLang) {
        this.prefLang = prefLang;
    }

    public String getPrimNat() {
        return primNat;
    }

    public void setPrimNat(String primNat) {
        this.primNat = primNat;
    }

    public String getSecNat() {
        return secNat;
    }

    public void setSecNat(String secNat) {
        this.secNat = secNat;
    }

    public String getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }

    public String getUpdatedTs() {
        return updatedTs;
    }

    public void setUpdatedTs(String updatedTs) {
        this.updatedTs = updatedTs;
    }

    public String getCreatedDateSys() {
        return createdDateSys;
    }

    public void setCreatedDateSys(String createdDateSys) {
        this.createdDateSys = createdDateSys;
    }

    public String getCreatedDateBus() {
        return createdDateBus;
    }

    public void setCreatedDateBus(String createdDateBus) {
        this.createdDateBus = createdDateBus;
    }

    public String getUpdatedDateSys() {
        return updatedDateSys;
    }

    public void setUpdatedDateSys(String updatedDateSys) {
        this.updatedDateSys = updatedDateSys;
    }

    public String getUpdatedDateBus() {
        return updatedDateBus;
    }

    public void setUpdatedDateBus(String updatedDateBus) {
        this.updatedDateBus = updatedDateBus;
    }

    public String getUpdatedZoneno() {
        return updatedZoneno;
    }

    public void setUpdatedZoneno(String updatedZoneno) {
        this.updatedZoneno = updatedZoneno;
    }

    public String getUpdatedBrno() {
        return updatedBrno;
    }

    public void setUpdatedBrno(String updatedBrno) {
        this.updatedBrno = updatedBrno;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedPgm() {
        return createdPgm;
    }

    public void setCreatedPgm(String createdPgm) {
        this.createdPgm = createdPgm;
    }

    public String getUpdatedPgm() {
        return updatedPgm;
    }

    public void setUpdatedPgm(String updatedPgm) {
        this.updatedPgm = updatedPgm;
    }

    public String getCreatedApp() {
        return createdApp;
    }

    public void setCreatedApp(String createdApp) {
        this.createdApp = createdApp;
    }

    public String getUpdatedApp() {
        return updatedApp;
    }

    public void setUpdatedApp(String updatedApp) {
        this.updatedApp = updatedApp;
    }

    public String getCreatedSystemId() {
        return createdSystemId;
    }

    public void setCreatedSystemId(String createdSystemId) {
        this.createdSystemId = createdSystemId;
    }

    public String getUpdatedSystemId() {
        return updatedSystemId;
    }

    public void setUpdatedSystemId(String updatedSystemId) {
        this.updatedSystemId = updatedSystemId;
    }

    public String getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy;
    }

    public String getPtDt() {
        return ptDt;
    }

    public void setPtDt(String ptDt) {
        this.ptDt = ptDt;
    }

    @Override
    public String toString() {
        return "CustInfo{" +
                "createdZoneno='" + createdZoneno + '\'' +
                ", createdBrno='" + createdBrno + '\'' +
                ", individualid='" + individualid + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", dapcode='" + dapcode + '\'' +
                ", individualStat='" + individualStat + '\'' +
                ", regType='" + regType + '\'' +
                ", regNo='" + regNo + '\'' +
                ", name='" + name + '\'' +
                ", enName='" + enName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", midName='" + midName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", natIdNo='" + natIdNo + '\'' +
                ", dfltGreet='" + dfltGreet + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", birthday='" + birthday + '\'' +
                ", cityOfBirth='" + cityOfBirth + '\'' +
                ", cntryOfBirth='" + cntryOfBirth + '\'' +
                ", maritalStat='" + maritalStat + '\'' +
                ", maritalStatDate='" + maritalStatDate + '\'' +
                ", educLevel='" + educLevel + '\'' +
                ", dateofgraduate='" + dateofgraduate + '\'' +
                ", techniquelevel='" + techniquelevel + '\'' +
                ", prof='" + prof + '\'' +
                ", profStat='" + profStat + '\'' +
                ", executivelevel='" + executivelevel + '\'' +
                ", startWorkDate='" + startWorkDate + '\'' +
                ", employer='" + employer + '\'' +
                ", employerType='" + employerType + '\'' +
                ", empStartDate='" + empStartDate + '\'' +
                ", empStat='" + empStat + '\'' +
                ", noOfDpnd='" + noOfDpnd + '\'' +
                ", crRskRating='" + crRskRating + '\'' +
                ", empNo='" + empNo + '\'' +
                ", icbcemplyeeflag='" + icbcemplyeeflag + '\'' +
                ", customerinothbank='" + customerinothbank + '\'' +
                ", govBnftRcptFlag='" + govBnftRcptFlag + '\'' +
                ", greencardflag='" + greencardflag + '\'' +
                ", howRefer='" + howRefer + '\'' +
                ", nonadultflag='" + nonadultflag + '\'' +
                ", salesStat='" + salesStat + '\'' +
                ", tempresidentflag='" + tempresidentflag + '\'' +
                ", localornot='" + localornot + '\'' +
                ", blacklistcustflag='" + blacklistcustflag + '\'' +
                ", customerlevel='" + customerlevel + '\'' +
                ", customermanager='" + customermanager + '\'' +
                ", seccustomermanager='" + seccustomermanager + '\'' +
                ", numoftransaction='" + numoftransaction + '\'' +
                ", amtoftransaction='" + amtoftransaction + '\'' +
                ", useofdeposit='" + useofdeposit + '\'' +
                ", sourceofdeposit='" + sourceofdeposit + '\'' +
                ", nameofmotherbemar='" + nameofmotherbemar + '\'' +
                ", religion='" + religion + '\'' +
                ", citycode='" + citycode + '\'' +
                ", customertype='" + customertype + '\'' +
                ", backup1='" + backup1 + '\'' +
                ", backup2='" + backup2 + '\'' +
                ", backup3='" + backup3 + '\'' +
                ", backup4='" + backup4 + '\'' +
                ", custAttribute='" + custAttribute + '\'' +
                ", advRecvFlag='" + advRecvFlag + '\'' +
                ", prvCntInd='" + prvCntInd + '\'' +
                ", bankRelated='" + bankRelated + '\'' +
                ", riskScore='" + riskScore + '\'' +
                ", nextRevDate='" + nextRevDate + '\'' +
                ", domicileCnt='" + domicileCnt + '\'' +
                ", domicilePrv='" + domicilePrv + '\'' +
                ", riskCnt='" + riskCnt + '\'' +
                ", residenActDate='" + residenActDate + '\'' +
                ", foreverType='" + foreverType + '\'' +
                ", degreeId='" + degreeId + '\'' +
                ", coPost='" + coPost + '\'' +
                ", hireKind='" + hireKind + '\'' +
                ", agreementEndDate='" + agreementEndDate + '\'' +
                ", advMobileFlag='" + advMobileFlag + '\'' +
                ", advExtendFlag='" + advExtendFlag + '\'' +
                ", creditGrade='" + creditGrade + '\'' +
                ", creditValue='" + creditValue + '\'' +
                ", custType='" + custType + '\'' +
                ", enNameRule='" + enNameRule + '\'' +
                ", deliveryOption='" + deliveryOption + '\'' +
                ", deliverTo='" + deliverTo + '\'' +
                ", writtenLanguage='" + writtenLanguage + '\'' +
                ", speakingLanguage='" + speakingLanguage + '\'' +
                ", existNameDate='" + existNameDate + '\'' +
                ", birthdateFlag='" + birthdateFlag + '\'' +
                ", residenceStatus='" + residenceStatus + '\'' +
                ", resStatusDesc='" + resStatusDesc + '\'' +
                ", residenceDate='" + residenceDate + '\'' +
                ", resCountryDesc='" + resCountryDesc + '\'' +
                ", profDesc='" + profDesc + '\'' +
                ", highRiskInd='" + highRiskInd + '\'' +
                ", highRiskDesc='" + highRiskDesc + '\'' +
                ", noOfKids='" + noOfKids + '\'' +
                ", religionDesc='" + religionDesc + '\'' +
                ", affirmFlag='" + affirmFlag + '\'' +
                ", affirmDate='" + affirmDate + '\'' +
                ", belongBrno='" + belongBrno + '\'' +
                ", custAttrChgDate='" + custAttrChgDate + '\'' +
                ", kycReasonCode='" + kycReasonCode + '\'' +
                ", kycCompleteFlag='" + kycCompleteFlag + '\'' +
                ", kycCompleteDate='" + kycCompleteDate + '\'' +
                ", kycMissingDoc='" + kycMissingDoc + '\'' +
                ", titleName='" + titleName + '\'' +
                ", bk1='" + bk1 + '\'' +
                ", bk2='" + bk2 + '\'' +
                ", bk3='" + bk3 + '\'' +
                ", bk4='" + bk4 + '\'' +
                ", bk5='" + bk5 + '\'' +
                ", bk6='" + bk6 + '\'' +
                ", bk7='" + bk7 + '\'' +
                ", bk8='" + bk8 + '\'' +
                ", bk9='" + bk9 + '\'' +
                ", bk10='" + bk10 + '\'' +
                ", prefLang='" + prefLang + '\'' +
                ", primNat='" + primNat + '\'' +
                ", secNat='" + secNat + '\'' +
                ", createdTs='" + createdTs + '\'' +
                ", updatedTs='" + updatedTs + '\'' +
                ", createdDateSys='" + createdDateSys + '\'' +
                ", createdDateBus='" + createdDateBus + '\'' +
                ", updatedDateSys='" + updatedDateSys + '\'' +
                ", updatedDateBus='" + updatedDateBus + '\'' +
                ", updatedZoneno='" + updatedZoneno + '\'' +
                ", updatedBrno='" + updatedBrno + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", createdPgm='" + createdPgm + '\'' +
                ", updatedPgm='" + updatedPgm + '\'' +
                ", createdApp='" + createdApp + '\'' +
                ", updatedApp='" + updatedApp + '\'' +
                ", createdSystemId='" + createdSystemId + '\'' +
                ", updatedSystemId='" + updatedSystemId + '\'' +
                ", checkedBy='" + checkedBy + '\'' +
                ", ptDt='" + ptDt + '\'' +
                '}';
    }
}
