/**
 * Java Class : IPropertyContent.java
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
 *   @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package fr.softeam.cameldesigner.handlers.propertypages;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;

/**
 * This abstract class defines the contract of all property pages
 * @author ebrosse
 */
@objid ("8235ea2c-105a-4c92-8d60-34227355cf3b")
public abstract class AbstractPropertyContent<T extends CamelElement> {
    @objid ("27c5cd97-e944-4c35-879c-05fd182b5135")
    protected T elt;

    @objid ("7a889238-da6b-40a9-883e-c0cab41976d0")
    public AbstractPropertyContent(T elt) {
        this.elt = elt;
    }

}
