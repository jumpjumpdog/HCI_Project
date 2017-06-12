package com.example.asus.test;

import java.util.List;

/**
 * Created by asus on 2017/6/11.
 */
public class FlightBean {

    /**
     * data : {"result":[{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:15:00","arriveTimeStamp":"1497233700","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:15:00","endtimestamp":1497233700,"flight":"MU5101","price":"4710","quantity":"3","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天08:00:00","starttimestamp":1497225600,"takeOffTime":"2017-06-12 08:00:00","takeOffTimeStamp":"1497225600"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 09:20:00","arriveTimeStamp":"1497230400","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天09:20:00","endtimestamp":1497230400,"flight":"MU5137","price":"4710","quantity":"6","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天07:00:00","starttimestamp":1497222000,"takeOffTime":"2017-06-12 07:00:00","takeOffTimeStamp":"1497222000"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:10:00","arriveTimeStamp":"1497233400","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:10:00","endtimestamp":1497233400,"flight":"CA1858","price":"4590","quantity":"2","rate":"1","standardPrice":"4590.0000","starttime_for_voice":"明天07:55:00","starttimestamp":1497225300,"takeOffTime":"2017-06-12 07:55:00","takeOffTimeStamp":"1497225300"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:10:00","arriveTimeStamp":"1497233400","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:10:00","endtimestamp":1497233400,"flight":"CA1858","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天07:55:00","starttimestamp":1497225300,"takeOffTime":"2017-06-12 07:55:00","takeOffTimeStamp":"1497225300"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:10:00","arriveTimeStamp":"1497233400","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:10:00","endtimestamp":1497233400,"flight":"CA1858","price":"5210","quantity":"3","rate":"1.11","standardPrice":"4710.0000","starttime_for_voice":"明天07:55:00","starttimestamp":1497225300,"takeOffTime":"2017-06-12 07:55:00","takeOffTimeStamp":"1497225300"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"1230","quantity":"10","rate":"0.99","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"1240","quantity":"10","rate":"1","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"2480","quantity":"10","rate":"2","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"3100","quantity":"10","rate":"2.5","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"首都国际机场","airline":"海南航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:35:00","arriveTimeStamp":"1497234900","cabinInfo":"经济舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:35:00","endtimestamp":1497234900,"flight":"HU7604","price":"1240","quantity":"5","rate":"1","standardPrice":"1240.0000","starttime_for_voice":"明天08:20:00","starttimestamp":1497226800,"takeOffTime":"2017-06-12 08:20:00","takeOffTimeStamp":"1497226800"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:45:00","arriveTimeStamp":"1497235500","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:45:00","endtimestamp":1497235500,"flight":"MU5151","price":"3100","quantity":"1","rate":"0.73","standardPrice":"4240.0000","starttime_for_voice":"明天08:30:00","starttimestamp":1497227400,"takeOffTime":"2017-06-12 08:30:00","takeOffTimeStamp":"1497227400"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:45:00","arriveTimeStamp":"1497235500","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:45:00","endtimestamp":1497235500,"flight":"MU5151","price":"4240","quantity":"1","rate":"1","standardPrice":"4240.0000","starttime_for_voice":"明天08:30:00","starttimestamp":1497227400,"takeOffTime":"2017-06-12 08:30:00","takeOffTimeStamp":"1497227400"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:45:00","arriveTimeStamp":"1497235500","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:45:00","endtimestamp":1497235500,"flight":"MU5151","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天08:30:00","starttimestamp":1497227400,"takeOffTime":"2017-06-12 08:30:00","takeOffTimeStamp":"1497227400"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"3780","quantity":"10","rate":"0.80","standardPrice":"4710.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"4590","quantity":"5","rate":"1","standardPrice":"4590.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"5210","quantity":"6","rate":"1.11","standardPrice":"4710.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:20:00","arriveTimeStamp":"1497237600","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:20:00","endtimestamp":1497237600,"flight":"MU5103","price":"3100","quantity":"3","rate":"0.73","standardPrice":"4240.0000","starttime_for_voice":"明天09:00:00","starttimestamp":1497229200,"takeOffTime":"2017-06-12 09:00:00","takeOffTimeStamp":"1497229200"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:20:00","arriveTimeStamp":"1497237600","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:20:00","endtimestamp":1497237600,"flight":"MU5103","price":"4240","quantity":"7","rate":"1","standardPrice":"4240.0000","starttime_for_voice":"明天09:00:00","starttimestamp":1497229200,"takeOffTime":"2017-06-12 09:00:00","takeOffTimeStamp":"1497229200"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:20:00","arriveTimeStamp":"1497237600","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:20:00","endtimestamp":1497237600,"flight":"MU5103","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天09:00:00","starttimestamp":1497229200,"takeOffTime":"2017-06-12 09:00:00","takeOffTimeStamp":"1497229200"}],"webpage":"http://athena.openspeech.cn/athena/iss?method=webpage&wsid=3b25a9e5d994baacc80d05533c410663&sid=atn00082cee@un83620c986b4f6f2a01"}
     * rc : 0
     * semantic : [{"intent":"QUERY","slots":[{"name":"endLoc.city","value":"北京市","normValue":"北京市"},{"name":"endLoc.cityAddr","value":"北京","normValue":"北京"},{"name":"endLoc.type","value":"LOC_BASIC","normValue":"LOC_BASIC"},{"name":"startDate","value":"明天","normValue":"{\"datetime\":\"2017-06-12\",\"suggestDatetime\":\"2017-06-12\"}"},{"name":"startLoc.city","value":"上海市","normValue":"上海市"},{"name":"startLoc.cityAddr","value":"上海","normValue":"上海"},{"name":"startLoc.type","value":"LOC_BASIC","normValue":"LOC_BASIC"}]}]
     * service : flight
     * text : 明天上海到北京
     * uuid : atn00082cee@un83620c986b4f6f2a01
     * answer : {"text":"[n2]为您找到100个班次，推荐明天08:00:00从上海出发，明天10:15:00到达北京的[n1][h1]MU5101的头等舱[h0][n0]，价格是[h2]4710元[h0]，航空公司为中国东方航空股份有限公司"}
     * dialog_stat : DataValid
     * sid : atn00082cee@un83620c986b4f6f2a01
     */

