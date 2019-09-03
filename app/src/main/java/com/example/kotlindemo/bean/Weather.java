package com.example.kotlindemo.bean;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 黄家三少 on 2017/10/6.
 */

public class Weather {

    /**
     * basic : {"city":"210101","cnty":"中国","id":"CN101320103","lat":"22.38100052","lon":"114.18800354","update":{"loc":"2017-07-02 19:49","utc":"2017-07-02 11:49"}}
     * daily_forecast : [{"astro":{"mr":"13:27","ms":"00:49","sr":"05:43","ss":"19:11"},"cond":{"code_d":"301","code_n":"101","txt_d":"强阵雨","txt_n":"多云"},"date":"2017-07-02","hum":"82","pcpn":"16.5","pop":"100","pres":"1006","tmp":{"max":"31","min":"26"},"uv":"8","vis":"13","wind":{"deg":"187","dir":"无持续风向","sc":"微风","spd":"5"}},{"astro":{"mr":"14:17","ms":"01:26","sr":"05:43","ss":"19:11"},"cond":{"code_d":"306","code_n":"300","txt_d":"中雨","txt_n":"阵雨"},"date":"2017-07-03","hum":"79","pcpn":"5.2","pop":"100","pres":"1007","tmp":{"max":"31","min":"27"},"uv":"12","vis":"15","wind":{"deg":"183","dir":"无持续风向","sc":"微风","spd":"8"}},{"astro":{"mr":"15:07","ms":"02:03","sr":"05:43","ss":"19:12"},"cond":{"code_d":"300","code_n":"300","txt_d":"阵雨","txt_n":"阵雨"},"date":"2017-07-04","hum":"79","pcpn":"14.5","pop":"100","pres":"1009","tmp":{"max":"31","min":"28"},"uv":"6","vis":"16","wind":{"deg":"178","dir":"无持续风向","sc":"微风","spd":"7"}},{"astro":{"mr":"15:57","ms":"02:42","sr":"05:44","ss":"19:11"},"cond":{"code_d":"300","code_n":"300","txt_d":"阵雨","txt_n":"阵雨"},"date":"2017-07-05","hum":"81","pcpn":"14.3","pop":"100","pres":"1011","tmp":{"max":"32","min":"27"},"uv":"7","vis":"17","wind":{"deg":"178","dir":"无持续风向","sc":"微风","spd":"4"}},{"astro":{"mr":"16:47","ms":"03:23","sr":"05:44","ss":"19:11"},"cond":{"code_d":"300","code_n":"302","txt_d":"阵雨","txt_n":"雷阵雨"},"date":"2017-07-06","hum":"81","pcpn":"13.0","pop":"100","pres":"1011","tmp":{"max":"31","min":"26"},"uv":"7","vis":"18","wind":{"deg":"173","dir":"无持续风向","sc":"微风","spd":"8"}},{"astro":{"mr":"17:37","ms":"04:06","sr":"05:44","ss":"19:11"},"cond":{"code_d":"302","code_n":"302","txt_d":"雷阵雨","txt_n":"雷阵雨"},"date":"2017-07-07","hum":"81","pcpn":"18.0","pop":"100","pres":"1011","tmp":{"max":"31","min":"26"},"uv":"7","vis":"17","wind":{"deg":"178","dir":"无持续风向","sc":"微风","spd":"6"}},{"astro":{"mr":"18:26","ms":"04:52","sr":"05:45","ss":"19:11"},"cond":{"code_d":"302","code_n":"300","txt_d":"雷阵雨","txt_n":"阵雨"},"date":"2017-07-08","hum":"80","pcpn":"6.9","pop":"100","pres":"1011","tmp":{"max":"31","min":"27"},"uv":"7","vis":"17","wind":{"deg":"190","dir":"无持续风向","sc":"微风","spd":"4"}}]
     * hourly_forecast : [{"cond":{"code":"305","txt":"小雨"},"date":"2017-07-02 22:00","hum":"83","pop":"90","pres":"1007","tmp":"29","wind":{"deg":"176","dir":"南风","sc":"3-4","spd":"19"}}]
     * now : {"cond":{"code":"101","txt":"多云"},"fl":"33","hum":"80","pcpn":"0.0","pres":"1005","tmp":16,"vis":"10","wind":{"deg":"150","dir":"南风","sc":"3-4","spd":"10"}}
     * status : ok
     * suggestion : {"comf":{"brf":"较不舒适","txt":"白天虽然有雨，但仍无法削弱较高气温带来的暑意，同时降雨造成湿度加大会您感到有些闷热，不很舒适。"},"cw":{"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"drsg":{"brf":"热","txt":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"},"flu":{"brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},"sport":{"brf":"较不宜","txt":"有较强降水，建议您选择在室内进行健身休闲运动。"},"trav":{"brf":"一般","txt":"天气稍热，有微风，但较强降雨的天气将给您的出行带来很多的不便，若坚持旅行建议带上雨具。"},"uv":{"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}}
     */

    private BasicBean basic;
    private NowBean now;
    private String status;
    private SuggestionBean suggestion;
    @SerializedName("daily_forecast")
    private List<DailyForecastBean> forecastList;
    private List<HourlyForecastBean> hourly_forecast;
    private AQIBean aqi;

