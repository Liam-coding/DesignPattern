package org.itstack.behavioralPattern.mementoPattern;

public class ConfigMemento {
    private ConfigFile configFile;
    public ConfigMemento(ConfigFile configFile) {
        this.configFile = configFile;
    }
    public ConfigFile getConfigFile() {
        return configFile;
    }
    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }
}