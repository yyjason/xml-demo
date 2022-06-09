package com.example.xml;

import ch.qos.logback.classic.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Component
public class XmlReader implements InitializingBean {
    private static Logger logger = (Logger) LoggerFactory.getLogger(XmlReader.class);
    public void loadXml() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        URL url = XmlReader.class.getResource("/demo.xml");
        Document document = saxReader.read(url);
        logger.info("root document  :" + document.getRootElement().toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        loadXml();
    }
}
