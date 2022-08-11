/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << HostingPort >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf141fb2-a5e7-4adf-9870-921e4a516048")
public class HostingPort extends FeaturePort {
    @objid ("bf55adf9-ecde-41a5-b1d6-f7a85b732f0c")
    public static final String STEREOTYPE_NAME = "HostingPort";

    /**
     * Tells whether a {@link HostingPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b50ee10e-404f-40af-8777-04434a0f2dd1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPort >> then instantiate a {@link HostingPort} proxy.
     * 
     * @return a {@link HostingPort} proxy on the created {@link Port}.
     */
    @objid ("179e54f6-5c85-4a70-a752-a02bd3b9703b")
    public static HostingPort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME);
        return HostingPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Port
     * @return a {@link HostingPort} proxy or <i>null</i>.
     */
    @objid ("c4ec2c40-c595-488c-9538-183a294227aa")
    public static HostingPort instantiate(final Port obj) {
        return HostingPort.canInstantiate(obj) ? new HostingPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Port}
     * @return a {@link HostingPort} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d955d3ad-f41e-4852-a5f5-ad1959b1c726")
    public static HostingPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPort.canInstantiate(obj))
            return new HostingPort(obj);
        else
            throw new IllegalArgumentException("HostingPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0870c0cb-5ed6-479d-be46-86aeb970afd2")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HostingPort other = (HostingPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}.
     * 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("81bf86e6-0607-4100-81c5-7579fbcde400")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("9fac0481-ac15-425d-8e9b-954149ff6704")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc47b2fa-358f-4eae-98fa-43a615e781d3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("b130e59b-90b5-4c93-8505-6a674c12a35a")
    protected HostingPort(final Port elt) {
        super(elt);
    }

    @objid ("98fe20f6-f33e-4b62-b8ea-1f4b27c8cf6e")
    public static final class MdaTypes {
        @objid ("2fe90014-9927-4591-a6a4-7efc4223bbc0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4a96d0e-fe14-4135-bbd1-7d6b5c3abc9c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d278766a-c717-4871-8a76-e0d5bdc0d89d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3034f867-5e90-4e5f-9f1b-b17b4cbadb2f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0672a25d-20e7-4566-b187-f3f3572d73c3");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

}
