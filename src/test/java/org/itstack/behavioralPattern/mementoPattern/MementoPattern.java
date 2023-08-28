package org.itstack.behavioralPattern.mementoPattern;

import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MementoPattern {
    Logger logger = LoggerFactory.getLogger(MementoPattern.class);

    @Test
    public void test() {
        Admin admin = new Admin();
        ConfigOriginator configOriginator = new ConfigOriginator();
        configOriginator.setConfigFile(new ConfigFile("1000001", "contnent A= haha", new Date(), "L"));
        admin.append(configOriginator.saveMemento()); // save configuration
        configOriginator.setConfigFile(new ConfigFile("1000002", "contnent A= xixi", new Date(), "L"));
        admin.append(configOriginator.saveMemento()); // save configuration
        configOriginator.setConfigFile(new ConfigFile("1000003", "contnent A= meme", new Date(), "L"));
        admin.append(configOriginator.saveMemento()); // save configuration
        configOriginator.setConfigFile(new ConfigFile("1000004", "contnent A= heihei", new Date(), " L"));
        admin.append(configOriginator.saveMemento()); // save configuration
        // history config(roll back)
        configOriginator.getMemento(admin.undo());
        logger.info("history config(roll back) undo {}", JSON.toJSONString(configOriginator.getConfigFile()));
        // history config(roll back)
        configOriginator.getMemento(admin.undo());
        logger.info("history config(roll back) undo {}", JSON.toJSONString(configOriginator.getConfigFile()));
        // history config(forward)
        configOriginator.getMemento(admin.redo());
        logger.info("history config(forward) undo {}", JSON.toJSONString(configOriginator.getConfigFile()));
        // history config(get)
        configOriginator.getMemento(admin.get("1000002"));
        logger.info("history config(get) undo {} ", JSON.toJSONString(configOriginator.getConfigFile()));
    }
}
