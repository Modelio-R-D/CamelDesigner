/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("3ceb6103-325a-4b69-9f14-e76fb0fe3f3a")
    public static final String STEREOTYPE_NAME = "HostingPortInstance";

    /**
     * Tells whether a {@link HostingPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0698bc78-1dec-40c4-aa44-77eddc2079f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPortInstance >> then instantiate a {@link HostingPortInstance} proxy.
     * 
     * @return a {@link HostingPortInstance} proxy on the created {@link Port}.
     */
    @objid ("92465673-4166-48b1-8f4d-bd79ef4c0245")
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
    @objid ("9d5e3827-69ab-4c50-aa94-762a0f6bd964")
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
    @objid ("33ef6d34-e4f8-4f0c-a5ba-db30b11ba4bd")
    public static HostingPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPortInstance.canInstantiate(obj))
        	return new HostingPortInstance(obj);
        else
        	throw new IllegalArgumentException("HostingPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1457d7e7-9194-4629-b058-7926a915a2e3")
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
    @objid ("98b616ac-5e7e-4ac3-818d-009f8bc14a8f")
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
    @objid ("5808b950-7f83-4566-ba2d-3f19d3544f52")
    public HostingPort getType() {
        return (HostingPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), HostingPort.STEREOTYPE_NAME);
    }

    @objid ("9df23839-3bf9-45bf-9969-894a350a1b96")
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
    @objid ("f13055fb-ed96-4094-86fb-f562ceb14ddb")
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

    @objid ("d0659c00-45ce-4ecf-80c4-e75561d645f9")
    protected HostingPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("ed3d08ae-14c6-4868-b319-18cc92db0872")
    public static final class MdaTypes {
        @objid ("1e4b9769-170e-4d03-b8a6-953b8b1b03db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7f4e44b-815a-4755-881d-71b626306f3e")
        private static Stereotype MDAASSOCDEP;

        @objid ("5d8261bd-6872-40ea-bc0a-cc655b1d102f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e9f9dfd-2a98-45de-ba1e-e299e26b8fb2")
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
