package com.dkey.service.frontier.response;

import javax.json.bind.annotation.JsonbNillable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="v$car_entity")
@JsonbNillable
public class FatResponse {

        @Id
        @Column(name="DOC#R")
        private String docR;
        @Column(name="DEP#R")
        private String depR;
        @Column(name="DEP_NAME")
        private String depName;
        private String note;
        @Column(name="D_REG_FIRST")
        private String dRegFirst;
        @Column(name="D_REG")
        private String dReg;
        @Column(name="OPER#R")
        private String operR;
        @Column(name="OPER_CODE")
        private String operCode;
        @Column(name="OPER_NAME")
        private String operName;
        @Column(name="TREG#R")
        private String tregR;
        @Column(name="TREG_NAME")
        private String tregName;
        @Column(name="N_REG")
        private String nReg;
        @Column(name="TDOC#R")
        private String tdocR;
        @Column(name="TDOC_NAME")
        private String tdocName;
        @Column(name="S_DOC")
        private String sDoc;
        @Column(name="n_DOC")
        private String nDoc;
        @Column(name="BRAND#R")
        private String brandR;
        @Column(name="BRAND_NAME")
        private String brandName;
        @Column(name="MODEL#R")
        private String modelR;
        @Column(name="MODEL_NAME")
        private String modelName;
        @Column(name="RANK#R")
        private String rankR;
        @Column(name="RANK_NAME")
        private String rankName;
        @Column(name="COLOR#R")
        private String colorR;
        @Column(name="COLOR_NAME")
        private String colorName;
        @Column(name="MAKE_YEAR")
        private String makeYear;
        @Column(name="N_BODY")
        private String nBody;
        @Column(name="VIN")
        private String vin;
        @Column(name="N_CHASSIS")
        private String nChassis;
        @Column(name="N_ENGINE")
        private String nEngine;
        @Column(name="PERSON")
        private String person;
        @Column(name="NAME1_U")
        private String name1U;
        @Column(name="NAME2_U")
        private String name2U;
        @Column(name="NAME3_U")
        private String name3U;
        @Column(name="NAME1_R")
        private String name1R;
        @Column(name="NAME2_R")
        private String name2R;
        @Column(name="NAME3_R")
        private String name3R;
        @Column(name="NAME1_L")
        private String name1L;
        @Column(name="NAME2_L")
        private String name2L;
        @Column(name="NAME3_L")
        private String name3L;
        private String birthday;
        private String inn;
        private String sex;
        @Column(name="CLNT_DOCTYPE#R")
        private String clntDoctypeR;
        @Column(name="TCLNT_DOC_NAME")
        private String tClntDocName;
        @Column(name="S_PASS")
        private String sPass;
        @Column(name="N_PASS")
        private String nPass;
        @Column(name="D_PASS")
        private String dPass;
        @Column(name="W_PASS")
        private String wPass;
        @Column(name="NAME_FULL_U")
        private String nameFullU;
        @Column(name="NAME_SHORT_U")
        private String nameShortU;
        @Column(name="NAME_FULL_R")
        private String nameFullR;
        @Column(name="NAME_FULL_L")
        private String nameFullL;
        private String edrpou;
        @Column(name="ADDS_COUNTRY#R")
        private String addsCountryR;
        @Column(name="COUNTRY_NAME")
        private String countryName;
        @Column(name="ADDS_CITY#R")
        private String addsCityR;
        @Column(name="CITY_NAME")
        private String cityName;
        @Column(name="ADDS_TSTREET#R")
        private String addsTsrreetR;
        @Column(name="TSTREET_FULL")
        private String tStreetFull;
        @Column(name="ADDS_STREET")
        private String addsStreet;
        @Column(name="ADDS_N_HOUSE")
        private String addsNHouse;
        @Column(name="ADDS_S_HOUSE")
        private String addsSHouse;
        @Column(name="ADDS_CORPS")
        private String addsCorps;
        @Column(name="ADDS_N_FLAT")
        private String addsNFlat;
        @Column(name="ADDS_S_FLAT")
        private String addsSFlat;

