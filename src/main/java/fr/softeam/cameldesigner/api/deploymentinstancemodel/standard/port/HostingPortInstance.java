/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
 * Proxy class to handle a {@link Port} with << HostingPortInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c7cd871c-65fe-47ef-94b0-65618ab304b4")
public class HostingPortInstance extends FeaturePort {
    @objid ("10a918ba-9758-4e59-b947-bb1f463bd2be")
    public static final String STEREOTYPE_NAME = "HostingPortInstance";

    /**
     * Tells whether a {@link HostingPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0d4a9e2a-c4e2-425a-8fc6-025f8e12cd42")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPortInstance >> then instantiate a {@link HostingPortInstance} proxy.
     * 
     * @return a {@link HostingPortInstance} proxy on the created {@link Port}.
     */
    @objid ("e0461691-eeeb-435a-b07f-395b5368db7e")
    public static HostingPortInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME);
        return HostingPortInstance.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link HostingPortInstance} proxy from a {@link Port} stereotyped << HostingPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link HostingPortInstance} proxy or <i>null</i>.
     */
    @objid ("5d09da5b-83d0-440d-8c36-9897c11b42ba")
    public static HostingPortInstance instantiate(final Port obj) {
        return HostingPortInstance.canInstantiate(obj) ? new HostingPortInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingPortInstance} proxy from a {@link Port} stereotyped << HostingPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link HostingPortInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("55365f2c-d0e2-4375-8c7b-8eaf553a4c29")
    public static HostingPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPortInstance.canInstantiate(obj))
        	return new HostingPortInstance(obj);
        else
        	throw new IllegalArgumentException("HostingPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("211b1725-4bfe-4222-8727-6c88a30f2d2d")
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
        HostingPortInstance other = (HostingPortInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("cfb6ef0a-2c7d-42db-8e40-97dc0a23ad1d")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("65b797b8-11f5-4c68-9b93-c5576ae97087")
    public HostingPort getType() {
        return (HostingPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), HostingPort.STEREOTYPE_NAME);
    }

    @objid ("59d3fff4-8de3-43b5-8cc9-fdd00db3c8f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("740e3f94-2389-4517-bc26-d9827fd74081")
    public void setType(final HostingPort obj) {
        ((Port) this.elt).setRepresentedFeature((obj != null) ? obj.getElement() : null);
    }

    @objid ("a12c45e3-b24e-4c23-8821-230ce8bd6525")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("93f38d4d-14fd-427f-8b5a-91e9b610b097")
    protected HostingPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("ed3d08ae-14c6-4868-b319-18cc92db0872")
    public static final class MdaTypes {
        @objid ("ca2d7af8-997e-4c25-b993-1b9f02ddeb36")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("608c946a-759e-4fda-997c-734b4585cfd9")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e8385e1-f602-4833-9c67-c3afccfaf93a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("586137cf-5472-463c-b87c-185729f66b9a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b2bcf5bc-48d4-42cc-bc87-0ca2f2ca2812");
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
