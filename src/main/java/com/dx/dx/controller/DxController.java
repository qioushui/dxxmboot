package com.dx.dx.controller;

import com.dx.common.config.BootdoConfig;
import com.dx.common.controller.BaseController;
import com.dx.common.service.FileService;
import com.dx.common.utils.R;
import com.dx.common.utils.XLSX2CSV;
import com.dx.dx.domain.DxbgDO;
import com.dx.dx.service.DxbgService;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xml.sax.SAXException;
import javax.annotation.Resource;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DxController extends BaseController {

    @Resource
    private DxbgService dxbgService ;
    @Autowired
    private FileService sysFileService;
    @Autowired
    private BootdoConfig bootdoConfig;
   /* @GetMapping("/tabulation")
    public String login() throws OpenXML4JException, ParserConfigurationException, SAXException, IOException {
        File file = new File("D:/var/uploaded_files/66735c6f-5f0c-4f5d-b7c0-5dafa94f35bc.xlsx");
        System.out.println("开始读取...");
        List<String[]> list = XLSX2CSV.readerExcelInputStream(file, 30);//默认读取30列
        System.out.println("数据量：" + list.size());
        System.out.println(list.get(1));
        //拆分成 1000条
        int splitNumber = 1000;
        // 拆分后的数据集
        List<List<String [] >> agreementNumberList = new ArrayList<List<String []>>();
        List<DxbgDO> agreementList = null;
        int size = list.size();
        System.out.println("size:"+size);
        int count = (size + splitNumber - 1) / splitNumber;
        System.out.println("count:"+count);
        for (int i = 0; i < count; i++) {
            List<String []> subList = list.subList(i * splitNumber, ((i + 1) * splitNumber > size ? size : splitNumber * (i + 1)));
            agreementNumberList.add(subList);
        }
        for (List<String []> listString :agreementNumberList) {
            agreementList = new ArrayList<>();
            for (String [] result : listString) {
                DxbgDO dxbgDO = new DxbgDO();
                dxbgDO.setNum(result[0]);
                dxbgDO.setNum2(result[1]);
                dxbgDO.setNum3(result[2]);
                dxbgDO.setNum4(result[3]);
                dxbgDO.setNum5(result[4]);
                dxbgDO.setNum6(result[5]);
                dxbgDO.setNum7(result[6]);
                dxbgDO.setNum8(result[7]);
                dxbgDO.setNum9(result[8]);
                dxbgDO.setNum10(result[9]);
                dxbgDO.setNum11(result[10]);
                dxbgDO.setNum12(result[11]);
                dxbgDO.setNum13(result[12]);
                dxbgDO.setNum14(result[13]);
                dxbgDO.setNum15(result[14]);
                dxbgDO.setNum16(result[15]);
                dxbgDO.setNum17(result[16]);
                dxbgDO.setNum18(result[17]);
                dxbgDO.setNum19(result[18]);
                dxbgDO.setNum20(result[19]);
                dxbgDO.setNum21(result[20]);
                dxbgDO.setNum22(result[21]);
                dxbgDO.setNum23(result[22]);
                dxbgDO.setNum24(result[23]);
                dxbgDO.setNum25(result[24]);
                dxbgDO.setNum26(result[25]);
                dxbgDO.setNum27(result[26]);
                dxbgDO.setNum28(result[27]);
                dxbgDO.setNum29(result[28]);
                dxbgDO.setNum30(result[29]);
                agreementList.add(dxbgDO);
            }
            dxbgService.save(agreementList);
        }
       return "";
    }
*/
   private static final Logger logger = LoggerFactory.getLogger(DxController.class);

    @PostMapping( "/tabulation")
    @ResponseBody
    public R tabulation(Long id) throws OpenXML4JException, ParserConfigurationException, SAXException, IOException {

        //清除数据库数据
        dxbgService.removeAll();
        String fileName = bootdoConfig.getUploadPath() + sysFileService.get(id).getUrl().replace("/files/", "");
        File file = new File(fileName);
        logger.info("......开始读取.......");
        List<String[]> list = XLSX2CSV.readerExcelInputStream(file, 30);//默认读取30列
        //拆分成 1000条
        int splitNumber = 1000;
        // 拆分后的数据集
        List<List<String [] >> agreementNumberList = new ArrayList<List<String []>>();
        List<DxbgDO> agreementList = null;
        int size = list.size();
        int count = (size + splitNumber - 1) / splitNumber;
        for (int i = 0; i < count; i++) {
            List<String []> subList = list.subList(i * splitNumber, ((i + 1) * splitNumber > size ? size : splitNumber * (i + 1)));
            agreementNumberList.add(subList);
        }
        for (List<String []> listString :agreementNumberList) {
            agreementList = new ArrayList<>();
            for (String [] result : listString) {
                DxbgDO dxbgDO = new DxbgDO();
                dxbgDO.setNum(result[0]);
                dxbgDO.setNum2(result[1]);
                dxbgDO.setNum3(result[2]);
                dxbgDO.setNum4(result[3]);
                dxbgDO.setNum5(result[4]);
                dxbgDO.setNum6(result[5]);
                dxbgDO.setNum7(result[6]);
                dxbgDO.setNum8(result[7]);
                dxbgDO.setNum9(result[8]);
                dxbgDO.setNum10(result[9]);
                dxbgDO.setNum11(result[10]);
                dxbgDO.setNum12(result[11]);
                dxbgDO.setNum13(result[12]);
                dxbgDO.setNum14(result[13]);
                dxbgDO.setNum15(result[14]);
                dxbgDO.setNum16(result[15]);
                dxbgDO.setNum17(result[16]);
                dxbgDO.setNum18(result[17]);
                dxbgDO.setNum19(result[18]);
                dxbgDO.setNum20(result[19]);
                dxbgDO.setNum21(result[20]);
                dxbgDO.setNum22(result[21]);
                dxbgDO.setNum23(result[22]);
                dxbgDO.setNum24(result[23]);
                dxbgDO.setNum25(result[24]);
                dxbgDO.setNum26(result[25]);
                dxbgDO.setNum27(result[26]);
                dxbgDO.setNum28(result[27]);
                dxbgDO.setNum29(result[28]);
                dxbgDO.setNum30(result[29]);
                agreementList.add(dxbgDO);
            }
            dxbgService.save(agreementList);
        }
        return  R.ok() ;
    }


}
