//package org.itstack.behavioralPattern.mediatorPattern.mediator;
//
//import jdk.jfr.Configuration;
//
//import java.util.List;
//
//public class DefaultSqlSessionFactory implements SqlSessionFactory{
//
//    private final Configuration configuration;
//    public DefaultSqlSessionFactory(Configuration configuration) {
//        this.configuration = configuration;
//    }
//    @Override
//    public SqlSession openSession() {
//        return new DefaultSqlSession(configuration.connection,
//                configuration.mapperElement);
//    }
//}
