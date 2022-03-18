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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.i18n.I18nMessages;
import fr.softeam.cameldesigner.ui.CamelFormat;
import org.modelio.api.module.IModule;

/**
 * This class handles the Camel Designer resources i.e. images, styles, property names, etc.
 * @author ebrosse
 */
@objid ("251e7d23-669b-4d48-a220-cb2787bc2ffe")
public class CamelDesignerResourcesManager {
    @objid ("8253263e-3cc8-45e1-87e2-f2b821c69f11")
    private static String camelFile = "FCRwithDataLocality.camel";

    @objid ("5b2bbfc8-093e-48c4-9f42-d1653e0b9707")
    private static String xmiFile = "FCRwithDataLocality.xmi";

    @objid ("dce9d4f6-5526-4433-b4f9-c27af36a6fde")
    private IModule _mdac;

    @objid ("845f28ee-9a8c-400b-9fc5-494dcc16c5d6")
    private static CamelDesignerResourcesManager instance = null;

    /**
     * Method ResourcesManager
     * @author ebrosse
     */
    @objid ("b4dfe963-46e7-4e13-9c31-d3cd9ac8220a")
    private CamelDesignerResourcesManager() {
    }

    /**
     * Method getInstance
     * @author ebrosse
     * 
     * @return the SysMLResourcesManager.java instance
     */
    @objid ("56110ea8-dc80-416a-acba-9f6b8f01f583")
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
    @objid ("18ea1511-4fc4-4dbf-9bb4-932d46e038aa")
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
    @objid ("c6778ca1-e819-421c-95e7-79b41046bf39")
    public String getImage(String imageName) {
        return this._mdac.getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + "icon" + File.separator + imageName;
    }

    /**
     * Method getStyle
     * @author ebrosse
     * 
     * @param styleName : the name of the style file
     * @return the absolute path of the style file
     */
    @objid ("94938bd8-5bee-452d-9aba-9f06e24db31b")
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
    @objid ("d5a642a1-6651-407b-950d-066e5b57ec28")
    public static String getPropertyName(String propertyName) {
        return I18nMessages.getString("TagType." + StringUtils.capitalizeFirst(propertyName) + ".Label" );
    }

    @objid ("216f0e6f-ba3c-4571-a5fa-8de1ee9c1e5a")
    public String getFile(CamelFormat format) {
        if (format.equals(CamelFormat.XMI)){
            return this._mdac.getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + xmiFile;
        
        }else {
            return this._mdac.getModuleContext().getConfiguration().getModuleResourcesPath() + File.separator + "res" + File.separator + camelFile;
        
        }
    }

}