        public String getDocR() {
            return docR;
        }

        public void setDocR(String docR) {
            this.docR = docR;
        }

        public String getDepR() {
            return depR;
        }

        public void setDepR(String depR) {
            this.depR = depR;
        }

        public String getDepName() {
            return depName;
        }

        public void setDepName(String depName) {
            this.depName = depName;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getdRegFirst() {
            return dRegFirst;
        }

        public void setdRegFirst(String dRegFirst) {
            this.dRegFirst = dRegFirst;
        }

        public String getdReg() {
            return dReg;
        }

        public void setdReg(String dReg) {
            this.dReg = dReg;
        }

        public String getOperR() {
            return operR;
        }

        public void setOperR(String operR) {
            this.operR = operR;
        }

        public String getOperCode() {
            return operCode;
        }

        public void setOperCode(String operCode) {
            this.operCode = operCode;
        }

        public String getOperName() {
            return operName;
        }

        public void setOperName(String operName) {
            this.operName = operName;
        }

        public String getTregR() {
            return tregR;
        }

        public void setTregR(String tregR) {
            this.tregR = tregR;
        }

        public String getTregName() {
            return tregName;
        }

        public void setTregName(String tregName) {
            this.tregName = tregName;
        }

        public String getnReg() {
            return nReg;
        }

        public void setnReg(String nReg) {
            this.nReg = nReg;
        }

        public String getTdocR() {
            return tdocR;
        }

        public void setTdocR(String tdocR) {
            this.tdocR = tdocR;
        }

        public String getTdocName() {
            return tdocName;
        }

        public void setTdocName(String tdocName) {
            this.tdocName = tdocName;
        }

        public String getsDoc() {
            return sDoc;
        }

        public void setsDoc(String sDoc) {
            this.sDoc = sDoc;
        }

        public String getnDoc() {
            return nDoc;
        }

        public void setnDoc(String nDoc) {
            this.nDoc = nDoc;
        }

        public String getBrandR() {
            return brandR;
        }

        public void setBrandR(String brandR) {
            this.brandR = brandR;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getModelR() {
            return modelR;
        }

        public void setModelR(String modelR) {
            this.modelR = modelR;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getRankR() {
            return rankR;
        }

        public void setRankR(String rankR) {
            this.rankR = rankR;
        }

        public String getRankName() {
            return rankName;
        }

        public void setRankName(String rankName) {
            this.rankName = rankName;
        }

        public String getColorR() {
            return colorR;
        }

        public void setColorR(String colorR) {
            this.colorR = colorR;
        }

        public String getColorName() {
            return colorName;
        }

        public void setColorName(String colorName) {
            this.colorName = colorName;
        }

        public String getMakeYear() {
            return makeYear;
        }

        public void setMakeYear(String makeYear) {
            this.makeYear = makeYear;
        }

        public String getnBody() {
            return nBody;
        }

        public void setnBody(String nBody) {
            this.nBody = nBody;
        }

        public String getVin() {
            return vin;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }

        public String getnChassis() {
            return nChassis;
        }

        public void setnChassis(String nChassis) {
            this.nChassis = nChassis;
        }

        public String getnEngine() {
            return nEngine;
        }

        public void setnEngine(String nEngine) {
            this.nEngine = nEngine;
        }

        public String getPerson() {
            return person;
        }

        public void setPerson(String person) {
            this.person = person;
        }

        public String getName1U() {
            return name1U;
        }

        public void setName1U(String name1U) {
            this.name1U = name1U;
        }

        public String getName2U() {
            return name2U;
        }

        public void setName2U(String name2U) {
            this.name2U = name2U;
        }

        public String getName3U() {
            return name3U;
        }

        public void setName3U(String name3U) {
            this.name3U = name3U;
        }

        public String getName1R() {
            return name1R;
        }

        public void setName1R(String name1R) {
            this.name1R = name1R;
        }

        public String getName2R() {
            return name2R;
        }

        public void setName2R(String name2R) {
            this.name2R = name2R;
        }

        public String getName3R() {
            return name3R;
        }

        public void setName3R(String name3R) {
            this.name3R = name3R;
        }

        public String getName1L() {
            return name1L;
        }

        public void setName1L(String name1L) {
            this.name1L = name1L;
        }

        public String getName2L() {
            return name2L;
        }

        public void setName2L(String name2L) {
            this.name2L = name2L;
        }

        public String getName3L() {
            return name3L;
        }

        public void setName3L(String name3L) {
            this.name3L = name3L;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getInn() {
            return inn;
        }

        public void setInn(String inn) {
            this.inn = inn;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getClntDoctypeR() {
            return clntDoctypeR;
        }

        public void setClntDoctypeR(String clntDoctypeR) {
            this.clntDoctypeR = clntDoctypeR;
        }

        public String gettClntDocName() {
            return tClntDocName;
        }

        public void settClntDocName(String tClntDocName) {
            this.tClntDocName = tClntDocName;
        }

        public String getsPass() {
            return sPass;
        }

        public void setsPass(String sPass) {
            this.sPass = sPass;
        }

        public String getnPass() {
            return nPass;
        }

        public void setnPass(String nPass) {
            this.nPass = nPass;
        }

        public String getdPass() {
            return dPass;
        }

        public void setdPass(String dPass) {
            this.dPass = dPass;
        }

        public String getwPass() {
            return wPass;
        }

        public void setwPass(String wPass) {
            this.wPass = wPass;
        }

        public String getNameFullU() {
            return nameFullU;
        }

        public void setNameFullU(String nameFullU) {
            this.nameFullU = nameFullU;
        }

        public String getNameShortU() {
            return nameShortU;
        }

        public void setNameShortU(String nameShortU) {
            this.nameShortU = nameShortU;
        }

        public String getNameFullR() {
            return nameFullR;
        }

        public void setNameFullR(String nameFullR) {
            this.nameFullR = nameFullR;
        }

        public String getNameFullL() {
            return nameFullL;
        }

        public void setNameFullL(String nameFullL) {
            this.nameFullL = nameFullL;
        }

        public String getEdrpou() {
            return edrpou;
        }

        public void setEdrpou(String edrpou) {
            this.edrpou = edrpou;
        }

        public String getAddsCountryR() {
            return addsCountryR;
        }

        public void setAddsCountryR(String addsCountryR) {
            this.addsCountryR = addsCountryR;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getAddsCityR() {
            return addsCityR;
        }

        public void setAddsCityR(String addsCityR) {
            this.addsCityR = addsCityR;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getAddsTsrreetR() {
            return addsTsrreetR;
        }

        public void setAddsTsrreetR(String addsTsrreetR) {
            this.addsTsrreetR = addsTsrreetR;
        }

        public String gettStreetFull() {
            return tStreetFull;
        }

        public void settStreetFull(String tStreetFull) {
            this.tStreetFull = tStreetFull;
        }

        public String getAddsStreet() {
            return addsStreet;
        }

        public void setAddsStreet(String addsStreet) {
            this.addsStreet = addsStreet;
        }

        public String getAddsNHouse() {
            return addsNHouse;
        }

        public void setAddsNHouse(String addsNHouse) {
            this.addsNHouse = addsNHouse;
        }

        public String getAddsSHouse() {
            return addsSHouse;
        }

        public void setAddsSHouse(String addsSHouse) {
            this.addsSHouse = addsSHouse;
        }

        public String getAddsCorps() {
            return addsCorps;
        }

        public void setAddsCorps(String addsCorps) {
            this.addsCorps = addsCorps;
        }

        public String getAddsNFlat() {
            return addsNFlat;
        }

        public void setAddsNFlat(String addsNFlat) {
            this.addsNFlat = addsNFlat;
        }

        public String getAddsSFlat() {
            return addsSFlat;
        }

        public void setAddsSFlat(String addsSFlat) {
            this.addsSFlat = addsSFlat;
        }

}
