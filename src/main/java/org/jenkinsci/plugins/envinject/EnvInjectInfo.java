package org.jenkinsci.plugins.envinject;

import hudson.Util;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Gregory Boissinot
 */
public class EnvInjectInfo implements Serializable {

    protected List<String> globalPropertiesFilePathNames;
    protected String propertiesFilePath;
    protected String propertiesContent;

    protected transient boolean populateTriggerCause;

    @DataBoundConstructor
    public EnvInjectInfo(String propertiesFilePath, String propertiesContent) {
        this.propertiesFilePath = Util.fixEmpty(propertiesFilePath);
        this.propertiesContent = Util.fixEmpty(propertiesContent);
    }

    public String getPropertiesFilePath() {
        return propertiesFilePath;
    }

    public String getPropertiesContent() {
        return propertiesContent;
    }

    @Deprecated
    public boolean isPopulateTriggerCause() {
        return populateTriggerCause;
    }
}
