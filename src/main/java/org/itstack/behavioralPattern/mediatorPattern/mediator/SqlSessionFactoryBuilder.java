//package org.itstack.behavioralPattern.mediatorPattern.mediator;
//
//import jdk.jfr.Configuration;
//import org.xml.sax.InputSource;
//
//import javax.lang.model.element.Element;
//import javax.swing.text.Document;
//import java.io.Reader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Map;
//
//public class SqlSessionFactoryBuilder {
//    public DefaultSqlSessionFactory build(Reader reader) {
//        SAXReader saxReader = new SAXReader();
//        try {
//            saxReader.setEntityResolver(new XMLMapperEntityResolver());
//            Document document = saxReader.read(new InputSource(reader));
//            Configuration configuration = parseConfiguration(document.getRootElement());
//            return new DefaultSqlSessionFactory(configuration);
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private Configuration parseConfiguration(Element root) {
//        Configuration configuration = new Configuration();
//        configuration.setDataSource(dataSource(root.selectNodes("//dataSource")));
//        configuration.setConnection(connection(configuration.dataSource));
//        configuration.setMapperElement(mapperElement(root.selectNodes("mappers")));
//        return configuration;
//    }
//
//    // 􁞴􀝐􀷄􀴝􁃠􁯈􁗝􀗞􀯳
//    private Map<String, String> dataSource(List<Element> list) {
//        Map<String, String> dataSource = new HashMap<>(4);
//        Element element = list.get(0);
//        List content = element.content();
//        for (Object o : content) {
//            Element e = (Element) o;
//            String name = e.attributeValue("name");
//            String value = e.attributeValue("value");
//            dataSource.put(name, value);
//        }
//        return dataSource;
//    }
//
//    private Connection connection(Map<String, String> dataSource) {
//        try {
//            Class.forName(dataSource.get("driver"));
//            return DriverManager.getConnection(dataSource.get("url"), dataSource.get("username"), dataSource.get("password"));
//        } catch (ClassNotFoundException | SQLException e) {
//
//        }
//        return null;
//    }
//}