    public AQIBean getAqi() {
        return aqi;
    }

    public void setAqi(AQIBean aqi) {
        this.aqi = aqi;
    }

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SuggestionBean getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionBean suggestion) {
        this.suggestion = suggestion;
    }

    public List<DailyForecastBean> getForecastList() {
        return forecastList;
    }

    public void setForecastList(List<DailyForecastBean> forecastList) {
        this.forecastList = forecastList;
    }

    public List<HourlyForecastBean> getHourly_forecast() {
        return hourly_forecast;
    }

    public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast) {
        this.hourly_forecast = hourly_forecast;
    }

    public static class AQIBean{
        private AQICity city;
        public static class AQICity{
            private String aqi;
            private String pm25;

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }
        }

        public AQICity getCity() {
            return city;
        }

        public void setCity(AQICity city) {
            this.city = city;
        }
    }
    public static class BasicBean {
        /**
         * city : 210101
         * cnty : 中国
         * id : CN101320103
         * lat : 22.38100052
         * lon : 114.18800354
         * update : {"loc":"2017-07-02 19:49","utc":"2017-07-02 11:49"}
         */

        @SerializedName("city")
        private String cityName;
        private String cnty;
        @SerializedName("id")
        private String weatherId;
        private String lat;
        private String lon;
        private UpdateBean update;



        public String getCnty() {
            return cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getWeatherId() {
            return weatherId;
        }

        public void setWeatherId(String weatherId) {
            this.weatherId = weatherId;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public static class UpdateBean {
            /**
             * loc : 2017-07-02 19:49
             * utc : 2017-07-02 11:49
             */
            @SerializedName("loc")
            private String updateTime;
            private String utc;

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }
    }

    public static class NowBean {
        /**
         * cond : {"code":"101","txt":"多云"}
         * fl : 33
         * hum : 80
         * pcpn : 0.0
         * pres : 1005
         * tmp : 16
         * vis : 10
         * wind : {"deg":"150","dir":"南风","sc":"3-4","spd":"10"}
         */

        @SerializedName("cond")
        private CondBean more;
        private String fl;
        private String hum;
        private String pcpn;
        private String pres;
        @SerializedName("tmp")
        private String tmperature;
        private String vis;
        private WindBean wind;



        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public CondBean getMore() {
            return more;
        }

        public void setMore(CondBean more) {
            this.more = more;
        }

        public String getTmperature() {
            return tmperature;
        }

        public void setTmperature(String tmperature) {
            this.tmperature = tmperature;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public static class CondBean {
            /**
             * code : 101
             * txt : 多云
             */

            private String code;
            @SerializedName("txt")
            private String info;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class WindBean {
            /**
             * deg : 150
             * dir : 南风
             * sc : 3-4
             * spd : 10
             */

            private String deg;
            private String dir;
            private String sc;
            private String spd;

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }

    public static class SuggestionBean {
        /**
         * comf : {"brf":"较不舒适","txt":"白天虽然有雨，但仍无法削弱较高气温带来的暑意，同时降雨造成湿度加大会您感到有些闷热，不很舒适。"}
         * cw : {"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
         * drsg : {"brf":"热","txt":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"}
         * flu : {"brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"}
         * sport : {"brf":"较不宜","txt":"有较强降水，建议您选择在室内进行健身休闲运动。"}
         * trav : {"brf":"一般","txt":"天气稍热，有微风，但较强降雨的天气将给您的出行带来很多的不便，若坚持旅行建议带上雨具。"}
         * uv : {"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}
         */

        @SerializedName("comf")
        private ComfBean comfort;
        @SerializedName("cw")
        private CwBean carWash;
        private DrsgBean drsg;
        private FluBean flu;
        private SportBean sport;
        private TravBean trav;
        private UvBean uv;

        public ComfBean getComfort() {
            return comfort;
        }

        public void setComfort(ComfBean comfort) {
            this.comfort = comfort;
        }

        public CwBean getCarWash() {
            return carWash;
        }

        public void setCarWash(CwBean carWash) {
            this.carWash = carWash;
        }

        public DrsgBean getDrsg() {
            return drsg;
        }

        public void setDrsg(DrsgBean drsg) {
            this.drsg = drsg;
        }

        public FluBean getFlu() {
            return flu;
        }

        public void setFlu(FluBean flu) {
            this.flu = flu;
        }

        public SportBean getSport() {
            return sport;
        }

        public void setSport(SportBean sport) {
            this.sport = sport;
        }

        public TravBean getTrav() {
            return trav;
        }

        public void setTrav(TravBean trav) {
            this.trav = trav;
        }

        public UvBean getUv() {
            return uv;
        }

        public void setUv(UvBean uv) {
            this.uv = uv;
        }

        public static class ComfBean {
            /**
             * brf : 较不舒适
             * txt : 白天虽然有雨，但仍无法削弱较高气温带来的暑意，同时降雨造成湿度加大会您感到有些闷热，不很舒适。
             */

            private String brf;
            @SerializedName("txt")
            private String info;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class CwBean {
            /**
             * brf : 不宜
             * txt : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
             */

            private String brf;
            @SerializedName("txt")
            private String info;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class DrsgBean {
            /**
             * brf : 热
             * txt : 天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。
             */

            private String brf;
            @SerializedName("txt")
            private String info;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class FluBean {
            /**
             * brf : 少发
             * txt : 各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class SportBean {
            /**
             * brf : 较不宜
             * txt : 有较强降水，建议您选择在室内进行健身休闲运动。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class TravBean {
            /**
             * brf : 一般
             * txt : 天气稍热，有微风，但较强降雨的天气将给您的出行带来很多的不便，若坚持旅行建议带上雨具。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class UvBean {
            /**
             * brf : 弱
             * txt : 紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }

    public static class DailyForecastBean {
        /**
         * astro : {"mr":"13:27","ms":"00:49","sr":"05:43","ss":"19:11"}
         * cond : {"code_d":"301","code_n":"101","txt_d":"强阵雨","txt_n":"多云"}
         * date : 2017-07-02
         * hum : 82
         * pcpn : 16.5
         * pop : 100
         * pres : 1006
         * tmp : {"max":"31","min":"26"}
         * uv : 8
         * vis : 13
         * wind : {"deg":"187","dir":"无持续风向","sc":"微风","spd":"5"}
         */

        private AstroBean astro;
        private CondBeanX cond;
        private String date;
        private String hum;
        private String pcpn;
        private String pop;
        private String pres;
        private TmpBean tmp;
        private String uv;
        private String vis;
        private WindBeanX wind;

        public AstroBean getAstro() {
            return astro;
        }

        public void setAstro(AstroBean astro) {
            this.astro = astro;
        }

        public CondBeanX getCond() {
            return cond;
        }

        public void setCond(CondBeanX cond) {
            this.cond = cond;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public TmpBean getTmp() {
            return tmp;
        }

        public void setTmp(TmpBean tmp) {
            this.tmp = tmp;
        }

        public String getUv() {
            return uv;
        }

        public void setUv(String uv) {
            this.uv = uv;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public WindBeanX getWind() {
            return wind;
        }

        public void setWind(WindBeanX wind) {
            this.wind = wind;
        }

        public static class AstroBean {
            /**
             * mr : 13:27
             * ms : 00:49
             * sr : 05:43
             * ss : 19:11
             */

            private String mr;
            private String ms;
            private String sr;
            private String ss;

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }
        }

        public static class CondBeanX {
            /**
             * code_d : 301
             * code_n : 101
             * txt_d : 强阵雨
             * txt_n : 多云
             */

            private String code_d;
            private String code_n;
            private String txt_d;
            private String txt_n;

            public String getCode_d() {
                return code_d;
            }

            public void setCode_d(String code_d) {
                this.code_d = code_d;
            }

            public String getCode_n() {
                return code_n;
            }

            public void setCode_n(String code_n) {
                this.code_n = code_n;
            }

            public String getTxt_d() {
                return txt_d;
            }

            public void setTxt_d(String txt_d) {
                this.txt_d = txt_d;
            }

            public String getTxt_n() {
                return txt_n;
            }

            public void setTxt_n(String txt_n) {
                this.txt_n = txt_n;
            }
        }

        public static class TmpBean {
            /**
             * max : 31
             * min : 26
             */

            private String max;
            private String min;

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }
        }

        public static class WindBeanX {
            /**
             * deg : 187
             * dir : 无持续风向
             * sc : 微风
             * spd : 5
             */

            private String deg;
            private String dir;
            private String sc;
            private String spd;

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }

    public static class HourlyForecastBean {
        /**
         * cond : {"code":"305","txt":"小雨"}
         * date : 2017-07-02 22:00
         * hum : 83
         * pop : 90
         * pres : 1007
         * tmp : 29
         * wind : {"deg":"176","dir":"南风","sc":"3-4","spd":"19"}
         */

        private CondBeanXX cond;
        private String date;
        private String hum;
        private String pop;
        private String pres;
        private String tmp;
        private WindBeanXX wind;

        public CondBeanXX getCond() {
            return cond;
        }

        public void setCond(CondBeanXX cond) {
            this.cond = cond;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getTmp() {
            return tmp;
        }

        public void setTmp(String tmp) {
            this.tmp = tmp;
        }

        public WindBeanXX getWind() {
            return wind;
        }

        public void setWind(WindBeanXX wind) {
            this.wind = wind;
        }

        public static class CondBeanXX {
            /**
             * code : 305
             * txt : 小雨
             */

            private String code;
            private String txt;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class WindBeanXX {
            /**
             * deg : 176
             * dir : 南风
             * sc : 3-4
             * spd : 19
             */

            private String deg;
            private String dir;
            private String sc;
            private String spd;

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }


    @Override
    public String toString() {
        return "Weather{" +
                "basic=" + basic +
                ", now=" + now +
                ", status='" + status + '\'' +
                ", suggestion=" + suggestion +
                ", forecastList=" + forecastList +
                ", hourly_forecast=" + hourly_forecast +
                ", aqi=" + aqi +
                '}';
    }
}