    private DataBean data;
    private int rc;
    private String service;
    private String text;
    private String uuid;
    private AnswerBean answer;
    private String dialog_stat;
    private String sid;
    private List<SemanticBean> semantic;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getRc() {
        return rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public AnswerBean getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerBean answer) {
        this.answer = answer;
    }

    public String getDialog_stat() {
        return dialog_stat;
    }

    public void setDialog_stat(String dialog_stat) {
        this.dialog_stat = dialog_stat;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public List<SemanticBean> getSemantic() {
        return semantic;
    }

    public void setSemantic(List<SemanticBean> semantic) {
        this.semantic = semantic;
    }

    public static class DataBean {
        /**
         * result : [{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:15:00","arriveTimeStamp":"1497233700","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:15:00","endtimestamp":1497233700,"flight":"MU5101","price":"4710","quantity":"3","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天08:00:00","starttimestamp":1497225600,"takeOffTime":"2017-06-12 08:00:00","takeOffTimeStamp":"1497225600"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 09:20:00","arriveTimeStamp":"1497230400","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天09:20:00","endtimestamp":1497230400,"flight":"MU5137","price":"4710","quantity":"6","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天07:00:00","starttimestamp":1497222000,"takeOffTime":"2017-06-12 07:00:00","takeOffTimeStamp":"1497222000"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:10:00","arriveTimeStamp":"1497233400","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:10:00","endtimestamp":1497233400,"flight":"CA1858","price":"4590","quantity":"2","rate":"1","standardPrice":"4590.0000","starttime_for_voice":"明天07:55:00","starttimestamp":1497225300,"takeOffTime":"2017-06-12 07:55:00","takeOffTimeStamp":"1497225300"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:10:00","arriveTimeStamp":"1497233400","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:10:00","endtimestamp":1497233400,"flight":"CA1858","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天07:55:00","starttimestamp":1497225300,"takeOffTime":"2017-06-12 07:55:00","takeOffTimeStamp":"1497225300"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:10:00","arriveTimeStamp":"1497233400","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:10:00","endtimestamp":1497233400,"flight":"CA1858","price":"5210","quantity":"3","rate":"1.11","standardPrice":"4710.0000","starttime_for_voice":"明天07:55:00","starttimestamp":1497225300,"takeOffTime":"2017-06-12 07:55:00","takeOffTimeStamp":"1497225300"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"1230","quantity":"10","rate":"0.99","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"1240","quantity":"10","rate":"1","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"2480","quantity":"10","rate":"2","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"南苑机场","airline":"中国联合航空有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:30:00","arriveTimeStamp":"1497234600","cabinInfo":"经济舱","dPort":"浦东国际机场","departCity":"上海","endtime_for_voice":"明天10:30:00","endtimestamp":1497234600,"flight":"KN5988","price":"3100","quantity":"10","rate":"2.5","standardPrice":"1240.0000","starttime_for_voice":"明天08:05:00","starttimestamp":1497225900,"takeOffTime":"2017-06-12 08:05:00","takeOffTimeStamp":"1497225900"},{"aPort":"首都国际机场","airline":"海南航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:35:00","arriveTimeStamp":"1497234900","cabinInfo":"经济舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:35:00","endtimestamp":1497234900,"flight":"HU7604","price":"1240","quantity":"5","rate":"1","standardPrice":"1240.0000","starttime_for_voice":"明天08:20:00","starttimestamp":1497226800,"takeOffTime":"2017-06-12 08:20:00","takeOffTimeStamp":"1497226800"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:45:00","arriveTimeStamp":"1497235500","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:45:00","endtimestamp":1497235500,"flight":"MU5151","price":"3100","quantity":"1","rate":"0.73","standardPrice":"4240.0000","starttime_for_voice":"明天08:30:00","starttimestamp":1497227400,"takeOffTime":"2017-06-12 08:30:00","takeOffTimeStamp":"1497227400"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:45:00","arriveTimeStamp":"1497235500","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:45:00","endtimestamp":1497235500,"flight":"MU5151","price":"4240","quantity":"1","rate":"1","standardPrice":"4240.0000","starttime_for_voice":"明天08:30:00","starttimestamp":1497227400,"takeOffTime":"2017-06-12 08:30:00","takeOffTimeStamp":"1497227400"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 10:45:00","arriveTimeStamp":"1497235500","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天10:45:00","endtimestamp":1497235500,"flight":"MU5151","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天08:30:00","starttimestamp":1497227400,"takeOffTime":"2017-06-12 08:30:00","takeOffTimeStamp":"1497227400"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"3780","quantity":"10","rate":"0.80","standardPrice":"4710.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"4590","quantity":"5","rate":"1","standardPrice":"4590.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国国际航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:10:00","arriveTimeStamp":"1497237000","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:10:00","endtimestamp":1497237000,"flight":"CA1590","price":"5210","quantity":"6","rate":"1.11","standardPrice":"4710.0000","starttime_for_voice":"明天08:55:00","starttimestamp":1497228900,"takeOffTime":"2017-06-12 08:55:00","takeOffTimeStamp":"1497228900"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:20:00","arriveTimeStamp":"1497237600","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:20:00","endtimestamp":1497237600,"flight":"MU5103","price":"3100","quantity":"3","rate":"0.73","standardPrice":"4240.0000","starttime_for_voice":"明天09:00:00","starttimestamp":1497229200,"takeOffTime":"2017-06-12 09:00:00","takeOffTimeStamp":"1497229200"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:20:00","arriveTimeStamp":"1497237600","cabinInfo":"公务舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:20:00","endtimestamp":1497237600,"flight":"MU5103","price":"4240","quantity":"7","rate":"1","standardPrice":"4240.0000","starttime_for_voice":"明天09:00:00","starttimestamp":1497229200,"takeOffTime":"2017-06-12 09:00:00","takeOffTimeStamp":"1497229200"},{"aPort":"首都国际机场","airline":"中国东方航空股份有限公司","arriveCity":"北京","arriveTime":"2017-06-12 11:20:00","arriveTimeStamp":"1497237600","cabinInfo":"头等舱","dPort":"虹桥国际机场","departCity":"上海","endtime_for_voice":"明天11:20:00","endtimestamp":1497237600,"flight":"MU5103","price":"4710","quantity":"10","rate":"1","standardPrice":"4710.0000","starttime_for_voice":"明天09:00:00","starttimestamp":1497229200,"takeOffTime":"2017-06-12 09:00:00","takeOffTimeStamp":"1497229200"}]
         * webpage : http://athena.openspeech.cn/athena/iss?method=webpage&wsid=3b25a9e5d994baacc80d05533c410663&sid=atn00082cee@un83620c986b4f6f2a01
         */

        private String webpage;
        private List<ResultBean> result;

        public String getWebpage() {
            return webpage;
        }

        public void setWebpage(String webpage) {
            this.webpage = webpage;
        }

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public static class ResultBean {
            /**
             * aPort : 首都国际机场
             * airline : 中国东方航空股份有限公司
             * arriveCity : 北京
             * arriveTime : 2017-06-12 10:15:00
             * arriveTimeStamp : 1497233700
             * cabinInfo : 头等舱
             * dPort : 虹桥国际机场
             * departCity : 上海
             * endtime_for_voice : 明天10:15:00
             * endtimestamp : 1497233700
             * flight : MU5101
             * price : 4710
             * quantity : 3
             * rate : 1
             * standardPrice : 4710.0000
             * starttime_for_voice : 明天08:00:00
             * starttimestamp : 1497225600
             * takeOffTime : 2017-06-12 08:00:00
             * takeOffTimeStamp : 1497225600
             */

            private String aPort;
            private String airline;
            private String arriveCity;
            private String arriveTime;
            private String arriveTimeStamp;
            private String cabinInfo;
            private String dPort;
            private String departCity;
            private String endtime_for_voice;
            private int endtimestamp;
            private String flight;
            private String price;
            private String quantity;
            private String rate;
            private String standardPrice;
            private String starttime_for_voice;
            private int starttimestamp;
            private String takeOffTime;
            private String takeOffTimeStamp;

            public String getAPort() {
                return aPort;
            }

            public void setAPort(String aPort) {
                this.aPort = aPort;
            }

            public String getAirline() {
                return airline;
            }

            public void setAirline(String airline) {
                this.airline = airline;
            }

            public String getArriveCity() {
                return arriveCity;
            }

            public void setArriveCity(String arriveCity) {
                this.arriveCity = arriveCity;
            }

            public String getArriveTime() {
                return arriveTime;
            }

            public void setArriveTime(String arriveTime) {
                this.arriveTime = arriveTime;
            }

            public String getArriveTimeStamp() {
                return arriveTimeStamp;
            }

            public void setArriveTimeStamp(String arriveTimeStamp) {
                this.arriveTimeStamp = arriveTimeStamp;
            }

            public String getCabinInfo() {
                return cabinInfo;
            }

            public void setCabinInfo(String cabinInfo) {
                this.cabinInfo = cabinInfo;
            }

            public String getDPort() {
                return dPort;
            }

            public void setDPort(String dPort) {
                this.dPort = dPort;
            }

            public String getDepartCity() {
                return departCity;
            }

            public void setDepartCity(String departCity) {
                this.departCity = departCity;
            }

            public String getEndtime_for_voice() {
                return endtime_for_voice;
            }

            public void setEndtime_for_voice(String endtime_for_voice) {
                this.endtime_for_voice = endtime_for_voice;
            }

            public int getEndtimestamp() {
                return endtimestamp;
            }

            public void setEndtimestamp(int endtimestamp) {
                this.endtimestamp = endtimestamp;
            }

            public String getFlight() {
                return flight;
            }

            public void setFlight(String flight) {
                this.flight = flight;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getQuantity() {
                return quantity;
            }

            public void setQuantity(String quantity) {
                this.quantity = quantity;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public String getStandardPrice() {
                return standardPrice;
            }

            public void setStandardPrice(String standardPrice) {
                this.standardPrice = standardPrice;
            }

            public String getStarttime_for_voice() {
                return starttime_for_voice;
            }

            public void setStarttime_for_voice(String starttime_for_voice) {
                this.starttime_for_voice = starttime_for_voice;
            }

            public int getStarttimestamp() {
                return starttimestamp;
            }

            public void setStarttimestamp(int starttimestamp) {
                this.starttimestamp = starttimestamp;
            }

            public String getTakeOffTime() {
                return takeOffTime;
            }

            public void setTakeOffTime(String takeOffTime) {
                this.takeOffTime = takeOffTime;
            }

            public String getTakeOffTimeStamp() {
                return takeOffTimeStamp;
            }

            public void setTakeOffTimeStamp(String takeOffTimeStamp) {
                this.takeOffTimeStamp = takeOffTimeStamp;
            }
        }
    }

    public static class AnswerBean {
        /**
         * text : [n2]为您找到100个班次，推荐明天08:00:00从上海出发，明天10:15:00到达北京的[n1][h1]MU5101的头等舱[h0][n0]，价格是[h2]4710元[h0]，航空公司为中国东方航空股份有限公司
         */

        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class SemanticBean {
        /**
         * intent : QUERY
         * slots : [{"name":"endLoc.city","value":"北京市","normValue":"北京市"},{"name":"endLoc.cityAddr","value":"北京","normValue":"北京"},{"name":"endLoc.type","value":"LOC_BASIC","normValue":"LOC_BASIC"},{"name":"startDate","value":"明天","normValue":"{\"datetime\":\"2017-06-12\",\"suggestDatetime\":\"2017-06-12\"}"},{"name":"startLoc.city","value":"上海市","normValue":"上海市"},{"name":"startLoc.cityAddr","value":"上海","normValue":"上海"},{"name":"startLoc.type","value":"LOC_BASIC","normValue":"LOC_BASIC"}]
         */

        private String intent;
        private List<SlotsBean> slots;

        public String getIntent() {
            return intent;
        }

        public void setIntent(String intent) {
            this.intent = intent;
        }

        public List<SlotsBean> getSlots() {
            return slots;
        }

        public void setSlots(List<SlotsBean> slots) {
            this.slots = slots;
        }

        public static class SlotsBean {
            /**
             * name : endLoc.city
             * value : 北京市
             * normValue : 北京市
             */

            private String name;
            private String value;
            private String normValue;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getNormValue() {
                return normValue;
            }

            public void setNormValue(String normValue) {
                this.normValue = normValue;
            }
        }
    }
}
