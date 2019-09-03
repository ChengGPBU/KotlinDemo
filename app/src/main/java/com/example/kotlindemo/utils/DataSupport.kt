package com.example.kotlindemo.utils

import com.example.kotlindemo.databean.City
import com.example.kotlindemo.databean.County
import com.example.kotlindemo.databean.Province
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.Charset

object DataSupport {
    //    从InputStream对象读取数据，并转换为ByteArray
    private fun getBytesByInputStream(content: InputStream): ByteArray {
        val bis = BufferedInputStream(content);
        val baos = ByteArrayOutputStream();
        val bos = BufferedOutputStream(baos);
        val buffer = ByteArray(1024 * 8);
        while (true) {
            val length = bis.read(buffer);
            if (length < 0) {
                break;
            }
            bos.write(buffer, 0, length);
        }

        bos.flush();
        val bytes = baos.toByteArray();
        bos.close();
        bis.close();
        return bytes;
    }

    //    从服务器获取数据，并以字符串的形式返回获取的数据
    private fun getServerContent(urlStr: String): String {
        val url = URL(urlStr);
        val conn = url.openConnection() as HttpURLConnection;
        conn.requestMethod = "GET"//get请求方式
        conn.doInput = true //默认支持从服务器读取结果流
        conn.useCaches = false // 禁用网络缓存
        if (conn.responseCode === 200) {
            val content = conn.inputStream;
//       将inputstream转换为byte数组
            val responseBody = getBytesByInputStream(content);
//        将字节流以utf-8格式转化为字符串
            val string = kotlin.text.String(responseBody, Charset.forName("utf-8"));
            println("数据请求 $urlStr")
            println(string)
            println("数据请求 $urlStr")
            return string;
        }
        return "";
    }

    //    获取省列表
    fun getProvinces(provinceList: (List<Province>) -> Unit) {
        Thread {
            val content = getServerContent("https://geekori.com/api/china")
//        转换为json数据 并返回
            val provinces = Utility.handleProvinceResponse(content);
            provinceList(provinces)
        }.start()

    }

    //根据省获取城市列表
    fun getCities(provinceCode: String, cityList: (List<City>) -> Unit) {
        Thread {
            val content = getServerContent("https://geekori.com/api/china/${provinceCode}")
            val cites = Utility.handleCityReaponse(content, provinceCode)
            cityList(cites)
        }.start()
    }


    //根据城市获取县区数据

    fun getCounties(provinceCode: String, cityCode: String,
                    countyList: (List<County>) -> Unit) {
        Thread {
            val content = getServerContent("https://geekori.com/api/china/${provinceCode}/${cityCode}")
            //将县区JSON数据转换为List<County>对象返回
            val counties = Utility.handleCountyReaponse(content, cityCode)
            countyList(counties)
        }.start()

    }



}