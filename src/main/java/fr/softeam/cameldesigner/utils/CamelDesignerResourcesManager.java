/**
 * Java Class : ResourcesManager.java
 *
 * Description :
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing,
 *    software distributed under the License is distributed on an
 *    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *    KIND, either express or implied.  See the License for the
 *    specific language governing permissions and limitations
 *    under the License.
 *
 * @category   Util
 * @package    com.modeliosoft.modelio.sysml.utils
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package fr.softeam.cameldesigner.utils;

import java.io.File;
import org.modelio.api.module.IModule;
import fr.softeam.cameldesigner.i18n.I18nMessages;
import fr.softeam.cameldesigner.ui.CamelFormat;

/**
 * This class handles the Camel Designer resources i.e. images, styles, property names, etc.
 * @author ebrosse
 */
public class CamelDesignerResourcesManager {
    private static CamelDesignerResourcesManager instance = null;

    private IModule _mdac;

    private static String camelFile = "ICON_SchedulerAndWorkers.camel";

    private static String xmiFile = "ICON_SchedulerAndWorkers.xmi";

    /**
     * Method ResourcesManager
     * @author ebrosse
     */
    private CamelDesignerResourcesManager() {
    }

    /**
     * Method getInstance
     * @author ebrosse
     *
     * @return the SysMLResourcesManager.java instance
     */
    public static CamelDesignerResourcesManager getInstance() {
        if(instance == null){
            instance =  new CamelDesignerResourcesManager();
        }
        return instance;
    }

    /**
     * This method sets the current module
     *
     * @param module : the current module
     */
    public void setJMDAC(IModule module) {
        this._mdac = module;
    }

    /**
     * Method getImage
     * @author ebrosse
     *
     * @param imageName : the name of the image file
     * @return the complete path of the image file
     */
    public String getImage(String imageName) {
        return this._mdac.getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + "icon" + File.separator + imageName;
    }


    public String getFile(CamelFormat format) {

        if (format.equals(CamelFormat.XMI)){
            return this._mdac.getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + xmiFile;

        }else {
            return this._mdac.getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + camelFile;

        }
      }


    /**
     * Method getStyle
     * @author ebrosse
     *
     * @param styleName : the name of the style file
     * @return the absolute path of the style file
     */
    public String getStyle(String styleName) {
        return this._mdac.getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator  + "res" + File.separator + "style" + File.separator + styleName;
    }

    /**
     * Method getPropertyName
     * @author ebrosse
     *
     * @param propertyName : the name of the property
     * @return the internationalized name of the property
     */
    public static String getPropertyName(String propertyName) {
        return I18nMessages.getString("TagType." + StringUtils.capitalizeFirst(propertyName) + ".Label" );
    }

}
